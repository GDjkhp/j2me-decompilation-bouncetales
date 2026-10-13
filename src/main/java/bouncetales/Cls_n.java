package bouncetales;


public final class Cls_n extends Cls_f {
   private int int_c;
   int int_a = 0;
   short short_a;
   private short short_d;
   short short_b;
   short short_c;
   private short short_e;
   private byte[] byteArr_a;
   private int[] intArr_a;
   private int[] intArr_b;
   private byte[] byteArr_b;
   private byte[] byteArr_c;
   private int[] intArr_c;
   private int[] intArr_d;
   private byte byte_a;
   private byte byte_b;
   private byte byte_e;
   private byte byte_f;
   private int int_d;
   private int int_r;
   private int int_s = 0;
   private int int_t;
   private int int_u;
   int int_b;
   private byte byte_g;

   public Cls_n() {
      this.byte_d = 6;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.short_a = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.short_d = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.short_b = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.short_c = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.byte_a = var1[var2++];
      this.byte_b = var1[var2++];
      this.byte_e = var1[var2++];
      this.byte_f = var1[var2++];
      int var48 = ++var2;
      var2++;
      int var8;
      this.int_d = 1140850688 | (var1[var48] & 255) << 16 | (var1[var2++] & 255) << 8 | (var8 = var1[var2++] & 255);
      if (var8 == 16) {
         this.byte_g = 1;
      } else {
         this.byte_g = 0;
      }

      if (this.int_d != 1140850688) {
         this.int_d = 1141969390;
      }

      this.short_e = (short)(this.short_b - this.short_a);
      if (this.int_d != 1140850688 && this.byte_g == 0) {
         int var9 = this.short_e * 50 / 100;
         this.byteArr_a = new byte[var9];
         this.int_r = var9 << 12;
         this.int_u = 0;
         this.int_a = var9 + 2;

         for (int var3 = 0; var3 < var9; var3++) {
            this.byteArr_a[var3] = 0;
         }

         for (int var28 = 0; var28 < this.int_c; var28++) {
            this.intArr_a[var28] = 0;
         }

         int var10 = var9 / 20;
         this.int_c = (var10 << 1) + 2;
         this.intArr_a = new int[this.int_c];
         this.intArr_b = new int[this.int_c];
         this.byteArr_b = new byte[this.int_c];
         this.byteArr_c = new byte[this.int_c];
         this.intArr_c = new int[this.int_c];
         this.intArr_d = new int[this.int_c];

         for (int var29 = 2; var29 <= var10 - 2; var29++) {
            int var4 = (this.byteArr_a.length - 1 << 12) * var29 / var10;
            int var5 = (Math.abs(Game.Random_a.nextInt() % 2) + 24 << 12 << 1) / 9;
            int var6 = (Math.abs(Game.Random_a.nextInt() % 2) + 10 << 12) / 3;
            int var7 = var5 * 3;
            this.a_int_int_int_int_int_int_ret_void(var5, var7, -1, var6, var4, 1);
            var5 = (Math.abs(Game.Random_a.nextInt() % 2) + 24 << 12 << 1) / 9;
            var6 = (Math.abs(Game.Random_a.nextInt() % 2) + 10 << 12) / 3;
            var7 = var5 * 3;
            this.a_int_int_int_int_int_int_ret_void(var5, var7, 1, var6, var4, 1);
         }
      }

      return var2;
   }

   public final void c_ret_void() {
      this.int_e = this.short_a << 16;
      this.int_g = this.short_b << 16;
      this.int_f = (this.short_d << 16) - 1966080;
      this.int_h = (this.short_c << 16) + 1966080;
      this.int_b = this.short_c << 16;
   }

   public final void a_int_float_int_c(int var1, float var2, int var3, Cls_c var4) {
      if (this.int_d != 1140850688) {
         this.int_t = 0;
         if (var2 > 230.0F) {
            var2 = 230.0F;
         } else if (var2 < -230.0F) {
            var2 = -230.0F;
         }

         int var9 = (int)Math.abs(var2);
         if (this.byte_g == 0) {
            var1 = (int)((long)(this.byteArr_a.length - 1 << 12) * var1 / 65536L);
            int var5;
            int var6 = (var5 = (var9 * 100 << 12) / 1500) << 1;
            this.a_int_int_int_int_int_int_ret_void(var5, var6, -1, 20480, var1 - (var3 << 2), 0);
            this.a_int_int_int_int_int_int_ret_void(var5, var6, 1, 20480, var1 + (var3 << 2), 0);
         }

         var4.float_j /= 3.0F;
         var4.float_k /= 3.0F;
         if (this.byte_g == 0) {
            this.a_l(Cls_f.l_a);
            var3 = Cls_f.l_a.int_f + (this.short_c << 16);
            var1 = var9 * 500 / 230;
            int var11 = var9 * 6 / 230;
            int var12 = var9 * 800 / 230;
            Game.g_b.a_int_int_int_int_int_int_int_int_int_ret_void(var11, Game.c_a.l_c.int_c, var3, var1, var1 >> 2, 325, 30, var12, var12 / 6);
            Game.g_b.a_int_int_int_int_int_int_int_int_int_ret_void(var11, Game.c_a.l_c.int_c, var3, var1, var1 >> 2, 35, 30, var12, var12 / 6);
         }
      }
   }

   public final void a_int_int_c(int var1, int var2, Cls_c var3) {
      this.int_t = this.int_t + Engine.int_a;
      if (!Game.boolean_a) {
         float var5 = (float)(var1 - this.int_e) / (this.int_g - this.int_e);
         float var9 = (float)(var2 - this.int_f) / (this.int_h - this.int_f);
         if (this.byte_f < this.byte_b) {
            int var4 = this.byte_b - this.byte_f;
            var1 = this.byte_f + (int)(var5 * var4);
         } else {
            int var13 = this.byte_f - this.byte_b;
            var1 = this.byte_b + (int)((1.0F - var5) * var13);
         }

         if (this.byte_e < this.byte_a) {
            int var14 = this.byte_a - this.byte_e;
            var2 = this.byte_e + (int)(var9 * var14);
         } else {
            int var15 = this.byte_e - this.byte_a;
            var2 = this.byte_a + (int)((1.0F - var9) * var15);
         }

         var3.float_d += var1 << 5;
         var3.float_e += var2 << 5;
         if (var3.float_j > 0.0F) {
            var3.float_j = var3.float_j - Engine.int_a * var3.float_j / 400.0F;
            if (var3.float_j < 0.0F) {
               var3.float_j = 0.0F;
            }
         } else if (var3.float_j < 0.0F) {
            var3.float_j = var3.float_j - Engine.int_a * var3.float_j / 400.0F;
            if (var3.float_j > 0.0F) {
               var3.float_j = 0.0F;
            }
         }

         if (var3.float_k > 0.0F) {
            var3.float_k = var3.float_k - Engine.int_a * var3.float_k / 400.0F;
            if (var3.float_k < 0.0F) {
               var3.float_k = 0.0F;
            }
         } else if (var3.float_k < 0.0F) {
            var3.float_k = var3.float_k - Engine.int_a * var3.float_k / 400.0F;
            if (var3.float_k > 0.0F) {
               var3.float_k = 0.0F;
            }
         }

         if (this.int_d != 1140850688) {
            float var7 = 1.0F / Cls_c.floatArr_a[Game.c_a.int_d];
            float var11 = Engine.int_a * 0.0014F;
            if (Game.c_a.float_a > 0.0F) {
               Game.c_a.float_a = Game.c_a.float_a - Game.c_a.float_a * var7 * var11;
               if (Game.c_a.float_a < 0.0F) {
                  Game.c_a.float_a = 0.0F;
               }
            } else {
               Game.c_a.float_a = Game.c_a.float_a - Game.c_a.float_a * var7 * var11;
               if (Game.c_a.float_a > 0.0F) {
                  Game.c_a.float_a = 0.0F;
               }
            }

            if (Game.c_a.float_b > 0.0F) {
               Game.c_a.float_b = Game.c_a.float_b - Game.c_a.float_b * var7 * var11;
               if (Game.c_a.float_b < 0.0F) {
                  Game.c_a.float_b = 0.0F;
               }
            } else {
               Game.c_a.float_b = Game.c_a.float_b - Game.c_a.float_b * var7 * var11;
               if (Game.c_a.float_b > 0.0F) {
                  Game.c_a.float_b = 0.0F;
               }
            }
         }

         if (this.int_t > 150 && this.int_d != 1140850688) {
            this.a_l(Cls_f.l_a);
            var1 = Cls_f.l_a.int_f + (this.short_c << 16);
            Game.g_c.int_b = var1;
            Game.g_c.int_c = 60000;
            var2 = Cls_m.intArr_a[4] / 60;
            Game.g_c.b_int_int_int_int_int_int(var2, Game.c_a.l_c.int_c, Game.c_a.l_c.int_f, Cls_c.intArr_a[0] << 15, 4000, 666);
            this.int_t = 0;
         }

         if (this.int_d != 1140850688) {
            Game.c_a.byte_c = 8;
         }

         Game.boolean_a = true;
      }
   }

   private void a_int_int_int_int_int_int_ret_void(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.int_c; var7++) {
         if (this.intArr_a[var7] == 0) {
            this.intArr_a[var7] = var1 * 50 / 100;
            this.intArr_b[var7] = var2 * 50 / 100;
            this.byteArr_b[var7] = (byte)var3;
            this.byteArr_c[var7] = (byte)var6;
            this.intArr_c[var7] = var4 * 50 / 100;
            this.intArr_d[var7] = var5;
            return;
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      int var13 = Engine.int_a * Engine.a_ret_int();
      if (this.int_d != 1140850688) {
         if (!Game.boolean_b) {
            this.int_u += var13;
            if (this.int_u > 150) {
               this.a_l(Cls_f.l_a);
               int var19 = Cls_f.l_a.int_c + (this.short_a << 16);
               int var24 = Cls_f.l_a.int_c + (this.short_b << 16);
               int var27 = Cls_f.l_a.int_f + (this.short_d << 16);
               int var29 = Cls_f.l_a.int_f + (this.short_c << 16);
               Game.g_c.int_b = var29;
               Game.g_c.int_c = 60000;
               Game.g_c.a_int_int_int_int_int_int_int_int_int_int_int(1, var19, var27, var24, var27, 0, 0, 0, 0, 4000, 666);
               this.int_u = 0;
            }
         }

         if (!Game.boolean_b && this.byte_g == 0) {
            this.int_s += var13;

            for (int var20 = 0; var20 < this.byteArr_a.length; var20++) {
               this.byteArr_a[var20] = 0;
            }

            for (int var21 = 0; var21 < this.int_c; var21++) {
               if (this.intArr_a[var21] != 0) {
                  if (this.byteArr_c[var21] != 1) {
                     this.intArr_a[var21] = this.intArr_a[var21] - (var13 * 28 >> 3);
                     this.intArr_b[var21] = this.intArr_b[var21] - (var13 * 12 >> 3);
                     this.intArr_c[var21] = this.intArr_c[var21] - (var13 << 2 >> 3);
                  }

                  this.intArr_d[var21] = this.intArr_d[var21] + (this.byteArr_b[var21] * this.intArr_c[var21] * var13 >> 6);
                  if (this.intArr_b[var21] <= 0 || this.intArr_c[var21] <= 0) {
                     this.intArr_a[var21] = 0;
                  }

                  if (this.intArr_a[var21] <= 0) {
                     this.intArr_a[var21] = 0;
                  } else if (this.intArr_d[var21] < 0 || this.intArr_d[var21] >> 12 >= this.int_r >> 12) {
                     this.byteArr_b[var21] = (byte)(-this.byteArr_b[var21]);
                     if (this.intArr_d[var21] < 0) {
                        this.intArr_d[var21] = 0;
                     } else if (this.intArr_d[var21] >> 12 >= this.int_r >> 12) {
                        this.intArr_d[var21] = (this.int_r >> 12) - 1 << 12;
                     }

                     if (this.byteArr_c[var21] != 1) {
                        this.intArr_a[var21] = this.intArr_a[var21] - (28 * (var13 << 1) >> 3);
                        this.intArr_b[var21] = this.intArr_b[var21] - (12 * (var13 << 1) >> 3);
                        this.intArr_c[var21] = this.intArr_c[var21] - (4 * (var13 << 1) >> 3);
                     }
                  }

                  int var25;
                  if (this.intArr_a[var21] > 0 && (var25 = this.intArr_d[var21] >> 12) >= 0 && var25 < this.byteArr_a.length) {
                     this.byteArr_a[var25] = (byte)(this.byteArr_a[var25] + (this.intArr_a[var21] >> 12));
                     int var30;
                     if ((var30 = this.intArr_b[var21] >> 12) == 0) {
                        var30 = 1;
                     }

                     int var34 = 180 / var30;

                     for (int var37 = 1; var37 < var30; var37++) {
                        int var40 = this.intArr_a[var21] * (Game.shortArr_b[90 + var34 * var37] + 360 >> 1) / 360 >> 12;
                        if (var25 - var37 >= 0) {
                           this.byteArr_a[var25 - var37] = (byte)(this.byteArr_a[var25 - var37] + var40);
                        }

                        if (var25 + var37 < this.byteArr_a.length) {
                           this.byteArr_a[var25 + var37] = (byte)(this.byteArr_a[var25 + var37] + var40);
                        }
                     }
                  }
               }
            }

            for (int var22 = 0; var22 < this.byteArr_a.length; var22++) {
               if (var22 > 0
                  && this.byteArr_a[var22 - 1] < this.byteArr_a[var22]
                  && var22 < this.byteArr_a.length - 1
                  && this.byteArr_a[var22 + 1] < this.byteArr_a[var22]) {
                  this.byteArr_a[var22]--;
               }
            }
         }

         this.a_l(Cls_f.l_a);
         Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
         Cls_l.l_a.a_int_int_ret_void(this.short_a << 16, this.short_c << 16);
         int var23 = Cls_l.int_g >> 16;
         int var26 = Cls_l.int_h >> 16;
         Cls_l.l_a.a_int_int_ret_void(this.short_b << 16, this.short_d << 16);
         int var28 = Cls_l.int_g >> 16;
         int var31 = Cls_l.int_h >> 16;
         int var35 = var28 - var23;
         if (this.byte_g != 0) {
            int var39 = Game.c_int_ret_int(this.int_d);
            int[] var42 = Cls_i.intArr_a;
            int[] var16 = Cls_i.intArr_b;
            var42[0] = var23;
            var16[0] = var26;
            var42[1] = var28;
            var16[1] = var26;
            var42[2] = var28;
            var16[2] = var31;
            var42[3] = var23;
            var16[3] = var31;
            var2.fillPolygon(var42, 0, var16, 0, 4, var39);
         } else {
            int var38 = (var35 << 8 << 10) / this.byteArr_a.length >> 8;
            int[] var41 = Cls_i.intArr_a;
            int[] var15 = Cls_i.intArr_b;
            var41[0] = var28;
            var15[0] = var31;
            var41[1] = var23;
            var15[1] = var31;
            int var18 = 2;

            for (int var43 = 2; var43 < this.byteArr_a.length + 2; var43++) {
               if (var43 > 2) {
                  byte var36 = this.byteArr_a[var43 - 2];
                  int var45 = 0;

                  for (int var32 = var43 + 1; var32 < this.byteArr_a.length + 2 && this.byteArr_a[var32 - 2] == var36; var32++) {
                     var45++;
                  }

                  var43 += var45;
               }

               if (var43 == this.byteArr_a.length + 1) {
                  var41[var18] = var28;
                  var15[var18] = var26;
               } else {
                  var41[var18] = ((var43 - 2) * var38 >> 10) + var23;
                  var15[var18] = (-this.byteArr_a[var43 - 2] * var38 >> 10) + var26;
               }

               var18++;
            }

            int var44 = Game.c_int_ret_int(this.int_d);
            var2.fillPolygon(var41, 0, var15, 0, var18, var44);
         }
      } else {
         if (!Game.boolean_b) {
            this.int_u += var13;
            if (this.int_u > 150) {
               this.a_l(Cls_f.l_a);
               int var4 = Cls_f.l_a.int_c + (this.short_a << 16);
               int var5 = Cls_f.l_a.int_c + (this.short_b << 16);
               int var6 = Cls_f.l_a.int_f + (this.short_d << 16);
               int var7 = Cls_f.l_a.int_f + (this.short_c << 16);
               int var10 = var4;
               int var14 = var5;
               int var17 = var6;
               int var11 = var7;
               int var8 = Math.abs(this.byte_f);
               if (Math.abs(this.byte_b) > var8) {
                  var8 = Math.abs(this.byte_b);
               }

               int var12 = Math.abs(this.byte_a);
               if (Math.abs(this.byte_e) > var12) {
                  var12 = Math.abs(this.byte_e);
               }

               short var9;
               if (this.byte_f + this.byte_b > 0) {
                  var8 <<= 7;
                  var9 = 90;
                  var14 = var4;
               } else if (this.byte_f + this.byte_b < 0) {
                  var8 <<= 7;
                  var9 = 270;
                  var10 = var5;
               } else if (this.byte_a + this.byte_e > 0) {
                  var8 = var12 << 7;
                  var9 = 0;
                  var11 = var6;
               } else {
                  var8 = var12 << 7;
                  var9 = 180;
                  var17 = var7;
               }

               Game.g_i.a_int_int_int_int_int_int_int_int_int_int_int(1, var10, var17, var14, var11, var8, var8 / 8, var9, 0, 2000, 333);
               this.int_u = 0;
            }
         }
      }
   }
}
