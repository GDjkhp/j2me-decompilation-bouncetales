package bouncetales;


public final class Cls_i extends Cls_f {
   public static int[] intArr_a;
   public static int[] intArr_b;
   private int[] intArr_e;
   private int[] intArr_f;
   public int[] intArr_c;
   public int[] intArr_d;
   private short[] shortArr_a;
   public int int_a;
   private int int_b;
   private int int_c;
   public short short_a;

   public Cls_i() {
      this.byte_d = 2;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      this.int_a = (short)(var1[var2++] << 8 | var1[var2++] & 255) + 1;
      this.int_b = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      int var3 = var1[var2++] & 255;
      int var4 = var1[var2++] & 255;
      int var5 = var1[var2++] & 255;
      int var6 = var1[var2++] & 255;
      this.int_c = var3 << 24 | var4 << 16 | var5 << 8 | var6;
      this.intArr_c = new int[this.int_a];
      this.intArr_d = new int[this.int_a];
      this.intArr_e = new int[this.int_a];
      this.intArr_f = new int[this.int_a];
      this.shortArr_a = new short[this.int_b];
      byte var27 = (byte)var1[var2++];
      short var29 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      var2 = a_intArr_int_int_byteArr_int_int(this.intArr_c, this.int_a - 1, var29, var1, var2, var27);
      var29 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      var2 = a_intArr_int_int_byteArr_int_int(this.intArr_d, this.int_a - 1, var29, var1, var2, var27);
      var27 = (byte)var1[var2++];
      var2 = a_shortArr_int_int_byteArr_int_int(this.shortArr_a, this.int_b, 0, var1, var2, var27);
      this.intArr_c[this.int_a - 1] = this.intArr_c[0];
      this.intArr_d[this.int_a - 1] = this.intArr_d[0];
      this.short_a = (short)(var1[var2++] << 8 | var1[var2++] & 255);
      this.c_ret_void();
      return var2;
   }

   public final void c_ret_void() {
      super.c_ret_void();

      for (int var1 = 0; var1 < this.intArr_c.length; var1++) {
         if (this.intArr_c[var1] < this.int_e) {
            this.int_e = this.intArr_c[var1];
         }

         if (this.intArr_c[var1] > this.int_g) {
            this.int_g = this.intArr_c[var1];
         }
      }

      for (int var2 = 0; var2 < this.intArr_d.length; var2++) {
         if (this.intArr_d[var2] < this.int_f) {
            this.int_f = this.intArr_d[var2];
         }

         if (this.intArr_d[var2] > this.int_h) {
            this.int_h = this.intArr_d[var2];
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      Cls_i var13 = this;
      if (this.boolean_g) {
         this.a_l(Cls_f.l_a);
         int var5 = var3.int_c;
         int var6 = var3.int_f;
         var3.int_c = 0;
         var3.int_f = 0;
         Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);
         var3.int_c = var5;
         var3.int_f = var6;

         for (int var4 = 0; var4 < var13.int_a; var4++) {
            Cls_l.l_a.a_int_int_ret_void(var13.intArr_c[var4], var13.intArr_d[var4]);
            var13.intArr_e[var4] = Cls_l.int_g >> 16;
            var13.intArr_f[var4] = Cls_l.int_h >> 16;
         }

         var13.boolean_g = false;
      }

      int var14 = Engine.int_b - 1;
      int var16 = Engine.int_c - 1;
      int var17 = var3.int_c >> 16;
      int var15 = var3.int_f >> 16;
      var1.setColor(Game.c_int_ret_int(this.int_c));

      for (int var18 = 0; var18 < this.int_b; var18 += 3) {
         int var7 = this.shortArr_a[var18];
         int var8 = this.shortArr_a[var18 + 1];
         int var9 = this.shortArr_a[var18 + 2];
         int var10 = this.intArr_e[var7] + var17;
         int var11 = this.intArr_e[var8] + var17;
         int var12 = this.intArr_e[var9] + var17;
         var7 = this.intArr_f[var7] + var15;
         var8 = this.intArr_f[var8] + var15;
         var9 = this.intArr_f[var9] + var15;
         if ((var10 >= 0 || var11 >= 0 || var12 >= 0)
            && (var7 >= 0 || var8 >= 0 || var9 >= 0)
            && (var10 <= var14 || var11 <= var14 || var12 <= var14)
            && (var7 <= var16 || var8 <= var16 || var9 <= var16)) {
            var1.fillTriangle(var10, var7, var11, var8, var12, var9);
         }
      }
   }
}
