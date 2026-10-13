package bouncetales;

public final class Cls_r {
   public Cls_s s_a = null;
   public boolean boolean_a = true;
   public int int_a = -1;
   public Cls_q q_a;
   private int[] intArr_a;

   public Cls_r() {
   }

   public Cls_r(String var1, int var2, Cls_s var3, int var4) {
      this.s_a = var3;
      this.int_a = var4;
      this.a_String_int(var1, var2);
   }

   public final int a_ret_int() {
      if (this.a_int_ret_int(5) == 256) {
         Cls_q var1 = this.q_a;
         if (this.q_a != null) {
            if (var1.String_a != null && var1.String_a.length() > 0) {
               return var1.int_b + this.a_int_ret_int(13) + this.a_int_ret_int(14);
            }

            return var1.int_b - Cls_q.int_a + this.a_int_ret_int(13) + this.a_int_ret_int(14);
         }

         if (this.s_a != null) {
            return this.s_a.b_ret_int();
         }
      } else {
         if (this.a_int_ret_int(8) != 4096) {
            return this.a_int_ret_int(10);
         }

         if (this.s_a != null) {
            return this.s_a.b_ret_int();
         }
      }

      return 0;
   }

   public final int b_ret_int() {
      Cls_q var1 = this.q_a;
      return (this.q_a != null ? var1.int_c : 0) + this.a_int_ret_int(11) + this.a_int_ret_int(12);
   }

   public final boolean a_ret_boolean() {
      return this.int_a != -1;
   }

   public final void a_int_int_ret_void(int var1, int var2) {
      this.intArr_a = Cls_s.a_int_int_intArr_int(var1, var2, this.intArr_a, 1);
   }

   public final int a_int_ret_int(int var1) {
      return !Cls_s.a_int_intArr(var1, this.intArr_a) && this.s_a != null
         ? Cls_s.a_int_intArr_int(var1, this.s_a.intArr_a, 1)
         : Cls_s.a_int_intArr_int(var1, this.intArr_a, 1);
   }

   public final void a_String_int(String var1, int var2) {
      if (var1 == null) {
         var1 = "";
      }

      Cls_q var3 = this.q_a;
      this.q_a = null;
      int var4 = this.a_ret_int();
      this.q_a = var3;
      var4 -= this.a_int_ret_int(13) + this.a_int_ret_int(14);
      int var6 = 0;

      for (int var5 = 0; var5 < 9; var5++) {
         var6 |= this.a_int_ret_int(var5);
      }

      this.q_a = new Cls_q(var1, var4, this.a_int_ret_int(9), var6, var2);
   }
}
