package bouncetales;


public final class Cls_k extends Cls_f {
   short short_a;
   Cls_c c_a;
   int int_a;
   private int int_c;
   int int_b;
   float float_a;
   byte byte_a;
   boolean boolean_a;

   public Cls_k() {
      this.byte_d = 8;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.short_a = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.byte_a = var1[var2++];
      this.int_a = 0;
      this.int_b = 0;
      this.int_c = 0;
      int var3;
      if ((var3 = Game.b_int_ret_int(Game.int_e)) == 0) {
         this.short_a = 497;
      }

      if (var3 == 1) {
         this.short_a = 509;
      }

      if (var3 == 2) {
         this.short_a = 490;
      }

      return var2;
   }

   public final void c_ret_void() {
      this.int_e = -4587520;
      this.int_g = 4587520;
      this.int_f = 0;
      this.int_h = 6225920;
   }

   public final void d_ret_void() {
      super.d_ret_void();
      if (this.int_a < this.int_b) {
         int var1 = Engine.int_a;
         this.int_a += var1;
         if (this.int_a >= this.int_b - this.int_b / Engine.b_int_ret_int(this.short_a)) {
            if (!this.boolean_a) {
               this.boolean_a = true;
               this.c_a.boolean_a = true;
               this.c_a.float_b = this.float_a;
               this.c_a.float_j = 0.0F;
               this.c_a.float_k = 0.0F;
               this.c_a.boolean_c = true;
               if (this.c_a.equals(Game.c_a)) {
                  Cls_m.intArr_a[1] = 0;
               }
            }

            var1 = Engine.b_int_ret_int(this.short_a);
            this.int_c = this.int_a * var1 / this.int_b;
         } else {
            var1 = Engine.b_int_ret_int(this.short_a);
            this.int_c = this.int_a * var1 / this.int_b;
            this.a_ret_void();
         }

         if (this.int_a >= this.int_b) {
            this.int_a = 0;
            this.int_b = 0;
            this.int_c = 0;
         }
      }
   }

   public final void a_ret_void() {
      this.a_l(Cls_f.l_a);
      this.c_a.l_c.int_f = Cls_f.l_a.int_f
         - (65536 * (short)Engine.b_int_int_ret_int(Engine.c_int_int_ret_int(this.short_a, this.int_c), 0) / Cls_f.l_g.int_a << 16);
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      this.a_l(Cls_f.l_a);
      Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
      int var4 = Cls_l.l_a.int_c >> 16;
      int var5 = Cls_l.l_a.int_f >> 16;
      Engine.b_int_int_int_int(var4, var5, this.short_a, this.int_c);
   }
}
