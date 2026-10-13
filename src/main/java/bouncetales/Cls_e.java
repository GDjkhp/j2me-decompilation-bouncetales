package bouncetales;


public final class Cls_e extends Cls_f {
   byte byte_a;
   private int int_c;
   private int int_d;
   private int int_r;
   private int int_s;
   private int int_t;
   private int int_u;
   private byte byte_e;
   private boolean boolean_b;
   private int int_v;
   private int int_w;
   int int_a;
   int int_b;
   private byte byte_f;
   boolean boolean_a;
   byte byte_b;
   private static int int_x = 2000;
   private static int[] intArr_a = new int[]{6000, 4000, 4000, 10000};
   private static int[] intArr_b = new int[]{100, 50, 80, 150};
   private static int[] intArr_c = new int[]{50, 100, 100, 150};

   public Cls_e() {
      this.byte_d = 10;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.int_c = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.l_c.int_c;
      this.int_d = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.l_c.int_f;
      this.int_r = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.l_c.int_c;
      this.int_s = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.l_c.int_f;
      this.byte_a = var1[var2++];
      this.byte_e = 0;
      this.int_v = 0;
      this.int_a = 0;
      this.boolean_b = false;
      if (this.int_c < this.int_r) {
         this.boolean_b = true;
      }

      this.byte_b = 1;
      this.int_w = 2000;
      this.byte_f = 1;
      this.int_b = 800;
      this.boolean_a = false;
      if (this.byte_a == 3) {
         this.int_v = int_x;
         this.int_t = this.l_c.int_c;
         this.int_u = this.l_c.int_f;
         this.int_c = this.int_t;
         this.int_d = this.int_u;
         this.int_r = this.int_t;
         this.int_s = this.int_u;
      }

      return var2;
   }

   public final void c_ret_void() {
      this.int_e = -intArr_c[this.byte_a] << 15;
      this.int_g = intArr_c[this.byte_a] << 15;
      this.int_f = 0;
      this.int_h = intArr_b[this.byte_a] << 16;
   }

   public final void a_ret_void() {
      this.a_l(Cls_f.l_a);
      int var1 = Cls_f.l_a.int_c;
      int var2 = Game.c_a.l_c.int_c;
      if (this.int_v <= 0 && this.byte_b == 0 && this.byte_f == 1) {
         this.int_v = 500;
         if (var1 < var2) {
            Game.c_a.float_f += 200.0F;
            Game.c_a.float_g += 400.0F;
         } else {
            Game.c_a.float_f += -200.0F;
            Game.c_a.float_g += 400.0F;
         }

         Game.c_a.float_a = 0.0F;
         Game.c_a.float_b = 0.0F;
      } else {
         if (this.byte_b == 1) {
            if (var1 < var2) {
               Game.c_a.float_f += 100.0F;
            } else {
               Game.c_a.float_f += -100.0F;
            }

            Game.c_a.float_a = 0.0F;
            Game.c_a.float_b = 0.0F;
         }
      }
   }

   public final void b_ret_void() {
      if (Game.int_e != 13 || Cls_m.intArr_a[8] != 5) {
         switch (this.byte_a) {
            case 0:
               if (this.int_v <= 0) {
                  this.a_l(Cls_f.l_a);
                  int var1 = Cls_f.l_a.int_c;
                  int var2 = Game.c_a.l_c.int_c;
                  if (var1 < var2) {
                     Game.c_a.float_f += 500.0F;
                  } else {
                     Game.c_a.float_f += -500.0F;
                  }

                  Game.c_a.float_a = 0.0F;
                  Game.c_a.float_b = 0.0F;
                  this.int_v = 500;
                  return;
               }
               break;
            case 1:
               if (Game.c_a.int_d == 1) {
                  this.f_ret_void();
                  return;
               }

               Cls_m.intArr_a[0] = 1;
               return;
            case 2:
               if (this.int_v <= 0 && this.byte_b == 0 && this.byte_f == 0) {
                  this.int_a = 0;
                  this.byte_f = 1;
                  this.int_b = 200;
                  return;
               }
               break;
            case 3:
               Cls_m.intArr_a[0] = 1;
               this.l_c.int_c = this.int_t;
               this.l_c.int_f = this.int_u;
               this.int_c = this.int_t;
               this.int_d = this.int_u;
               this.int_r = this.int_t;
               this.int_s = this.int_u;
         }
      }
   }

   private void f_ret_void() {
      this.a_l(Cls_f.l_a);
      int var1 = Cls_f.l_a.int_c;
      int var2 = Cls_f.l_a.int_f;
      Game.g_g.a_int_int_int_int_int_int_ret_void(10, var1, var2 + (intArr_b[this.byte_a] << 15), 370, 920, 230);
      this.j();
      Game.h_a.l_c.int_c = var1;
      Game.h_a.l_c.int_f = var2 + 1966080;
      Game.h_a.l_b.a_l(this.l_c);
      Game.h_a.k();
      Game.h_a.l_b.c_l(Game.h_a.l_d);
   }

   public final void e_ret_void() {
      switch (this.byte_a) {
         case 0:
            g();
            this.f_ret_void();
            return;
         case 1:
         case 3:
            return;
         case 2:
            g();
            this.f_ret_void();
      }
   }

   private static void g() {
      if (Game.c_a.float_b < 0.0F) {
         Game.c_a.float_b = -Game.c_a.float_b * 0.5F;
         Game.c_a.float_a *= 0.7F;
      } else {
         Game.c_a.float_a = -Game.c_a.float_a * 0.5F;
         Game.c_a.float_b *= 0.7F;
      }
   }

   public final void d_ret_void() {
      this.h();
      super.d_ret_void();
      if (Game.int_e != 13 || Cls_m.intArr_a[8] != 5) {
         int var1 = Engine.int_a;
         int var2 = this.l_c.int_c;
         int var3 = this.l_c.int_f;
         if (this.int_v > 0) {
            this.int_v -= var1;
            if (this.int_v <= 0) {
               this.int_v = 0;
               if (this.byte_a == 3) {
                  this.int_v = int_x;
                  this.int_r = this.int_c;
                  this.int_s = this.int_d;
                  int var6 = this.int_r - var2;
                  int var7 = this.int_s - var3;
                  float var8 = var6 >> 16;
                  float var9 = var7 >> 16;
                  int var22 = (int)(Math.sqrt(var8 * var8 + var9 * var9) * 65536.0);
                  int var28;
                  if ((var28 = (int_x << 1) * intArr_a[this.byte_a]) > var22) {
                     double var10 = (double)var28 / var22;
                     this.int_r += (int)(var6 * (var10 - 1.0));
                     this.int_s += (int)(var7 * (var10 - 1.0));
                  }

                  this.int_c = Game.c_a.l_c.int_c;
                  this.int_d = Game.c_a.l_c.int_f;
               }
            }
         }

         if (this.byte_a == 3) {
            int var18 = this.int_r;
            int var20 = this.int_s;
            int var4 = var18 - var2;
            int var5 = var20 - var3;
            float var23 = var4 >> 16;
            float var29 = var5 >> 16;
            int var24;
            if ((var24 = (int)(Math.sqrt(var23 * var23 + var29 * var29) * 65536.0)) != 0) {
               double var33 = (double)(var1 * intArr_a[this.byte_a]) / var24;
               var2 += (int)(var4 * var33);
               var3 += (int)(var5 * var33);
            }
         } else {
            if (this.byte_a == 2) {
               if (this.int_w > 0) {
                  this.int_w -= var1;
                  if (this.int_w <= 0) {
                     if (this.byte_b == 0) {
                        this.byte_b = 1;
                        this.int_w = 2000;
                        this.byte_f = 1;
                        this.int_b = 800;
                     } else {
                        this.byte_b = 0;
                        this.int_w = 5000;
                        this.byte_f = 2;
                        this.int_b = 800;
                        this.boolean_a = true;
                     }
                  }
               }

               if (this.byte_f == 1) {
                  this.int_a += var1;
                  if (this.int_a >= this.int_b) {
                     if (this.byte_b == 0) {
                        this.byte_f = 2;
                        this.int_b = 200;
                     }

                     this.int_a = this.int_b;
                  }
               } else if (this.byte_f == 2) {
                  this.int_a -= var1;
                  if (this.int_a <= 0) {
                     this.byte_f = 0;
                     this.int_a = 0;
                     this.boolean_a = false;
                  }
               }
            }

            int var19;
            int var21;
            int var25;
            if (this.byte_e == 0) {
               var19 = this.int_c;
               var21 = this.int_d;
               var25 = this.int_r;
            } else {
               var19 = this.int_r;
               var21 = this.int_s;
               var25 = this.int_c;
            }

            if (this.byte_a == 0 && Math.abs(var2 - var19) > 4587520 && Math.abs(var2 - var25) > 4587520) {
               this.a_l(Cls_f.l_a);
               int var30 = Cls_f.l_a.int_c;
               var25 = Game.c_a.l_c.int_c;
               if (Math.abs(Game.c_a.l_c.int_c - var30) < 7864320 && (var30 < var25 && var19 < var2 || var30 > var25 && var19 > var2)) {
                  if (this.byte_e == 0) {
                     var19 = this.int_r;
                     var21 = this.int_s;
                     this.byte_e = 1;
                  } else {
                     var19 = this.int_c;
                     var21 = this.int_d;
                     this.byte_e = 0;
                  }
               }
            }

            int var14 = var19 - var2;
            int var16 = var21 - var3;
            float var31 = var14 >> 16;
            float var27 = var16 >> 16;
            int var32 = (int)(Math.sqrt(var31 * var31 + var27 * var27) * 65536.0);
            boolean var34 = false;
            boolean var11 = false;
            if (var32 != 0) {
               double var12 = (double)(var1 * intArr_a[this.byte_a]) / var32;
               var14 = (int)(var14 * var12);
               var16 = (int)(var16 * var12);
               var2 += var14;
               var3 += var16;
               if (var14 >= 0 && var2 >= var19 || var14 <= 0 && var2 <= var19) {
                  var2 = var19;
                  var34 = true;
               }

               if (var16 >= 0 && var3 >= var21 || var16 <= 0 && var3 <= var21) {
                  var3 = var21;
                  var11 = true;
               }
            }

            if (var34 && var11 || var32 == 0) {
               var2 = var19;
               var3 = var21;
               if (this.byte_e == 0) {
                  this.byte_e = 1;
               } else {
                  this.byte_e = 0;
               }
            }
         }

         if (this.byte_a != 2 || this.byte_a == 2 && this.byte_b == 0 && this.byte_f == 0) {
            this.boolean_b = true;
            if (this.l_c.int_c < var2) {
               this.boolean_b = false;
            }

            this.l_c.int_c = var2;
            this.l_c.int_f = var3;
            this.boolean_e = true;
            this.boolean_f = true;
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      this.a_l(Cls_f.l_a);
      Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
      int var11 = Cls_l.l_a.int_c >> 16;
      int var12 = Cls_l.l_a.int_f >> 16;
      switch (this.byte_a) {
         case 0:
            int var10 = Game.int_b / 50 % 6;
            Engine.b_int_int_int_int(var11, var12, 467, var10);
            return;
         case 1:
            if (this.boolean_b) {
               Engine.a_int_int_int(var11, var12, -43);
               return;
            }

            Engine.a_int_int_int(var11, var12, -44);
            return;
         case 2:
            if (this.byte_f != 0) {
               int var4 = var1.getClipX();
               int var5 = var1.getClipY();
               int var6 = var1.getClipWidth();
               int var7 = var1.getClipHeight();
               int var8;
               if ((var8 = var12 - var5) > var7) {
                  var8 = var7;
               }

               var1.setClip(var4, var5, var6, var8);
               var8 = this.int_a * 61 / this.int_b;
               if (this.boolean_b) {
                  Engine.a_int_int_int(var11, var12 + 61 - var8, 189);
               } else {
                  Engine.a_int_int_int(var11, var12 + 61 - var8, 194);
               }

               var1.setClip(var4, var5, var6, var7);
            }

            int var9;
            if (this.byte_f == 0) {
               var9 = Game.int_a / 150 % 4;
            } else {
               var9 = 0;
            }

            Engine.b_int_int_int_int(var11, var12, 504, var9);
            return;
         case 3:
            Engine.a_int_int_int(var11, var12, -30);
      }
   }
}
