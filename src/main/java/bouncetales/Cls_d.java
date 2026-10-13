package bouncetales;


public final class Cls_d extends Cls_f {
   private short short_a;
   private byte byte_a;
   private int int_r;
   private boolean boolean_a;
   private int int_s;
   int int_a;
   int int_b;
   int int_c;
   int int_d;
   private static int[] intArr_a;
   private static int int_t = (intArr_a = new int[]{500, 100, 300})[0] + intArr_a[1] + intArr_a[2];
   private static int int_u = intArr_a[2];

   public Cls_d() {
      this.byte_d = 7;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.short_a = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.byte_a = var1[var2++];
      this.int_r = 0;
      this.boolean_a = false;
      this.int_s = 0;
      if (this.l_c.int_a >= 0) {
         this.boolean_a = true;
      }

      return var2;
   }

   public final void c_ret_void() {
      this.int_e = -7864320;
      this.int_g = 7864320;
      this.int_f = -7864320;
      this.int_h = 7864320;
      this.int_a = -2621440;
      this.int_b = 2621440;
      this.int_c = -2621440;
      this.int_d = 2621440;
   }

   public final void a_ret_void() {
      if (this.int_r == 0 && Cls_m.intArr_a[1] == 0) {
         Cls_m.intArr_a[1] = 1;
         Game.d_a = this;
         Cls_c var1 = (Cls_c)this.a_ret_f().a_short_ret_f(this.short_a);
         this.a_l(Cls_f.l_a);
         var1.a_int_int_ret_void(Cls_f.l_a.int_c, Cls_f.l_a.int_f + 2293760);
         var1.boolean_a = false;
         var1.boolean_b = false;
      }
   }

   public final void b_ret_void() {
      if (this.int_s == 0) {
         float var1 = Engine.int_a * 0.001F;
         var1 = 3.0F * var1;
         Cls_l.l_a.a_float(var1);
         Cls_l.l_a.int_c = 0;
         Cls_l.l_a.int_f = 0;
         this.l_c.b_l(Cls_l.l_a);
         if (this.boolean_a && this.l_c.int_a < 0) {
            this.l_c.int_a = 0;
            this.l_c.int_d = 65536;
            this.l_c.int_b = -65536;
            this.l_c.int_e = 0;
         }

         if (!this.boolean_a && this.l_c.int_a > 0) {
            this.l_c.int_a = 0;
            this.l_c.int_d = 65536;
            this.l_c.int_b = 65536;
            this.l_c.int_e = 0;
         }

         this.h();
      }
   }

   public final void e_ret_void() {
      if (this.int_s == 0) {
         float var1 = Engine.int_a * 0.001F;
         var1 = -3.0F * var1;
         Cls_l.l_a.a_float(var1);
         Cls_l.l_a.int_c = 0;
         Cls_l.l_a.int_f = 0;
         this.l_c.b_l(Cls_l.l_a);
         if (this.boolean_a && this.l_c.int_b > 0) {
            this.l_c.int_a = 65536;
            this.l_c.int_d = 0;
            this.l_c.int_b = 0;
            this.l_c.int_e = 65536;
         }

         if (!this.boolean_a && this.l_c.int_b < 0) {
            this.l_c.int_a = -65536;
            this.l_c.int_d = 0;
            this.l_c.int_b = 0;
            this.l_c.int_e = 65536;
         }

         this.h();
      }
   }

   public final void f_ret_void() {
      if (this.int_s == 0) {
         this.int_s = int_t;
      }
   }

   public final void d_ret_void() {
      super.d_ret_void();
      this.int_r = this.int_r - Engine.int_a;
      if (this.int_r < 0) {
         this.int_r = 0;
      }

      if (this.int_s > 0) {
         this.int_s = this.int_s - Engine.int_a;
         if (this.int_s <= int_u && Cls_m.intArr_a[1] == 1) {
            Cls_c var1;
            (var1 = (Cls_c)this.a_ret_f().a_short_ret_f(this.short_a)).float_h = 0.0F;
            var1.float_i = 0.0F;
            var1.float_a = this.byte_a * this.l_c.int_a >> 12;
            var1.float_b = this.byte_a * this.l_c.int_d >> 12;
            var1.boolean_d = false;
            var1.boolean_c = true;
            var1.boolean_a = true;
            var1.boolean_b = true;
            var1.float_j = 0.0F;
            var1.float_k = 0.0F;
            Cls_m.intArr_a[1] = 0;
            this.int_r = 500;
            this.a_l(Cls_f.l_a);
            Cls_f.l_a.a_int_int_ret_void(7864320, 0);
            int var2 = Cls_l.int_g;
            int var3 = Cls_l.int_h;
            var1.l_c.int_c = var2;
            var1.l_c.int_f = var3;
            Game.g_e.a_int_int_int_int_int(10, var2, var3, this.l_c.int_a, this.l_c.int_d);
         }

         if (this.int_s <= 0) {
            this.int_s = 0;

            for (int var5 = 0; var5 < 3; var5++) {
               Cls_i var6 = (Cls_i)Game.fArr_a[var5 + 9];
               Cls_i var7 = (Cls_i)Game.fArr_a[var5];

               for (int var4 = 0; var4 < var6.intArr_c.length; var4++) {
                  var6.intArr_c[var4] = var7.intArr_c[var4];
                  var6.intArr_d[var4] = var7.intArr_d[var4];
               }
            }
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      if (this.int_s > 0) {
         int var4 = int_t - this.int_s;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < 3 && var4 >= var5 + intArr_a[var7]; var7++) {
            var5 += intArr_a[var7];
            var6++;
         }

         int var18 = var6;
         float var12 = (float)(var4 - var5) / intArr_a[var6];
         float var14 = 1.0F - var12;

         for (int var16 = 0; var16 < 3; var16++) {
            Cls_i var8 = (Cls_i)Game.fArr_a[var18 * 3 + var16];
            Cls_i var10 = (Cls_i)Game.fArr_a[var16 + 9];
            Cls_i var9;
            if (var18 == 2) {
               var9 = (Cls_i)Game.fArr_a[var16];
            } else {
               var9 = (Cls_i)Game.fArr_a[(var18 + 1) * 3 + var16];
            }

            for (int var11 = 0; var11 < var10.intArr_c.length; var11++) {
               var10.intArr_c[var11] = (int)(var8.intArr_c[var11] * var14 + var9.intArr_c[var11] * var12);
               var10.intArr_d[var11] = (int)(var8.intArr_d[var11] * var14 + var9.intArr_d[var11] * var12);
            }
         }
      }

      this.a_l(Cls_f.l_a);
      Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
      int var13 = Cls_l.l_a.int_c >> 16;
      int var15 = Cls_l.l_a.int_f >> 16;

      for (int var17 = 0; var17 < 3; var17++) {
         Cls_f var19;
         (var19 = Game.fArr_a[var17 + 9]).l_c.int_c = this.l_c.int_c;
         var19.l_c.int_f = this.l_c.int_f;
         var19.l_c.int_a = this.l_c.int_a;
         var19.l_c.int_d = this.l_c.int_d;
         var19.l_c.int_b = this.l_c.int_b;
         var19.l_c.int_e = this.l_c.int_e;
         var19.h();
         var19.a_Graphics_DirectGraphics_l(var1, var2, var3);
      }

      Engine.a_int_int_int(var13, var15, 48);
   }
}
