package bouncetales;

public final class Cls_l {
   public int int_a = 65536;
   public int int_b;
   public int int_c;
   public int int_d;
   public int int_e = 65536;
   public int int_f;
   public static int int_g;
   public static int int_h;
   public static Cls_l l_a = new Cls_l();

   public final void a_int_int_ret_void(int var1, int var2) {
      int_g = (int)((long)this.int_a * var1 + (long)this.int_b * var2 >> 16) + this.int_c;
      int_h = (int)((long)this.int_d * var1 + (long)this.int_e * var2 >> 16) + this.int_f;
   }

   public final void b_int_int_ret_void(int var1, int var2) {
      int_g = (int)((long)this.int_a * var1 + (long)this.int_b * var2 >> 16);
      int_h = (int)((long)this.int_d * var1 + (long)this.int_e * var2 >> 16);
   }

   public final void a_l(Cls_l var1) {
      this.int_a = var1.int_a;
      this.int_b = var1.int_b;
      this.int_c = var1.int_c;
      this.int_d = var1.int_d;
      this.int_e = var1.int_e;
      this.int_f = var1.int_f;
   }

   public final void b_l(Cls_l var1) {
      int var2 = (int)((long)this.int_a * var1.int_a + (long)this.int_b * var1.int_d >> 16);
      int var3 = (int)((long)this.int_a * var1.int_b + (long)this.int_b * var1.int_e >> 16);
      int var4 = (int)(((long)this.int_a * var1.int_c + (long)this.int_b * var1.int_f >> 16) + this.int_c);
      int var5 = (int)((long)this.int_d * var1.int_a + (long)this.int_e * var1.int_d >> 16);
      int var6 = (int)((long)this.int_d * var1.int_b + (long)this.int_e * var1.int_e >> 16);
      int var7 = (int)(((long)this.int_d * var1.int_c + (long)this.int_e * var1.int_f >> 16) + this.int_f);
      this.int_a = var2;
      this.int_b = var3;
      this.int_c = var4;
      this.int_d = var5;
      this.int_e = var6;
      this.int_f = var7;
   }

   public static void a_l_l_l(Cls_l var0, Cls_l var1, Cls_l var2) {
      int var3 = (int)((long)var0.int_a * var1.int_a + (long)var0.int_b * var1.int_d >> 16);
      int var4 = (int)((long)var0.int_a * var1.int_b + (long)var0.int_b * var1.int_e >> 16);
      int var5 = (int)(((long)var0.int_a * var1.int_c + (long)var0.int_b * var1.int_f >> 16) + var0.int_c);
      int var6 = (int)((long)var0.int_d * var1.int_a + (long)var0.int_e * var1.int_d >> 16);
      int var7 = (int)((long)var0.int_d * var1.int_b + (long)var0.int_e * var1.int_e >> 16);
      int var8 = (int)(((long)var0.int_d * var1.int_c + (long)var0.int_e * var1.int_f >> 16) + var0.int_f);
      var2.int_a = var3;
      var2.int_b = var4;
      var2.int_c = var5;
      var2.int_d = var6;
      var2.int_e = var7;
      var2.int_f = var8;
   }

   public final void c_l(Cls_l var1) {
      long var2;
      if ((var2 = (long)this.int_a * this.int_e - (long)this.int_b * this.int_d >> 16) != 0L) {
         var1.int_a = (int)(((long)this.int_e << 16) / var2);
         var1.int_b = (int)(((long)this.int_d << 16) / var2);
         var1.int_d = (int)(((long)this.int_b << 16) / var2);
         var1.int_e = (int)(((long)this.int_a << 16) / var2);
         var1.int_c = -((int)((long)this.int_c * var1.int_a + (long)this.int_f * var1.int_b >> 16));
         var1.int_f = -((int)((long)this.int_c * var1.int_d + (long)this.int_f * var1.int_e >> 16));
      } else {
         throw new ArithmeticException("Non-invertible matrix.");
      }
   }

   public final void a_float(float var1) {
      int var2 = (int)((float)Math.cos(var1) * 65536.0F);
      int var3 = (int)((float)Math.sin(var1) * 65536.0F);
      this.int_a = var2;
      this.int_b = -var3;
      this.int_d = var3;
      this.int_e = var2;
   }

   public final String toString() {
      return new String(this.int_a + " " + this.int_b + " " + this.int_c + "\n" + this.int_d + " " + this.int_e + " " + this.int_f);
   }
}
