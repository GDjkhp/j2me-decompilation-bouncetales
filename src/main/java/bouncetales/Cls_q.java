package bouncetales;

public final class Cls_q {
   public static final int int_a = Engine.int_b >>> 5;
   private int int_d;
   private int int_e;
   private int int_f;
   private int int_g;
   private int int_h = 0;
   private int int_i;
   public int int_b;
   public int int_c;
   private int int_j;
   String String_a;
   private String[] StringArr_a;
   private int int_k;
   private int int_l;
   private boolean boolean_a;

   public Cls_q(String var1, int var2, int var3, int var4, int var5) {
      this.int_e = var4;
      this.String_a = var1;
      this.int_f = var3;
      switch (this.int_e & 3) {
         case 1:
            this.int_g = 2;
            break;
         case 2:
            this.int_g = 3;
            break;
         default:
            this.int_g = 1;
      }

      if (var5 >= 0) {
         this.int_d = var5;
         this.int_l = Engine.a_int_int_ret_int(var5, 0) + int_a;
         this.int_k = Engine.a_int_int_ret_int(var5, 1);
      } else {
         this.int_d = -1;
         this.int_l = 0;
         this.int_k = 0;
      }

      this.boolean_a = var2 > this.int_l && (this.int_e & 128) == 128 && (this.int_e & 48) != 32;
      boolean var6 = false;
      if ((this.int_e & 256) == 256) {
         var6 = true;
      }

      this.String_a = var1 != null ? var1 : "";
      this.StringArr_a = Engine.a_String_int_int_boolean_int_int_boolean(this.String_a, var2, this.int_f, this.boolean_a, this.int_l, this.int_k, var6);
      this.a_String_ret_void(this.StringArr_a[0]);
   }

   private void a_String_ret_void(String var1) {
      int[] var2 = new int[4];
      if (var1 != null) {
         int var3 = 0;

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var1.charAt(var4) == ' ') {
               var2[var3] = var4;
               var3++;
            }
         }

         try {
            this.int_j = Integer.valueOf(var1.substring(0, var2[0]));
         } catch (Exception var9) {
         }

         try {
            this.int_h = Integer.valueOf(var1.substring(var2[0] + 1, var2[1]));
         } catch (Exception var8) {
            this.int_h = 0;
         }

         try {
            this.int_i = Integer.valueOf(var1.substring(var2[1] + 1, var2[2]));
         } catch (Exception var7) {
            this.int_i = 0;
         }

         try {
            this.int_b = Integer.valueOf(var1.substring(var2[2] + 1, var2[3]));
         } catch (Exception var6) {
            this.int_b = 0;
         }

         try {
            this.int_c = Integer.valueOf(var1.substring(var2[3] + 1, var1.length()));
         } catch (NumberFormatException var5) {
            this.int_c = 0;
         }
      } else {
         this.int_j = 0;
         this.int_h = 0;
         this.int_i = 0;
         this.int_b = 0;
         this.int_c = 0;
      }
   }

   public final void a_int_int_int_int(int var1, int var2, int var3, int var4) {
      int var6 = this.int_j;
      int var14 = var2;
      var2 = var1;
      Cls_q var12 = this;
      Engine.a_int_int_ret_void(this.int_f, this.int_g);
      Engine.b_int_int_ret_void(0, var3);
      Engine.b_int_int_ret_void(1, var4);
      if (var6 > this.int_j) {
         var6 = this.int_j;
      }

      byte var18;
      if ((this.int_e & 48) == 32) {
         var4 = this.int_b / 2;
         var18 = 17;
      } else {
         int var7;
         if ((this.int_e & 12) == 8) {
            var7 = (this.int_b - this.int_i) / 2;
         } else {
            var7 = 0;
         }

         if ((this.int_e & 48) == 0) {
            var4 = var7;
            var18 = 20;
         } else {
            var4 = this.int_b - var7;
            var18 = 24;
         }
      }

      boolean var20 = (this.int_e & 48) == 0;
      byte var8 = 0;
      byte var9 = 0;
      int var10 = 0;
      int var11 = 0;
      switch (this.int_e & 12) {
         case 0:
            var9 = 20;
            var11 = 0;
            var8 = 20;
            if (var20) {
               var10 = this.int_l;
            } else {
               var10 = 0;
            }
            break;
         case 4:
            var9 = 24;
            var11 = this.int_b;
            var8 = 24;
            if (var20) {
               var10 = this.int_b;
            } else {
               var10 = this.int_b - this.int_l;
            }
            break;
         case 8:
            var9 = 17;
            var11 = this.int_b / 2;
            if (var20) {
               var8 = 20;
               var10 = (this.int_b - this.int_i) / 2 + this.int_l;
            } else {
               var8 = 24;
               var10 = this.int_b - (this.int_b - this.int_i) / 2 - this.int_l;
            }
      }

      if (this.int_d >= 0) {
         Engine.a_int_int_int_int(var1 + var4, var2, this.int_d, var18);
      }

      if (!this.boolean_a) {
         var14 = var2 + this.int_k;
      }

      var4 = 0 * Engine.a_int_ret_int(this.int_f);

      for (int var19 = 0; var19 < var6; var19++) {
         if (var12.StringArr_a[var19 + 1] != null) {
            if (var19 < var12.int_h) {
               Engine.a_String_int_int_int_int(var12.StringArr_a[var19 + 1], var12.StringArr_a[var19 + 1].length(), var2 + var10, var14 + var4, var8);
            } else {
               Engine.a_String_int_int_int_int(var12.StringArr_a[var19 + 1], var12.StringArr_a[var19 + 1].length(), var2 + var11, var14 + var4, var9);
            }

            var4 += Engine.a_int_ret_int(var12.int_f);
         }
      }
   }

   static {
      char[] var10000 = new char[]{'\n', ' ', '-'};
   }
}
