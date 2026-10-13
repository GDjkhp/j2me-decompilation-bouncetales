package bouncetales;


public final class Cls_m extends Cls_f {
   public static int[] intArr_a;
   private byte[][] byteArr2_a;
   private byte byte_a = 0;
   private byte byte_b;
   private byte byte_e;
   private short short_a;
   private byte byte_f = 0;
   private byte byte_g = -1;
   private int int_a;
   private int int_b;
   private Cls_f[] fArr_a = new Cls_f[2];
   private Cls_f[] fArr_b = new Cls_f[2];
   private static Cls_f[] fArr_c = new Cls_f[2];
   private static Cls_m[] mArr_a;
   private static int int_c = 0;

   public Cls_m() {
      this.byte_d = 3;
   }

   private boolean a_byteArr_ret_boolean(byte[] var1) {
      byte var10000 = var1[0];
      int var2 = 0;
      switch (var10000) {
         case 0:
            short var11 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            short var12 = Game.shortArr_a[var11];
            if (!Game.a_int_ret_boolean(13)) {
               Game.a_int_ret_void(var12);
            }

            return true;
         case 1:
            short var9 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var10;
            if ((var10 = this.a_ret_f().a_short_ret_f(var9)) != null) {
               ((Cls_j)var10).a_ret_void();
            }

            return true;
         case 2:
            mArr_a[var1[1]].a_int_ret_void(1);
            return true;
         case 3:
            mArr_a[var1[1]].a_int_ret_void(0);
            return true;
         case 4:
            mArr_a[var1[1]].a_int_ret_void(2);
            return true;
         case 5:
            mArr_a[var1[1]].a_int_ret_void(3);
            return true;
         case 6:
            short var29;
            if ((var29 = Cls_f.a_byteArr_int_ret_short(var1, 3)) < 0) {
               var1[3] = var1[1];
               var1[4] = var1[2];
               return true;
            }

            var29 = (short)(var29 - Engine.int_a);
            a_byteArr_int_ret_void(var1, var29);
            break;
         case 7:
            if (var1[1] == 1) {
               a_byte_float(var1[2], a_byteArr_ret_float(var1));
            }

            if (var1[1] == 2) {
               intArr_a[var1[2]] = a_byteArr_ret_int(var1);
            }

            return true;
         case 8:
            if (var1[1] == 1) {
               a_byte_float(var1[2], a_byte(var1[2]) + a_byteArr_ret_float(var1));
            }

            if (var1[1] == 2) {
               intArr_a[var1[2]] = intArr_a[var1[2]] + a_byteArr_ret_int(var1);
            }

            return true;
         case 9:
            if (var1[1] == 1) {
               a_byte_float(var1[2], a_byte(var1[2]) - a_byteArr_ret_float(var1));
            }

            if (var1[1] == 2) {
               intArr_a[var1[2]] = intArr_a[var1[2]] - a_byteArr_ret_int(var1);
            }

            return true;
         case 10:
            if (var1[1] == 1) {
               a_byte_float(var1[2], a_byte(var1[2]) * a_byteArr_ret_float(var1));
            }

            if (var1[1] == 2) {
               intArr_a[var1[2]] = intArr_a[var1[2]] * a_byteArr_ret_int(var1);
            }

            return true;
         case 11:
            if (var1[1] == 1) {
               a_byte_float(var1[2], a_byte(var1[2]) / a_byteArr_ret_float(var1));
            }

            if (var1[1] == 2) {
               intArr_a[var1[2]] = intArr_a[var1[2]] / a_byteArr_ret_int(var1);
            }

            return true;
         case 12:
            if (var1[1] == 2) {
               if (intArr_a[var1[2]] == a_byteArr_ret_int(var1)) {
                  return true;
               }
            } else if (var1[1] == 1 && a_byte(var1[2]) == a_byteArr_ret_float(var1)) {
               return true;
            }

            this.byte_g = (byte)(var1[int_c] - 2);
            return true;
         case 13:
            if (var1[1] == 2) {
               if (intArr_a[var1[2]] != a_byteArr_ret_int(var1)) {
                  return true;
               }
            } else if (var1[1] == 1 && a_byte(var1[2]) != a_byteArr_ret_float(var1)) {
               return true;
            }

            this.byte_g = (byte)(var1[int_c] - 2);
            return true;
         case 14:
            if (var1[1] == 2) {
               if (intArr_a[var1[2]] < a_byteArr_ret_int(var1)) {
                  return true;
               }
            } else if (var1[1] == 1 && a_byte(var1[2]) < a_byteArr_ret_float(var1)) {
               return true;
            }

            this.byte_g = (byte)(var1[int_c] - 2);
            return true;
         case 15:
            if (var1[1] == 2) {
               if (intArr_a[var1[2]] > a_byteArr_ret_int(var1)) {
                  return true;
               }
            } else if (var1[1] == 1 && a_byte(var1[2]) > a_byteArr_ret_float(var1)) {
               return true;
            }

            this.byte_g = (byte)(var1[int_c] - 2);
            return true;
         case 16:
            int var27 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var38;
            if ((var38 = this.a_ret_f().a_short_ret_f((short)var27)) == null) {
               return true;
            }

            int var47 = Cls_f.b_byteArr_int(var1, 15);
            var27 = Engine.int_a;
            if (var47 - var27 <= 0) {
               var1[15] = var1[11];
               var1[16] = var1[12];
               var1[17] = var1[13];
               var1[18] = var1[14];
               var27 = var47;
            }

            var38.l_c.int_c = var38.l_c.int_c + Cls_f.b_byteArr_int(var1, 3) * var27;
            var38.l_c.int_f = var38.l_c.int_f + Cls_f.b_byteArr_int(var1, 7) * var27;
            var38.h();
            var38.i();
            if ((var47 = var47 - var27) <= 0) {
               return true;
            }

            a_byteArr_int_int(var1, 15, var47);
            break;
         case 17:
            int var25 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var37;
            if ((var37 = this.a_ret_f().a_short_ret_f((short)var25)) == null) {
               return true;
            }

            int var45 = Cls_f.b_byteArr_int(var1, 11);
            var25 = Cls_f.b_byteArr_int(var1, 7);
            int var52 = Engine.int_a;
            if (var45 == var25) {
               a_byteArr_int_int(var1, 15, var37.l_c.int_a);
               a_byteArr_int_int(var1, 19, var37.l_c.int_b);
               a_byteArr_int_int(var1, 23, var37.l_c.int_d);
               a_byteArr_int_int(var1, 27, var37.l_c.int_e);
            }

            if (var45 - var52 <= 0) {
               var1[11] = var1[7];
               var1[12] = var1[8];
               var1[13] = var1[9];
               var1[14] = var1[10];
               var45 = 0;
            }

            float var54 = (float)((long)Cls_f.b_byteArr_int(var1, 3) * (var25 - var45) / var25) / 65536.0F;
            Cls_l.l_a.a_float(var54);
            Cls_l.l_a.int_c = 0;
            Cls_l.l_a.int_f = 0;
            var37.l_c.int_a = Cls_f.b_byteArr_int(var1, 15);
            var37.l_c.int_b = Cls_f.b_byteArr_int(var1, 19);
            var37.l_c.int_d = Cls_f.b_byteArr_int(var1, 23);
            var37.l_c.int_e = Cls_f.b_byteArr_int(var1, 27);
            var37.l_c.b_l(Cls_l.l_a);
            var37.h();
            var37.i();
            if ((var45 = var45 - var52) <= 0) {
               return true;
            }

            a_byteArr_int_int(var1, 11, var45);
            break;
         case 18:
            short var23 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var36;
            if ((var36 = this.a_ret_f().a_short_ret_f(var23)) == null) {
               return true;
            }

            short var44;
            if ((var44 = Cls_f.a_byteArr_int_ret_short(var1, 3)) < 0) {
               var36.l_c.int_c = Cls_f.b_byteArr_int(var1, 5);
               var36.l_c.int_f = Cls_f.b_byteArr_int(var1, 9);
            } else {
               Cls_f var24;
               if ((var24 = this.a_ret_f().a_short_ret_f(var44)) != null) {
                  var24.a_l(Cls_f.l_a);
                  int var51 = Cls_f.l_a.int_c;
                  int var53 = Cls_f.l_a.int_f;
                  var36.l_c.int_c = 0;
                  var36.l_c.int_f = 0;
                  var36.boolean_f = true;
                  var36.a_l(Cls_f.l_a);
                  Cls_f.l_a.c_l(Cls_l.l_a);
                  Cls_l.l_a.a_int_int_ret_void(var51, var53);
                  var36.l_c.int_c = Cls_l.int_g;
                  var36.l_c.int_f = Cls_l.int_h;
               }
            }

            var36.h();
            var36.i();
            var36.a_l(var36.l_b);
            return true;
         case 19:
            short var21 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            short var35 = Cls_f.a_byteArr_int_ret_short(var1, 3);
            Cls_f var43 = this.a_ret_f();
            Cls_f var22;
            if ((var22 = Cls_f.f_b.a_short_ret_f(var21)) == null) {
               return true;
            }

            Cls_f var50;
            if ((var50 = var43.a_short_ret_f(var35)) == null) {
               return true;
            }

            var22.b_f_ret_void(var50);
            var22.i();
            return true;
         case 20:
            short var20 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var42;
            if ((var42 = this.a_ret_f().a_short_ret_f(var20)) == null) {
               return true;
            }

            var42.i();
            var42.b_f_ret_void(Cls_f.f_b);
            return true;
         case 21:
            this.byte_g = (byte)(var1[1] - 2);
            return true;
         case 22:
            return true;
         case 23:
            if (this.byte_e == 1) {
               this.byte_a = 0;
            } else {
               this.byte_a = 1;
            }
            break;
         case 24:
            short var19 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var34 = this.a_ret_f().a_short_ret_f(var19);
            if (a_ObjectArr_int_Object(this.fArr_b, this.int_b, var34)) {
               return false;
            }

            return true;
         case 25:
            Game.int_g = this.l_b.int_c;
            Game.int_h = this.l_b.int_f;
            return true;
         case 26:
            short var18 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var33;
            if ((var33 = this.a_ret_f().a_short_ret_f(var18)).byte_d == 4) {
               Cls_c var41;
               Cls_c var57 = var41 = (Cls_c)var33;
               var57.float_f = var57.float_f + Cls_f.a_byteArr_int_ret_short(var1, 3);
               var41.float_g = var41.float_g + Cls_f.a_byteArr_int_ret_short(var1, 5);
            }

            return true;
         case 27:
            short var17 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var32;
            if ((var32 = this.a_ret_f().a_short_ret_f(var17)).byte_d == 4) {
               Cls_c var40;
               Cls_c var56 = var40 = (Cls_c)var32;
               var56.float_d = var56.float_d + Cls_f.a_byteArr_int_ret_short(var1, 3);
               var40.float_e = var40.float_e + Cls_f.a_byteArr_int_ret_short(var1, 5);
            }

            return true;
         case 28:
            short var16 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var31;
            if ((var31 = this.a_ret_f().a_short_ret_f(var16)).byte_d == 4) {
               Cls_c var39;
               Cls_c var55 = var39 = (Cls_c)var31;
               var55.float_a = var55.float_a + Cls_f.a_byteArr_int_ret_short(var1, 3);
               var39.float_b = var39.float_b + Cls_f.a_byteArr_int_ret_short(var1, 5);
            }

            return true;
         case 29:
            var2 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f var3;
            if ((var3 = this.a_ret_f().a_short_ret_f((short)var2)) == null) {
               return true;
            }

            int var4 = Cls_f.b_byteArr_int(var1, 3);
            var2 = Cls_f.b_byteArr_int(var1, 7);
            if ((var4 & 1) > 0) {
               var3.int_m &= -32;
               var3.int_m |= var2 & 31;
               var3.byte_c = (byte)((var3.int_m & 31) - 16);
            }

            if ((var4 & 32) > 0) {
               var3.int_m &= -33;
               var3.int_m |= var2 & 32;
            }

            if ((var4 & 128) > 0) {
               var3.int_m &= -129;
               var3.int_m |= var2 & 128;
               Cls_j var5;
               if (var3.a_ret_byte() == 5 && (var5 = (Cls_j)var3).shortArr_a[0] == 358) {
                  var5.a_l(Cls_f.l_a);
                  int var6 = Cls_f.l_a.int_c + var5.int_e + 3932160;
                  int var8 = Cls_f.l_a.int_f + var5.int_f + 3932160;
                  int var7 = Cls_f.l_a.int_c + (var5.int_g - 3932160);
                  int var49 = Cls_f.l_a.int_f + (var5.int_h - 3932160);
                  Game.g_h.a_int_int_int_int_int_int_int_int_int_int_int(24, var6, var8, var7, var49, 840, 0, 0, 360, 2040, 510);
               }
            }

            if ((var4 & 256) > 0) {
               var3.int_m &= -257;
               var3.int_m |= var2 & 256;
            }

            return true;
         case 30:
            var2 = Cls_f.a_byteArr_int_ret_short(var1, 1);
            Cls_f.f_a = this.a_ret_f().a_short_ret_f((short)var2);
            return true;
         case 31:
            Game.boolean_c = var1[1] == 1;
            Cls_f.int_p = Cls_f.a_byteArr_int_ret_short(var1, 2);
            Cls_f.int_q = Cls_f.a_byteArr_int_ret_short(var1, 4);
            return true;
         case 32:
            Game.boolean_c = false;
            Cls_f.int_p = 90;
            Cls_f.int_q = 140;
            return true;
         default:
            return true;
      }

      return false;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.int_e = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.int_h = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.int_g = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.int_f = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.byte_a = var1[var2++];
      if (this.byte_a == 2) {
         this.byte_g = 0;
      }

      this.byte_b = var1[var2++];
      this.byte_e = var1[var2++];
      this.short_a = a_byteArr_int_ret_short(var1, var2);
      var2 += 2;
      this.byte_f = var1[var2++];
      this.byteArr2_a = new byte[this.byte_f][];

      for (int var3 = 0; var3 < this.byte_f; var3++) {
         byte var4 = var1[var2++];
         this.byteArr2_a[var3] = new byte[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            this.byteArr2_a[var3][var5] = var1[var2++];
         }
      }

      this.int_m |= 128;
      return var2;
   }

   protected final void a_int_ret_void(int var1) {
      switch (this.byte_a) {
         case 0:
            if (var1 == 2) {
               this.byte_a = 2;
               this.byte_g = 0;
            }

            if (var1 == 1) {
               this.byte_a = 1;
               return;
            }
            break;
         case 1:
            if (var1 == 0) {
               this.byte_a = 0;
               this.a_ret_void();
               return;
            }
            break;
         case 2:
            if (var1 == 1) {
               this.byte_a = 1;
            }

            if (var1 == 3) {
               this.byte_a = 3;
            }
            break;
         case 3:
            if (var1 == 2) {
               this.byte_a = 2;
               return;
            }
      }
   }

   private final void a_ret_void() {
      this.byte_g = -1;

      for (int var1 = 0; var1 < this.byteArr2_a.length; var1++) {
         byte[] var2;
         switch ((var2 = this.byteArr2_a[var1])[0]) {
            case 6:
               var2[3] = var2[1];
               var2[4] = var2[2];
               break;
            case 16:
               var2[15] = var2[11];
               var2[16] = var2[12];
               var2[17] = var2[13];
               var2[18] = var2[14];
               break;
            case 17:
               var2[11] = var2[7];
               var2[12] = var2[8];
               var2[13] = var2[9];
               var2[14] = var2[10];
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
   }

   public static void a_mArr_c(Cls_m[] var0, Cls_c var1) {
      int var2 = var1.int_g - var1.int_e;
      int var3 = var1.int_h - var1.int_f;
      var2 = var2 < var3 ? var3 >> 1 : var2 >> 1;

      for (int var14 = 0; var14 < var0.length; var14++) {
         Cls_m var4;
         if ((var4 = var0[var14]).byte_a != 1) {
            var4.a_l(Cls_f.l_a);
            Cls_f.l_a.c_l(Cls_l.l_a);
            Cls_l.l_a.a_int_int_ret_void(var1.l_b.int_c, var1.l_b.int_f);
            int var5 = Cls_l.int_g;
            int var6 = Cls_l.int_h;
            Cls_l.l_a.a_int_int_ret_void(var1.l_c.int_c, var1.l_c.int_f);
            int var7 = Cls_l.int_g;
            int var8 = Cls_l.int_h;
            int var9 = var4.int_e - var2;
            int var10 = var4.int_f - var2;
            int var11 = var4.int_g + var2;
            int var12 = var4.int_h + var2;
            if (Cls_f.a_int_int_int_int_int_int_int_int(var5, var6, var7, var8, var9, var10, var11, var12)
                  | Cls_f.a_int_int_int_int_int_int_ret_boolean(var7, var8, var9, var10, var11, var12)
               && var4.int_a < 2) {
               var4.fArr_a[var4.int_a] = var1;
               var4.int_a++;
            }
         }
      }
   }

   private static final boolean a_ObjectArr_int_Object(Object[] var0, int var1, Object var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         if (var0[var3] == var2) {
            return true;
         }
      }

      return false;
   }

   public static void a_mArr(Cls_m[] var0) {
      mArr_a = var0;

      for (int var1 = 0; var1 < var0.length; var1++) {
         Cls_m var2;
         if ((var2 = var0[var1]).byte_b == 0) {
            for (int var7 = 0; var7 < var2.int_a; var7++) {
               Cls_f var10 = var2.fArr_a[var7];
               if (!a_ObjectArr_int_Object(var2.fArr_b, var2.int_b, var10)) {
                  fArr_c[var7] = var10;
               }
            }
         } else {
            for (int var3 = 0; var3 < var2.int_b; var3++) {
               Cls_f var4 = var2.fArr_b[var3];
               if (!a_ObjectArr_int_Object(var2.fArr_a, var2.int_a, var4)) {
                  fArr_c[var3] = var4;
               }
            }
         }

         for (int var8 = 0; var8 < fArr_c.length; var8++) {
            if (fArr_c[var8] != null && (var2.short_a < 0 || fArr_c[var8].a_ret_short() == var2.short_a)) {
               var2.a_int_ret_void(2);
            }
         }

         for (int var9 = 0; var9 < var2.fArr_a.length; var9++) {
            var2.fArr_b[var9] = var2.fArr_a[var9];
            var2.fArr_a[var9] = null;
            fArr_c[var9] = null;
         }

         var2.int_b = var2.int_a;
         var2.int_a = 0;
      }

      boolean var10000;
      for (int var5 = 0; var5 < var0.length; var5++) {
         do {
            Cls_m var6;
            if ((var6 = var0[var5]).a_f_ret_boolean(Game.f_a) && var6.byte_a == 2 && var6.a_byteArr_ret_boolean(var6.byteArr2_a[var6.byte_g])) {
               if (var6.byte_g < -1) {
                  var6.byte_g = -1;
               }

               var6.byte_g++;
               if (var6.byte_g >= var6.byte_f) {
                  if (var6.byte_e == 1) {
                     var6.byte_a = 0;
                     var6.a_ret_void();
                  } else {
                     var6.byte_a = 1;
                  }

                  var10000 = false;
               } else {
                  var10000 = true;
               }
            } else {
               var10000 = false;
            }
         } while (var10000);
      }
   }

   private static final int a_byteArr_ret_int(byte[] var0) {
      byte var1 = var0[3];
      int var2 = 0;
      int_c = 4;
      switch (var1) {
         case 2:
            int_c++;
            byte var3 = var0[4];
            var2 = intArr_a[var3];
            break;
         case 32:
            int_c += 4;
            var2 = Cls_f.b_byteArr_int(var0, 4);
      }

      return var2;
   }

   private static float a_byte(byte var0) {
      return Float.intBitsToFloat(intArr_a[var0]);
   }

   private static final void a_byte_float(byte var0, float var1) {
      intArr_a[var0] = Float.floatToIntBits(var1);
   }

   private static final float a_byteArr_ret_float(byte[] var0) {
      byte var1 = var0[3];
      float var2 = 0.0F;
      int_c = 4;
      switch (var1) {
         case 1:
            int_c++;
            var2 = a_byte(var0[4]);
            break;
         case 2:
            int_c++;
            byte var3 = var0[4];
            var2 = intArr_a[var3];
            break;
         case 16:
            int_c += 4;
            var2 = Float.intBitsToFloat((int)((((0L | var0[4]) << 8 | var0[5] & 255) << 8 | var0[6] & 255) << 8 | var0[7] & 255));
            break;
         case 32:
            int_c += 4;
            var2 = Cls_f.b_byteArr_int(var0, 4);
      }

      return var2;
   }

   private static void a_byteArr_int_ret_void(byte[] var0, int var1) {
      var0[3] = (byte)(var1 >> 8);
      var0[4] = (byte)var1;
   }

   private static void a_byteArr_int_int(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >> 24);
      var0[var1 + 1] = (byte)(var2 >> 16);
      var0[var1 + 2] = (byte)(var2 >> 8);
      var0[var1 + 3] = (byte)var2;
   }
}
