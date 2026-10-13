# Bounce Tales (Java SE port)

Desktop port of the Nokia J2ME game *Bounce Tales* 240x320 (v2.0.25), decompiled from the
original MIDlet and rewritten against standard Java (AWT/Swing + javax.sound). No `javax.microedition`
or `com.nokia` classes remain.

## Run
    ./build.sh && java -jar BounceTales.jar      # or: mvn package
Requires Java 17+.

## Controls
| Action | Keys |
|---|---|
| Move / menu | Arrow keys or WASD |
| Select / jump-confirm (fire) | Enter or Space |
| Left / right soft key | Z or Q / X, E or Esc |
| Number keys, `*`, `#` | digit row, numpad, `*`, `#` |

Window is resizable; the 240x320 frame is scaled (integer steps when it fits). Minimising pauses the game.
Saves go to `~/.bouncetales` (override with `-Dbouncetales.saves=<dir>`).

## What changed from the J2ME build
| J2ME | Port |
|---|---|
| `MIDlet`, `Display`, `GameCanvas` | `Main`, `Engine` game loop, `GameWindow` (Swing, 60 fps cap) |
| `Graphics`, `DirectGraphics`, `Image`, `Font` | `Gfx` / `Img` over `Graphics2D` / `BufferedImage` (clip, anchors, 8 sprite transforms, ARGB polygons, drawRGB) |
| `Manager`/`Player` MIDI | `MidiPlayer` (`javax.sound.midi`, looping, volume) |
| RMS `RecordStore` | `SaveStore` (files) |
| Keycodes / `getGameAction` | `GameWindow.translate` maps AWT keys to handset codes |
| JAD properties | removed; "More games" link and cheats disabled |
| Nokia-Platform check in `Strings` | removed (it would exit on desktop Java) |

## Source layout
Code is decompiled from obfuscated bytecode (Vineflower, after a bytecode pass that gave every
obfuscated member a unique name). Named: `Engine` (loop, resources, audio, input), `Game` (game state/UI flow),
`Strings` (localisation), `ResourceReader`. Remaining `Cls_x` classes are game objects/entities whose
original names are unknown. Several decompiler errors were fixed by hand (inverted `do/while` in
`Cls_m`, reused locals in `Engine`, byte loop counters, lost `throws` clauses).

Game assets (`src/main/resources`) are the original game's data and remain Nokia's property.
