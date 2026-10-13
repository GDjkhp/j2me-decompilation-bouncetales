package bouncetales;


public class Cls_f {
   public static final Cls_l l_a = new Cls_l();
   public final Cls_l l_b;
   public final Cls_l l_c;
   private Cls_l l_h;
   public final Cls_l l_d;
   public final Cls_l l_e;
   private Cls_f f_c;
   private Cls_f f_d;
   private Cls_f f_e;
   private Cls_f f_f;
   private short short_a;
   private short short_b;
   public int int_e;
   public int int_f;
   public int int_g;
   public int int_h;
   public int int_i;
   public int int_j;
   public int int_k;
   public int int_l;
   public byte byte_c;
   public int int_m;
   public boolean boolean_e = true;
   private boolean boolean_a = true;
   public boolean boolean_f = true;
   public boolean boolean_g = true;
   private short short_c;
   protected byte byte_d = 1;
   private static short short_d;
   private static int int_a = 0;
   public static final Cls_l l_f = new Cls_l();
   private static Cls_l l_i = new Cls_l();
   public static final Cls_l l_g = new Cls_l();
   private static Cls_l l_j = new Cls_l();
   private static Cls_l l_k = new Cls_l();
   public static Cls_f f_a;
   public static int int_n;
   public static int int_o;
   public static int int_p;
   public static int int_q;
   private static int int_b;
   private static Cls_f[] fArr_a;
   protected static Cls_f f_b;

   public Cls_f() {
      this.short_c = short_d++;
      this.l_b = new Cls_l();
      this.l_c = new Cls_l();
      this.l_h = new Cls_l();
      this.l_d = new Cls_l();
      this.l_e = new Cls_l();
   }

   public final byte a_ret_byte() {
      return this.byte_d;
   }

   public void d_ret_void() {
      if (this.boolean_e) {
         if (this.f_c != null) {
            Cls_l.a_l_l_l(this.f_c.l_b, this.l_c, this.l_b);
         } else {
            this.l_b.a_l(this.l_c);
         }

         this.l_b.c_l(this.l_d);
         this.boolean_e = false;
      }
   }

   public final void h() {
      for (Cls_f var1 = this; var1 != null; var1 = var1.a_f_ret_f(this)) {
         var1.boolean_e = true;
         var1.boolean_f = true;
         var1.boolean_g = true;
      }
   }

   public final void i() {
      for (Cls_f var1 = this; var1 != null; var1 = var1.f_c) {
         var1.boolean_a = true;
      }
   }

   public void a_f_ret_void(Cls_f var1) {
   }

   public void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
   }

   public final void b_f_ret_void(Cls_f var1) {
      if (var1.a_f_ret_boolean(this)) {
         throw new IllegalArgumentException();
      } else if (var1 == this) {
         throw new IllegalArgumentException();
      } else {
         this.j();
         this.f_e = var1.f_d;
         if (this.f_e != null) {
            this.f_e.f_f = this;
         }

         this.f_c = var1;
         this.f_c.f_d = this;
      }
   }

   public final void j() {
      if (this.f_c != null) {
         if (this.f_c.f_d == this) {
            this.f_c.f_d = this.f_e;
            if (this.f_e != null) {
               this.f_e.f_f = null;
            }
         } else {
            if (this.f_f != null) {
               this.f_f.f_e = this.f_e;
            }

            if (this.f_e != null) {
               this.f_e.f_f = this.f_f;
            }
         }

         this.f_c = null;
         this.f_e = null;
         this.f_f = null;
      }
   }

   public final void a_l(Cls_l var1) {
      if (this.boolean_f) {
         this.k();
      }

      var1.a_l(this.l_h);
   }

   public final void k() {
      this.l_h.a_l(this.l_c);

      for (Cls_f var1 = this.f_c; var1 != null; var1 = var1.f_c) {
         Cls_l.a_l_l_l(var1.l_c, this.l_h, this.l_h);
      }

      this.l_h.c_l(this.l_e);
      this.boolean_f = false;
   }

   public final boolean a_f_ret_boolean(Cls_f var1) {
      for (Cls_f var2 = this.f_c; var2 != null; var2 = var2.f_c) {
         if (var1 == var2) {
            return true;
         }
      }

      return false;
   }

   public final Cls_f a_f_ret_f(Cls_f var1) {
      if (var1 == null) {
         return null;
      } else if (this.f_d != null) {
         return this.f_d;
      } else if (this == var1) {
         return null;
      } else if (this.f_e != null) {
         return this.f_e;
      } else {
         for (Cls_f var2 = this.f_c; var2 != null && var2 != var1; var2 = var2.f_c) {
            if (var2.f_e != null) {
               return var2.f_e;
            }
         }

         return null;
      }
   }

   public final Cls_f b_f_ret_f(Cls_f var1) {
      if (var1 == null) {
         return null;
      } else if (this == var1) {
         return null;
      } else if (this.f_e != null) {
         return this.f_e;
      } else {
         for (Cls_f var2 = this.f_c; var2 != null && var2 != var1; var2 = var2.f_c) {
            if (var2.f_e != null) {
               return var2.f_e;
            }
         }

         return null;
      }
   }

   public final short a_ret_short() {
      return this.short_c;
   }

   public final void a_short_ret_void(short var1) {
      this.short_c = var1;
   }

   public final Cls_f a_short_ret_f(short var1) {
      Cls_f var2 = this;

      while (var2 != null && var2.short_c != var1) {
         var2 = var2.a_f_ret_f(this);
      }

      return var2;
   }

   public final Cls_f a_ret_f() {
      Cls_f var1 = this;

      while (var1.f_c != null) {
         var1 = var1.f_c;
      }

      return var1;
   }

   public void c_ret_void() {
      this.int_e = Integer.MAX_VALUE;
      this.int_f = Integer.MAX_VALUE;
      this.int_g = Integer.MIN_VALUE;
      this.int_h = Integer.MIN_VALUE;
   }

   public final void l() {
      if (this.boolean_a) {
         this.int_i = this.int_e;
         this.int_j = this.int_f;
         this.int_k = this.int_g;
         this.int_l = this.int_h;

         for (Cls_f var1 = this.f_d; var1 != null; var1 = var1.f_e) {
            var1.l();
            var1.l_c.a_int_int_ret_void(var1.int_i, var1.int_j);
            if (Cls_l.int_g < this.int_i) {
               this.int_i = Cls_l.int_g;
            }

            if (Cls_l.int_h < this.int_j) {
               this.int_j = Cls_l.int_h;
            }

            if (Cls_l.int_g > this.int_k) {
               this.int_k = Cls_l.int_g;
            }

            if (Cls_l.int_h > this.int_l) {
               this.int_l = Cls_l.int_h;
            }

            var1.l_c.a_int_int_ret_void(var1.int_i, var1.int_l);
            if (Cls_l.int_g < this.int_i) {
               this.int_i = Cls_l.int_g;
            }

            if (Cls_l.int_h < this.int_j) {
               this.int_j = Cls_l.int_h;
            }

            if (Cls_l.int_g > this.int_k) {
               this.int_k = Cls_l.int_g;
            }

            if (Cls_l.int_h > this.int_l) {
               this.int_l = Cls_l.int_h;
            }

            var1.l_c.a_int_int_ret_void(var1.int_k, var1.int_l);
            if (Cls_l.int_g < this.int_i) {
               this.int_i = Cls_l.int_g;
            }

            if (Cls_l.int_h < this.int_j) {
               this.int_j = Cls_l.int_h;
            }

            if (Cls_l.int_g > this.int_k) {
               this.int_k = Cls_l.int_g;
            }

            if (Cls_l.int_h > this.int_l) {
               this.int_l = Cls_l.int_h;
            }

            var1.l_c.a_int_int_ret_void(var1.int_k, var1.int_j);
            if (Cls_l.int_g < this.int_i) {
               this.int_i = Cls_l.int_g;
            }

            if (Cls_l.int_h < this.int_j) {
               this.int_j = Cls_l.int_h;
            }

            if (Cls_l.int_g > this.int_k) {
               this.int_k = Cls_l.int_g;
            }

            if (Cls_l.int_h > this.int_l) {
               this.int_l = Cls_l.int_h;
            }
         }

         this.boolean_a = false;
      }
   }

   public int a_byteArr_int_ret_int(byte[] var1, int var2) {
      this.short_a = a_byteArr_int_ret_short(var1, var2);
      var2 += 2;
      this.short_b = a_byteArr_int_ret_short(var1, var2);
      var2 += 2;
      byte var3 = var1[var2];
      var2++;
      if ((var3 & 7) == 7) {
         this.l_c.int_a = b_byteArr_int(var1, var2);
         var2 += 4;
         this.l_c.int_b = b_byteArr_int(var1, var2);
         var2 += 4;
         this.l_c.int_c = b_byteArr_int(var1, var2);
         var2 += 4;
         this.l_c.int_d = b_byteArr_int(var1, var2);
         var2 += 4;
         this.l_c.int_e = b_byteArr_int(var1, var2);
         var2 += 4;
         this.l_c.int_f = b_byteArr_int(var1, var2);
         var2 += 4;
      } else {
         if ((var3 & 1) > 0) {
            this.l_c.int_c = a_byteArr_int_ret_short(var1, var2) << 16;
            var2 += 2;
            this.l_c.int_f = a_byteArr_int_ret_short(var1, var2) << 16;
            var2 += 2;
         }

         if ((var3 & 2) > 0) {
            this.l_c.a_float(b_byteArr_int(var1, var2) / 65536.0F);
            var2 += 4;
         }

         if ((var3 & 4) > 0) {
            this.l_c.int_a = b_byteArr_int(var1, var2);
            var2 += 4;
            this.l_c.int_e = b_byteArr_int(var1, var2);
            var2 += 4;
         }
      }

      this.int_m = b_byteArr_int(var1, var2);
      this.byte_c = (byte)((this.int_m & 31) - 16);
      this.l_b.int_a = this.l_c.int_a;
      this.l_b.int_b = this.l_c.int_b;
      this.l_b.int_c = this.l_c.int_c;
      this.l_b.int_d = this.l_c.int_d;
      this.l_b.int_e = this.l_c.int_e;
      this.l_b.int_f = this.l_c.int_f;
      return var2 + 4;
   }

   public static void a_fArr(Cls_f[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         Cls_f var2;
         if ((var2 = var0[var1]).short_a >= 0) {
            Cls_f var3 = var0[var2.short_a];
            var2.f_c = var3;
            if (var3.f_d == null) {
               var3.f_d = var2;
            }
         }

         if (var2.short_b >= 0) {
            Cls_f var5 = var0[var2.short_b];
            var2.f_f = var5;
            var5.f_e = var2;
         }
      }

      for (int var4 = 0; var4 < var0.length; var4++) {
         var0[var4].boolean_e = true;
         var0[var4].boolean_a = true;
         var0[var4].boolean_f = true;
         var0[var4].k();
         var0[var4].a_l(l_a);
         var0[var4].l_b.a_l(l_a);
         var0[var4].l_b.c_l(var0[var4].l_d);
      }
   }

   public static final short a_byteArr_int_ret_short(byte[] var0, int var1) {
      return (short)((0 | var0[var1]) << 8 | var0[var1 + 1] & 255);
   }

   public static final int b_byteArr_int(byte[] var0, int var1) {
      return (int)((((0L | var0[var1]) << 8 | var0[var1 + 1] & 0xFF) << 8 | var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF);
   }

   public static int a_intArr_int_int_byteArr_int_int(int[] var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 1 << var5 - 1;
      int var10 = (1 << var5) - 1;

      while (var8 < var1) {
         var6 |= var3[var4++] << var7;
         var7 += 8;

         for (var6 &= (1 << var7) - 1; var7 >= var5; var6 >>>= var5) {
            int var11;
            if (((var11 = var6 & var10) & var9) > 0) {
               var11 |= ~var10;
            }

            if (var8 < var1) {
               var0[var8++] = var11 + var2 << 16;
            }

            var7 -= var5;
         }
      }

      return var4;
   }

   public static int a_shortArr_int_int_byteArr_int_int(short[] var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 1 << var5 - 1;
      int var10 = (1 << var5) - 1;

      while (var8 < var1) {
         var6 |= var3[var4++] << var7;
         var7 += 8;

         for (var6 &= (1 << var7) - 1; var7 >= var5; var6 >>>= var5) {
            int var11;
            if (((var11 = var6 & var10) & var9) > 0) {
               var11 |= ~var10;
            }

            if (var8 < var1) {
               var0[var8++] = (short)(var11 + var2);
            }

            var7 -= var5;
         }
      }

      return var4;
   }

   public static final boolean a_int_int_int_int_int_int_int_int(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = var6 - var4;
      long var10 = var7 - var5;
      long var12 = var2 - var0;
      long var14 = var3 - var1;
      long var16 = var0 + var2 - var4 - var6;
      long var18 = var1 + var3 - var5 - var7;
      long var20 = var12 > 0L ? var12 : -var12;
      if ((var16 > 0L ? var16 : -var16) > var8 + var20) {
         return false;
      } else {
         long var22 = var14 > 0L ? var14 : -var14;
         long var24;
         return (var18 > 0L ? var18 : -var18) > var10 + var22
            ? false
            : ((var24 = var16 * var14 - var18 * var12) > 0L ? var24 : -var24) <= var8 * var22 + var10 * var20;
      }
   }

   public static final boolean b_int_int_int_int_int_int_int_int(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return var2 < var4 || var0 > var6 ? false : var3 >= var5 && var1 <= var7;
   }

   public static boolean a_int_int_int_int_int_int_ret_boolean(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 < var2 || var0 > var4 ? false : var1 >= var3 && var1 <= var5;
   }

   public static void m() {
      int_n = 0;
      int_o = 0;
      b_boolean(true);
   }

   public static void b_boolean(boolean var0) {
      int var1 = Engine.int_a;
      int var2 = 0;
      int var3 = 0;
      f_a.a_l(l_a);
      if (var1 != 0) {
         var2 = (l_a.int_c - f_a.l_b.int_c) / var1;
         var3 = (l_a.int_f - f_a.l_b.int_f) / var1;
      }

      var2 <<= 7;
      var3 = -var3 << 7;
      int var4 = l_a.int_c;
      int var5 = l_a.int_f;
      int var6 = -Engine.int_c / 5 << 16;
      l_g.c_l(Cls_l.l_a);
      Cls_l.l_a.b_int_int_ret_void(0, var6);
      var6 = Cls_l.int_g;
      int var7 = Cls_l.int_h;
      Cls_l.l_a.b_int_int_ret_void(var2, var3);
      var2 = var4 + var6 + var2 + Cls_l.int_g;
      var3 = var5 + var7 + var3 + Cls_l.int_h;
      if (var0) {
         l_f.int_c = var2;
         l_f.int_f = var3;
      } else {
         int dx = var2 - l_f.int_c;
         var2 = var3 - l_f.int_f;
         if (Math.abs(dx) < 327680) {
            dx = 0;
         }

         if (Math.abs(var2) < 327680) {
            var2 = 0;
         }

         for (int_a += var1; int_a >= 15; int_a -= 15) {
            l_f.int_c = l_f.int_c + int_n * 15;
            l_f.int_f = l_f.int_f + int_o * 15;
            int_n = int_n + (15 * int_p * (dx >> 6) >> 14);
            int_o = int_o + (15 * int_p * (var2 >> 6) >> 14);
            int_n = int_n - (15 * int_q * int_n >> 14);
            int_o = int_o - (15 * int_q * int_o >> 14);
         }
      }
   }

   public static void a_f_Graphics_DirectGraphics(Cls_f var0, Gfx var1, Gfx var2) {
      l_f.c_l(l_i);
      Cls_l.a_l_l_l(l_g, l_i, l_j);
      l_j.int_c >>= 16;
      l_j.int_c <<= 16;
      l_j.int_f >>= 16;
      l_j.int_f <<= 16;
      l_j.c_l(l_k);
      var0 = var0;
      l_k.a_int_int_ret_void(0, 0);
      int var3 = Cls_l.int_g;
      int var4 = Cls_l.int_h;
      l_k.a_int_int_ret_void(Engine.int_b << 16, Engine.int_c << 16);
      int var5 = Cls_l.int_g;
      int var6 = Cls_l.int_h;
      if (var3 > var5) {
         var5 = var3;
         var3 = Cls_l.int_g;
      }

      if (var4 > var6) {
         var6 = var4;
         var4 = Cls_l.int_h;
      }

      int_b = 0;
      Cls_f var7 = var0;

      while (var7 != null) {
         var7.a_l(l_a);
         l_a.a_int_int_ret_void(var7.int_i, var7.int_j);
         int var8 = Cls_l.int_g;
         int var9 = Cls_l.int_h;
         int var10 = Cls_l.int_g;
         int var11 = Cls_l.int_h;
         l_a.a_int_int_ret_void(var7.int_i, var7.int_l);
         if (Cls_l.int_g < var8) {
            var8 = Cls_l.int_g;
         }

         if (Cls_l.int_h < var9) {
            var9 = Cls_l.int_h;
         }

         if (Cls_l.int_g > var10) {
            var10 = Cls_l.int_g;
         }

         if (Cls_l.int_h > var11) {
            var11 = Cls_l.int_h;
         }

         l_a.a_int_int_ret_void(var7.int_k, var7.int_l);
         if (Cls_l.int_g < var8) {
            var8 = Cls_l.int_g;
         }

         if (Cls_l.int_h < var9) {
            var9 = Cls_l.int_h;
         }

         if (Cls_l.int_g > var10) {
            var10 = Cls_l.int_g;
         }

         if (Cls_l.int_h > var11) {
            var11 = Cls_l.int_h;
         }

         l_a.a_int_int_ret_void(var7.int_k, var7.int_j);
         if (Cls_l.int_g < var8) {
            var8 = Cls_l.int_g;
         }

         if (Cls_l.int_h < var9) {
            var9 = Cls_l.int_h;
         }

         if (Cls_l.int_g > var10) {
            var10 = Cls_l.int_g;
         }

         if (Cls_l.int_h > var11) {
            var11 = Cls_l.int_h;
         }

         if (var7.byte_d != 11 && !b_int_int_int_int_int_int_int_int(var8, var9, var10, var11, var3, var4, var5, var6)) {
            var7 = var7.b_f_ret_f(var0);
         } else if ((var7.int_m & 128) > 0) {
            var7 = var7.a_f_ret_f(var0);
         } else {
            fArr_a[int_b] = var7;
            int_b++;
            var7 = var7.a_f_ret_f(var0);
         }
      }

      var3 = int_b;
      Cls_f[] var13 = fArr_a;
      if (fArr_a != null && var3 > 1) {
         if (var3 == 2) {
            if (var13[0].byte_c < var13[1].byte_c) {
               Cls_f var17 = var13[0];
               var13[0] = var13[1];
               var13[1] = var17;
            }
         } else {
            a_fArr_int_int(var13, 0, var3 - 1);
         }
      }

      for (int var14 = 0; var14 < int_b; var14++) {
         fArr_a[var14].a_Graphics_DirectGraphics_l(var1, var2, l_j);
      }

      int_b = 0;

      for (int var15 = 0; var15 < fArr_a.length; var15++) {
         fArr_a[var15] = null;
      }
   }

   private static final void a_fArr_int_int(Cls_f[] var0, int var1, int var2) {
      while (var1 < var2) {
         int var4 = var1;
         Cls_f[] var3 = var0;
         Cls_f var5 = var0[var2];

         int var6;
         for (var6 = var1 - 1; var4 < var2; var4++) {
            if (var5.byte_c < var3[var4].byte_c) {
               Cls_f var7 = var3[++var6];
               var3[var6] = var3[var4];
               var3[var4] = var7;
            }
         }

         var3[var2] = var3[var6 + 1];
         var3[var6 + 1] = var5;
         int var8 = var6 + 1;
         a_fArr_int_int(var0, var1, var8 - 1);
         var1 = var8 + 1;
         var0 = var0;
      }
   }

   static {
      l_g.int_a = 43266;
      l_g.int_e = -43266;
      if (Engine.int_b < 200) {
         l_g.int_a = 22306;
         l_g.int_e = -22306;
      }

      int_b = 0;
      fArr_a = new Cls_f[60];
      f_b = new Cls_f();
   }
}
