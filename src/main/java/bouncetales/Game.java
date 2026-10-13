package bouncetales;

import java.util.Random;

public final class Game {
   public static final short[] shortArr_a = new short[]{
      1,
      47,
      48,
      45,
      43,
      46,
      44,
      55,
      8,
      72,
      73,
      74,
      0,
      87,
      79,
      78,
      80,
      77,
      76,
      9,
      12,
      54,
      7,
      53,
      52,
      5,
      89,
      88,
      56,
      75,
      91,
      90,
      71,
      67,
      66,
      59,
      65,
      64,
      63,
      62,
      58,
      61,
      60,
      70,
      69,
      57,
      68,
      6,
      11,
      10,
      86,
      85,
      83,
      84,
      50,
      82,
      81,
      51,
      49,
      41,
      40,
      39,
      42,
      38,
      37,
      36,
      35,
      34,
      33,
      27,
      26,
      25,
      24,
      23,
      22,
      21,
      20,
      19,
      18,
      17,
      16,
      15,
      14,
      13,
      32,
      31,
      30,
      29,
      28,
      4,
      3,
      2
   };
   private static boolean boolean_e;
   private Cls_s s_a = null;
   private final Cls_s s_b = new Cls_s();
   private int int_i = 1;
   private static byte byte_a;
   private static final byte[] byteArr_a = new byte[]{10, 10, 10};
   private static final byte[] byteArr_b = new byte[]{11, 11, 11};
   private static boolean boolean_f;
   private static boolean boolean_g;
   private static String String_a;
   private static short[] shortArr_c;
   public static Random Random_a;
   public static int int_a;
   public static int int_b;
   private static int int_j;
   private static int int_k;
   private static int int_l;
   private static int int_m;
   public static int int_c;
   public static int int_d;
   private static int int_n;
   private static float[] floatArr_a;
   private static int[] intArr_c;
   private static int[] intArr_d;
   private static int int_o;
   private static short[] shortArr_d;
   private static short[] shortArr_e;
   private static short[] shortArr_f;
   private static short[] shortArr_g;
   private static short[] shortArr_h;
   private static short[] shortArr_i;
   private static short[] shortArr_j;
   private static short[] shortArr_k;
   private static short[] shortArr_l;
   private static short[] shortArr_m;
   private static short[] shortArr_n;
   private static short[] shortArr_o;
   private static short[] shortArr_p;
   private static short[] shortArr_q;
   private static short[] shortArr_r;
   private static short[] shortArr_s;
   private static short[] shortArr_t;
   private static short[] shortArr_u;
   private static short[] shortArr_v;
   private static int int_p;
   private static int int_q;
   private static int int_r;
   private static int int_s;
   public static short[] shortArr_b;
   public static boolean boolean_a;
   public static Cls_h h_a;
   private static String String_b;
   public static Cls_g g_a;
   public static Cls_g g_b;
   public static Cls_g g_c;
   public static Cls_g g_d;
   public static Cls_g g_e;
   public static Cls_g g_f;
   public static Cls_g g_g;
   public static Cls_g g_h;
   private static int[] intArr_e;
   private static int[] intArr_f;
   private static int[] intArr_g;
   private static int[] intArr_h;
   private static int[] intArr_i;
   private static int[] intArr_j;
   private static int[] intArr_k;
   private static int[] intArr_l;
   public static Cls_g g_i;
   private static int[] intArr_m;
   private static boolean boolean_h;
   private static boolean boolean_i;
   private static Img[] ImageArr_a;
   private static Img[] ImageArr_b;
   public static Img Image_a;
   public static Gfx Graphics_a;
   public static int[] intArr_a;
   public static Img Image_b;
   public static Gfx Graphics_b;
   public static int[] intArr_b;
   private static boolean boolean_j;
   private static int int_t;
   private static int[] intArr_n;
   private static String[] StringArr_a;
   private static boolean boolean_k;
   private static boolean boolean_l;
   private static int int_u;
   private int int_v = 0;
   private static boolean boolean_m;
   private int int_w;
   private long long_a;
   private static final int[] intArr_o;
   private static final int[] intArr_p;
   private static final int[] intArr_q;
   private static final int[] intArr_r;
   private boolean boolean_n = false;
   public static boolean boolean_b;
   public static int int_e;
   private static Cls_f[] fArr_b;
   public static Cls_f[] fArr_a;
   public static Cls_f f_a;
   private static Cls_m[] mArr_a;
   public static Cls_c c_a;
   public static Cls_d d_a;
   public static boolean boolean_c;
   public static int int_f;
   public static int int_g;
   public static int int_h;
   private static int int_x;
   public static boolean boolean_d;
   private static int int_y;
   private static int[] intArr_s;
   private static int[] intArr_t;
   private static int[] intArr_u;
   private static int[] intArr_v;
   private static int[] intArr_w;
   private static short[] shortArr_w;
   private static boolean boolean_o;
   private static boolean boolean_p;
   private static int int_z;
   private static int int_A;
   private boolean boolean_q = false;
   private boolean boolean_r = false;
   private boolean boolean_s = false;
   private int int_B = -1;
   private int int_C = -1;
   private boolean boolean_t = false;

   public static int a_ret_int() {
      byte var0 = 0;
      if (a_int_ret_boolean(intArr_d[0]) || int_e == intArr_d[0] && Cls_m.intArr_a[2] > 0) {
         var0 = 1;
      }

      if (a_int_ret_boolean(intArr_d[1]) || int_e == intArr_d[1] && Cls_m.intArr_a[2] > 0) {
         var0 = 2;
      }

      return var0;
   }

   private static boolean b_int_ret_boolean(int var0) {
      return shortArr_f[(var0 << 2) + 1] > 0;
   }

   public static boolean a_int_ret_boolean(int var0) {
      var0 <<= 2;
      return shortArr_f[var0 + 1] > 0 && shortArr_f[var0 + 1] < 9999;
   }

   private static void a_int_short_short_short(int var0, short var1, short var2, short var3) {
      var0 <<= 2;
      if (var1 > shortArr_f[var0]) {
         shortArr_f[var0] = var1;
      }

      if (var2 < shortArr_f[var0 + 1]) {
         shortArr_f[var0 + 1] = var2;
      }

      if (var3 > shortArr_f[var0 + 2]) {
         shortArr_f[var0 + 2] = var3;
      }

      if (var3 > shortArr_f[var0 + 3]) {
         shortArr_f[var0 + 3] = var3;
      }
   }

   private static void e_int_ret_void(int var0) {
      if (shortArr_f[(var0 << 2) + 1] == 0) {
         shortArr_f[(var0 << 2) + 1] = 9999;
      }
   }

   private static void f_int(int var0) {
      var0 <<= 2;
      if (shortArr_f[var0 + 1] == 0 || shortArr_f[var0 + 1] == 9999) {
         shortArr_f[var0 + 1] = 300;
      }
   }

   private static boolean c_int_ret_boolean(int var0) {
      for (int var1 = 0; var1 < intArr_c.length; var1 += 2) {
         if (var0 == intArr_c[var1]) {
            return true;
         }
      }

      return false;
   }

   private static int d_ret_int() {
      short var0 = 0;

      for (int var1 = 0; var1 < 15; var1++) {
         var0 += shortArr_f[var1 << 2];
      }

      return var0;
   }

   private static boolean a_ret_boolean() {
      for (int var0 = 0; var0 < 15; var0++) {
         int var1 = var0 << 2;
         if (shortArr_f[var1] < shortArr_d[var0 * 3]) {
            return false;
         }

         if (shortArr_f[var1 + 1] > shortArr_e[var0 * 3]) {
            return false;
         }
      }

      return true;
   }

   private static final void a_ret_void() {
      int var0 = 20520;
      int var1 = 0;
      int var2 = 0;

      while (var1 < 360) {
         int var3 = var2 / 57;
         var0 -= var3;
         var2 += var0 / 57;
         shortArr_b[var1++] = (short)var3;
      }
   }

   private void g_int(int var1) {
      this.s_b.a_ret_void();
      this.s_b.b_int_ret_void(0);
      this.s_b.b_int_ret_void(1);
      this.s_b.intArr_b = null;
      this.s_b.intArr_a = null;
      this.s_b.int_a = var1;
      this.s_b.a_int_int_ret_void(9, -2);
      this.s_b.b_int_int_ret_void(13, -2);
      switch (var1) {
         case 10:
            this.s_b.d_int_ret_void(36);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - int_q);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.a_int_int_ret_void(3, 0);
            this.s_b.a_int_int_ret_void(2, 32);
            this.s_b.b_int_int_ret_void(14, Engine.a_int_ret_int(-3) << 1);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(72));
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(48), 17);
            boolean var8 = false;

            for (int var17 = 0; var17 < 15; var17++) {
               if (shortArr_f[(var17 << 2) + 3] > 0) {
                  var8 = true;
               }
            }

            if (var8) {
               String[] var20 = new String[1];

               for (int var9 = 0; var9 < 15; var9++) {
                  String var4 = "0";
                  if (shortArr_f[(var9 << 2) + 3] > 0) {
                     var4 = "" + shortArr_f[(var9 << 2) + 3];
                  }

                  String var18;
                  if (c_int_ret_boolean(var9)) {
                     var20[0] = a_int_ret_String(var9);
                     var18 = Strings.a_int_StringArr(75, var20);
                  } else {
                     var20[0] = a_int_ret_String(var9);
                     var18 = Strings.a_int_StringArr(56, var20);
                  }

                  byte var5 = 89;
                  if (var9 == 0) {
                     var5 = -1;
                  }

                  this.s_b.a_r(new Cls_r(var18 + "\n" + var4, var5, this.s_b, -1));
               }
            } else {
               this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(87), -1, this.s_b, -1));
            }
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 19:
         case 21:
         case 23:
         case 26:
         case 27:
         default:
            break;
         case 17:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -2);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.a_int_int_ret_void(5, 256);
            this.s_b.b_int_int_ret_void(6, int_p);
            this.s_b.b_int_int_ret_void(5, 128);
            this.s_b.a_int_int_ret_void(18, 16742400);
            this.s_b.a_String_ret_void("");
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(1), -2);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(47), 9);
            if (b_int_ret_boolean(1)) {
               this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(74), -1, this.s_b, 18));
               this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(55), -1, this.s_b, 20));
            } else {
               this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(55), -1, this.s_b, 18));
               int_j = 0;
            }

            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(72), -1, this.s_b, 10));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(73), -1, this.s_b, 22));
            if (boolean_g) {
               this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(0), -1, this.s_b, 38));
            }

            this.s_b.a_int_ret_void(int_n);
            break;
         case 18:
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(1), 7);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(48), 17);
            a_s(this.s_b);
            break;
         case 20:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(8));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(43), 11);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(46), 17);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(89), -1, this.s_b, -1));
            break;
         case 22:
            this.s_b.d_int_ret_void(36);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - int_q);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.a_int_int_ret_void(3, 0);
            this.s_b.a_int_int_ret_void(2, 32);
            this.s_b.b_int_int_ret_void(14, Engine.a_int_ret_int(-3) << 1);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(73));
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(48), 17);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(79), -1, this.s_b, -1));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(78), 102, this.s_b, -1));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(80), -1, this.s_b, -1));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(77), 371, this.s_b, -1));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(76), 372, this.s_b, -1));
            break;
         case 24:
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(12));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(43), 9);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(46), 17);
            break;
         case 25:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.a_int_int_ret_void(5, 256);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(12, Engine.int_b - 40);
            this.s_b.b_int_int_ret_void(4, 64);
            this.s_b.b_int_int_ret_void(3, 32);
            this.s_b.b_int_int_ret_void(5, 128);
            this.s_b.a_int_int_ret_void(18, 16742400);
            this.s_b.b_int_int_ret_void(2, 0);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(9));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(1), -2);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(44), 30);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(53), -1, this.s_b, 8));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(54), -1, this.s_b, 28));
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(52), -1, this.s_b, 29));
            this.s_b.a_int_ret_void(int_n);
            break;
         case 28:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.a_int_int_ret_void(5, 256);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - 40);
            this.s_b.b_int_int_ret_void(4, 64);
            this.s_b.b_int_int_ret_void(3, 32);
            this.s_b.b_int_int_ret_void(2, 0);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(7));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(43), 37);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(46), 25);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(88), -1, this.s_b, -1));
            break;
         case 29:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            int_u = 18;
            this.s_b.a_int_int_ret_void(5, 256);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - 40);
            this.s_b.b_int_int_ret_void(4, 64);
            this.s_b.b_int_int_ret_void(3, 32);
            this.s_b.b_int_int_ret_void(2, 0);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(5));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(43), 5);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(46), 25);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(88), -1, this.s_b, -1));
            break;
         case 30:
            this.s_b.d_int_ret_void(37);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            int_u = 17;
            this.s_b.a_int_int_ret_void(5, 256);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - 40);
            this.s_b.b_int_int_ret_void(4, 64);
            this.s_b.b_int_int_ret_void(3, 32);
            this.s_b.b_int_int_ret_void(2, 0);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(12));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(43), 5);
            this.s_b.a_int_String_int(1, Strings.a_int_ret_String(46), 25);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(88), -1, this.s_b, -1));
            break;
         case 31:
            this.s_b.d_int_ret_void(36);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - int_q);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(6));
            if (this.boolean_r) {
               this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 33);
            } else if (this.boolean_q) {
               this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 32);
            } else {
               this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 18);
            }

            String[] var6;
            (var6 = new String[1])[0] = "" + int_o;
            Cls_r var10 = new Cls_r(Strings.a_int_StringArr(49, var6), -1, this.s_b, -1);
            this.s_b.a_r(var10);
            var6[0] = int_f + "/" + int_y;
            var10 = new Cls_r(var6[0], 102, this.s_b, -1);
            if (boolean_e) {
               var10.a_int_int_ret_void(2, 16);
               var10.a_String_int(var6[0], 102);
            }

            this.s_b.a_r(var10);
            var6[0] = b_int_ret_String(int_a / 1000);
            var10 = new Cls_r(var6[0], 103, this.s_b, -1);
            if (boolean_e) {
               var10.a_int_int_ret_void(2, 16);
               var10.a_String_int(var6[0], 103);
            }

            this.s_b.a_r(var10);
            if (this.boolean_t) {
               (var10 = new Cls_r(Strings.a_int_ret_String(51), -1, this.s_b, -1)).a_int_int_ret_void(1, 8);
               var10.a_String_int(Strings.a_int_ret_String(51), -1);
               this.s_b.a_r(var10);
            }

            if (a_int_ret_boolean(13) && !this.boolean_q && !c_int_ret_boolean(int_e)) {
               boolean var7 = false;
               if (this.int_B >= 0) {
                  short var14 = shortArr_c[this.int_B];
                  var7 = true;
                  Cls_r var3 = new Cls_r(Strings.a_int_ret_String(83), var14, this.s_b, -1);
                  if (boolean_e) {
                     var3.a_int_int_ret_void(2, 0);
                  } else {
                     var3.a_int_int_ret_void(2, 16);
                  }

                  var3.a_int_int_ret_void(3, 64);
                  var3.a_int_int_ret_void(1, 8);
                  var3.a_String_int(Strings.a_int_ret_String(83), var14);
                  this.s_b.a_r(var3);
               }

               if (this.int_C >= 0) {
                  short var15 = shortArr_c[this.int_C];
                  var7 = true;
                  Cls_r var19 = new Cls_r(Strings.a_int_ret_String(84), var15, this.s_b, -1);
                  if (boolean_e) {
                     var19.a_int_int_ret_void(2, 0);
                  } else {
                     var19.a_int_int_ret_void(2, 16);
                  }

                  var19.a_int_int_ret_void(3, 64);
                  var19.a_int_int_ret_void(1, 8);
                  var19.a_String_int(Strings.a_int_ret_String(84), var15);
                  this.s_b.a_r(var19);
               }

               if (!var7) {
                  (var10 = new Cls_r(Strings.a_int_ret_String(50), -1, this.s_b, -1)).a_int_int_ret_void(1, 8);
                  var10.a_String_int(Strings.a_int_ret_String(50), -1);
                  this.s_b.a_r(var10);
               }
            }

            this.boolean_q = false;
            this.boolean_r = false;
            this.int_B = -1;
            this.int_C = -1;
            this.boolean_t = false;
            a_s_boolean(this.s_b, false);
            break;
         case 32:
            this.s_b.d_int_ret_void(36);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - int_q);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(11));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 18);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(86), -1, this.s_b, -1));
            break;
         case 33:
            this.s_b.d_int_ret_void(36);
            this.s_b.a_int_int_ret_void(9, -3);
            this.s_b.b_int_int_ret_void(13, -2);
            this.s_b.b_int_int_ret_void(6, 40);
            this.s_b.b_int_int_ret_void(7, 5);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - int_q);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(9, 18);
            this.s_b.a_String_ret_void(Strings.a_int_ret_String(10));
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 18);
            this.s_b.a_r(new Cls_r(Strings.a_int_ret_String(85), -1, this.s_b, -1));
            break;
         case 34:
            this.s_b.a_int_int_ret_void(9, -1);
            this.s_b.b_int_int_ret_void(13, -1);
            this.s_b.b_int_int_ret_void(15, 2);
            this.s_b.b_int_int_ret_void(16, 2);
            this.s_b.b_int_int_ret_void(11, Engine.int_b - 40 + 4);
            this.s_b.b_int_int_ret_void(12, Engine.int_c - 40);
            this.s_b.b_int_int_ret_void(4, 64);
            this.s_b.b_int_int_ret_void(3, 32);
            this.s_b.b_int_int_ret_void(2, 0);
            this.s_b.a_String_ret_void("");
            this.s_b.a_int_String_int(0, Strings.a_int_ret_String(45), 35);
            if (boolean_l) {
               this.s_b.a_r(new Cls_r(String_b, -1, this.s_b, -1));
               boolean_l = false;
            } else {
               String var2;
               if (StringArr_a != null) {
                  var2 = Strings.a_int_StringArr(intArr_n[0], StringArr_a);
                  StringArr_a = null;
               } else {
                  var2 = Strings.a_int_ret_String(intArr_n[0]);
               }

               if (var2.endsWith("\n\n")) {
                  var2 = var2.substring(0, var2.length() - 2);
               } else if (var2.startsWith("\n\n")) {
                  var2 = var2.substring(2, var2.length());
               }

               String_b = var2;
               this.s_b.a_r(new Cls_r(var2, -1, this.s_b, -1));
            }
      }

      this.s_a = this.s_b;
      this.s_b.b_ret_void();
      Engine.d_ret_void();
      Engine.e_ret_void();
   }

   private void b_ret_void() {
      this.s_a = null;
      Engine.c_ret_void();
      Engine.a_int_String_int(1, "", 1);
      Engine.d_ret_void();
      Engine.e_ret_void();
   }

   private static void a_s_boolean(Cls_s var0, boolean var1) {
      boolean var2 = false;
      if (int_j != 14) {
         if (int_k < int_j) {
            var2 = true;
         }

         int_k = int_j++;
         if (int_l == 0 || var2) {
            int_l = 650;
         }

         int_m = 0;
         if (var1) {
            a_s(var0);
         }
      }
   }

   private static void a_s(Cls_s var0) {
      if (b_int_ret_boolean(int_j)) {
         var0.b_String(Strings.a_int_ret_String(1));
      } else {
         var0.b_String(null);
      }
   }

   public static boolean a_s_int_int_int_int_int(Cls_s var0, int var1, int var2, int var3, int var4, int var5) {
      Engine.i();
      Gfx var6 = Engine.a_ret_Graphics();
      int var7 = Engine.int_a * Engine.a_ret_int();
      Gfx var8 = var6;
      if ((var0.int_a == 34 || var0.int_a == 25 || var0.int_a == 28 || var0.int_a == 29 || var0.int_a == 30) && var1 == 1) {
         int[] var21 = Cls_i.intArr_a;
         int[] var38 = Cls_i.intArr_b;
         var21[0] = var2;
         var38[0] = var3;
         var21[1] = var2 + var4;
         var38[1] = var3;
         var21[2] = var2 + var4;
         var38[2] = var3 + var5;
         var21[3] = var2;
         var38[3] = var3 + var5;
         var8.fillPolygon(var21, 0, var38, 0, 4, 1426063360);
         Engine.a_int_int_int(var2, var3, 311);
         Engine.a_int_int_int(var2 + var4, var3, 312);
         Engine.a_int_int_int(var2, var3 + var5, 309);
         Engine.a_int_int_int(var2 + var4, var3 + var5, 310);
         a_DirectGraphics(var8);
         return false;
      } else if (var0.int_a != 18) {
         if (var0.int_a != 25 && var0.int_a != 28 && var0.int_a != 29 && var0.int_a != 30 && var0.int_a != 15 && var0.int_a != 34 && var1 == 1) {
            a_Graphics(var6);
            var1 = Engine.int_b >> 1;
            int var37 = Engine.int_c >> 1;
            if (var0.int_a == 17) {
               int var15;
               var2 = (var15 = Engine.b_int_int_ret_int(332, 0)) >> 16;
               short var27 = (short)var15;
               int var16;
               var4 = (var16 = Engine.b_int_int_ret_int(332, 1)) >> 16;
               short var17 = (short)var16;
               var5 = var1 - 117;
               var7 = var37 - 157;
               int var40 = var1 + var4 - var5;
               var6.setColor(6570800);
               var6.fillRect(var1 + var2, var37 + var27, var4 - var2, var17 - var27);
               Engine.a_int_int_int(var1, var37, 332);
               var6.setColor(5580559);
               var6.drawRect(var5 + 2, var7 + 2, var40 - 4, 296);
               var6.drawRect(var5 + 3, var7 + 3, var40 - 6, 294);
               var6.setColor(3610889);
               var6.drawRect(var5, var7, var40, 300);
               var6.drawRect(var5 + 1, var7 + 1, var40 - 2, 298);
               Engine.c_int_int_ret_void(var1 + var40 - 117 + 2, var7 - 2);
               Engine.a_int_int_int_int(var1 + var40 - 117 + 2, var37 + 300 - 157 + 2, 12, 40);
               Engine.a_int_int_int_int(var5 - 5, var37 - 75, 15, 6);
               Engine.a_int_int_int_int(var5 - 5, var37 + 75, 15, 6);
            } else {
               a_int_int_Graphics(var1, var37, var6);
            }

            a_DirectGraphics(var8);
            return false;
         } else {
            if (var1 == 1) {
               a_DirectGraphics(var8);
            }

            if (var1 == 4) {
               return false;
            } else if (var1 == 2) {
               return false;
            } else if (var1 == 9) {
               return false;
            } else if (var0.int_a != 25 && var0.int_a != 28 && var0.int_a != 29 && var0.int_a != 30 && var0.int_a != 34 && var1 == 10) {
               var6.setClip(0, 0, Engine.int_b, Engine.int_c);
               var1 = shortArr_b[(int)((System.currentTimeMillis() >> 1) % 360L)] * 5 / 360;
               Engine.a_int_int_int_int(var2 - 5 - 4 + var1, var3 + (var5 >> 1), 2, 10);
               Engine.a_int_int_int_int(var2 + var4 + 5 + 4 - var1, var3 + (var5 >> 1), 326, 6);
               return false;
            } else {
               return true;
            }
         }
      } else {
         if (var1 == 1) {
            a_Graphics(var6);
            var1 = Engine.int_b >> 1;
            int var9 = Engine.int_c >> 1;
            var2 = (short)Engine.b_int_int_ret_int(331, 2) + var9;
            var4 = (short)Engine.b_int_int_ret_int(331, 3) + var9;
            Engine.a_int_int_ret_void(-3, 3);
            if ((var3 = 10 + Engine.a_int_ret_int(Engine.f_ret_int()) * 3) > var2) {
               var2 = var3 + 2;
            }

            a_int_int_Graphics(var1, var9, var6);
            if (int_j != 0) {
               Engine.a_int_int_int_int(3, var9, 326, 6);
            }

            if (int_j != 14) {
               Engine.a_int_int_int_int(Engine.int_b - 3, var9, 2, 10);
            }

            int var12 = 0;
            var3 = 0;
            if (int_l < int_m) {
               if ((int_l += var7) > int_m) {
                  int_l = int_m;
               }

               var12 = int_j;
               var3 = int_k;
            } else if (int_l > int_m) {
               if ((int_l -= var7) < int_m) {
                  int_l = int_m;
               }

               var12 = int_k;
               var3 = int_j;
            }

            if (int_l > 400 && int_l < 650) {
               var3 = (int_l - 400 << 1) / 250;
               a_int_int_int_int_int(var1, var9, var12, var2, var4);
               Engine.b_int_int_int_int(var1, var9, 442, var3);
            } else if (int_l <= 400 && int_l > 0) {
               var5 = var1 - 119 - 239 + 22;
               var7 = var1 + 120 + -30;
               int var10 = var1 - 119 + 22;
               int var34 = var7 - 25 - var5;
               int var41 = var7 - var10;
               var5 = int_l * var34 / 400 + var5;
               var7 = int_l * var41 / 400 + var10;
               var10 = var9 - 158 + -3;
               var6.setClip(0, 0, var5 + 3, Engine.int_c);
               a_int_int_int_int_int(var1, var9, var12, var2, var4);
               var6.setClip(var7 - 2, 0, Engine.int_b - var7 + 2, Engine.int_c);
               a_int_int_int_int_int(var1, var9, var3, var2, var4);
               var6.setClip(0, 0, Engine.int_b, Engine.int_c);
               Engine.a_int_int_int(var5, var10, 377);
               var6.setColor(15394508);
               int var13 = var7 - var5 - 12 - 13;
               var6.fillRect(var5 + 12, var10, var13, 295);
               var6.setColor(0);
               var6.fillRect(var5 + 12, var10, var13, 1);
               var6.fillRect(var5 + 12, var10 + 307 - 1 + -12, var13, 1);
               Engine.a_int_int_int(var5 + 12 + var13, var10, 378);
               Engine.a_int_int_int(var1, var9, 376);
            } else {
               a_int_int_int_int_int(var1, var9, int_j, var2, var4);
            }

            Engine.a_int_int_ret_void(-3, 3);
            Engine.b_int_int_ret_void(0, 16742400);
            Engine.b_int_int_ret_void(1, 0);
            Engine.a_int_int_int(9, 9, 102);
            String var10000 = d_ret_int() + "/" + 450;
            Object var14 = null;
            Engine.a_String_int_int_int_int(var10000, var10000.length(), 41, 10, 20);
            a_DirectGraphics(var8);
         }

         return false;
      }
   }

   private static void a_Graphics(Gfx var0) {
      var0.setColor(4135425);
      var0.fillRect(0, 0, Engine.int_b >> 1, Engine.int_c);
      var0.setColor(6170113);
      var0.fillRect(Engine.int_b >> 1, 0, Engine.int_b >> 1, Engine.int_c);
      Engine.a_int_int_int(0, 0, 4);
      Engine.a_int_int_int(0, 0, 74);
      Engine.a_int_int_int(0, 0, 75);
      Engine.a_int_int_int(0, Engine.int_c, 3);
   }

   private static int d_int_ret_int(int var0) {
      byte var1 = -1;
      int var2 = var0 << 2;
      if (shortArr_f[var2] >= shortArr_d[var0 * 3]) {
         var1 = 2;
      } else if (shortArr_f[var2] >= shortArr_d[var0 * 3 + 1]) {
         var1 = 1;
      } else if (shortArr_f[var2] >= shortArr_d[var0 * 3 + 2]) {
         var1 = 0;
      }

      return var1;
   }

   private static int e_int_ret_int(int var0) {
      byte var1 = -1;
      int var2 = var0 << 2;
      if (shortArr_f[var2 + 1] <= shortArr_e[var0 * 3]) {
         var1 = 2;
      } else if (shortArr_f[var2 + 1] <= shortArr_e[var0 * 3 + 1]) {
         var1 = 1;
      } else if (shortArr_f[var2 + 1] <= shortArr_e[var0 * 3 + 2]) {
         var1 = 0;
      }

      return var1;
   }

   private static void a_int_int_int_int_int(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      if ((var5 = b_int_ret_int(var2)) == 0) {
         Engine.a_int_int_int(var0, var1, 8);
      } else if (var5 == 2) {
         Engine.a_int_int_int(var0, var1, 380);
      }

      Engine.a_int_int_int(var0, var1, shortArr_g[var2]);
      String[] var21 = new String[1];
      Engine.a_int_int_ret_void(-3, 1);
      Engine.b_int_int_ret_void(0, 0);
      if (!b_int_ret_boolean(var2)) {
         Engine.a_int_int_int(var0, var1, 149);
         if (c_int_ret_boolean(var2)) {
            int var6 = 0;

            for (int var7 = 0; var7 < intArr_c.length; var7 += 2) {
               if (var2 == intArr_c[var7]) {
                  var6 = intArr_c[var7 + 1];
               }
            }

            var21[0] = "" + var6;
            String var13 = Strings.a_int_StringArr(91, var21);
            int var9 = Engine.a_int_String_int_int(-3, var13, 0, var13.length()) + 23 + 5;
            int var10;
            var6 = (var10 = (Engine.int_b >> 1) - (var9 >> 1)) + var9;
            if (boolean_e) {
               Engine.a_int_int_int_int(var6, var4, 102, 24);
               Engine.a_String_int_int_int_int(var13, var13.length(), var10, var4, 20);
            } else {
               Engine.a_int_int_int_int(var10, var4, 102, 20);
               Engine.a_String_int_int_int_int(var13, var13.length(), var10 + 23 + 5, var4, 20);
            }
         }
      } else {
         int var23 = Engine.a_int_ret_int(-3) + 1;
         int var24 = Engine.a_int_ret_int(-3) + 23 + 3;
         var21[0] = "9999";
         String var14 = Strings.a_int_StringArr(49, var21);
         int var8 = Engine.a_int_String_int_int(-3, var14, 0, var14.length());
         var21[0] = Integer.toString(0);
         int var26 = var2 << 2;
         if (shortArr_f[var26 + 2] > 0) {
            var21[0] = "" + shortArr_f[var26 + 2];
         }

         int var27 = (Engine.int_b >> 1) - (var8 >> 1) - 6;
         String var15 = "00/00";
         int var11 = Engine.a_int_String_int_int(-3, var15, 0, var15.length()) + 23 + 11;
         String var16 = Strings.a_int_StringArr(49, var21);
         if (boolean_e) {
            Engine.a_String_int_int_int_int(var16, var16.length(), var27 + var8, var4, 24);
         } else {
            Engine.a_String_int_int_int_int(var16, var16.length(), var27, var4, 20);
         }

         if (!c_int_ret_boolean(var2)) {
            var21[0] = "" + shortArr_f[var26] + "/" + 30;
            String var17 = var21[0];
            if (boolean_e) {
               Engine.a_int_int_int_int(var27 + var11, var4 + var23, 102, 20);
               Engine.a_String_int_int_int_int(var17, var17.length(), var27 - 11 + var11, var4 + var23 + 11, 10);
            } else {
               Engine.a_int_int_int_int(var27, var4 + var23, 102, 20);
               Engine.a_String_int_int_int_int(var17, var17.length(), var27 + 23 + 11, var4 + var23 + 11, 6);
            }
         }

         if (a_int_ret_boolean(13) && !c_int_ret_boolean(var2)) {
            if ((var8 = d_int_ret_int(var2)) >= 0) {
               var8 = shortArr_c[var8];
            }

            int var12;
            if ((var12 = e_int_ret_int(var2)) >= 0) {
               var12 = shortArr_c[var12];
            }

            var21[0] = b_int_ret_String(shortArr_f[var26 + 1]);
            String var18 = var21[0];
            if (boolean_e) {
               Engine.a_int_int_int_int(var27 + var11, var4 + var24, 103, 20);
               Engine.a_String_int_int_int_int(var18, var18.length(), var27 - 11 + var11, var4 + var24 + 11, 10);
            } else {
               Engine.a_int_int_int_int(var27, var4 + var24, 103, 20);
               Engine.a_String_int_int_int_int(var18, var18.length(), var27 + 23 + 11, var4 + var24 + 11, 6);
            }

            String var19 = "00:00";
            var1 = Engine.a_int_String_int_int(-3, var19, 0, var19.length()) + 23 + 11;
            if (boolean_e) {
               if (var8 >= 0) {
                  Engine.a_int_int_int_int(var27, var4 + var23, var8, 24);
               }

               if (var12 >= 0) {
                  Engine.a_int_int_int_int(var27, var4 + var24, var12, 12);
               }
            } else {
               if (var8 >= 0) {
                  Engine.a_int_int_int_int(var27 + var1 + 11, var4 + var23, var8, 20);
               }

               if (var12 >= 0) {
                  Engine.a_int_int_int_int(var27 + var1 + 11, var4 + var24, var12, 20);
               }
            }
         }
      }

      Engine.a_int_int_ret_void(-2, 3);
      Engine.b_int_int_ret_void(0, 16742400);
      Engine.b_int_int_ret_void(1, 0);
      if (c_int_ret_boolean(var2)) {
         var21[0] = a_int_ret_String(var2);
         String var10000 = Strings.a_int_StringArr(75, var21);
         Engine.a_String_int_int_int_int(var10000, var10000.length(), var0, var3 - Engine.a_int_ret_int(Engine.f_ret_int()), 33);
      } else {
         var21[0] = a_int_ret_String(var2);
         String var28 = Strings.a_int_StringArr(56, var21);
         Engine.a_String_int_int_int_int(var28, var28.length(), var0, var3 - Engine.a_int_ret_int(Engine.f_ret_int()), 33);
      }

      String var29 = Strings.a_int_ret_String(shortArr_h[var2]);
      Engine.a_String_int_int_int_int(var29, var29.length(), var0, var3, 33);
   }

   private static String a_int_ret_String(int var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < intArr_c.length && var0 >= intArr_c[var2]; var2 += 2) {
         var1++;
      }

      return c_int_ret_boolean(var0) ? "" + var1 : "" + (var0 + 1 - var1);
   }

   private static void a_int_int_Graphics(int var0, int var1, Gfx var2) {
      Engine.a_int_int_int(var0, var1, 331);
      int var3;
      int var4 = (var3 = Engine.b_int_int_ret_int(331, 0)) >> 16;
      short var5 = (short)var3;
      int var6 = (var3 = Engine.b_int_int_ret_int(331, 1)) >> 16;
      short var8 = (short)var3;
      var2.setColor(16512995);
      var2.fillRect(var0 + var6, var1 + var8, var4 - var6, var5 - var8);
      var2.setColor(0);
      var2.fillRect(var0 + var6 - 2, var1 + var8, 4, var5 - var8);
   }

   public static final void a_int_ret_void(int var0) {
      if (int_t < 5) {
         intArr_n[int_t] = var0;
         int_t++;
      }
   }

   private void c_ret_void() {
      if (!boolean_j && int_t > 0) {
         this.g_int(34);
         boolean_k = true;
         boolean_j = true;

         for (int var1 = 0; var1 < 4; var1++) {
            intArr_n[var1] = intArr_n[var1 + 1];
         }

         int_t--;
      }
   }

   public final void b_int_ret_void(int var1) {
      if (this.s_a != null) {
         Cls_s var4 = this.s_a;
         boolean var3 = false;
         if (var4.int_a == 18) {
            if (boolean_f) {
               if (byteArr_a[byte_a] == var1) {
                  if (++byte_a == byteArr_a.length) {
                     for (int var5 = 0; var5 < 15; var5++) {
                        f_int(var5);
                     }

                     byte_a = 0;
                     a_s(var4);
                     d_ret_void();
                  }
               } else if (byteArr_b[byte_a] != var1) {
                  byte_a = 0;
               } else if (++byte_a == byteArr_b.length) {
                  for (int var2 = 0; var2 < 15; var2++) {
                     f_int(var2);
                     a_int_short_short_short(var2, (short)30, (short)1, (short)9999);
                  }

                  byte_a = 0;
                  a_s(var4);
                  d_ret_void();
               }
            }

            switch (var1) {
               case 3:
                  var3 = false;
                  if (int_j != 0) {
                     if (int_k > int_j) {
                        var3 = true;
                     }

                     int_k = int_j--;
                     if (int_l == 650 || var3) {
                        int_l = 0;
                     }

                     int_m = 650;
                     a_s(var4);
                  }
                  break;
               case 4:
                  a_s_boolean(var4, true);
            }
         }

         this.s_a.c_int_ret_void(var1);
      } else if (this.int_i == 2) {
         this.e_ret_void();
      } else {
         if (this.int_i != 3 && this.int_i == 4) {
            if (boolean_f) {
               if (byteArr_a[byte_a] == var1 && (Cls_m.intArr_a[1] == 0 || Cls_m.intArr_a[1] == 1)) {
                  if (++byte_a == byteArr_a.length) {
                     Cls_m.intArr_a[0] = 2;
                     byte_a = 0;
                     int_f = 30;
                  }
               } else {
                  byte_a = 0;
               }
            }

            switch (var1) {
               case 5:
                  boolean_b = true;
                  return;
               case 20:
                  if (Cls_m.intArr_a[1] == 0 && Cls_m.intArr_a[0] != 3) {
                     c_a.f_ret_void();
                  }
            }
         }
      }
   }

   public final int b_ret_int() {
      if (boolean_h) {
         Engine.a_ret_void();
      }

      if (boolean_i) {
         Engine.d_int_int(28, -1);
         boolean_i = false;
      }

      if (this.s_a != null) {
         this.s_a.b_ret_void();
         this.s_a.c_ret_void();
      } else {
         if (this.int_i == 2) {
            return 0;
         }

         if (this.int_i == 4) {
            if (boolean_b) {
               this.g_int(25);
               Engine.h();
               return 0;
            }

            if (boolean_l) {
               this.g_int(34);
               boolean_k = true;
               boolean_j = true;
               return 0;
            }

            int_b = int_b + Engine.int_a;
            boolean_a = false;
            if (Cls_m.intArr_a[0] == 0) {
               c_a.byte_c = 0;
               if (Cls_m.intArr_a[1] != 3) {
                  int_a = int_a + Engine.int_a;
               }

               if (Cls_m.intArr_a[1] != 0) {
                  if (Cls_m.intArr_a[1] == 1) {
                     if (Engine.a_int_ret_boolean(1)) {
                        d_a.b_ret_void();
                     }

                     if (Engine.a_int_ret_boolean(2)) {
                        d_a.e_ret_void();
                     }

                     if (Engine.a_int_ret_boolean(15) || Engine.a_int_ret_boolean(7)) {
                        d_a.f_ret_void();
                     }
                  }
               } else {
                  boolean var2 = false;
                  if (Engine.a_int_ret_boolean(3)) {
                     c_a.a_ret_void();
                     var2 = true;
                  }

                  if (Engine.a_int_ret_boolean(4)) {
                     c_a.b_ret_void();
                     var2 = true;
                  }

                  if (Engine.a_int_ret_boolean(15) || Engine.a_int_ret_boolean(12) || Engine.a_int_ret_boolean(1) || Engine.a_int_ret_boolean(7)) {
                     c_a.a_boolean(false);
                     var2 = true;
                  }

                  if (var2) {
                     if (Cls_c.int_c != 1) {
                        Cls_c.int_c = 0;
                     }

                     Cls_c.int_b = 3000;
                  }
               }

               int var11 = Cls_m.intArr_a[4];
               i();
               if (Cls_m.intArr_a[4] == 0 && var11 != 0) {
                  c_a.g();
               }

               if (c_a.l_c.int_f < f_a.int_j && Cls_m.intArr_a[0] == 0) {
                  Cls_m.intArr_a[0] = 1;
               }

               if (int_f == int_y && c_int_ret_boolean(int_e)) {
                  Cls_m.intArr_a[0] = 2;
               }

               Cls_m.intArr_a[4] = (int)c_a.float_c;
               Cls_m.intArr_a[5] = (int)c_a.float_a;
               Cls_m.intArr_a[6] = (int)c_a.float_b;
               Cls_m.intArr_a[3] = c_a.int_d;
               var11 = Engine.int_a;
               if (int_z > 0) {
                  int_z -= var11;
                  if ((int_A -= var11) <= 0) {
                     int_A = Math.abs(Random_a.nextInt() % 200 + 300);
                     boolean_o = true;
                  }

                  if (int_z <= 0) {
                     int_z = 0;
                     int_A = 0;
                     boolean_o = false;
                     boolean_p = !boolean_p;
                  }

                  for (int var3 = 0; var3 < shortArr_u.length; var3++) {
                     if (Engine.a_int_ret_Image(shortArr_u[var3]) != null) {
                        if (boolean_p && !boolean_o || !boolean_p && boolean_o) {
                           if (ImageArr_b[var3] != null) {
                              Engine.a_int_Image(shortArr_u[var3], ImageArr_b[var3]);
                           }
                        } else if (ImageArr_a[var3] != null) {
                           Engine.a_int_Image(shortArr_u[var3], ImageArr_a[var3]);
                        }
                     }
                  }
               }
            } else if (Cls_m.intArr_a[0] == 1) {
               Engine.d_int_int(33, 1);
               Cls_m.intArr_a[0] = 3;
               int_c = 3000;
               int_d = c_a.l_c.int_f;
            } else if (Cls_m.intArr_a[0] == 2) {
               Engine.d_int_int(34, 1);
               Cls_m.intArr_a[0] = 4;
               int_c = 3000;
               c_a.g();
               if (c_int_ret_boolean(int_e)) {
                  c_a.boolean_a = false;
               }

               g_a.a_int_int_int_int_int_int_ret_void(20, c_a.l_c.int_c, c_a.l_c.int_f, 740, 1840, 230);
            } else if (Cls_m.intArr_a[0] == 3) {
               int_c = int_c - Engine.int_a;
               c_a.e_ret_void();
               if (int_c <= 0) {
                  c_a.a_int_int_ret_void(int_g, int_h);
                  boolean_c = true;
                  Cls_m.intArr_a[0] = 0;
                  c_a.int_a = -16777216;
                  Engine.d_int_int(e_ret_int(), -1);
               }
            } else if (Cls_m.intArr_a[0] == 4) {
               int_c = int_c - Engine.int_a;
               c_a.a_boolean(true);
               i();
               if (int_c <= 0) {
                  int var13 = e_int_ret_int(int_e);
                  int var4 = d_int_ret_int(int_e);
                  short var5 = shortArr_f[(int_e << 2) + 3];
                  boolean var6 = a_int_ret_boolean(13);
                  boolean var7 = a_ret_boolean();
                  short var8;
                  if ((var8 = (short)(int_a / 1000)) <= 0) {
                     var8 = 1;
                  }

                  int var9;
                  if ((var9 = (int)(int_f * 10000 * floatArr_a[int_e] / var8)) > 32767) {
                     var9 = 32767;
                  }

                  int_o = (short)var9;
                  a_int_short_short_short(int_e, (short)int_f, (short)var8, (short)int_o);
                  if (!c_int_ret_boolean(int_e)) {
                     if (c_int_ret_boolean(var8 = (short)(int_e + 1))) {
                        var8++;
                     }

                     if (var8 <= 14 && !b_int_ret_boolean(var8)) {
                        e_int_ret_void(var8);
                     }
                  }

                  var8 = 0;

                  for (int var16 = 0; var16 < intArr_c.length; var16 += 2) {
                     int var10;
                     if (d_ret_int() >= intArr_c[var16 + 1] && !b_int_ret_boolean(var10 = intArr_c[var16])) {
                        e_int_ret_void(var10);
                        var8 = (short)((var16 >> 1) + 1);
                     }
                  }

                  if (!var6 && a_int_ret_boolean(13)) {
                     this.boolean_q = true;
                  }

                  if (!var7 && a_ret_boolean()) {
                     this.boolean_r = true;
                  }

                  if ((var9 = e_int_ret_int(int_e)) > var13) {
                     this.int_B = var9;
                  }

                  int var18;
                  if ((var18 = d_int_ret_int(int_e)) > var4) {
                     this.int_C = var18;
                  }

                  if (shortArr_f[(int_e << 2) + 3] > var5) {
                     this.boolean_t = true;
                  }

                  d_ret_void();
                  if (var8 > 0) {
                     this.boolean_s = true;
                     StringArr_a = new String[]{"" + var8};
                     a_int_ret_void(90);
                  } else {
                     this.j();
                  }
               }
            }

            this.c_ret_void();
            return 0;
         }
      }

      return 0;
   }

   public final int a_int_ret_int(int var1) {
      Gfx var2 = Engine.a_ret_Graphics();
      if (this.int_i == 2) {
         if (this.int_w < 0) {
            Object var22 = null;
            this.b_Graphics(var2);
            this.e_ret_void();
         } else {
            var2.setColor(intArr_r[this.int_w]);
            var2.fillRect(0, 0, Engine.int_b, Engine.int_c);
            int var29 = intArr_p[this.int_w];
            Engine.a_int_int_int(
               (Engine.int_b - Engine.a_int_int_ret_int(var29, 0)) / 2 + Engine.a_int_int_ret_int(var29, 2),
               (Engine.int_c - Engine.a_int_int_ret_int(var29, 1)) / 2 + Engine.a_int_int_ret_int(var29, 3),
               var29
            );
            if (System.currentTimeMillis() - this.long_a > intArr_q[this.int_w]) {
               this.e_ret_void();
            }
         }

         return 0;
      } else {
         if (var1 == 1) {
            if (this.int_i == 4) {
               Engine.i();
               Gfx var20 = var2 = Engine.a_ret_Graphics();
               var2.setClip(0, 0, int_r, int_s);
               int var4 = b_int_ret_int(int_e);
               short[] var5 = shortArr_i;
               short[] var6 = shortArr_j;
               short[] var7 = shortArr_k;
               short[] var8 = shortArr_l;
               int var9 = 5413606;
               int var10 = 7460351;
               if (var4 == 1) {
                  var5 = shortArr_m;
                  var6 = shortArr_n;
                  var7 = shortArr_o;
                  var8 = shortArr_p;
                  var9 = 7263689;
                  var10 = 10485759;
               } else if (var4 == 2) {
                  var5 = shortArr_q;
                  var6 = shortArr_r;
                  var7 = shortArr_s;
                  var8 = shortArr_t;
                  var9 = 7737588;
                  var10 = 131610;
               }

               if (c_int_ret_boolean(int_e)) {
                  var9 = 11796669;
                  var10 = 16616467;
               }

               int var10004 = Engine.int_c / 40;
               Gfx var14 = var2;
               int var13 = var10004;
               int var12 = Engine.int_c;
               int var11 = Engine.int_b;
               int var15 = var9 >> 16 & 0xFF;
               int var16 = var9 >> 8 & 0xFF;
               var9 &= 255;
               int var17 = var10 >> 16 & 0xFF;
               int var18 = var10 >> 8 & 0xFF;
               var10 &= 255;
               int var19 = 65536 / var12;
               var17 = (var17 - var15) * var19 * var13;
               var18 = (var18 - var16) * var19 * var13;
               var10 = (var10 - var9) * var19 * var13;
               var15 <<= 16;
               var16 <<= 16;
               var9 <<= 16;

               for (int var38 = 0; var38 < var12; var38 += var13) {
                  a_int_Graphics((var15 >> 16 << 16) + (var16 >> 16 << 8) + (var9 >> 16), var14);
                  var14.fillRect(0, var38, var11, var13);
                  var15 += var17;
                  var16 += var18;
                  var9 += var10;
               }

               Random_a.setSeed(int_e + 1);
               if (var4 == 2) {
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var8, 5, 600, 100, -80, 50, 2, -1, var2);
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var7, 20, Engine.a_int_int_ret_int(var7[0], 0), 0, -50, 0, 3, 1380668, var2);
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var6, 50, Engine.a_int_int_ret_int(var6[0], 0), 0, -30, 0, 3, 131610, var2);
               } else {
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var7, 20, 200, 140, -200, 200, 5, -1, var2);
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var6, 50, 100, 70, -70, 300, 5, -1, var2);
                  a_shortArr_int_int_int_int_int_int_int_Graphics(var5, 80, 150, 100, -70, 300, 5, -1, var2);
               }

               Random_a.setSeed(System.currentTimeMillis());
               Cls_f.a_f_Graphics_DirectGraphics(f_a, var2, var20);
               var2.setClip(0, 0, Engine.int_b, Engine.int_c);
               Engine.a_int_int_ret_void(-3, 1);
               Engine.b_int_int_ret_void(0, 0);
               Engine.a_int_int_int(0, 0, 102);
               int var24;
               Engine.a_int_int_int(var24 = 32 + a_int_int_int_boolean(32, int_f, 4, false), 7, 101);
               int var25 = var24 + 9;
               a_int_int_int_boolean(var25, int_y, 4, false);
               Engine.a_int_int_int(Engine.int_b, 0, 103);
               int var26;
               var1 = (var26 = int_a / 1000) / 60;
               int var3 = var26 % 60;
               int var27;
               Engine.a_int_int_int_int(var27 = Engine.int_b - 25 - 6 - 1 - a_int_int_int_boolean(Engine.int_b - 25 - 6 - 1, var3, 8, true), 7, 100, 24);
               int var28 = var27 - 5;
               a_int_int_int_boolean(var28, var1, 8, false);
               boolean_o = false;
            }

            if (this.s_a != null) {
               this.s_a.d_ret_void();
            }
         } else if (var1 == 2) {
            this.b_Graphics(var2);
         }

         return 0;
      }
   }

   public static void a_String_int_int_int_int(String var0, int var1, int var2, int var3, int var4) {
      if (var1 == 1) {
         Engine.a_int_int_int_int(var2, var3, (var4 | 16) == 16 ? 151 : 150, var4);
      } else {
         Engine.a_int_int_ret_void(-3, 3);
         Engine.b_int_int_ret_void(0, 16742400);
         Engine.b_int_int_ret_void(1, 0);
         Engine.a_String_int_int_int_int(var0, var0.length(), var2, var3, var4);
      }
   }

   public static int c_ret_int() {
      return Engine.a_int_ret_int(-3) + 4;
   }

   public final void c_int_ret_void(int var1) {
      if (var1 == 1) {
         Engine.c_int_ret_void(9);
         Engine.c_int_ret_void(14);
         Engine.c_int_ret_void(15);
         Engine.c_int_ret_void(37);
         Engine.c_int_ret_void(36);
         Engine.c_int_ret_void(-1);
         Engine.c_int_ret_void(-2);
         Engine.c_int_ret_void(-3);
         Engine.a_int_ret_void(0);
      }

      if (var1 == 3 && this.int_i == 4) {
         boolean_b = true;
         if (boolean_j) {
            boolean_l = true;
            boolean_j = false;
            this.b_ret_void();
            return;
         }

         if (!boolean_l) {
            String_b = null;
         }
      }
   }

   public final int a_int_int_ret_int(int var1, int var2) {
      if (var1 != 17 && var1 != 25) {
         int_n = 0;
      }

      switch (var1) {
         case 0:
            Engine.a_int_ret_void(2);
            return 0;
         case 1:
            if (var2 >= 0 && var2 < intArr_o.length) {
               if (var2 == 0) {
                  this.int_w = -1;
                  this.int_i = 2;
               }

               Engine.c_int_ret_void(intArr_o[var2]);
               return var2 + 1;
            } else {
               if (var2 == intArr_o.length) {
                  f_ret_void();
                  if (Engine.c_ret_boolean()) {
                     Engine.f_ret_void();
                  }

                  byte[] var6 = Engine.a_String_ret_byteArr("game");
                  var2 = 0;
                  if (var6 != null) {
                     for (int var3 = 0; var3 < shortArr_f.length; var3++) {
                        shortArr_f[var3] = (short)((var6[var2++] & 255) << 8 | var6[var2++] & 255);
                     }

                     if (!a_int_ret_boolean(13)) {
                        for (int var9 = 14; var9 >= 0; var9--) {
                           if (b_int_ret_boolean(var9) && !c_int_ret_boolean(var9)) {
                              int_j = var9;
                              break;
                           }
                        }
                     }
                  } else {
                     for (int var10 = 0; var10 < shortArr_f.length; var10++) {
                        shortArr_f[var10] = 0;
                     }

                     e_int_ret_void(0);
                  }

                  return 0;
               }

               return 0;
            }
         case 2:
            if (var2 == 0) {
               return 1;
            } else if (var2 == 1) {
               return 2;
            } else {
               if (var2 != 2) {
                  return 0;
               }

               if (this.s_a != null && this.s_a.int_a != 14) {
                  this.g_int(19);
               } else {
                  Engine.g();
                  Engine.a_int_ret_void(1);
               }

               return 0;
            }
         case 3:
         case 4:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 23:
         case 24:
         case 25:
         case 26:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         default:
            return 0;
         case 5:
            if (var2 == 0) {
               Engine.h();
               f_ret_void();
               return 1;
            } else {
               if (var2 == 1) {
                  this.int_i = 3;
                  this.g_int(int_u);
                  Engine.d_int_int(28, -1);
                  return 0;
               }

               return 0;
            }
         case 6:
         case 15:
            if (var2 == 0) {
               Engine.h();
               Engine.d_int_ret_void(10);
               Engine.d_int_ret_void(13);
               Engine.c_int_ret_void(shortArr_v[int_e]);
               Engine.c_int_ret_void(shortArr_v[15]);
               Engine.c_int_ret_void(2);
               Engine.c_int_ret_void(1);
               Engine.c_int_ret_void(6);
               Engine.c_int_ret_void(5);
               Engine.c_int_ret_void(24);
               Engine.c_int_ret_void(0);
               Engine.c_int_ret_void(3);
               Engine.c_int_ret_void(26);
               Engine.c_int_ret_void(20);
               Engine.c_int_ret_void(19);
               Engine.c_int_ret_void(16);
               Engine.c_int_ret_void(25);
               Engine.c_int_ret_void(27);
               Engine.c_int_ret_void(21);
               Engine.c_int_ret_void(23);
               Engine.c_int_ret_void(22);
               if ((var1 = b_int_ret_int(int_e)) == 0) {
                  Engine.c_int_ret_void(12);
                  Engine.c_int_ret_void(17);
                  Engine.c_int_ret_void(18);
               }

               if (var1 == 1) {
                  Engine.c_int_ret_void(11);
                  Engine.c_int_ret_void(17);
                  Engine.c_int_ret_void(18);
               }

               if (var1 == 2) {
                  Engine.c_int_ret_void(8);
                  Engine.c_int_ret_void(4);
                  Engine.c_int_ret_void(17);
               }

               Graphics_a = (Image_a = Img.create(Cls_c.intArr_b[0] * 3, Cls_c.intArr_b[0] * 3)).getGraphics();
               intArr_a = new int[Image_a.getWidth() * Image_a.getHeight()];
               Graphics_b = (Image_b = Img.create(112, 26)).getGraphics();
               intArr_b = new int[Image_b.getWidth() * Image_b.getHeight()];
               return 1;
            } else {
               if (var2 == 1) {
                  if (!this.boolean_n) {
                     this.boolean_n = true;
                     boolean_b = false;
                     g();
                  }

                  this.int_i = 4;
                  this.b_ret_void();
                  if (!boolean_b) {
                     Engine.d_int_int(e_ret_int(), -1);
                  }

                  return 0;
               }

               return 0;
            }
         case 11:
            for (int var4 = 0; var4 < shortArr_f.length; var4++) {
               if ((var4 + 1) % 4 != 0) {
                  shortArr_f[var4] = 0;
               }
            }

            e_int_ret_void(0);
            int_j = 0;
            d_ret_void();
            this.boolean_n = false;
            this.g_int(18);
            return 0;
         case 21:
         case 22:
            int_n = this.s_b.a_ret_int();
            this.g_int(var1);
            return 0;
         case 27:
            return 0;
         case 36:
            if (var2 == 0) {
               Engine.d_int_ret_void(intArr_o[intArr_o.length - 1]);
               return 1;
            } else if (var2 == 1) {
               this.int_i = 3;
               Engine.d_int_int(28, -1);
               this.g_int(17);
               return 0;
            } else {
               return 0;
            }
      }
   }

   private static int e_ret_int() {
      byte var0 = 31;
      if (b_int_ret_int(int_e) == 1) {
         var0 = 30;
      }

      if (b_int_ret_int(int_e) == 0) {
         var0 = 29;
      }

      if (int_e == 4 || int_e == 9 || int_e == 14) {
         var0 = 35;
      }

      if (int_e == 3 || int_e == 8 || int_e == 13) {
         var0 = 32;
      }

      return var0;
   }

   public static int b_int_ret_int(int var0) {
      byte var1 = 2;
      if (var0 <= 9) {
         var1 = 1;
      }

      if (var0 <= 4) {
         var1 = 0;
      }

      return var1;
   }

   public final void d_int_ret_void(int var1) {
      if (var1 != 17 && var1 != 25) {
         int_n = 0;
      }

      switch (var1) {
         case 2:
         case 5:
         case 6:
         case 11:
         case 15:
         case 21:
         case 22:
         case 27:
            Engine.a_int_ret_void(var1);
            return;
         case 3:
         case 4:
         case 12:
         case 14:
         case 16:
         case 34:
         case 36:
         default:
            break;
         case 8:
            boolean_b = false;
            this.b_ret_void();
            if (!boolean_b) {
               Engine.d_int_int(e_ret_int(), -1);
               return;
            }
            break;
         case 9:
            Engine.a_ret_void();
            return;
         case 10:
         case 20:
         case 28:
         case 29:
         case 30:
            int_n = this.s_b.a_ret_int();
         case 17:
         case 18:
         case 19:
         case 23:
         case 24:
         case 25:
         case 26:
         case 31:
         case 32:
         case 33:
            this.g_int(var1);
            return;
         case 13:
            return;
         case 35:
            boolean_j = false;
            this.b_ret_void();
            if (this.boolean_s) {
               this.boolean_s = false;
               this.j();
               return;
            }
            break;
         case 37:
            h();
         case 7:
            if (b_int_ret_boolean(int_j)) {
               int_l = int_m;
               this.boolean_n = false;
               int_e = int_j;
               Engine.a_int_ret_void(6);
               return;
            }
            break;
         case 38:
            try {
               boolean_i = true;
               Engine.h();
               if (Engine.openUrl(String_a)) {
                  boolean_h = true;
               }

               return;
            } catch (Exception var2) {
            }
      }
   }

   private static void d_ret_void() {
      byte[] var0 = new byte[shortArr_f.length << 1];

      for (int var1 = 0; var1 < shortArr_f.length; var1++) {
         var0[var1 << 1] = (byte)(shortArr_f[var1] >> 8);
         var0[(var1 << 1) + 1] = (byte)shortArr_f[var1];
      }

      Engine.a_String_byteArr("game", var0);
   }

   private void b_Graphics(Gfx var1) {
      if (boolean_m) {
         var1.setColor(7352325);
         var1.fillRect(0, 0, Engine.int_b, Engine.int_c);
         var1.setColor(0);
         var1.fillRect((Engine.int_b - 60) / 2, (Engine.int_c - 10) / 2, 60, 10);
         var1.setColor(4660480);
         var1.fillRect((Engine.int_b - 60) / 2 + 1, (Engine.int_c - 10) / 2 + 1, 58, 8);
         var1.setColor(11460924);
         var1.fillRect((Engine.int_b - 60) / 2 + 1, (Engine.int_c - 10) / 2 + 1, 60 * this.int_v / 20 - 2, 8);
         this.int_v++;
         if (this.int_v > 20) {
            this.int_v = 0;
            return;
         }
      } else {
         var1.setColor(16777215);
         var1.fillRect(0, 0, Engine.int_b, Engine.int_c);
      }
   }

   private void e_ret_void() {
      if (this.int_w + 1 < intArr_o.length) {
         if (!Engine.b_int_ret_boolean(intArr_o[this.int_w + 1])) {
            return;
         }

         boolean_m = true;
         this.int_w++;
         this.long_a = System.currentTimeMillis();
         if (this.int_w - 1 >= 0) {
            Engine.d_int_ret_void(intArr_o[this.int_w - 1]);
            return;
         }
      } else {
         Engine.a_int_ret_void(36);
      }
   }

   private static void f_ret_void() {
      Image_a = null;
      Graphics_a = null;
      intArr_a = null;
      Image_b = null;
      Graphics_b = null;
      intArr_b = null;
      Cls_i.intArr_a = null;
      Cls_i.intArr_b = null;
      f_a = null;
      Cls_f.f_a = null;
      c_a = null;
      mArr_a = null;
      d_a = null;
      ImageArr_a = null;
      ImageArr_b = null;
      Engine.d_int_ret_void(2);
      Engine.d_int_ret_void(1);
      Engine.d_int_ret_void(6);
      Engine.d_int_ret_void(5);
      Engine.d_int_ret_void(24);
      Engine.d_int_ret_void(0);
      Engine.d_int_ret_void(3);
      Engine.d_int_ret_void(26);
      Engine.d_int_ret_void(20);
      Engine.d_int_ret_void(19);
      Engine.d_int_ret_void(16);
      Engine.d_int_ret_void(25);
      Engine.d_int_ret_void(22);
      Engine.d_int_ret_void(27);
      Engine.d_int_ret_void(21);
      Engine.d_int_ret_void(23);
      int var0;
      if ((var0 = b_int_ret_int(int_e)) == 0) {
         Engine.d_int_ret_void(12);
         Engine.d_int_ret_void(17);
         Engine.d_int_ret_void(18);
      }

      if (var0 == 1) {
         Engine.d_int_ret_void(11);
         Engine.d_int_ret_void(17);
         Engine.d_int_ret_void(18);
      }

      if (var0 == 2) {
         Engine.d_int_ret_void(8);
         Engine.d_int_ret_void(4);
      }

      Engine.c_int_ret_void(10);
      Engine.c_int_ret_void(13);
   }

   private static void g() {
      Engine.b_ret_void();
      Engine.b_int_ret_void(150 / Engine.a_ret_int());

      for (int var1 = 0; var1 < 5; var1++) {
         intArr_n[var1] = -1;
      }

      int_t = 0;
      boolean_j = false;
      boolean_l = false;
      boolean_d = a_ret_boolean();
      Cls_f.int_p = 90;
      Cls_f.int_q = 140;
      int_a = 0;
      int_b = 0;
      int_f = 0;
      int_o = 0;
      boolean_j = false;
      boolean_a = false;
      boolean_k = false;
      Cls_f.l_g.int_c = Engine.int_b << 15;
      Cls_f.l_g.int_f = Engine.int_c << 15;
      byte[] var12 = (byte[])Engine.a_int_ret_Object(shortArr_v[15]);
      int var2 = 8;
      fArr_a = new Cls_f[Cls_f.a_byteArr_int_ret_short(var12, 8)];
      var2 += 6;
      var2++;
      int var3 = var12[14];
      int var4 = 0;
      int var5 = 0;

      while (var3 != 127) {
         short var6 = Cls_f.a_byteArr_int_ret_short(var12, var2);
         var2 += 2;
         switch (var3) {
            case 4:
               Cls_i var28;
               (var28 = new Cls_i()).a_short_ret_void((short)var4);
               var28.a_byteArr_int_ret_int(var12, var2);
               if (var28.int_a > var5) {
                  var5 = var28.int_a;
               }

               fArr_a[var4++] = var28;
            default:
               var2 += var6;
               var3 = var12[var2++];
         }
      }

      int var0 = var5;
      if ((var12 = (byte[])Engine.a_int_ret_Object(shortArr_v[int_e])) != null) {
         int var21 = 8;
         fArr_b = new Cls_f[Cls_f.a_byteArr_int_ret_short(var12, 8)];
         mArr_a = new Cls_m[Cls_f.a_byteArr_int_ret_short(var12, 12)];
         var21 += 6;
         var21++;
         var3 = var12[14];
         var4 = (short)0;
         var5 = 0;

         for (int_y = 0; var3 != 127; var3 = var12[var21++]) {
            short var55 = Cls_f.a_byteArr_int_ret_short(var12, var21);
            var21 += 2;
            switch (var3) {
               case 4:
                  Cls_i var36;
                  (var36 = new Cls_i()).a_short_ret_void((short)var4);
                  var36.a_byteArr_int_ret_int(var12, var21);
                  if (var36.int_a > var0) {
                     var0 = var36.int_a;
                  }

                  fArr_b[var4++] = var36;
                  break;
               case 5:
               case 7:
               default:
                  fArr_b[var4] = new Cls_f();
                  fArr_b[var4].a_short_ret_void((short)var4);
                  fArr_b[var4++].a_byteArr_int_ret_int(var12, var21);
                  break;
               case 6:
                  Cls_m var7;
                  (var7 = new Cls_m()).a_short_ret_void((short)var4);
                  var7.a_byteArr_int_ret_int(var12, var21);
                  fArr_b[var4++] = var7;
                  mArr_a[var5++] = var7;
                  break;
               case 8:
                  (c_a = new Cls_c(true)).a_short_ret_void((short)var4);
                  c_a.a_byteArr_int_ret_int(var12, var21);
                  c_a.c_ret_void();
                  fArr_b[var4++] = c_a;
                  int_g = c_a.l_c.int_c;
                  int_h = c_a.l_c.int_f;
                  break;
               case 9:
                  fArr_b[var4] = new Cls_j();
                  fArr_b[var4].a_short_ret_void((short)var4);
                  fArr_b[var4].a_byteArr_int_ret_int(var12, var21);
                  fArr_b[var4++].c_ret_void();
                  break;
               case 10:
                  Cls_n var35;
                  (var35 = new Cls_n()).a_short_ret_void((short)var4);
                  var35.a_byteArr_int_ret_int(var12, var21);
                  var35.c_ret_void();
                  if (var35.int_a > var0) {
                     var0 = var35.int_a;
                  }

                  fArr_b[var4++] = var35;
                  break;
               case 11:
                  Cls_d var34;
                  (var34 = new Cls_d()).a_short_ret_void((short)var4);
                  var34.a_byteArr_int_ret_int(var12, var21);
                  var34.c_ret_void();
                  fArr_b[var4++] = var34;
                  break;
               case 12:
                  Cls_k var33;
                  (var33 = new Cls_k()).a_short_ret_void((short)var4);
                  var33.a_byteArr_int_ret_int(var12, var21);
                  var33.c_ret_void();
                  fArr_b[var4++] = var33;
                  break;
               case 13:
                  Cls_h var32;
                  (var32 = new Cls_h()).a_short_ret_void((short)var4);
                  var32.a_byteArr_int_ret_int(var12, var21);
                  var32.c_ret_void();
                  fArr_b[var4++] = var32;
                  int_y++;
                  break;
               case 14:
                  Cls_c var31;
                  (var31 = new Cls_c(false)).a_short_ret_void((short)var4);
                  var31.a_byteArr_int_ret_int(var12, var21);
                  var31.c_ret_void();
                  fArr_b[var4++] = var31;
                  break;
               case 15:
                  Cls_e var30;
                  (var30 = new Cls_e()).a_short_ret_void((short)var4);
                  var30.a_byteArr_int_ret_int(var12, var21);
                  var30.c_ret_void();
                  fArr_b[var4++] = var30;
                  int_y++;
            }

            var21 += var55;
         }

         Cls_f.a_fArr(fArr_b);
         f_a = fArr_b[0];
         fArr_b = null;
         (h_a = new Cls_h()).a_short_ret_void((short)(var4++));
         Cls_f var26 = f_a;
         Cls_h var14 = h_a;
         h_a.b_f_ret_void(var26);
         var14.l_c.int_a = 65536;
         var14.l_c.int_b = 0;
         var14.l_c.int_c = Integer.MAX_VALUE;
         var14.l_c.int_d = 0;
         var14.l_c.int_e = 65536;
         var14.l_c.int_f = Integer.MAX_VALUE;
         var14.l_b.a_l(var14.l_c);
         var14.c_ret_void();
         g_c.a_short_ret_void((short)(var4++));
         g_c.c_f(f_a);
         g_b.a_short_ret_void((short)(var4++));
         g_b.c_f(f_a);
         g_e.a_short_ret_void((short)(var4++));
         g_e.c_f(f_a);
         g_f.a_short_ret_void((short)(var4++));
         g_f.c_f(f_a);
         g_g.a_short_ret_void((short)(var4++));
         g_g.c_f(f_a);
         g_a.a_short_ret_void((short)(var4++));
         g_a.c_f(f_a);
         g_d.a_short_ret_void((short)(var4++));
         g_d.c_f(f_a);
         g_h.a_short_ret_void((short)(var4++));
         g_h.c_f(f_a);
         g_i.a_short_ret_void((short)var4);
         g_i.c_f(f_a);
         Cls_i.intArr_a = new int[var0];
         Cls_i.intArr_b = new int[var0];
         (Cls_m.intArr_a = new int[73])[1] = 0;
         Cls_m.intArr_a[0] = 0;
         Cls_m.intArr_a[2] = 0;
         Cls_m.intArr_a[7] = 0;
         Engine.d_int_ret_void(shortArr_v[int_e]);
         Engine.d_int_ret_void(shortArr_v[15]);
         Cls_f.f_a = c_a;
         Cls_f.m();
         int_x = Cls_f.l_f.int_f;
         int_z = 0;
         int_A = 0;
         boolean_o = false;
         boolean_p = false;

         try {
            ImageArr_a = new Img[shortArr_u.length];
            ImageArr_b = new Img[shortArr_u.length];

            for (int var11 = 0; var11 < shortArr_u.length; var11++) {
               if (Engine.a_int_ret_Image(shortArr_u[var11]) != null) {
                  ImageArr_a[var11] = Engine.a_int_ret_Image(shortArr_u[var11]);
                  ImageArr_b[var11] = Img.create(ImageArr_a[var11]);
                  int[] var27 = new int[ImageArr_b[var11].getWidth() * ImageArr_b[var11].getHeight()];
                  ImageArr_b[var11].getRGB(var27, 0, ImageArr_b[var11].getWidth(), 0, 0, ImageArr_b[var11].getWidth(), ImageArr_b[var11].getHeight());
                  int[] var54 = var27;

                  for (int var9 = 0; var9 < var54.length; var9++) {
                     var4 = var54[var9] >>> 24;
                     int var56 = var54[var9] >> 16 & 0xFF;
                     var3 = var54[var9] >> 8 & 0xFF;
                     int var15 = var54[var9] & 0xFF;
                     int var57 = var3 + var15 >> 1;
                     int var38 = var56 + var15 >> 1;
                     int var16 = var56 + var3 >> 1;
                     var54[var9] = (var4 << 24) + (var57 << 16) + (var38 << 8) + var16;
                  }

                  var3 = ImageArr_b[var11].getWidth();
                  var4 = ImageArr_b[var11].getHeight();
                  ImageArr_b[var11] = Img.createRGB(var27, var3, var4, true);
               }
            }
         } catch (Exception var10) {
         }

         g_b.int_a = -1;
         g_c.int_a = -1;
         g_e.int_a = -1;
         g_f.int_a = -1;
         g_g.int_a = -1;
         g_a.int_a = -1;
         g_d.int_a = -1;
         g_h.int_a = -1;
         g_i.int_a = -1;
         c_a.int_a = -16777216;
         boolean var58 = true;

         for (int var40 = 0; var40 < intArr_c.length; var40 += 2) {
            if (a_int_ret_boolean(intArr_c[var40])) {
               var58 = false;
            }
         }

         if (var58 && c_int_ret_boolean(int_e)) {
            a_int_ret_void(80);
         }

         Cls_c.int_c = 0;
         Cls_c.int_b = 3000;
      }
   }

   public static int c_int_ret_int(int var0) {
      if (boolean_p && !boolean_o || !boolean_p && boolean_o) {
         int var1 = var0 >>> 24;
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         var0 &= 255;
         int var8 = var3 + var0 >> 1;
         int var9 = var2 + var0 >> 1;
         var0 = var2 + var3 >> 1;
         var0 = (var1 << 24) + (var8 << 16) + (var9 << 8) + var0;
      }

      return var0;
   }

   private static void a_int_Graphics(int var0, Gfx var1) {
      if (boolean_p && !boolean_o || !boolean_p && boolean_o) {
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         var0 &= 255;
         int var8 = var3 + var0 >> 1;
         int var9 = var2 + var0 >> 1;
         var0 = var2 + var3 >> 1;
         var0 = (var8 << 16) + (var9 << 8) + var0;
      }

      var1.setColor(var0);
   }

   private static void a_shortArr_int_int_int_int_int_int_int_Graphics(
      short[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Gfx var8
   ) {
      intArr_s[0] = 0;
      int var9 = 0;
      if (var5 != 0) {
         var9 = Random_a.nextInt() % var5;
      }

      intArr_t[0] = var4 + var9;

      for (int var10 = 1; var10 < var6 + 1; var10++) {
         var9 = 0;
         if (var3 != 0) {
            var9 = Math.abs(Random_a.nextInt() % var3);
         }

         intArr_s[var10] = intArr_s[var10 - 1] + var9 + var2;
         var9 = 0;
         if (var5 != 0) {
            var9 = Random_a.nextInt() % var5;
         }

         intArr_t[var10] = var4 + var9;
         intArr_u[var10] = Math.abs(Random_a.nextInt() % var0.length);
      }

      int var16;
      var9 = (var16 = intArr_s[var6]) - (((Cls_f.l_f.int_c >> 16) + 33000) * Cls_f.l_g.int_a >> 16) * var1 / 100 % var16;
      var1 = ((Cls_f.l_f.int_f - int_x >> 16) * Cls_f.l_g.int_a >> 16) * var1 / 100 + Engine.int_c;

      for (int var12 = 0; var12 < var6; var12++) {
         if (var12 < 2) {
            Engine.a_int_int_int(var9 + intArr_s[var12], var1 + intArr_t[var12], var0[intArr_u[var12]]);
         }

         if (var12 > 2) {
            Engine.a_int_int_int(var9 + intArr_s[var12] - (var16 << 1), var1 + intArr_t[var12], var0[intArr_u[var12]]);
         }

         Engine.a_int_int_int(var9 + intArr_s[var12] - var16, var1 + intArr_t[var12], var0[intArr_u[var12]]);
      }

      if (var7 != -1) {
         a_int_Graphics(var7, var8);
         var8.fillRect(0, var1 + intArr_t[0], Engine.int_b, Engine.int_c - (var1 + intArr_t[0]));
      }
   }

   private static void a_DirectGraphics(Gfx var0) {
      int var1 = Engine.c_ret_int();
      int var2 = Engine.int_b;
      int var3 = Engine.int_c - var1;
      int[] var4 = intArr_v;
      int[] var5 = intArr_w;
      var4[0] = 0;
      var5[0] = var3;
      var4[1] = var2;
      var5[1] = var3;
      var4[2] = var2;
      var5[2] = var3 + var1;
      var4[3] = 0;
      var5[3] = var3 + var1;
      var0.fillPolygon(var4, 0, var5, 0, 4, 1426063360);
   }

   private static int a_int_int_int_boolean(int var0, int var1, int var2, boolean var3) {
      int var5 = 0;
      int var4 = 1;
      int var6 = var1;
      var3 = var1 < 10 && var3;
      if (var2 == 4) {
         var4 = 0;
      }

      for (int var7 = var4; var7 < 2; var7++) {
         if (var1 == 0) {
            if (var7 == 1) {
               Engine.a_int_int_int_int(var0, 7, shortArr_w[0], 24);
            }

            var5 += Engine.a_int_int_ret_int(shortArr_w[0], 0);
         } else {
            while (var1 != 0) {
               var4 = var1 % 10;
               short var10 = shortArr_w[var4];
               if (var7 == 1) {
                  Engine.a_int_int_int_int(var0 - var5, 7, var10, 24);
               }

               var1 /= 10;
               var5 += Engine.a_int_int_ret_int(var10, 0);
            }
         }

         if (var7 == 0) {
            var0 += var5;
            var5 = 0;
            var1 = var6;
         }
      }

      if (var3) {
         Engine.a_int_int_int_int(var0 - var5, 7, shortArr_w[0], 24);
         var5 += Engine.a_int_int_ret_int(shortArr_w[0], 0);
      }

      return var5;
   }

   private static String b_int_ret_String(int var0) {
      int var1 = var0 / 60;
      String var3;
      if ((var0 = var0 % 60) < 10) {
         var3 = var1 + ":" + "0" + var0;
      } else {
         var3 = var1 + ":" + var0;
      }

      return var3;
   }

   private static void h() {
      for (int var0 = 0; var0 < shortArr_u.length; var0++) {
         if (Engine.a_int_ret_Image(shortArr_u[var0]) != null && ImageArr_a[var0] != null) {
            Engine.a_int_Image(shortArr_u[var0], ImageArr_a[var0]);
         }
      }
   }

   private static void i() {
      if (boolean_k) {
         Cls_m.a_mArr(mArr_a);
         boolean_k = false;
      } else {
         f_a.l();

         for (Cls_f var0 = f_a; var0 != null; var0 = var0.a_f_ret_f(f_a)) {
            var0.d_ret_void();
         }

         Cls_m.a_mArr_c(mArr_a, c_a);
         int var1 = Cls_m.intArr_a[7];
         Cls_m.a_mArr(mArr_a);
         if (Cls_m.intArr_a[7] != var1) {
            boolean_o = false;
            int_z = 2000;
            int_A = 0;
         }

         for (Cls_f var2 = f_a; var2 != null; var2 = var2.a_f_ret_f(f_a)) {
            var2.a_f_ret_void(f_a);
         }

         if (boolean_c) {
            Cls_f.int_n = 0;
            Cls_f.int_o = 0;
            Cls_f.b_boolean(true);
            boolean_c = false;
         } else {
            Cls_f.b_boolean(false);
         }
      }
   }

   private void j() {
      h();
      this.boolean_n = false;
      Engine.a_int_ret_void(5);
      int_u = 31;
      Cls_m.intArr_a[0] = 0;
   }

   static {
      Engine.boolean_a = boolean_e = Strings.a_int_ret_String(2).equals("1");
      boolean_f = false; // cheats disabled
      boolean_g = false; // "more games" link disabled
      String_a = null;
      shortArr_c = new short[]{314, 315, 389};
      Random_a = new Random(System.currentTimeMillis());
      int_j = 0;
      int_k = 0;
      int_l = 0;
      int_m = 0;
      int_n = 0;
      floatArr_a = new float[]{0.937F, 0.969F, 0.659F, 0.937F, 1.412F, 0.969F, 2.121F, 1.298F, 1.298F, 1.011F, 1.298F, 1.921F, 1.298F, 0.712F, 1.195F};
      intArr_c = new int[]{4, 60, 9, 200, 14, 400};
      intArr_d = new int[]{3, 8};
      shortArr_d = new short[]{
         30,
         29,
         26,
         30,
         28,
         26,
         30,
         25,
         21,
         30,
         25,
         20,
         30,
         30,
         30,
         30,
         28,
         25,
         30,
         28,
         22,
         30,
         27,
         20,
         30,
         27,
         24,
         30,
         30,
         30,
         30,
         29,
         27,
         30,
         28,
         19,
         30,
         25,
         20,
         30,
         25,
         20,
         30,
         30,
         30
      };
      shortArr_e = new short[]{
         30,
         40,
         50,
         36,
         45,
         55,
         35,
         40,
         48,
         32,
         42,
         50,
         9999,
         9999,
         9999,
         34,
         45,
         60,
         75,
         85,
         95,
         42,
         46,
         55,
         45,
         55,
         65,
         9999,
         9999,
         9999,
         45,
         50,
         58,
         60,
         70,
         80,
         48,
         54,
         60,
         24,
         34,
         44,
         9999,
         9999,
         9999
      };
      shortArr_f = new short[60];
      shortArr_g = new short[]{359, 363, 364, 365, 328, 366, 367, 368, 369, 329, 370, 360, 361, 362, 330};
      shortArr_h = new short[]{71, 67, 66, 65, 59, 64, 63, 62, 61, 58, 60, 70, 69, 68, 57};
      shortArr_i = new short[]{388};
      shortArr_j = new short[]{251};
      shortArr_k = new short[]{252};
      shortArr_l = new short[0];
      shortArr_m = new short[]{373};
      shortArr_n = new short[]{161};
      shortArr_o = new short[]{159, 160};
      shortArr_p = new short[0];
      shortArr_q = new short[]{352};
      shortArr_r = new short[]{113};
      shortArr_s = new short[]{114};
      shortArr_t = new short[]{353};
      shortArr_u = new short[]{388, 373, 145, 313, 265, 157, 174, 55, 345, 243, 78, 317, 176, 267};
      shortArr_v = new short[]{39, 40, 41, 42, 51, 43, 44, 45, 46, 52, 47, 48, 49, 50, 53, 54};
      int_r = Engine.int_b;
      int_s = Engine.int_c;
      int_p = 129;
      int_q = 56;
      shortArr_b = new short[360];
      a_ret_void();
      intArr_e = new int[]{536};
      intArr_f = new int[]{526, 516, 531, 521};
      intArr_g = new int[]{390, 420};
      intArr_h = new int[]{420, 426};
      intArr_i = new int[]{414, 396, 420};
      intArr_j = new int[]{420, 426, 402, 408};
      intArr_k = new int[]{420, 426};
      intArr_l = new int[]{390, 414, 396};
      g_c = new Cls_g(150, 80, 0, 1, intArr_e, 4000, 7);
      g_b = new Cls_g(20, -200, 0, 0, intArr_f, 800, 7);
      g_e = new Cls_g(10, 0, 30, 2, intArr_g, 800, -1);
      g_f = new Cls_g(50, 0, 85, 3, intArr_h, 540, -2);
      g_g = new Cls_g(50, 0, 35, 4, intArr_i, 1840, -3);
      g_a = new Cls_g(20, 0, 35, 4, intArr_j, 1840, -4);
      g_d = new Cls_g(10, 0, 0, 6, intArr_k, 1000, -5);
      g_h = new Cls_g(24, 0, 35, 4, intArr_l, 2040, -6);
      intArr_m = new int[]{437, 432};
      g_i = new Cls_g(150, 0, 0, 7, intArr_m, 2000, 15);
      boolean_h = false;
      boolean_i = false;
      intArr_n = new int[5];
      StringArr_a = null;
      boolean_l = false;
      int_u = 17;
      boolean_m = false;
      intArr_o = new int[]{7};
      intArr_p = new int[]{1};
      intArr_q = new int[]{3000};
      intArr_r = new int[]{16777215};
      boolean_c = false;
      intArr_s = new int[10];
      intArr_t = new int[10];
      intArr_u = new int[10];
      intArr_v = new int[4];
      intArr_w = new int[4];
      shortArr_w = new short[]{90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
   }
}
