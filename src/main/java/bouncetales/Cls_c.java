package bouncetales;


public final class Cls_c extends Cls_f {
   public int int_a = 0;
   private int int_r = 0;
   private static float float_l = -400.0F;
   private static float[] floatArr_b = new float[]{0.6F, 0.3F, 0.6F};
   private static float[] floatArr_c = new float[]{0.1F, 0.1F, 0.1F};
   private static float[] floatArr_d = new float[]{(float)Math.cos(0.9599311F), (float)Math.cos(0.9599311F), (float)Math.cos(0.9599311F)};
   public static final int[] intArr_a = new int[]{20, 20, 20};
   public static final float[] floatArr_a = new float[]{1.0F, 1.4F, 0.5F};
   private static float[] floatArr_e = new float[]{500.0F, 350.0F, 312.5F};
   private static float[] floatArr_f = new float[]{280.0F, 350.0F, 150.0F};
   private static float[] floatArr_g = new float[]{1.5F, 2.5F, 1.2F};
   private static float[] floatArr_h = new float[]{288.0F, 255.0F, 162.5F};
   public static int[] intArr_b = new int[3];
   private static int int_s;
   public static int int_b;
   public static int int_c;
   private static int[] intArr_c = new int[]{458, 460, 454, 452, 456};
   private static short[] shortArr_a = new short[]{
      211,
      212,
      223,
      234,
      237,
      238,
      239,
      240,
      241,
      242,
      213,
      214,
      215,
      216,
      217,
      218,
      219,
      220,
      221,
      222,
      224,
      225,
      226,
      227,
      228,
      229,
      230,
      231,
      232,
      233,
      235,
      236
   };
   public float float_a;
   public float float_b;
   public float float_c;
   public float float_d;
   public float float_e;
   public float float_f;
   public float float_g;
   public boolean boolean_a = true;
   public boolean boolean_b = true;
   public boolean boolean_c = false;
   private int[] intArr_d;
   private int[] intArr_e;
   private int[] intArr_f;
   private int[] intArr_g;
   private int[] intArr_h;
   private int[] intArr_i;
   public float float_h;
   public float float_i;
   public float float_j;
   public float float_k;
   private float float_m;
   private int int_t;
   private final int[] intArr_j = new int[16];
   private final int[] intArr_k = new int[16];
   private final int[] intArr_l = new int[16];
   private final int[] intArr_m = new int[16];
   private final int[] intArr_n = new int[16];
   private final int[] intArr_o = new int[16];
   private final boolean[] booleanArr_a = new boolean[16];
   private float float_n = 0.5F;
   private int int_u = 15539236;
   private int int_v = 16777215;
   private int int_w = 11473152;
   private static int[] intArr_p = new int[]{15592941, 25788, 15592941, 14752000, 15592941, 15261445};
   public int int_d = 0;
   private float float_o;
   private float float_p;
   private float float_q;
   public boolean boolean_d = false;
   private boolean boolean_h = false;
   private static int int_x;
   private static int int_y;
   private static int int_z;
   private static boolean boolean_i;
   private static float float_r = 1.5258789E-5F;

   public Cls_c(boolean var1) {
      this.byte_d = 4;
      this.boolean_h = var1;
      if (var1) {
         this.intArr_d = new int[4];
         this.intArr_e = new int[4];
         this.intArr_f = new int[4];
         this.intArr_g = new int[4];
         this.intArr_h = new int[4];
         this.intArr_i = new int[4];
         this.n();
      }
   }

   private void n() {
      for (int var1 = 0; var1 < 4; var1++) {
         this.intArr_d[var1] = 0;
         this.intArr_e[var1] = 0;
         this.intArr_f[var1] = 0;
         this.intArr_g[var1] = 0;
      }
   }

   public final void a_ret_void() {
      float var1 = 0.0F;
      if (Game.boolean_d && this.int_d == 0) {
         var1 = 50.0F;
      }

      if (this.boolean_d) {
         if (this.float_a > -floatArr_f[this.int_d] - var1) {
            this.float_d = this.float_d - (floatArr_e[this.int_d] + var1);
            return;
         }
      } else if (this.float_a > -floatArr_f[this.int_d] - var1) {
         this.float_d = this.float_d - (floatArr_e[this.int_d] + var1) / floatArr_g[this.int_d];
      }
   }

   public final void b_ret_void() {
      float var1 = 0.0F;
      if (Game.boolean_d && this.int_d == 0) {
         var1 = 50.0F;
      }

      if (this.boolean_d) {
         if (this.float_a < floatArr_f[this.int_d] + var1) {
            this.float_d = this.float_d + (floatArr_e[this.int_d] + var1);
            return;
         }
      } else if (this.float_a < floatArr_f[this.int_d] + var1) {
         this.float_d = this.float_d + (floatArr_e[this.int_d] + var1) / floatArr_g[this.int_d];
      }
   }

   public final void a_boolean(boolean var1) {
      if (this.float_q > floatArr_d[this.int_d] && this.boolean_d) {
         if (var1) {
            this.float_g = this.float_g + floatArr_h[this.int_d] / 2.0F;
         } else {
            this.float_g = this.float_g + floatArr_h[this.int_d];
         }

         this.boolean_d = false;
         if (this.boolean_h) {
            if (var1) {
               this.b_int_int_ret_void(0, -27);
               this.b_int_int_ret_void(1, -27);
               return;
            }

            this.b_int_int_ret_void(0, -53);
            this.b_int_int_ret_void(1, -53);
         }
      }
   }

   private void b_int_int_ret_void(int var1, int var2) {
      if (var2 > 0) {
         if (var2 > 70) {
            var2 = 70;
         }
      } else if (var2 < 0 && var2 < -70) {
         var2 = -70;
      }

      this.intArr_d[var1] = this.intArr_d[var1] + var2;
   }

   public final void c_ret_void() {
      this.int_e = -intArr_a[this.int_d] << 16;
      this.int_g = intArr_a[this.int_d] << 16;
      this.int_f = -intArr_a[this.int_d] << 16;
      this.int_h = intArr_a[this.int_d] << 16;
   }

   public final void d_ret_void() {
      this.h();
      super.d_ret_void();
      this.boolean_f = true;
      if (this.boolean_a) {
         this.float_d = this.float_d + 0.0F * floatArr_a[this.int_d];
         this.float_e = this.float_e + float_l * floatArr_a[this.int_d];
         if (this.boolean_h) {
            if (!this.boolean_c) {
               float var1 = this.float_a - this.float_h;
               float var2 = this.float_b - this.float_i;
               if (var1 > 0.0F) {
                  this.b_int_int_ret_void(3, ((int)var1 >> 2 << 1) / 3);
               } else {
                  this.b_int_int_ret_void(2, (-((int)var1) >> 2 << 1) / 3);
               }

               if (var2 > 0.0F) {
                  this.b_int_int_ret_void(1, ((int)var2 >> 2 << 1) / 3);
               } else {
                  this.b_int_int_ret_void(0, (-((int)var2) >> 2 << 1) / 3);
               }
            }

            this.boolean_c = false;
         }

         float var9 = Engine.int_a * 0.001F;
         if (this.boolean_h) {
            this.float_h = this.float_a;
            this.float_i = this.float_b;
         }

         float var3 = 1.0F / floatArr_a[this.int_d];
         this.float_a = this.float_a + this.float_d * var3 * var9;
         this.float_b = this.float_b + this.float_e * var3 * var9;
         this.float_a = this.float_a + this.float_f * var3;
         this.float_b = this.float_b + this.float_g * var3;
         this.l_c.int_c = this.l_c.int_c + (int)(this.float_a * var9 * 65536.0F);
         this.l_c.int_f = this.l_c.int_f + (int)(this.float_b * var9 * 65536.0F);
         this.float_d = 0.0F;
         this.float_e = 0.0F;
         this.float_f = 0.0F;
         this.float_g = 0.0F;
         float var4 = (var3 = this.float_j * this.float_p + this.float_k * this.float_q) * this.float_p;
         var3 *= this.float_q;
         if (this.float_p * this.float_j + this.float_q * this.float_k >= 0.0F) {
            var4 = this.float_j - var4;
            var3 = this.float_k - var3;
         } else {
            var4 = this.float_j + var4;
            var3 = this.float_k + var3;
         }

         var9 = (float)Math.sqrt(var4 * var4 + var3 * var3) / intArr_a[this.int_d] * var9;
         if (this.float_p * var3 - var4 * this.float_q > 0.0F) {
            var9 = -var9;
         }

         this.float_m += var9;
         this.float_o = this.float_o + Engine.int_a / 1000.0F;
         if (this.float_o > 0.25F) {
            this.boolean_d = false;
         }

         this.float_c = (float)Math.sqrt(this.float_a * this.float_a + this.float_b * this.float_b);
         if (this.float_c > 999.0F) {
            float var5 = 999.0F / this.float_c;
            this.float_a *= var5;
            this.float_b *= var5;
            this.float_c = 999.0F;
         }

         if (this.boolean_h) {
            for (int var6 = 0; var6 < 4; var6++) {
               this.intArr_g[var6] = this.intArr_g[var6] + this.intArr_d[var6];
               this.intArr_d[var6] = 0;
               if (this.intArr_g[var6] > 70) {
                  this.intArr_g[var6] = 70;
               } else if (this.intArr_g[var6] < -70) {
                  this.intArr_g[var6] = -70;
               }

               this.intArr_e[var6] = this.intArr_e[var6] + this.intArr_g[var6] * Engine.int_a;
               this.intArr_f[var6] = this.intArr_e[var6] * Cls_f.l_g.int_a / 65536;
               this.intArr_g[var6] = this.intArr_g[var6] + (Engine.int_a * 7 * -this.intArr_e[var6] >> 16);
               this.intArr_g[var6] = this.intArr_g[var6] - (Engine.int_a * 120 * this.intArr_g[var6] >> 16);
            }
         }

         if (this.boolean_h) {
            if (int_s > 0) {
               int_s = int_s - Engine.int_a;
               int_b = 3000;
               if (int_s <= 0) {
                  if (int_c >= 2 && int_c <= 8) {
                     int var11;
                     if (Math.abs(Game.Random_a.nextInt() % 3) == 0) {
                        var11 = 3;
                     } else {
                        var11 = Math.abs(Game.Random_a.nextInt() % 6) + 3;
                     }

                     int_s = 1500;
                     int_c = var11;
                     if (var11 == 3) {
                        int_s = 600;
                     }
                  } else {
                     int_s = 0;
                     int_c = 0;
                  }
               }
            } else if (Cls_m.intArr_a[0] == 0
               && Cls_m.intArr_a[1] == 0
               && Math.abs(this.float_a) < 40.0F
               && Math.abs(this.float_b) < 40.0F
               && (int_b = int_b - Engine.int_a) <= 0) {
               int_s = 600;
               int_c = 2;
               int_b = 3000;
            }

            if (Math.abs(this.float_a) >= 40.0F || Math.abs(this.float_b) >= 40.0F) {
               if (int_c != 1) {
                  int_c = 0;
               }

               int_b = 3000;
            }
         }

         if (this.int_a != 0) {
            int var7 = this.int_a >>> 24;
            int var12;
            if ((var12 = Engine.int_a / 2) <= 0) {
               var12 = 1;
            }

            if ((var7 = var7 - var12) < 0) {
               var7 = 0;
            }

            this.int_a = var7 << 24;
         }
      }
   }

   public final void a_int_int_ret_void(int var1, int var2) {
      this.g();
      this.l_c.int_c = var1;
      this.l_c.int_f = var2;
      this.l_b.int_c = var1;
      this.l_b.int_f = var2;
      this.boolean_c = true;
      if (this.boolean_h) {
         this.float_h = 0.0F;
         this.float_i = 0.0F;

         for (int var3 = 0; var3 < 4; var3++) {
            this.intArr_d[var3] = 0;
            this.intArr_e[var3] = 0;
            this.intArr_f[var3] = 0;
            this.intArr_g[var3] = 0;
         }
      }

      this.boolean_f = true;
   }

   public final void a_f_ret_void(Cls_f var1) {
      int var2 = 1;

      while (++var2 < 10) {
         Cls_f var4 = var1;
         Cls_c var3 = this;
         this.int_t = 0;
         int var5 = intArr_a[this.int_d] << 16;
         int var6 = intArr_a[this.int_d] * intArr_a[this.int_d] << 16;
         int var7 = this.l_c.int_c - this.l_b.int_c;
         int var8 = this.l_c.int_f - this.l_b.int_f;
         Cls_f var9 = var1;

         while (var9 != null) {
            var9.l_d.a_int_int_ret_void(var3.l_b.int_c, var3.l_b.int_f);
            int var10 = Cls_l.int_g;
            int var11 = Cls_l.int_h;
            if (var9.boolean_f) {
               var9.k();
            }

            var9.l_e.a_int_int_ret_void(var3.l_c.int_c, var3.l_c.int_f);
            int var12 = Cls_l.int_g;
            int var13 = Cls_l.int_h;
            int var14 = var10;
            int var15 = var12;
            if (var10 > var12) {
               var14 = var12;
               var15 = var10;
            }

            int var16 = var11;
            int var17 = var13;
            if (var11 > var13) {
               var16 = var13;
               var17 = var11;
            }

            var14 -= var5;
            var16 -= var5;
            var15 += var5;
            var17 += var5;
            if (!b_int_int_int_int_int_int_int_int(var9.int_i, var9.int_j, var9.int_k, var9.int_l, var14, var16, var15, var17)) {
               var9 = var9.b_f_ret_f(var4);
            } else if ((var9.int_m & 32) > 0) {
               var9 = var9.a_f_ret_f(var4);
            } else {
               switch (var9.a_ret_byte()) {
                  case 2:
                     Cls_i var50 = (Cls_i)var9;
                     boolean var53 = false;
                     int var56 = 0;
                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var24 = 0;
                     int var25 = var50.int_a - 1;
                     int var26 = 0;

                     for (; var26 < var25; var26++) {
                        int var27 = var50.intArr_c[var26];
                        int var28 = var50.intArr_d[var26];
                        int var29 = var50.intArr_c[var26 + 1];
                        int var30 = var50.intArr_d[var26 + 1];
                        int var31 = var27;
                        int var32 = var29;
                        if (var27 > var29) {
                           var31 = var29;
                           var32 = var27;
                        }

                        int var33 = var28;
                        int var34 = var30;
                        if (var28 > var30) {
                           var33 = var30;
                           var34 = var28;
                        }

                        if (b_int_int_int_int_int_int_int_int(var31, var33, var32, var34, var14, var16, var15, var17)) {
                           if (!var53) {
                              var53 = true;
                              var56 = var12 - var10;
                              var57 = var13 - var11;
                              if ((var58 = (int)Math.sqrt((long)var56 * var56 + (long)var57 * var57)) != 0) {
                                 var59 = (int)(((long)var56 << 16) / var58);
                                 var24 = (int)(((long)var57 << 16) / var58);
                              }
                           }

                           var31 = var28 - var30;
                           var32 = -(var27 - var29);
                           var33 = (int)Math.sqrt((long)var31 * var31 + (long)var32 * var32);
                           var34 = (int)(((long)var31 * intArr_a[var3.int_d] << 16) / var33);
                           var33 = (int)(((long)var32 * intArr_a[var3.int_d] << 16) / var33);
                           int var35 = var27 + var34;
                           int var36 = var28 + var33;
                           var34 = var29 + var34;
                           var33 = var30 + var33;
                           if ((long)var56 * var31 + (long)var57 * var32 < 0L) {
                              if (a_int_int_int_int_int_int_int_int_int_ret_boolean(var10, var11, var56, var57, var35, var36, var34, var33, var6)) {
                                 var3.a_i_int_int_int_int_int_boolean(var50, int_z, var7, var8, var31, var32, boolean_i);
                              }

                              if (c_int_int_int_int_int_int_int_int(var10, var11, var59, var24, var58, var27, var28, intArr_a[var3.int_d])) {
                                 var31 = int_x - var27;
                                 var32 = int_y - var28;
                                 var3.a_i_int_int_int_int_int_boolean(var50, int_z, var7, var8, var31, var32, boolean_i);
                              }

                              if (c_int_int_int_int_int_int_int_int(var10, var11, var59, var24, var58, var29, var30, intArr_a[var3.int_d])) {
                                 var31 = int_x - var29;
                                 var32 = int_y - var30;
                                 var3.a_i_int_int_int_int_int_boolean(var50, int_z, var7, var8, var31, var32, boolean_i);
                              }
                           }
                        }
                     }

                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 3:
                  case 5:
                  default:
                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 4:
                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 6:
                     Cls_n var49;
                     int var52 = (var49 = (Cls_n)var9).short_a << 16;
                     int var55 = var49.short_c << 16;
                     if (a_int_int_int_int_int_int_int_int_int_ret_boolean(var52, var55, (var49.short_b << 16) - var52, 0, var10, var11, var12, var13, 0)) {
                        var49.a_int_float_int_c(int_z, var3.float_b, intArr_a[var3.int_d], var3);
                     }

                     if (var13 - var5 < var49.int_b) {
                        var49.a_int_int_c(var12, var13 - var5, var3);
                     }

                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 7:
                     Cls_d var48 = (Cls_d)var9;
                     if (a_int_int_int_int_int_int_int_int(var10, var11, var12, var13, var48.int_a, var48.int_c, var48.int_b, var48.int_d)) {
                        var48.a_ret_void();
                     }

                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 8:
                     Cls_k var47 = (Cls_k)var9;
                     if (a_int_int_int_int_int_int_int_int_int_ret_boolean(-4587520, 6225920, 9175040, 0, var10, var11, var12, var13, 0)) {
                        float var38 = var3.float_b;
                        if (var38 < 0.0F) {
                           if ((var13 = -((int)var38)) < 100) {
                              var13 = 100;
                           }

                           if (var13 > 1000) {
                              var13 = 1000;
                           }

                           var47.int_b = (1100 - var13 >> 1) + 20;
                           var47.int_a = var47.int_b / Engine.b_int_ret_int(var47.short_a);
                           var47.c_a = var3;
                           var47.float_a = -var38 * var47.byte_a * 2.0F / 100.0F;
                           float var39 = 400.0F * var47.byte_a * 2.0F / 100.0F;
                           if (var47.float_a > var39) {
                              var47.float_a = var39;
                           }

                           var47.c_a.boolean_a = false;
                           var47.c_a.float_a = 0.0F;
                           var47.c_a.float_b = 0.0F;
                           var47.boolean_a = false;
                           var47.a_ret_void();
                           if (var47.c_a.equals(Game.c_a)) {
                              Cls_m.intArr_a[1] = 2;
                           }
                        }
                     }

                     var9 = var9.a_f_ret_f(var4);
                     break;
                  case 9:
                     Cls_h var46 = (Cls_h)var9;
                     Cls_f var51 = var9.a_f_ret_f(var4);
                     int var54 = var12 >> 16;
                     int var21 = var13 >> 16;
                     if (var54 * var54 + var21 * var21 < 2025) {
                        var46.a_l(Cls_f.l_a);
                        var11 = Cls_f.l_a.int_c;
                        var12 = Cls_f.l_a.int_f;
                        Game.g_f.a_int_int_int_int_int_int_ret_void(8, var11, var12, 540, 540, 0);
                        if (var46.equals(Game.h_a)) {
                           Game.int_f++;
                           var46.l_c.int_c = Integer.MAX_VALUE;
                           var46.l_c.int_f = Integer.MAX_VALUE;
                           var46.l_b.a_l(var46.l_c);
                           var46.l_b.c_l(var46.l_d);
                           var46.boolean_f = true;
                        } else {
                           var46.j();
                           Game.int_f++;
                        }
                     }

                     var9 = var51;
                     break;
                  case 10:
                     Cls_e var18 = (Cls_e)var9;
                     Cls_f var19 = var9.a_f_ret_f(var4);
                     boolean var20 = false;
                     if (var18.byte_a == 0 || var18.byte_a == 2 && (var18.byte_b == 1 || var18.boolean_a)) {
                        var20 = a_int_int_int_int_int_int_int_int(
                           var10, var11, var12, var13, var18.int_e, var18.int_f + (var18.int_h - var18.int_f << 1) / 3, var18.int_g, var18.int_h
                        );
                     }

                     if (var20) {
                        var18.e_ret_void();
                     } else {
                        if (a_int_int_int_int_int_int_int_int(var10, var11, var12, var13, var18.int_e, var18.int_f, var18.int_g, var18.int_h)) {
                           var18.b_ret_void();
                        }

                        if (var18.byte_a == 2) {
                           int var22 = var18.int_a * 100 / var18.int_b;
                           int var23 = (var18.int_h - var18.int_f) * var22 / 100;
                           if (a_int_int_int_int_int_int_int_int(var10, var11, var12, var13, var18.int_e, var18.int_f, var18.int_g, var18.int_f + var23)) {
                              var18.a_ret_void();
                           }
                        }
                     }

                     var9 = var19;
               }
            }
         }

         if (var3.int_t == 0) {
            break;
         }

         this.o();
      }

      this.float_o = this.float_o + Engine.int_a / 1000.0F;
      if (this.float_o > 0.25F) {
         this.boolean_d = false;
      }
   }

   private void a_i_int_int_int_int_int_boolean(Cls_i var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var2 > 0) {
         this.intArr_j[this.int_t] = this.l_b.int_c + (int)((long)var3 * var2 >> 16);
         this.intArr_k[this.int_t] = this.l_b.int_f + (int)((long)var4 * var2 >> 16);
         this.booleanArr_a[this.int_t] = var7;
         var1.l_b.b_int_int_ret_void(var5, var6);
         var3 = Cls_l.int_g;
         var4 = Cls_l.int_h;
         var1.a_l(Cls_f.l_a);
         Cls_f.l_a.b_int_int_ret_void(var5, var6);
         var5 = Cls_l.int_g;
         var6 = Cls_l.int_h;
         this.intArr_l[this.int_t] = (int)((long)var3 * (65536 - var2) + (long)var5 * var2 >> 16);
         this.intArr_m[this.int_t] = (int)((long)var4 * (65536 - var2) + (long)var6 * var2 >> 16);
      } else {
         if (var2 < 0) {
            throw new IllegalStateException("t < 0, t: " + var2);
         }

         var1.l_b.a_int_int_ret_void(int_x, int_y);
         this.intArr_j[this.int_t] = Cls_l.int_g;
         this.intArr_k[this.int_t] = Cls_l.int_h;
         this.booleanArr_a[this.int_t] = var7;
         var1.l_b.a_int_int_ret_void(var5, var6);
         this.intArr_l[this.int_t] = Cls_l.int_g;
         this.intArr_m[this.int_t] = Cls_l.int_h;
      }

      var1.l_b.a_int_int_ret_void(int_x, int_y);
      var4 = Cls_l.int_g;
      var5 = Cls_l.int_h;
      var1.a_l(Cls_f.l_a);
      Cls_f.l_a.a_int_int_ret_void(int_x, int_y);
      this.intArr_n[this.int_t] = Cls_l.int_g - var4;
      this.intArr_o[this.int_t] = Cls_l.int_h - var5;
      this.int_t++;
      if (var1.short_a >= 0) {
         ((Cls_m)this.a_ret_f().a_short_ret_f(var1.short_a)).a_int_ret_void(2);
      }
   }

   private void o() {
      long var1 = Long.MAX_VALUE;
      int var3 = -1;

      for (int var4 = 0; var4 < this.int_t; var4++) {
         long var5 = this.intArr_j[var4] - this.l_b.int_c;
         long var7 = this.intArr_k[var4] - this.l_b.int_f;
         long var9 = var5 * var5 + var7 * var7;
         if (this.booleanArr_a[var4]) {
            var9 = -var9;
         }

         if (var9 > 42949672960000L) {
            System.out.println("Sanity check failed! Found collision is too far, distance: " + Math.sqrt(var9) / 65536.0);
         } else if (var9 < var1) {
            var1 = var9;
            var3 = var4;
         }
      }

      if (var3 != -1) {
         float var37 = 1000.0F / Engine.int_a;
         float var6 = this.intArr_j[var3] * float_r;
         float var40 = this.intArr_k[var3] * float_r;
         float var8 = this.intArr_l[var3] * float_r;
         float var43 = this.intArr_m[var3] * float_r;
         float var10 = 1.0F / (float)Math.sqrt(var8 * var8 + var43 * var43);
         var8 *= var10;
         var43 *= var10;
         float var18 = this.intArr_n[var3] * float_r;
         float var2 = this.intArr_o[var3] * float_r;
         float var25;
         var10 = (var25 = var18 * var8 + var2 * var43) * var8;
         float var11 = var25 * var43;
         if (var8 * var18 + var43 * var2 < 0.0F) {
            var10 = -var10;
            var11 = -var11;
         }

         float var12 = var18 * var37;
         float var13 = var2 * var37;
         float var14 = (this.l_c.int_c - this.intArr_j[var3]) * float_r;
         float var21 = (this.l_c.int_f - this.intArr_k[var3]) * float_r;
         float var19 = var6 + var18;
         var2 = var40 + var2;
         float var15 = var8 * 0.01F;
         float var16 = var43 * 0.01F;
         float var17 = (var25 = var14 * var8 + var21 * var43) * var8;
         var25 *= var43;
         var14 = var14 - var17 - var17 * floatArr_c[this.int_d];
         float var22 = var21 - var25 - var25 * floatArr_c[this.int_d];
         var6 = var6 + var14 + var10 + var15;
         var40 = var40 + var22 + var11 + var16;
         var17 = (var25 = this.float_a * var8 + this.float_b * var43) * var8;
         var25 *= var43;
         var14 = this.float_a - var17 - var17 * floatArr_c[this.int_d];
         float var23 = this.float_b - var25 - var25 * floatArr_c[this.int_d];
         var17 = (var25 = var12 * var8 + var13 * var43) * var8;
         var25 *= var43;
         this.float_a = var17 + var14;
         this.float_b = var25 + var23;
         float var24 = this.float_a - var12;
         var10 = this.float_b - var13;
         var11 = (var25 = (float)Math.sqrt(var24 * var24 + var10 * var10)) != 0.0F ? var24 / var25 : 0.0F;
         var12 = var25 != 0.0F ? var10 / var25 : 0.0F;
         var25 = -(var8 * 0.0F + var43 * float_l);
         var25 = floatArr_b[this.int_d] * floatArr_a[this.int_d] * var25;
         var11 *= var25;
         var12 *= var25;
         var25 = floatArr_a[this.int_d] * var37;
         var37 = var24 * var25;
         var25 = var10 * var25;
         if (var37 * var37 + var25 * var25 < var11 * var11 + var12 * var12) {
            this.float_d -= var37;
            this.float_e -= var25;
         } else {
            this.float_d -= var11;
            this.float_e -= var12;
         }

         this.float_j = this.float_j * (1.0F - this.float_n) + var24 * this.float_n;
         this.float_k = this.float_k * (1.0F - this.float_n) + var10 * this.float_n;
         this.float_o = 0.0F;
         this.boolean_d = true;
         this.float_p = var8;
         this.float_q = var43;
         this.l_b.int_c = (int)(var19 * 65536.0F);
         this.l_b.int_f = (int)(var2 * 65536.0F);
         this.l_c.int_c = (int)(var6 * 65536.0F);
         this.l_c.int_f = (int)(var40 * 65536.0F);
         this.k();
         this.l_b.c_l(this.l_d);
         this.int_t = 0;
      }
   }

   private static boolean c_int_int_int_int_int_int_int_int(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = var0 - var5;
      long var10 = var1 - var6;
      long var12;
      if ((var12 = var8 * var2 + var10 * var3 >> 16) >= 0L) {
         return false;
      } else {
         long var14;
         if ((var14 = (var8 * var8 + var10 * var10 >> 16) - (var7 * var7 << 16)) <= 0L) {
            int_z = 0;
            int var20 = (int)Math.sqrt(var8 * var8 + var10 * var10);
            int var17 = 0;
            int var21 = 0;
            if (var20 != 0) {
               var17 = (int)((var8 * var7 << 16) / var20);
               var21 = (int)((var10 * var7 << 16) / var20);
            }

            int_x = var5 + var17;
            int_y = var6 + var21;
            boolean_i = true;
            return true;
         } else {
            long var16;
            if ((var16 = (var12 * var12 >> 16) - var14) < 0L) {
               return false;
            } else {
               long var18;
               if ((var18 = -var12 - (int)Math.sqrt(var16 << 16)) <= var4) {
                  int_z = (int)((var18 << 16) / var4);
                  int_x = (int)(var0 + (var18 * var2 >> 16));
                  int_y = (int)(var1 + (var18 * var3 >> 16));
                  boolean_i = false;
                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   private static boolean a_int_int_int_int_int_int_int_int_int_ret_boolean(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8
   ) {
      long var9 = (long)var4 * var3 >> 16;
      long var11 = (long)var5 * var2 >> 16;
      long var13 = (long)var6 * var3 >> 16;
      long var15 = (long)var7 * var2 >> 16;
      long var17;
      if ((var17 = var9 - var11 - var13 + var15) == 0L) {
         return false;
      } else {
         long var19;
         if ((var19 = (var9 - var11 + ((long)var2 * var1 >> 16) - ((long)var3 * var0 >> 16) << 16) / var17) >= 0L && var19 <= 65536L) {
            long var21;
            if ((var21 = ((long)var4 * (var7 - var1) + (long)var5 * (var0 - var6) + (long)var6 * var1 - (long)var7 * var0) / var17) >= 0L && var21 <= 65536L) {
               int_z = (int)var21;
               int_x = (int)(var0 + (var21 * var2 >> 16));
               int_y = (int)(var1 + (var21 * var3 >> 16));
               boolean_i = false;
               return true;
            } else if (var21 < 0L) {
               long var23 = var6 - var4;
               long var25 = var7 - var5;
               long var27 = var0 - var4;
               long var29 = var1 - var5;
               long var31;
               if ((var31 = var27 * var23 + var29 * var25 >> 16) <= 0L) {
                  return false;
               } else {
                  long var33 = var23 * var23 + var25 * var25 >> 16;
                  if (var31 >= var33) {
                     return false;
                  } else {
                     var31 = (var31 << 16) / var33;
                     long var35 = var4 + (var31 * var23 >> 16);
                     long var37 = var5 + (var31 * var25 >> 16);
                     long var39 = var35 - var0;
                     long var41 = var37 - var1;
                     if (var39 * var39 + var41 * var41 >> 16 > var8) {
                        return false;
                     } else {
                        int_z = 0;
                        int_x = (int)var35;
                        int_y = (int)var37;
                        boolean_i = true;
                        return true;
                     }
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public final void e_ret_void() {
      this.h();
      super.d_ret_void();
      this.n();
      int var1;
      if ((var1 = 3000 - Game.int_c) <= 1000) {
         this.l_c.int_f = Game.int_d + (Game.shortArr_b[var1 / 5 % 360] << 14);
      } else {
         this.l_c.int_f = Game.int_d + (Game.shortArr_b[200] << 14) - (var1 - 1000) * 22500;
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      if (this.boolean_b) {
         this.a_l(Cls_f.l_a);
         Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
         Cls_l.l_a.a_int_int_ret_void(this.l_c.int_c, this.l_c.int_f);
         int var19 = Cls_l.l_a.int_c >> 16;
         int var20 = Cls_l.l_a.int_f >> 16;
         Cls_l.l_a.a_int_int_ret_void(-(intArr_a[this.int_d] << 16), intArr_a[this.int_d] << 16);
         int var4 = Cls_l.int_g >> 16;
         int var5 = Cls_l.int_h >> 16;
         int var6 = var19 - var4;
         int var7 = var20 - var5;
         int var8 = var6 >> 2;
         int var9 = var19 - var8;
         int var10 = var20 - var8;
         if (!this.boolean_h) {
            var1.setColor(this.int_u);
            var1.fillArc(var4, var5, var6 << 1, var7 << 1, 0, 360);
         } else {
            if (this.int_d == 0) {
               var6 = var19;
               var7 = var20;
               Gfx var21 = Engine.a_ret_Graphics();
               if (this.int_a != 0) {
                  Game.Graphics_a.setColor(255);
                  Game.Graphics_a.fillRect(0, 0, Game.Image_a.getWidth(), Game.Image_a.getHeight());
                  var19 = Game.Image_a.getWidth() >> 1;
                  var20 = Game.Image_a.getHeight() >> 1;
                  var1 = Game.Graphics_a;
                  Engine.a_Graphics(Game.Graphics_a);
               }

               for (int var23 = 0; var23 < 4; var23++) {
                  this.intArr_h[var23] = 0;

                  for (int var34 = 0; var34 < 4; var34++) {
                     if (var23 != var34) {
                        this.intArr_h[var23] = this.intArr_h[var23] - (this.intArr_f[var34] >> 1);
                     }
                  }
               }

               for (int var24 = 0; var24 < 4; var24++) {
                  this.intArr_i[var24] = 999;
               }

               this.a_int_int_int_int_int_Graphics_boolean_boolean(
                  var19, var20, intArr_b[this.int_d] + 2, intArr_b[this.int_d] + 2, -16777216, var1, false, false
               );
               this.a_int_int_int_int_int_Graphics_boolean_boolean(var19, var20, intArr_b[this.int_d], intArr_b[this.int_d], this.int_u, var1, true, false);
               var5 = intArr_b[this.int_d] * 90 / 100;
               this.a_int_int_int_int_int_Graphics_boolean_boolean(var19, var20 + 2, var5, intArr_b[this.int_d], this.int_w, var1, false, false);
               this.a_int_int_int_int_int_Graphics_boolean_boolean(var19 + 1, var20 - 1, var5, intArr_b[this.int_d], this.int_u, var1, false, true);
               Cls_l.l_a.a_float(5.3F);
               var5 = this.intArr_i[1] >> 1;
               var8 = this.intArr_i[1] - var5 + 1;
               var9 = var19 + (Cls_l.l_a.int_a * var8 >> 16);
               var8 = var20 + (Cls_l.l_a.int_d * var8 >> 16);

               for (int var40 = 0; var40 < 12; var40++) {
                  int var11 = 31 + Math.abs(var40 % 2);
                  float var12 = this.float_m + var40 * 0.8F;
                  int var13 = 100 - (var40 << 2);
                  int var14 = var13;
                  var13 = var20;
                  int var47 = var19;
                  Cls_c var43 = this;
                  Cls_l.l_a.a_float(var12);

                  for (int var51 = 0; var51 < 4; var51++) {
                     int var17 = var43.intArr_i[var51] >> 1 >> 1;
                     var17 = var14 * (var43.intArr_i[var51] - var17) / 100;
                     int var18 = var47 + (Cls_l.l_a.int_a * var17 >> 16);
                     var17 = var13 + (Cls_l.l_a.int_d * var17 >> 16);
                     if (var51 == 0) {
                        if (var18 >= var47 && var17 <= var13) {
                           Engine.a_int_int_int(var18, var17 + (var43.intArr_f[1] + var43.intArr_h[1] >> 10), var11);
                           break;
                        }
                     } else if (var51 == 1) {
                        if (var18 <= var47 && var17 <= var13) {
                           Engine.a_int_int_int(var18, var17 + (var43.intArr_f[1] + var43.intArr_h[1] >> 10), var11);
                           break;
                        }
                     } else if (var51 == 2) {
                        if (var18 <= var47 && var17 >= var13) {
                           Engine.a_int_int_int(var18, var17 + (var43.intArr_f[1] + var43.intArr_h[1] >> 10), var11);
                           break;
                        }
                     } else if (var18 >= var47 && var17 >= var13) {
                        Engine.a_int_int_int(var18, var17 + (var43.intArr_f[1] + var43.intArr_h[1] >> 10), var11);
                        break;
                     }
                  }
               }

               Engine.a_int_int_int(var19, var20, 17);
               this.a_int_int_int_int_int_Graphics_boolean_boolean(var9, var8, var5 >> 1, intArr_b[this.int_d], this.int_v, var1, false, false);
               Engine.a_int_int_int(var19, var20, 28);
               if (this.int_a != 0) {
                  Engine.a_Graphics(var21);
                  Game.Image_a.getRGB(Game.intArr_a, 0, Game.Image_a.getWidth(), 0, 0, Game.Image_a.getWidth(), Game.Image_a.getHeight());
                  var10 = 0;

                  for (int var44 = 0; var44 < Game.Image_a.getHeight(); var44++) {
                     for (int var48 = 0; var48 < Game.Image_a.getWidth(); var48++) {
                        if (Game.intArr_a[var10] == -16776961) {
                           Game.intArr_a[var10] = 0;
                        } else {
                           Game.intArr_a[var10] = Game.intArr_a[var10] - this.int_a;
                        }

                        var10++;
                     }
                  }

                  int var45 = var6 - (Game.Image_a.getWidth() >> 1);
                  int var49 = var7 - (Game.Image_a.getHeight() >> 1);
                  Engine.a_ret_Graphics()
                     .drawRGB(Game.intArr_a, 0, Game.Image_a.getWidth(), var45, var49, Game.Image_a.getWidth(), Game.Image_a.getHeight(), true);
               }

               if (Game.boolean_d && !Game.boolean_b) {
                  var10 = Engine.int_a * Engine.a_ret_int();
                  this.int_r += var10;
                  if (this.int_r > 150) {
                     int var46 = Cls_m.intArr_a[4] / 120;
                     Game.g_d.b_int_int_int_int_int_int(var46, Game.c_a.l_c.int_c, Game.c_a.l_c.int_f, intArr_a[0] << 15, 1000, 166);
                     this.int_r = 0;
                  }
               }
            } else if (this.int_d == 1) {
               var7 = (int)Math.toDegrees(this.float_m);

               while (var7 < 0) {
                  var7 += 360;
               }

               while (var7 > 359) {
                  var7 -= 360;
               }

               var4 = 31 - (int)(var7 / 11.25F);
               Engine.a_int_int_int(var19, var20, shortArr_a[var4]);
            } else if (this.int_d == 2) {
               var6 = intArr_b[this.int_d] << 1;
               var1.setColor(0);
               var1.fillArc(var4 - 2, var5 - 2, var6 + 4, var6 + 4, 0, 360);

               for (int var32 = 0; var32 < 6; var32++) {
                  var1.setColor(intArr_p[var32]);
                  var1.fillArc(var4, var5, var6, var6, var32 * 60 - (int)Math.toDegrees(this.float_m), 60);
               }

               var1.setColor(intArr_p[0]);
               var1.fillArc(var9, var10, var8 << 1, var8 << 1, 0, 360);
               Engine.a_int_int_int(var19, var20, 5);
            }

            if (int_c == 1 || Cls_m.intArr_a[0] == 3) {
               Engine.a_int_int_int(var19, var20, 20);
               return;
            }

            if (int_c == 2 || int_c == 3) {
               short var29 = 462;
               byte var33 = 2;
               if (int_c == 3) {
                  var29 = 447;
                  var33 = 4;
               }

               if ((var8 = int_s * var33 / 600) > var33 - 1) {
                  var8 = var33 - 1;
               }

               var8 = var33 - 1 - var8;
               Engine.b_int_int_int_int(var19, var20, var29, var8);
               return;
            }

            if (int_c >= 4 && int_c <= 8) {
               Engine.b_int_int_int_int(var19, var20, intArr_c[int_c - 4], 0);
               return;
            }

            if (Cls_m.intArr_a[0] == 4) {
               Engine.b_int_int_int_int(var19, var20, 465, 0);
               return;
            }
         }
      }
   }

   public final void f_ret_void() {
      this.int_d++;
      if (this.int_d > 2) {
         this.int_d = 0;
      }

      int var1 = Game.a_ret_int();
      if (this.int_d > var1) {
         this.int_d = 0;
      }

      this.c_ret_void();
   }

   public final void g() {
      this.float_a = 0.0F;
      this.float_b = 0.0F;
      this.float_f = 0.0F;
      this.float_g = 0.0F;
      this.float_d = 0.0F;
      this.float_e = 0.0F;
      this.float_j = 0.0F;
      this.float_k = 0.0F;
   }

   private void a_int_int_int_int_int_Graphics_boolean_boolean(int var1, int var2, int var3, int var4, int var5, Gfx var6, boolean var7, boolean var8) {
      var6.setColor(var5);
      var5 = 2;

      for (int var9 = 0; var9 < 4; var9++) {
         int var10 = var3 - var3 * (this.intArr_f[var5] + this.intArr_h[var5] >> 10) / var4;
         int var11 = var3 - var3 * (this.intArr_f[var9 >> 1] + this.intArr_h[var9 >> 1] >> 10) / var4;
         if (var8) {
            var10++;
         }

         if (var7) {
            this.intArr_i[var9] = var10;
            if (var11 < var10) {
               this.intArr_i[var9] = var11;
            }
         }

         int var12 = var1 - var10;
         int var13 = var2 - var11;
         var6.fillArc(var12, var13 + (this.intArr_f[1] + this.intArr_h[1] >> 10), var10 << 1, var11 << 1, var9 * 90, 90);
         if (var9 == 0) {
            var5++;
         }

         if (var9 == 2) {
            var5--;
         }
      }
   }

   static {
      intArr_b[0] = intArr_a[0] * Cls_f.l_g.int_a / 65536 + 1;
      intArr_b[1] = intArr_a[1] * Cls_f.l_g.int_a / 65536 + 1;
      intArr_b[2] = intArr_a[2] * Cls_f.l_g.int_a / 65536 + 1;
   }
}
