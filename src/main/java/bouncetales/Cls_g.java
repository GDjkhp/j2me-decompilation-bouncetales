package bouncetales;


public final class Cls_g extends Cls_f {
   private static boolean boolean_a = false;
   private int[] intArr_a;
   private int[] intArr_b;
   private int[] intArr_c;
   private int[] intArr_d;
   private int[] intArr_e;
   private short[] shortArr_a;
   private byte[] byteArr_a;
   private byte[] byteArr_b;
   private int int_d;
   private int int_r;
   public int int_a;
   private int int_s;
   private int int_t;
   public int int_b;
   public int int_c;
   private int[] intArr_f;
   private int int_u;
   private static int[] intArr_g = new int[2];

   public Cls_g(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (!boolean_a) {
         boolean_a = true;
      }

      this.intArr_a = new int[var1];
      this.intArr_b = new int[var1];
      this.intArr_c = new int[var1];
      this.intArr_d = new int[var1];
      this.intArr_e = new int[var1];
      this.byteArr_b = new byte[var1];
      if (var4 == 4) {
         this.shortArr_a = new short[var1];
         this.byteArr_a = new byte[var1];

         for (int var8 = 0; var8 < var1; var8++) {
            this.shortArr_a[var8] = 0;
         }
      }

      this.int_s = var1;
      this.int_d = var2;
      this.int_r = var3;
      this.int_a = -1;
      this.int_t = var4;
      this.byte_d = 11;
      this.intArr_f = var5;
      this.int_u = var6;
      this.byte_c = (byte)var7;
   }

   public final void c_f(Cls_f var1) {
      this.b_f_ret_void(var1);
      this.l_c.int_a = 65536;
      this.l_c.int_b = 0;
      this.l_c.int_c = 0;
      this.l_c.int_d = 0;
      this.l_c.int_e = 65536;
      this.l_c.int_f = 0;
      this.l_b.a_l(this.l_c);
      this.c_ret_void();
   }

   public final void a_int_int_int_int_int_int_ret_void(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 + 1 + this.int_a > this.int_s) {
         var1 = this.int_s - this.int_a - 1;
      }

      for (int var9 = 0; var9 < var1; var9++) {
         int var7;
         int var8 = (var7 = var9 * 360 / var1) + 90 >= 360 ? var7 + 90 - 360 : var7 + 90;
         this.int_a++;
         this.intArr_a[this.int_a] = var6 != 0 ? var5 + Game.Random_a.nextInt() % var6 : var5;
         this.intArr_b[this.int_a] = var2;
         this.intArr_c[this.int_a] = var3;
         this.intArr_d[this.int_a] = var4 * Game.shortArr_b[var7];
         this.intArr_e[this.int_a] = var4 * Game.shortArr_b[var8];
         if (this.int_t == 3) {
            this.byteArr_b[this.int_a] = (byte)(var9 % this.intArr_f.length);
         } else if (this.int_t == 4 && this.equals(Game.g_a)) {
            byte var10;
            if ((var10 = (byte)Math.abs(Game.Random_a.nextInt() % this.intArr_f.length)) > 1) {
               var10 = (byte)Math.abs(Game.Random_a.nextInt() % this.intArr_f.length);
            }

            this.byteArr_b[this.int_a] = var10;
         } else {
            this.byteArr_b[this.int_a] = (byte)Math.abs(Game.Random_a.nextInt() % this.intArr_f.length);
         }
      }
   }

   public final void a_int_int_int_int_int_int_int_int_int_ret_void(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 + 1 + this.int_a > this.int_s) {
         var1 = this.int_s - this.int_a - 1;
      }

      for (int var13 = 0; var13 < var1; var13++) {
         int var10001 = Game.Random_a.nextInt();
         int var10;
         int var11 = (
                     var10 = var6
                        + var10001 % (var7 / 2 + 1)
                        - (var6 + var10001 % (var7 / 2 + 1) >= 360 ? 360 : 0)
                        + (var6 + var10001 % (var7 / 2 + 1) - (var6 + var10001 % (var7 / 2 + 1) >= 360 ? 360 : 0) < 0 ? 360 : 0)
                  )
                  + 90
               >= 360
            ? var10 - 270
            : var10 + 90;
         int var12 = var5 != 0 ? var4 + Game.Random_a.nextInt() % var5 : var4;
         this.int_a++;
         this.intArr_a[this.int_a] = var9 != 0 ? var8 + Game.Random_a.nextInt() % var9 : var8;
         this.intArr_b[this.int_a] = var2;
         this.intArr_c[this.int_a] = var3;
         this.intArr_d[this.int_a] = var12 * Game.shortArr_b[var10];
         this.intArr_e[this.int_a] = var12 * Game.shortArr_b[var11];
         if (this.int_t == 0) {
            if (var10 >= 35 && var10 <= 90) {
               this.byteArr_b[this.int_a] = 2;
            } else if (var10 < 35) {
               this.byteArr_b[this.int_a] = 3;
            } else if (var10 > 325) {
               this.byteArr_b[this.int_a] = 1;
            } else {
               this.byteArr_b[this.int_a] = 0;
            }
         } else if (this.int_t == 7) {
            if (var6 != 0 && var6 != 180) {
               this.byteArr_b[this.int_a] = 1;
            } else {
               this.byteArr_b[this.int_a] = 0;
            }
         } else {
            this.byteArr_b[this.int_a] = (byte)Math.abs(Game.Random_a.nextInt() % this.intArr_f.length);
         }
      }
   }

   public final void a_int_int_int_int_int(int var1, int var2, int var3, int var4, int var5) {
      if (11 + this.int_a > this.int_s) {
         var1 = this.int_s - this.int_a - 1;
      }

      for (int var9 = 0; var9 < var1; var9++) {
         int var6 = 800 + Game.Random_a.nextInt() % 200;
         this.int_a++;
         this.intArr_a[this.int_a] = 800 + Game.Random_a.nextInt() % 200;
         this.intArr_b[this.int_a] = var2;
         this.intArr_c[this.int_a] = var3;
         int var7 = var4 + (Game.Random_a.nextInt() % 30 << 10);
         int var8 = var5 + (Game.Random_a.nextInt() % 30 << 10);
         this.intArr_d[this.int_a] = var6 * var7 >> 8;
         this.intArr_e[this.int_a] = var6 * var8 >> 8;
         this.byteArr_b[this.int_a] = (byte)Math.abs(Game.Random_a.nextInt() % this.intArr_f.length);
      }
   }

   public final void b_int_int_int_int_int_int(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var9 = 0; var9 < var1; var9++) {
         int var7;
         int var8;
         do {
            var7 = Game.Random_a.nextInt() % ((var4 << 1) + 1);
            var8 = Game.Random_a.nextInt() % ((var4 << 1) + 1);
         } while (var7 * var7 + var8 * var8 > var4 * var4);

         var7 = var2 + var7;
         var8 = var3 + var8;
         this.a_int_int_int_int_int_int_int_int_int_ret_void(1, var7, var8, 0, 0, 0, 0, var5, var6);
      }
   }

   public final void a_int_int_int_int_int_int_int_int_int_int_int(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      for (int var14 = 0; var14 < var1; var14++) {
         int var12 = var2 + Math.abs(Game.Random_a.nextInt() % (var4 - var2 + 1));
         int var13 = var3 + Math.abs(Game.Random_a.nextInt() % (var5 - var3 + 1));
         this.a_int_int_int_int_int_int_int_int_int_ret_void(1, var12, var13, var6, var7, var8, var9, var10, var11);
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      int var7 = Engine.int_a * Engine.a_ret_int();

      for (int var4 = 0; var4 < this.int_a + 1; var4++) {
         boolean var8 = false;
         this.intArr_a[var4] = this.intArr_a[var4] - var7;
         if (this.intArr_a[var4] > 0) {
            if (this.int_r != 0) {
               this.intArr_d[var4] = this.intArr_d[var4] - (this.intArr_d[var4] * this.int_r * var7 >> 14);
               this.intArr_e[var4] = this.intArr_e[var4] - (this.intArr_e[var4] * this.int_r * var7 >> 14);
            }

            this.intArr_d[var4] = this.intArr_d[var4];
            this.intArr_e[var4] = this.intArr_e[var4] + this.int_d * var7;
            if (this.int_t == 1 && this.intArr_e[var4] > this.int_c) {
               this.intArr_e[var4] = this.int_c;
            } else if (this.int_t == 4) {
               this.shortArr_a[var4] = (short)(this.shortArr_a[var4] - var7);
               if (this.shortArr_a[var4] <= 0) {
                  this.shortArr_a[var4] = (short)(Math.abs(Game.Random_a.nextInt() % 200) + 300);
                  this.byteArr_a[var4] = (byte)(Math.abs(Game.Random_a.nextInt()) & 3);
               }

               int var5 = var7 / 2;
               if (this.byteArr_a[var4] == 1) {
                  a_int_int_int(var5, this.intArr_d[var4], this.intArr_e[var4]);
                  this.intArr_d[var4] = intArr_g[0];
                  this.intArr_e[var4] = intArr_g[1];
               } else if (this.byteArr_a[var4] == 2) {
                  a_int_int_int(359 - var5, this.intArr_d[var4], this.intArr_e[var4]);
                  this.intArr_d[var4] = intArr_g[0];
                  this.intArr_e[var4] = intArr_g[1];
               }
            } else if (this.int_t == 5) {
               a_int_int_int(var7 / 5, this.intArr_d[var4], this.intArr_e[var4]);
               this.intArr_d[var4] = intArr_g[0];
               this.intArr_e[var4] = intArr_g[1];
            }

            this.intArr_b[var4] = this.intArr_b[var4] + (this.intArr_d[var4] * var7 >> 4);
            this.intArr_c[var4] = this.intArr_c[var4] + (this.intArr_e[var4] * var7 >> 4);
         } else {
            var8 = true;
         }

         if (this.int_t == 1 && this.intArr_c[var4] >= this.int_b) {
            var8 = true;
         }

         if (var8) {
            if (var4 == this.int_a) {
               this.int_a--;
            } else {
               this.intArr_a[var4] = this.intArr_a[this.int_a];
               this.intArr_b[var4] = this.intArr_b[this.int_a];
               this.intArr_c[var4] = this.intArr_c[this.int_a];
               this.intArr_d[var4] = this.intArr_d[this.int_a];
               this.intArr_e[var4] = this.intArr_e[this.int_a];
               this.int_a--;
               var4--;
            }
         } else {
            int var11 = Engine.b_int_ret_int(this.intArr_f[this.byteArr_b[var4]]);
            int var9;
            if ((var9 = this.intArr_a[var4] * var11 / this.int_u) > var11 - 1) {
               var9 = var11 - 1;
            }

            int var10 = var11 - 1 - var9;
            var3.a_int_int_ret_void(this.intArr_b[var4], this.intArr_c[var4]);
            var11 = Cls_l.int_g >> 16;
            int var6 = Cls_l.int_h >> 16;
            Engine.b_int_int_int_int(var11, var6, this.intArr_f[this.byteArr_b[var4]], var10);
         }
      }
   }

   private static void a_int_int_int(int var0, int var1, int var2) {
      short var3 = Game.shortArr_b[var0 % 360];
      short var4 = Game.shortArr_b[(var0 + 90) % 360];
      intArr_g[0] = (var1 * var4 - var2 * var3) / 360;
      intArr_g[1] = (var1 * var3 + var2 * var4) / 360;
   }
}
