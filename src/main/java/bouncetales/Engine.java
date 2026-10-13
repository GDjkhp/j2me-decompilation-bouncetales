package bouncetales;

import java.awt.Font;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class Engine implements Runnable, ResourceReader {
   private static Engine o_a = null;
   public static boolean boolean_a = false;
   private static boolean boolean_b = false;
   private static boolean boolean_c = true;
   private static int int_d = 500;
   private static Object Object_a = new Object();
   private static Object Object_b = new Object();
   public static Game b_a;
   private static int[] intArr_a;
   private static int int_e;
   private static int[] intArr_b;
   private static int int_f;
   private static boolean boolean_d = false;
   private static boolean boolean_e = false;
   private static boolean boolean_f = false;
   private static boolean boolean_g = false;
   private static int int_g = -1;
   private static int int_h = 500;
   private static long long_a;
   public static int int_a;
   private static int int_i = 1;
   private static int int_j = 0;
   private static String[] StringArr_a;
   private static String[] StringArr_b;
   private static int[] intArr_c;
   private static char[] charArr_a = new char[]{'\n', ' ', '-'};
   public static int int_b = 240;
   public static int int_c = 320;
   private static Gfx Graphics_a = null;
   private static Gfx Graphics_b = null;
   private static Font[] FontArr_a = new Font[]{Gfx.createFont(Gfx.ITALIC), Gfx.createFont(Gfx.BOLD), Gfx.createFont(Gfx.PLAIN)};
   private static int[] intArr_d = new int[2];
   private static int int_k;
   private static int int_l = -1;
   private static Vector Vector_a;
   private static Vector Vector_b;
   private static ResourceReader[] pArr_a;
   private static Object[] ObjectArr_a;
   private static boolean[] booleanArr_a;
   private static String[] StringArr_c;
   private static int[] intArr_e;
   private static short[][] shortArr2_a;
   private static short[][] shortArr2_b;
   private static short[] shortArr_a;
   private static Img[] ImageArr_a;
   private static byte[] byteArr_a;
   private static final short[] shortArr_b = new short[6];
   private static int int_m = -1;
   private static String[] StringArr_d;
   private static int int_n;
   private static boolean boolean_h = false;
   private static MidiPlayer Player_a = null;
   private static int int_o = 60;
   private static int int_p = -1;
   public static GameWindow window;
   private static int int_q = 1;
   private static int int_r = 0;
   private static int int_s = 0;
   private static int int_t = 0;
   private static int[] intArr_f;
   private static int int_u;
   private static boolean boolean_i;
   private static long long_b = 0L;
   private static int int_v = 0;
   private static int int_w = 0;
   private static long long_c = 0L;
   private static boolean boolean_j = false;
   private static int int_x;
   private static char char_a;
   private static char[][] charArr2_a = new char[][]{
      {' ', '0'},
      {'.', ',', '?', '!', '\'', '-', '(', ')', '@', '/', ':', '_', '1'},
      {'a', 'b', 'c', '\u00e4', '\u00e5', '2'},
      {'d', 'e', 'f', '3'},
      {'g', 'h', 'i', '4'},
      {'j', 'k', 'l', '5'},
      {'m', 'n', 'o', '\u00f6', '6'},
      {'p', 'q', 'r', 's', '7'},
      {'t', 'u', 'v', '8'},
      {'w', 'x', 'y', 'z', '9'},
      new char[0],
      new char[0]
   };

   public Engine() {
   }

   private static void f_int(int var0) {
      if (int_e != 20) {
         intArr_a[int_e] = var0;
         int_e++;
      }
   }

   public static void a_int_ret_void(int var0) {
      if (int_f == 40) {
         throw new RuntimeException();
      } else {
         intArr_b[int_f] = var0;
         int_f++;
      }
   }

   public static void a_ret_void() {
      boolean_g = true;
   }

   public static void b_ret_void() {
      int_i = 2;
   }

   public static int a_ret_int() {
      return int_i;
   }

   public static void b_int_ret_void(int var0) {
      int_h = var0;
   }

   public static void a_int_String_int(int var0, String var1, int var2) {
      StringArr_a[var0] = var1;
      intArr_c[var0] = var2;
   }

   public static void c_ret_void() {
      for (int var0 = 0; var0 < 3; var0++) {
         a_int_String_int(var0, null, -1);
      }
   }

   public static int b_ret_int() {
      if ((c_int_ret_int(0) & 114) == (c_int_ret_int(1) & 114)) {
         return (c_int_ret_int(0) & 32) == 32 ? 2 : 1;
      } else if ((c_int_ret_int(0) & 13) == (c_int_ret_int(1) & 13)) {
         return (c_int_ret_int(0) & 4) == 4 ? 3 : 4;
      } else {
         return 0;
      }
   }

   public static int c_ret_int() {
      return b_ret_int() != 0 ? Game.c_ret_int() : 0;
   }

   public static int d_ret_int() {
      return b_ret_int() != 0 ? -1 : 0;
   }

   private static int c_int_ret_int(int var0) {
      switch (var0) {
         case 0:
            return 33;
         case 1:
            return 40;
         case 2:
            return 36;
         default:
            return -1;
      }
   }

   public static boolean a_ret_boolean() {
      return b_ret_int() == 3 || b_ret_int() == 4;
   }

   public static boolean b_ret_boolean() {
      return b_ret_int() == 1 || b_ret_int() == 2;
   }

   public static String[] a_String_int_int_boolean_int_int_boolean(String var0, int var1, int var2, boolean var3, int var4, int var5, boolean var6) {
      String[] var7 = new String[5];
      int var8 = 0;
      int var9 = 0;
      int var10 = var4;
      int var11 = 0;
      int var12 = var0.length();
      int var13 = 0;

      while (var13 < var12) {
         boolean var14;
         int var15;
         if (var14 = var3 && a_int_ret_int(var2) * var8 < var5) {
            var15 = var1 - var4;
            var9++;
         } else {
            var15 = var1;
         }

         int var16 = 0;
         int var17 = var13;
         int var18 = var12;

         while (var13 < var12) {
            int var19 = var12;

            for (int var20 = var13; var20 < var12; var20++) {
               int var21 = 0;

               while (var21 < charArr_a.length && var0.charAt(var20) != charArr_a[var21]) {
                  var21++;
               }

               if (var21 < charArr_a.length) {
                  var19 = var20;
                  if (var0.charAt(var20) == '-') {
                     var19 = var20 + 1;
                  }
                  break;
               }
            }

            if (a_int_String_int_int(var2, var0, var17, var19 - var17) >= var15) {
               if (var16 != 0) {
                  break;
               }

               int var27 = var17;

               while (a_int_String_int_int(var2, var0, var17, var27 - var17 + 1) < var15) {
                  var27++;
               }

               var18 = var27;
               var13 = var27;
               break;
            }

            var18 = var19;
            var13 = var19;
            var16++;
            if (var19 < var12 && var0.charAt(var19) == '\n') {
               break;
            }

            while (var13 < var12) {
               int var26 = 0;

               while (var26 < charArr_a.length && var0.charAt(var13) != charArr_a[var26]) {
                  var26++;
               }

               if (var26 >= charArr_a.length || var0.charAt(var13) == '-' || var0.charAt(var13) == '\n') {
                  break;
               }

               var13++;
            }
         }

         int var25 = a_int_String_int_int(var2, var0, var17, var18 - var17);
         if (var14) {
            var10 = Math.max(var10, var25 + var4);
            var11 = Math.max(var11, var25 + var4);
         } else {
            var11 = Math.max(var11, var25);
         }

         if (boolean_a) {
            var7 = a_StringArr_int_String(var7, var8 + 1, '\u200f' + var0.substring(var17, var18));
         } else {
            var7 = a_StringArr_int_String(var7, var8 + 1, var0.substring(var17, var18));
         }

         var8++;
         if (var13 < var12 && var0.charAt(var13) == '\n') {
            var13++;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var22) {
         }
      }

      int var23;
      if (var6) {
         var23 = var11;
      } else {
         var23 = var1;
      }

      if (var3) {
         var1 = Math.max(var8 * a_int_ret_int(var2), var5);
      } else {
         var1 = var8 * a_int_ret_int(var2) + var5;
      }

      var7[0] = "" + var8 + " " + var9 + " " + var10 + " " + var23 + " " + var1;
      return var7;
   }

   private static String[] a_StringArr_int_String(String[] var0, int var1, String var2) {
      if (var0.length <= var1) {
         String[] var3 = new String[var0.length + 5];
         System.arraycopy(var0, 0, var3, 0, var0.length);
         var0 = var3;
      }

      var0[var1] = var2;
      return var0;
   }

   public static int e_ret_int() {
      return int_b;
   }

   public static boolean a_int_ret_boolean(int var0) {
      return (int_t & 1 << var0) != 0;
   }

   public static void d_ret_void() {
      int_r = 0;
      int_q = 2;
   }

   public static void e_ret_void() {
      int_r = 0;
      int_t = 0;
      int_s = 0;
      int_u = 0;
      boolean_i = true;
   }

   public static void a_String_byteArr(String var0, byte[] var1) {
      SaveStore.write(var0, var1);
   }

   public static byte[] a_String_ret_byteArr(String var0) {
      return SaveStore.read(var0);
   }

   public static Gfx a_ret_Graphics() {
      return Graphics_b;
   }

   public static void a_Graphics(Gfx var0) {
      Graphics_b = var0 != null ? var0 : Graphics_a;
   }

   public static boolean a_int_int_int_int_intArr(int var0, int var1, int var2, int var3, int[] var4) {
      int var5 = Graphics_b.getClipX();
      int var6 = Graphics_b.getClipY();
      int var7 = Graphics_b.getClipWidth();
      int var8 = Graphics_b.getClipHeight();
      var4[0] = var5;
      var4[1] = var6;
      var4[2] = var7;
      var4[3] = var8;
      if (var0 < var5) {
         var2 -= var5 - var0;
         var0 = var5;
      }

      if (var1 < var6) {
         var3 -= var6 - var1;
         var1 = var6;
      }

      if (var0 + var2 > var5 + var7) {
         var2 = var5 + var7 - var0;
      }

      if (var1 + var3 > var6 + var8) {
         var3 = var6 + var8 - var1;
      }

      if (var2 > 0 && var3 > 0) {
         Graphics_b.setClip(var0, var1, var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public static int a_int_String_int_int(int var0, String var1, int var2, int var3) {
      byte var4;
      if (var0 == -1) {
         var4 = 0;
      } else if (var0 == -2) {
         var4 = 1;
      } else {
         if (var0 != -3) {
            return -1;
         }

         var4 = 2;
      }

      return Gfx.textWidth(FontArr_a[var4], var1, var2, var3);
   }

   public static int a_int_ret_int(int var0) {
      byte var1;
      if (var0 == -1) {
         var1 = 0;
      } else if (var0 == -2) {
         var1 = 1;
      } else {
         if (var0 != -3) {
            return -1;
         }

         var1 = 2;
      }

      return Gfx.fontHeight(FontArr_a[var1]);
   }

   public static void a_int_int_ret_void(int var0, int var1) {
      int_l = var0;
      int_k = var1;
      intArr_d[0] = 0;
   }

   public static int f_ret_int() {
      return int_l;
   }

   public static void b_int_int_ret_void(int var0, int var1) {
      intArr_d[var0] = var1;
   }

   public static void a_String_int_int_int_int(String var0, int var1, int var2, int var3, int var4) {
      byte var5;
      if (int_l == -1) {
         var5 = 0;
      } else if (int_l == -2) {
         var5 = 1;
      } else {
         if (int_l != -3) {
            return;
         }

         var5 = 2;
      }

      if ((var4 & 2) == 2) {
         var4 = var4 & -3 | 16;
         var3 -= a_int_ret_int(int_l) / 2;
      }

      Graphics_b.setFont(FontArr_a[var5]);
      if (int_k != 1) {
         Graphics_b.setColor(intArr_d[1]);
         switch (int_k) {
            case 2:
               Graphics_b.drawSubstring(var0, 0, var1, var2 + 1, var3 + 1, var4);
               break;
            case 3:
               var5 = 0;

               while (var5 < 4) {
                  Graphics_b.drawSubstring(var0, 0, var1, var2 + (var5 & 1) * (var5 - 2), var3 + (++var5 & 1) * (var5 - 2), var4);
               }
         }
      }

      Graphics_b.setColor(intArr_d[0]);
      Graphics_b.drawSubstring(var0, 0, var1, var2, var3, var4);
   }

   public static void c_int_ret_void(int var0) {
      if (var0 >= 0) {
         Integer var1 = new Integer(var0);
         if (!Vector_a.contains(var1)) {
            Vector_a.addElement(var1);
         }

         Vector_b.removeElement(var1);
      }
   }

   public static void d_int_ret_void(int var0) {
      if (var0 >= 0) {
         Integer var1 = new Integer(var0);
         if (!Vector_b.contains(var1)) {
            Vector_b.addElement(var1);
         }

         Vector_a.removeElement(var1);
      }
   }

   public static Object a_int_ret_Object(int var0) {
      if (var0 < 0) {
         return null;
      } else {
         return ObjectArr_a != null ? ObjectArr_a[var0] : null;
      }
   }

   public static boolean b_int_ret_boolean(int var0) {
      return var0 < 0 ? false : booleanArr_a != null && booleanArr_a[var0];
   }

   private static void a_DataInputStream_int_ret_void(DataInputStream var0, int var1) throws java.lang.Exception {
      int var2 = 0;

      while (var2 < var1) {
         var2 = var0.skipBytes(var1 - var2);
      }
   }

   private static byte[] a_InputStream_int(InputStream var0, int var1) throws java.lang.Exception {
      if (var1 != -1) {
         byte[] var5 = new byte[var1];
         int var6 = 0;

         while (var6 < var5.length) {
            var6 += var0.read(var5, var6, var5.length - var6);
         }

         return var5;
      } else {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var2 = new byte[1024];

         int var3;
         while ((var3 = var0.read(var2)) >= 0) {
            var4.write(var2, 0, var3);
         }

         return var4.toByteArray();
      }
   }

   private static void j() throws java.lang.Exception {
      if (StringArr_c == null) {
         short[] var1 = null;

         try {
            DataInputStream var2;
            short var3;
            StringArr_c = new String[var3 = (var2 = new DataInputStream(Engine.class.getResourceAsStream("/a"))).readShort()];
            intArr_e = new int[var3 << 1];

            for (int var4 = 0; var4 < var3; var4++) {
               StringArr_c[var4] = var2.readUTF();
               intArr_e[var4 << 1] = var2.readInt();
               intArr_e[(var4 << 1) + 1] = var2.readInt();
            }

            shortArr2_a = new short[var3 = var2.readShort()][];
            ObjectArr_a = new Object[var3];
            booleanArr_a = new boolean[var3];

            for (int var13 = 0; var13 < var3; var13++) {
               short var0 = var2.readByte();
               byte var5 = var2.readByte();
               shortArr2_a[var13] = new short[var5 + 2];
               shortArr2_a[var13][0] = var0;
               shortArr2_a[var13][1] = var2.readShort();

               for (int var7 = 0; var7 < var5; var7++) {
                  shortArr2_a[var13][var7 + 2] = var2.readShort();
               }
            }

            short[] var8 = new short[var3 = var2.readShort()];
            var1 = new short[var3];

            for (int var14 = 0; var14 < var3; var14++) {
               var8[var14] = var2.readShort();
               var1[var14] = var2.readShort();
            }

            var2.close();

            for (int var15 = 0; var15 < var1.length; var15++) {
               if ((var2 = a_int_ret_DataInputStream(var1[var15])) != null) {
                  int var16 = 0;

                  while (var16 < pArr_a.length && !pArr_a[var16].a_DataInputStream_int_ret_boolean(var2, var8[var15])) {
                     var16++;
                  }

                  var2.close();
               }
            }

            pArr_a[0].a_DataInputStream_int_ret_boolean(null, -1);
         } catch (IOException var6) {
         }
      }
   }

   private static void k() throws java.lang.Exception {
      Vector var0 = new Vector();

      for (int var1 = 0; var1 < Vector_a.size(); var1++) {
         int var2 = (Integer)Vector_a.elementAt(var1);
         if (!booleanArr_a[var2]) {
            int var3 = 0;

            for (int var4 = -1; var4 < shortArr2_a[var2].length - 2; var4++) {
               short var5 = var4 == -1 ? shortArr2_a[var2][1] : shortArr2_a[var2][var4 + 2];
               int var6 = var0.size();

               for (int var7 = var3; var7 < var0.size(); var7++) {
                  int[] var8 = (int[])var0.elementAt(var7);
                  boolean var9 = StringArr_c[var5].equals(StringArr_c[var8[2]]);
                  boolean var10 = var7 == var0.size() - 1 || !StringArr_c[var5].equals(StringArr_c[((int[])var0.elementAt(var7 + 1))[2]]);
                  if (var9 && intArr_e[var5 << 1] < intArr_e[var8[2] << 1]) {
                     var6 = var7;
                     break;
                  }

                  if (var9 && var10) {
                     var6 = var7 + 1;
                     break;
                  }
               }

               if (var4 == -1) {
                  var3 = var6 + 1;
               }

               int[] var23;
               (var23 = new int[3])[0] = var2;
               var23[1] = var4;
               var23[2] = var5;
               var0.insertElementAt(var23, var6);
            }
         }
      }

      try {
         DataInputStream var15 = null;
         String var17 = null;
         int var19 = 0;

         for (int var20 = 0; var20 < var0.size(); var20++) {
            int[] var21;
            int var24 = (var21 = (int[])var0.elementAt(var20))[0];
            int var13 = var21[2];
            String var25 = StringArr_c[var13];
            int var26 = intArr_e[var13 << 1];
            int var27 = intArr_e[(var13 << 1) + 1];
            if (var15 != null && var25.equals(var17) && var19 <= var26) {
               a_DataInputStream_int_ret_void(var15, var26 - var19);
            } else {
               if (var15 != null) {
                  var15.close();
                  var15 = null;
               }

               if (var26 != -1 && var27 != 0) {
                  var15 = a_int_ret_DataInputStream(var13);
               }
            }

            boolean var14 = false;
            if (var21[1] == -1) {
               if (var26 == -1) {
                  var15 = new DataInputStream(Engine.class.getResourceAsStream("/" + var25));
               }

               for (int var28 = 0; var28 < pArr_a.length; var28++) {
                  Object loaded;
                  if ((loaded = pArr_a[var28].a_DataInputStream_int_int_int(var27 != 0 ? var15 : null, var27, shortArr2_a[var24][0], var24)) != null) {
                     ObjectArr_a[var24] = loaded;
                     var14 = true;
                     break;
                  }
               }
            } else if (var27 != 0) {
               int var11 = 0;

               while (
                  var11 < pArr_a.length
                     && !(
                        var14 = pArr_a[var11]
                           .a_DataInputStream_String_int_int_int_int(var15, var27 == -1 ? var25 : null, var27, shortArr2_a[var24][0], var24, var21[1])
                     )
               ) {
                  var11++;
               }
            }

            if (!var14 && var26 != -1) {
               a_DataInputStream_int_ret_void(var15, var27);
            }

            if (var15 != null) {
               var17 = var25;
               var19 = var26 + var27;
            }
         }

         if (var15 != null) {
            var15.close();
         }
      } catch (IOException var12) {
      }

      for (int var16 = 0; var16 < Vector_a.size(); var16++) {
         int var18 = (Integer)Vector_a.elementAt(var16);
         booleanArr_a[var18] = true;
      }

      Vector_a.removeAllElements();
   }

   private static void l() throws java.lang.Exception {
      for (int var0 = 0; var0 < Vector_b.size(); var0++) {
         int var1 = (Integer)Vector_b.elementAt(var0);
         if (booleanArr_a[var1]) {
            short var2 = shortArr2_a[var1][0];
            int var3 = 0;

            while (var3 < pArr_a.length && !pArr_a[var3].a_int_int_ret_boolean(var2, var1)) {
               var3++;
            }

            ObjectArr_a[var1] = null;
            booleanArr_a[var1] = false;
         }
      }

      Vector_b.removeAllElements();
   }

   private static short a_byteArr_int_ret_short(byte[] var0, int var1) {
      return (short)(var0[var1] << 8 | var0[var1 + 1] & 255);
   }

   private static DataInputStream a_int_ret_DataInputStream(int var0) throws java.lang.Exception {
      if (intArr_e[(var0 << 1) + 1] != 0) {
         InputStream var1 = Engine.class.getResourceAsStream("/" + StringArr_c[var0]);
         DataInputStream var2 = new DataInputStream(var1);
         if (intArr_e[var0 << 1] != -1) {
            a_DataInputStream_int_ret_void(var2, intArr_e[var0 << 1]);
         }

         return var2;
      } else {
         return null;
      }
   }

   public final boolean a_DataInputStream_int_ret_boolean(DataInputStream var1, int var2) throws java.lang.Exception {
      switch (var2) {
         case -1:
            shortArr_a = new short[428];
            byteArr_a = new byte[2282];
            ImageArr_a = new Img[46];

            for (int var7 = 0; var7 < shortArr_a.length; var7++) {
               shortArr_a[var7] = -1;
            }

            for (int var8 = 0; var8 < byteArr_a.length; var8++) {
               byteArr_a[var8] = -1;
            }
         case 0:
         case 1:
         case 2:
         case 3:
         case 5:
         default:
            break;
         case 4:
            int_n = var1.readByte();
            StringArr_d = new String[var1.readShort()];
            break;
         case 6:
            short var6;
            shortArr2_b = new short[var6 = var1.readShort()][];

            for (int var3 = 0; var3 < var6; var3++) {
               short var4 = var1.readShort();
               shortArr2_b[var3] = new short[var4];

               for (int var5 = 0; var5 < var4; var5++) {
                  shortArr2_b[var3][var5] = var1.readShort();
               }
            }

            return true;
         case 7:
            return true;
      }

      return false;
   }

   public final Object a_DataInputStream_int_int_int(DataInputStream var1, int var2, int var3, int var4) throws java.lang.Exception {
      switch (var3) {
         case 2:
            int var11 = var1.readByte();
            short var15 = var1.readShort();
            short var18 = var1.readShort();
            short var19 = var1.readShort();
            short var21 = var1.readShort();

            for (int var8 = 0; var8 < var18; var8++) {
               short var9 = var1.readShort();
               shortArr_a[var9 - 326 << 1] = (short)var4;
               shortArr_a[(var9 - 326 << 1) + 1] = (short)(var1.readShort() + 4);
            }

            ByteArrayOutputStream var22 = new ByteArrayOutputStream(var19 + 4);
            DataOutputStream var23;
            (var23 = new DataOutputStream(var22)).writeShort(var15);
            var23.writeShort(var15 + var11);

            for (int var12 = 0; var12 < var19; var12++) {
               var23.writeByte(var1.readByte());
            }

            var11 = 0;

            for (int var16 = 0; var16 < var21 << 3; var16++) {
               if ((var16 & 7) == 0) {
                  var11 = 7 * var1.readShort();
               } else {
                  byteArr_a[var11 + (var16 & 7) - 1] = var1.readByte();
               }
            }

            return var22.toByteArray();
         case 3:
            return new Object();
         case 4:
            short var14 = var1.readShort();
            short var10 = var1.readShort();
            var4 = -999999;
            int var5 = -999999;
            int var6 = 0;

            for (int var7 = 0; var7 < int_n + 1; var7++) {
               if (var7 == 0) {
                  var4 = var1.readInt();
               } else {
                  var6 = var1.readInt();
                  if (var7 == 1) {
                     var5 = var6 - var4;
                  }
               }
            }

            a_DataInputStream_int_ret_void(var1, var4);

            for (int var20 = 0; var20 < var14; var20++) {
               if (StringArr_d[var10 + var20] == null) {
                  StringArr_d[var10 + var20] = var1.readUTF();
               } else {
                  var1.readUTF();
               }
            }

            a_DataInputStream_int_ret_void(var1, var6 - (var4 + var5));
            return new short[]{(short)var10, (short)var14};
         case 5:
         case 6:
         case 7:
         default:
            return a_InputStream_int(var1, var2);
      }
   }

   public final boolean a_DataInputStream_String_int_int_int_int(DataInputStream var1, String var2, int var3, int var4, int var5, int var6) throws java.lang.Exception {
      switch (var4) {
         case 2:
            var4 = a_byteArr_int_ret_short((byte[])a_int_ret_Object(var5), 0) + var6;
            if (var1 != null) {
               byte[] var7 = a_InputStream_int(var1, var3);
               ImageArr_a[var4] = Img.create(var7, 0, var7.length);
            } else {
               ImageArr_a[var4] = Img.create("/" + var2);
            }

            return true;
         case 3:
         case 8:
            if (var1 != null) {
               a_byteArr_int_String(a_InputStream_int(var1, var3), var5, null);
            } else {
               a_byteArr_int_String(null, var5, "/" + var2);
            }

            return true;
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            return false;
      }
   }

   public final boolean a_int_int_ret_boolean(int var1, int var2) {
      switch (var1) {
         case 2:
            byte[] var7 = (byte[])ObjectArr_a[var2];
            short var10 = 0;

            for (; var10 < shortArr_a.length; var10 += 2) {
               if (shortArr_a[var10] == var2) {
                  shortArr_a[var10] = -1;
                  shortArr_a[var10 + 1] = -1;
               }
            }

            var10 = a_byteArr_int_ret_short(var7, 0);
            short var8 = a_byteArr_int_ret_short(var7, 2);

            for (int var4 = 0; var4 < byteArr_a.length; var4 += 7) {
               byte var5;
               if ((var5 = byteArr_a[var4 + 6]) >= var10 && var5 < var8) {
                  for (int var13 = 0; var13 < 7; var13++) {
                     byteArr_a[var4 + var13] = -1;
                  }
               }
            }

            var10 = a_byteArr_int_ret_short(var7, 2);

            for (int var9 = a_byteArr_int_ret_short(var7, 0); var9 < var10; var9++) {
               ImageArr_a[var9] = null;
            }

            return true;
         case 3:
            return true;
         case 4:
            short[] var6;
            for (int var3 = (var6 = (short[])ObjectArr_a[var2])[0]; var3 < var6[1] + var6[0]; var3++) {
               StringArr_d[var3] = null;
            }

            return true;
         case 5:
         case 6:
         case 7:
         default:
            return false;
      }
   }

   public static void f_ret_void() {
      short[] var0 = shortArr2_b[0];

      for (int var1 = 0; var1 < var0.length; var1++) {
         c_int_ret_void(var0[var1]);
      }
   }

   public static Img a_int_ret_Image(int var0) {
      int var1;
      return (var1 = d_int_ret_int(var0)) >= 0 ? ImageArr_a[var1] : null;
   }

   public static void a_int_Image(int var0, Img var1) {
      if ((var0 = d_int_ret_int(var0)) >= 0) {
         ImageArr_a[var0] = var1;
      }
   }

   private static int d_int_ret_int(int var0) {
      if (var0 == -1) {
         return -1;
      } else if (var0 < -1) {
         return -1;
      } else {
         byte[] var4 = null;
         int var1;
         int var2;
         int var9;
         if (var0 < 326) {
            var1 = -99;
            var2 = 0;
            var9 = 0;
            if (byteArr_a[var0 * 7 + 6] == -1) {
               return -1;
            }
         } else {
            int var5;
            if ((var5 = (var0 - 326 << 1) + 1) >= shortArr_a.length) {
               return -1;
            }

            var9 = shortArr_a[var5];
            short var7;
            if ((var7 = shortArr_a[var0 - 326 << 1]) < 0) {
               return -1;
            }

            var4 = (byte[])ObjectArr_a[var7];
            if (var9 == -1 || var4 == null) {
               return -1;
            }

            byte var8;
            var1 = (var8 = var4[var9++]) & 3;
            var2 = (var8 & 4) != 0 ? 2 : 1;
         }

         short var11 = -1;
         if (var1 == 0 || var1 == -99) {
            if (var1 == 0) {
               if (var2 == 2) {
                  var9 += 12;
               } else {
                  var9 += 6;
               }

               var11 = (short)(var4[var9] << 8 | var4[var9 + 1] & 255);
            } else {
               var0 *= 7;
               var11 = byteArr_a[var0 + 6];
            }
         }

         return var11;
      }
   }

   public static void a_int_int_int(int var0, int var1, int var2) {
      byte[] var6 = null;
      int var3;
      int var4;
      int var17;
      if (var2 < 326) {
         var3 = -99;
         var4 = 0;
         var17 = 0;
      } else {
         var17 = shortArr_a[(var2 - 326 << 1) + 1];
         byte var7;
         var3 = (var7 = (var6 = (byte[])ObjectArr_a[shortArr_a[var2 - 326 << 1]])[var17++]) & 3;
         var4 = (var7 & 4) != 0 ? 2 : 1;
      }

      if (var3 != 0 && var3 != -99) {
         if (var3 == 1) {
            var17 += var4 << 2;
            short var23 = (short)(var6[var17] << 8 | var6[var17 + 1] & 255);
            var17 += 2;
            if (var4 == 2) {
               for (int var15 = 0; var15 < var23; var15++) {
                  a_int_int_int(
                     var0 + (short)(var6[var17] << 8 | var6[var17 + 1] & 255),
                     var1 + (short)(var6[var17 + 2] << 8 | var6[var17 + 3] & 255),
                     (short)(var6[var17 + 4] << 8 | var6[var17 + 5] & 255)
                  );
                  var17 += 6;
               }

               return;
            }

            for (int var14 = 0; var14 < var23; var14++) {
               a_int_int_int(var0 + var6[var17++], var1 + var6[var17++], var6[var17++]);
            }
         }
      } else {
         Img var22;
         if (var3 == 0) {
            if (var4 == 2) {
               for (int var11 = 0; var11 < 6; var11++) {
                  shortArr_b[var11] = (short)(var6[var17] << 8 | var6[var17 + 1] & 255);
                  var17 += 2;
               }
            } else {
               for (int var10 = 0; var10 < 6; var10++) {
                  shortArr_b[var10] = var6[var17++];
               }
            }

            var22 = ImageArr_a[(short)(var6[var17] << 8 | var6[var17 + 1] & 255)];
         } else {
            var2 *= 7;
            shortArr_b[0] = (short)(byteArr_a[var2] & 255);
            shortArr_b[1] = (short)(byteArr_a[var2 + 1] & 255);
            shortArr_b[2] = byteArr_a[var2 + 2];
            shortArr_b[3] = byteArr_a[var2 + 3];
            shortArr_b[4] = (short)(byteArr_a[var2 + 4] & 255);
            shortArr_b[5] = (short)(byteArr_a[var2 + 5] & 255);
            var22 = ImageArr_a[byteArr_a[var2 + 6]];
         }

         var0 -= shortArr_b[2];
         var1 -= shortArr_b[3];
         Graphics_b.getClipX();
         Graphics_b.getClipY();
         Graphics_b.getClipWidth();
         Graphics_b.getClipHeight();
         short var13 = shortArr_b[0];
         short var16 = shortArr_b[1];
         if (var13 > 0 && var16 > 0) {
            if (int_m != -1) {
               Graphics_b.drawRegion(var22, shortArr_b[4], shortArr_b[5], var13, var16, int_m, var0, var1, 20);
               int_m = -1;
               return;
            }

            Graphics_b.drawRegion(var22, shortArr_b[4], shortArr_b[5], var13, var16, 0, var0, var1, 20);
         }
      }
   }

   public static void a_int_int_int_int(int var0, int var1, int var2, int var3) {
      var0 += a_int_int_ret_int(var2, 2);
      var1 += a_int_int_ret_int(var2, 3);
      if ((var3 & 1) == 1) {
         var0 -= a_int_int_ret_int(var2, 0) / 2;
      }

      if ((var3 & 8) == 8) {
         var0 -= a_int_int_ret_int(var2, 0);
      }

      if ((var3 & 2) == 2) {
         var1 -= a_int_int_ret_int(var2, 1) / 2;
      }

      if ((var3 & 32) == 32) {
         var1 -= a_int_int_ret_int(var2, 1);
      }

      a_int_int_int(var0, var1, var2);
   }

   public static void c_int_int_ret_void(int var0, int var1) {
      int_m = 6;
      a_int_int_int_int(var0, var1, 12, 24);
   }

   public static int a_int_int_ret_int(int var0, int var1) {
      if (var0 < 326) {
         return var1 != 2 && var1 != 3 ? byteArr_a[var0 * 7 + var1] & 0xFF : byteArr_a[var0 * 7 + var1];
      } else {
         int var2 = shortArr_a[(var0 - 326 << 1) + 1];
         byte[] var3;
         if ((((var3 = (byte[])ObjectArr_a[shortArr_a[var0 - 326 << 1]])[var2++] & 4) != 0 ? 2 : 1) == 2) {
            var2 += var1 << 1;
            return (short)(var3[var2] << 8 | var3[var2 + 1] & 0xFF);
         } else {
            return var3[var2 + var1];
         }
      }
   }

   public static int b_int_int_ret_int(int var0, int var1) {
      int var2 = shortArr_a[(var0 - 326 << 1) + 1];
      byte var3;
      byte[] var5;
      int var4 = (var3 = (var5 = (byte[])ObjectArr_a[shortArr_a[var0 - 326 << 1]])[var2++]) & 3;
      var3 = (byte)((var3 & 4) != 0 ? 2 : 1);
      if (var4 == 1) {
         var2 += var3 << 2;
         short var11 = a_byteArr_int_ret_short(var5, var2);
         var2 += 2;
         var2 = var2 + var3 * 3 * var11 + (var3 << 1) * var1;
         return var3 == 1
            ? var5[var2] << 16 & -65536 | var5[var2 + 1] & 65535
            : a_byteArr_int_ret_short(var5, var2) << 16 & -65536 | a_byteArr_int_ret_short(var5, var2 + 2) & 65535;
      } else {
         return 0;
      }
   }

   public static void b_int_int_int_int(int var0, int var1, int var2, int var3) {
      a_int_int_int(var0, var1, c_int_int_ret_int(var2, var3));
   }

   public static int c_int_int_ret_int(int var0, int var1) {
      int var2 = shortArr_a[(var0 - 326 << 1) + 1];
      byte[] var3 = (byte[])ObjectArr_a[shortArr_a[var0 - 326 << 1]];
      var2 += 3;
      var2 += var1 << 1;
      return var3[var2] << 8 | var3[var2 + 1] & 0xFF;
   }

   public static int b_int_ret_int(int var0) {
      int var1 = shortArr_a[(var0 - 326 << 1) + 1];
      byte[] var2 = (byte[])ObjectArr_a[shortArr_a[var0 - 326 << 1]];
      return a_byteArr_int_ret_short(var2, ++var1);
   }

   public static void g() {
      boolean_h = true;
   }

   public static boolean c_ret_boolean() {
      return boolean_h;
   }

   private static void a_byteArr_int_String(byte[] var0, int var1, String var2) {
      if (var0 == null) {
         InputStream var6 = Engine.class.getResourceAsStream(var2);

         try {
            var0 = a_InputStream_int(var6, -1);
         } catch (Exception var3) {
         }
      }

      if (var1 >= 0) {
         ObjectArr_a[var1] = var0;
         booleanArr_a[var1] = var0 != null;
      }
   }

   public static void d_int_int(int var0, int var1) {
      synchronized (Object_b) {
         if (boolean_e) {
            if (var1 == -1) {
               int_g = var0;
            } else {
               int_g = -1;
            }
         } else {
            int_g = -1;
            byte[] var3;
            if ((var3 = (byte[])a_int_ret_Object(var0)) != null) {
               h();
               if (boolean_h) {
                  try {
                     if (var1 == -1) {
                        var1 = -1;
                        int_p = var0;
                     }

                     Player_a = new MidiPlayer(var3);
                     Player_a.setVolume(int_o);
                     Player_a.start(var1);
                  } catch (Exception var4) {
                  }
               }
            }
         }
      }
   }

   public static void h() {
      synchronized (Object_b) {
         int_g = -1;
         if (boolean_h && Player_a != null) {
            try {
               Player_a.close();
            } catch (Exception var2) {
            }

            int_p = -1;
            Player_a = null;
         }
      }
   }

   public static void i() {
      // backlight control not applicable on desktop
   }

   public static void e_int_ret_void(int var0) {
      synchronized (Object_b) {
         int_r = 0;
         int_t = 0;
         int_s = 0;
         if (var0 == 1) {
            o_a = new Engine();
            new Thread(o_a).start();
         } else if (o_a != null) {
            if (var0 != 2 && var0 != 4) {
               if ((var0 == 3 || var0 == 5) && boolean_d) {
                  boolean_d = false;
                  Object_b.notifyAll();
               }
            } else if (!boolean_d) {
               boolean_d = true;
               boolean_e = true;
               var0 = int_p;
               h();
               int_g = var0;
            }
         }
      }
   }

   public final void run() {
      try {
         if (boolean_b) {
            synchronized (Object_a) {
               try {
                  Object_a.wait(500L);

                  while (boolean_f) {
                     o();
                     g_int(2);
                     Object_a.wait(int_d);
                  }
               } catch (InterruptedException var4) {
               }
            }
         } else {
            boolean_b = true;
            intArr_a = new int[20];
            int_e = 0;
            intArr_b = new int[40];
            int_f = 0;
            intArr_f = new int[20];
            int_u = 0;
            StringArr_a = new String[3];
            StringArr_b = new String[3];
            intArr_c = new int[3];
            window = new GameWindow();
            window.show(2);
            o();
            Vector_a = new Vector();
            Vector_b = new Vector();
            (pArr_a = new ResourceReader[1])[0] = o_a;
            b_a = new Game();
            f_int(1);
            m();

            while (!boolean_g) {
               try {
                  System.currentTimeMillis();
                  if (!boolean_c) {
                     boolean_e = true;
                  }

                  o();
                  if (int_e > 0) {
                     synchronized (intArr_a) {
                        for (int var2 = 0; var2 < int_e; var2++) {
                           b_a.c_int_ret_void(intArr_a[var2]);
                           intArr_a[var2] = 0;
                        }

                        int_e = 0;
                     }

                     synchronized (Object_b) {
                        if (int_g != -1) {
                           d_int_int(int_g, -1);
                           int_g = -1;
                        }
                     }
                  }

                  if (d_ret_boolean()) {
                     for (int var10 = 0; var10 < StringArr_a.length; var10++) {
                        StringArr_b[var10] = null;
                     }

                     n();
                     System.currentTimeMillis();
                  }

                  if (boolean_e) {
                     q();
                  } else {
                     for (int var11 = 0; var11 < StringArr_a.length; var11++) {
                        if (StringArr_b[var11] != StringArr_a[var11]) {
                           if (StringArr_b[var11] != null && StringArr_b[var11].equals(StringArr_a[var11])) {
                              StringArr_a[var11] = StringArr_b[var11];
                           } else {
                              StringArr_b[var11] = StringArr_a[var11];
                           }
                        }
                     }

                     g_int(1);
                     if (boolean_e) {
                        q();
                     } else {
                        p();
                        if (!boolean_g) {
                           if (boolean_j) {
                              int var12 = int_x;
                              if (int_x >= 10 && var12 <= 19 && System.currentTimeMillis() - long_c > 500L) {
                                 h_int(var12);
                              }
                           }

                           if (boolean_e) {
                              q();
                           } else {
                              Thread.sleep(1L);
                           }
                        }
                     }
                  }
               } catch (Throwable var7) {
                  var7.printStackTrace();
               }
            }

            b_a = null;
            h();

            for (int var13 = 0; var13 < ObjectArr_a.length; var13++) {
               Vector_b.addElement(new Integer(var13));
            }

            l();
            window.close();
            System.exit(0);
         }
      } catch (Throwable var8) {
         var8.printStackTrace();
      }
   }

   private static void m() {
      long_a = 0L;
      int_a = 0;
      e_ret_void();
   }

   private static boolean d_ret_boolean() {
      return Vector_a.size() > 0 || Vector_b.size() > 0 || int_f > 0;
   }

   private static void n() throws java.lang.Exception {
      boolean_f = true;
      new Thread(o_a).start();
      j();
      int var0 = 0;
      int var1 = 0;

      while (var0 < int_f || !Vector_a.isEmpty() || !Vector_b.isEmpty()) {
         if (!Vector_b.isEmpty()) {
            l();
            System.gc();
         }

         if (!Vector_a.isEmpty()) {
            k();
            System.gc();
         }

         if (var0 < int_f && (var1 = b_a.a_int_int_ret_int(intArr_b[var0], var1)) == 0) {
            var0++;
         }
      }

      synchronized (Object_a) {
         boolean_f = false;
         Object_a.notify();
      }

      int_f = 0;
      m();
   }

   private static void o() {
      int var0 = GameWindow.WIDTH;
      int var1 = GameWindow.HEIGHT;
      if (int_b != var0 || int_c != var1) {
         int_b = var0;
         int_c = var1;
         if (b_a != null) {
            f_int(2);
         }
      }
   }

   private static void g_int(int var0) {
      int_j = var0;
      Gfx var6 = window.getGraphics();
      if (int_j != 0) {
         try {
            label60: {
               Graphics_a = var6;
               Graphics_b = var6;
               var6.setClip(0, 0, int_b, int_c);
               if (b_a == null) {
                  var6.setColor(0);
                  var6.fillRect(0, 0, int_b, int_c);
               } else {
                  if (!boolean_c) {
                     break label60;
                  }

                  b_a.a_int_ret_int(int_j);
               }

               var6.setClip(0, 0, int_b, int_c);

               for (int var7 = 0; var7 < 3; var7++) {
                  String var1;
                  if ((var1 = StringArr_b[var7]) != null) {
                     int var2 = c_int_ret_int(var7);
                     int var3 = 0;
                     int var4 = 0;
                     if ((var2 & 4) == 4) {
                        var3 = 2;
                     }

                     if ((var2 & 8) == 8) {
                        var3 = int_b - 2;
                     }

                     if ((var2 & 1) == 1) {
                        var3 = int_b >> 1;
                     }

                     if ((var2 & 16) == 16) {
                        var4 = 2;
                     }

                     if ((var2 & 32) == 32) {
                        var4 = int_c - 2;
                     }

                     if ((var2 & 2) == 2) {
                        var4 = int_c >> 1;
                     }

                     Game.a_String_int_int_int_int(var1, intArr_c[var7], var3, var4, var2);
                  }
               }
            }
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      }

      window.flush();
      int_j = 0;
   }

   private static void p() {
      long var0 = System.currentTimeMillis();
      if (long_a != 0L) {
         if ((int_a = (int_a = (int)(var0 - long_a)) / int_i) > int_h) {
            int_a = int_h;
         }
      } else {
         int_a = 0;
      }

      long_a = var0;
      boolean_i = false;

      for (int var2 = 0; var2 < int_i; var2++) {
         for (int var1 = 0; var1 < int_u; var1++) {
            b_a.b_int_ret_void(intArr_f[var1]);
            intArr_f[var1] = -1;
         }

         int_u = 0;
         int_t = int_r | int_s;
         int_s = 0;
         b_a.b_ret_int();
         if (d_ret_boolean()) {
            break;
         }
      }
   }

   private static void q() {
      synchronized (Object_b) {
         if (!d_ret_boolean()) {
            boolean_e = false;
            f_int(3);
         }

         if (boolean_d) {
            try {
               Object_b.wait();
            } catch (InterruptedException var2) {
            }
         }
      }

      m();
   }

   private static int e_int_ret_int(int var0) {
      if (var0 == -7) {
         return 5;
      } else if (var0 == -6) {
         return 6;
      } else if (var0 == -5) {
         return 7;
      } else {
         switch (var0) {
            case 35:
               return 21;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            default:
               switch (var0) {
                  case -1:
                     return 1;
                  case -2:
                     return 2;
                  case -3:
                     return 3;
                  case -4:
                     return 4;
                  default:
                     return -1;
               }
            case 42:
               return 20;
            case 48:
               return 10;
            case 49:
               return 11;
            case 50:
               return 12;
            case 51:
               return 13;
            case 52:
               return 14;
            case 53:
               return 15;
            case 54:
               return 16;
            case 55:
               return 17;
            case 56:
               return 18;
            case 57:
               return 19;
         }
      }
   }

   private static void e_int_int(int var0, int var1) {
      if (!boolean_i) {
         if (boolean_c) {
            try {
               if ((var1 & 8) == 8) {
                  var0 = e_int_ret_int(var0);
               }

               if (int_q == 2) {
                  if (var0 == 15) {
                     var0 = 7;
                  } else if (var0 == 12) {
                     var0 = 1;
                  } else if (var0 == 14) {
                     var0 = 3;
                  } else if (var0 == 18) {
                     var0 = 2;
                  } else if (var0 == 16) {
                     var0 = 4;
                  }
               }

               if (int_q == 3 && (var0 >= 10 && var0 <= 21 || var0 == 21)) {
                  if ((var1 & 1) != 1) {
                     if ((var1 & 2) == 2) {
                        if (var0 >= 10 && var0 <= 19 && System.currentTimeMillis() - long_b > 1200L) {
                           int_w = 0;
                           long_b = 0L;
                        }

                        h_int(var0);
                     }
                  } else {
                     if (var0 != 21) {
                        long var2;
                        if ((var2 = System.currentTimeMillis()) - long_b < 700L && var0 == int_v) {
                           int_w++;
                        } else {
                           int_w = 0;
                        }

                        var1 = var0 - 10;
                        if (charArr2_a[var1].length == 0 || var1 < 0) {
                           return;
                        }

                        long_b = var2;
                        int_v = var0;
                        char var6 = charArr2_a[var1][int_w % charArr2_a[var1].length];
                        if ((var0 != int_x || var6 != char_a) && !boolean_j) {
                           int_x = var0;
                           char_a = var6;
                           long_c = System.currentTimeMillis();
                           boolean_j = true;
                        }
                     }
                  }
               } else {
                  if ((var1 & 1) == 1) {
                     if (int_u < 20) {
                        intArr_f[int_u] = var0;
                        int_u++;
                     }

                     if (var0 != -1) {
                        int_r |= 1 << var0;
                        int_s |= 1 << var0;
                        return;
                     }
                  } else if ((var1 & 2) == 2 && var0 != -1) {
                     int_r &= ~(1 << var0);
                  }
               }
            } catch (Throwable var4) {
               var4.printStackTrace();
            }
         }
      }
   }

   private static void h_int(int var0) {
      if (var0 == int_x && boolean_j) {
         boolean_j = false;
         int_x = 999;
         char_a = ' ';
      }
   }

   public static void keyPressed(int keyCode) {
      e_int_int(keyCode, 9);
   }

   public static void keyReleased(int keyCode) {
      e_int_int(keyCode, 10);
   }

   /** Asks the game loop to terminate. */
   public static void requestQuit() {
      a_ret_void();
      synchronized (Object_b) {
         boolean_d = false;
         Object_b.notifyAll();
      }
   }

   public static void pause() {
      e_int_ret_void(4);
   }

   public static void resume() {
      e_int_ret_void(5);
   }

   public static void start() {
      e_int_ret_void(1);
   }

   /** Opens a URL in the system browser; returns true on success. */
   public static boolean openUrl(String url) {
      try {
         if (url != null && java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            return true;
         }
      } catch (Exception ignored) {
      }
      return false;
   }
}
