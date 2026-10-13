package bouncetales;

import java.io.ByteArrayInputStream;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;

/** Plays a MIDI file through the Java Sound synthesizer with looping and volume. */
public final class MidiPlayer {
    private Sequencer sequencer;
    private Synthesizer synth;
    private volatile int volume = 100; // 0..100

    /** Receiver that scales controller 7 (channel volume) by the master level. */
    private final class VolumeReceiver implements Receiver {
        private final Receiver target;

        VolumeReceiver(Receiver target) {
            this.target = target;
        }

        @Override
        public void send(MidiMessage m, long ts) {
            if (m instanceof ShortMessage) {
                ShortMessage sm = (ShortMessage) m;
                if (sm.getCommand() == ShortMessage.CONTROL_CHANGE && sm.getData1() == 7) {
                    try {
                        ShortMessage scaled = new ShortMessage(
                                ShortMessage.CONTROL_CHANGE, sm.getChannel(), 7, sm.getData2() * volume / 100);
                        target.send(scaled, ts);
                        return;
                    } catch (Exception ignored) {
                        // fall through to unscaled
                    }
                }
            }
            target.send(m, ts);
        }

        @Override
        public void close() {
            target.close();
        }
    }

    /** Loads MIDI data; throws if no MIDI device is available. */
    public MidiPlayer(byte[] midi) throws Exception {
        Sequence seq = MidiSystem.getSequence(new ByteArrayInputStream(midi));
        sequencer = MidiSystem.getSequencer(false);
        synth = MidiSystem.getSynthesizer();
        sequencer.open();
        synth.open();
        sequencer.getTransmitter().setReceiver(new VolumeReceiver(synth.getReceiver()));
        sequencer.setSequence(seq);
    }

    public void setVolume(int level) {
        volume = Math.max(0, Math.min(100, level));
        if (synth != null && synth.isOpen()) {
            try {
                Receiver r = synth.getReceiver();
                for (int ch = 0; ch < 16; ch++) {
                    r.send(new ShortMessage(ShortMessage.CONTROL_CHANGE, ch, 7, 127 * volume / 100), -1);
                }
            } catch (Exception ignored) {
                // volume is best effort
            }
        }
    }

    /** @param loops number of extra repeats; -1 loops forever. */
    public void start(int loops) {
        sequencer.setLoopCount(loops < 0 ? Sequencer.LOOP_CONTINUOUSLY : loops);
        sequencer.setTickPosition(0);
        sequencer.start();
    }

    public boolean isOpen() {
        return sequencer != null && sequencer.isOpen();
    }

    public void close() {
        try {
            if (sequencer != null) {
                sequencer.stop();
                sequencer.close();
            }
            if (synth != null) {
                synth.close();
            }
        } catch (Exception ignored) {
            // shutting down
        } finally {
            sequencer = null;
            synth = null;
        }
    }
}
