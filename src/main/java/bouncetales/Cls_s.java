package bouncetales;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

public final class Cls_s {
   private Vector Vector_a = new Vector();
   private int int_b = -1;
   private int int_c = 0;
   public int int_a = 0;
   public int[] intArr_a = null;
   public int[] intArr_b = null;
   private Cls_q q_a = null;
   private int int_d = -1;
   private int int_e = 0;
   private int int_f = 0;
   private int int_g = 1;
   private int[] intArr_c = new int[3];
   private String[] StringArr_a = new String[3];
   private int[] intArr_d = new int[3];
   private static final int[] intArr_e = new int[4];
   private static final int[] intArr_f = new int[]{3, 12, 48, 64, 128, 256, 1536, 2048, 4096};
   private static int[] intArr_g = new int[]{-1, 7304, -1, -1, 1, 1, 1, 1, 16777215, 0, 0, 6710886, 0, 0, 6710886, 11171584};
   private static final int[] intArr_h = new int[]{3, 12, 16, 32, 64, 128};
   private static int[] intArr_i = new int[]{-1, 8, 2, 2, 2, 0, 0, -1, -1, -1, 20, 12, 12, 2, 6, 1, 4456448, 6170113, 68, 10526880, 0, 10027008, 0};

   public final void a_r(Cls_r var1) {
      int var3 = this.Vector_a.size();
      this.Vector_a.insertElementAt(var1, var3);
      var1.s_a = this;
      if (this.int_b == -1 && this.a_int_ret_boolean(var3)) {
         this.a_int_ret_void(var3);
      }
   }

   public final void a_ret_void() {
      this.Vector_a.removeAllElements();
      this.int_c = 0;
      this.int_b = -1;
   }

   private boolean a_int_ret_boolean(int var1) {
      Cls_r var2 = (Cls_r)this.Vector_a.elementAt(var1);
      int var3;
      return (var3 = this.a_int_ret_int(var1)) >= this.int_c && var3 + var2.b_ret_int() <= this.int_c + this.e_ret_int();
   }

   public final int a_ret_int() {
      return this.int_b;
   }

   public final void a_int_ret_void(int var1) {
      if (var1 >= this.Vector_a.size()) {
         var1 = this.Vector_a.size() - 1;
      }

      if (var1 != this.int_b) {
         if (var1 == -1 || ((Cls_r)this.Vector_a.elementAt(var1)).a_ret_boolean()) {
            int var2 = this.int_b;
            this.int_b = var1;
            if (var2 != -1) {
               this.Vector_a.elementAt(var2);
            }

            if (var1 != -1) {
               this.Vector_a.elementAt(var1);
            }

            if (this.int_b != -1) {
               int var3 = (var2 = this.a_int_ret_int(this.int_b)) + ((Cls_r)this.Vector_a.elementAt(this.int_b)).b_ret_int();
               int var4 = this.e_ret_int();
               if (var2 < this.int_c) {
                  this.int_c = var2;
                  return;
               }

               if (var3 > this.int_c + var4) {
                  this.int_c = var3 - var4;
               }
            }
         }
      }
   }

   private Cls_r a_ret_r() {
      Cls_r var1;
      return (var1 = this.int_b != -1 ? (Cls_r)this.Vector_a.elementAt(this.int_b) : null) != null && var1.boolean_a ? var1 : null;
   }

   public final void a_String_ret_void(String var1) {
      int var2 = this.c_int_ret_int(0) | 256;
      this.q_a = var1 != null && var1.length() > 0 ? new Cls_q(var1, Integer.MAX_VALUE, this.c_int_ret_int(13), var2, -1) : null;
      this.int_d = -1;
      this.int_f = 0;
   }

   public final void a_int_String_int(int var1, String var2, int var3) {
      this.intArr_c[var1] = 1114112 | (short)var3 & '\uffff';
      this.StringArr_a[var1] = var2;
      this.intArr_d[var1] = 0;
   }

   public final void b_String(String var1) {
      if ((this.intArr_c[0] & 65536) == 65536) {
         this.StringArr_a[0] = var1;
         this.intArr_d[0] = 0;
      }
   }

   public final void b_int_ret_void(int var1) {
      this.intArr_c[var1] = 0;
      this.StringArr_a[var1] = null;
      this.intArr_d[var1] = 0;
   }

   public final void b_ret_void() {
      for (int var1 = 0; var1 < 3; var1++) {
         boolean var2 = (short)this.intArr_c[var1] == -2;
         Cls_r var3 = this.a_ret_r();
         if ((this.intArr_c[var1] & 65536) != 0 && (this.intArr_c[var1] & 1048576) != 0 && (!var2 || var3 != null)) {
            Engine.a_int_String_int(var1, this.StringArr_a[var1], this.intArr_d[var1]);
         } else {
            Engine.a_int_String_int(var1, null, 0);
         }
      }
   }

   private int a_int_ret_int(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 += ((Cls_r)this.Vector_a.elementAt(var3)).b_ret_int() + this.c_int_ret_int(19);
      }

      return var2;
   }

   private static int a_r_int(Cls_r var0, int var1) {
      int var2;
      if ((var2 = var0.a_int_ret_int(6)) == 512) {
         return var1 - var0.a_ret_int();
      } else {
         return var2 == 1024 ? var1 - var0.a_ret_int() >> 1 : 0;
      }
   }

   private int c_ret_int() {
      int var1;
      return (var1 = this.c_int_ret_int(11)) > 0 ? var1 : Engine.e_ret_int() - (Engine.a_ret_boolean() ? Engine.d_ret_int() : 0);
   }

   public final int b_ret_int() {
      return this.c_ret_int() - this.c_int_ret_int(15) - this.c_int_ret_int(16);
   }

   private int d_ret_int() {
      return this.Vector_a.size() > 0 ? this.a_int_ret_int(this.Vector_a.size() - 1) + ((Cls_r)this.Vector_a.lastElement()).b_ret_int() : 0;
   }

   private int e_ret_int() {
      int var1 = this.b_int_ret_int(5);
      return this.d_ret_int() > var1 ? var1 - this.b_int_ret_int(6) - this.b_int_ret_int(7) : var1;
   }

   private int b_int_ret_int(int var1) {
      switch (var1) {
         case 1:
            int var2 = Engine.int_c - (Engine.b_ret_boolean() ? Engine.c_ret_int() : 0);
            if (this.c_int_ret_int(3) == 32) {
               return Math.min(this.b_int_ret_int(2) + this.d_ret_int() + this.c_int_ret_int(17) + this.c_int_ret_int(18), var2);
            } else {
               if ((var1 = this.c_int_ret_int(12)) > 0) {
                  return var1;
               }

               return var2;
            }
         case 2:
            return Math.max(this.q_a != null ? this.q_a.int_c : 0, this.int_d != -1 ? Engine.a_int_int_ret_int(this.int_d, 1) : 0)
               + this.c_int_ret_int(6)
               + this.c_int_ret_int(7);
         case 3:
         default:
            return 0;
         case 4:
            return this.b_int_ret_int(1) - this.b_int_ret_int(2);
         case 5:
            return this.b_int_ret_int(4) - this.c_int_ret_int(17) - this.c_int_ret_int(18);
         case 6:
            return 1 + Engine.a_int_int_ret_int(151, 1);
         case 7:
            return 1 + Engine.a_int_int_ret_int(150, 1);
      }
   }

   public final void c_int_ret_void(int var1) {
      Cls_r var2 = this.a_ret_r();
      int var8;
      switch (var1) {
         case 1:
            Cls_s var11 = this;
            if (this.Vector_a.size() != 0) {
               int var14;
               if (this.int_b == -1) {
                  var14 = -1;

                  for (int var16 = 0; var16 < var11.Vector_a.size(); var16++) {
                     Cls_r var20 = (Cls_r)var11.Vector_a.elementAt(var16);
                     int var24;
                     int var28 = (var24 = var11.a_int_ret_int(var16)) + var20.b_ret_int();
                     if (var24 >= var11.int_c) {
                        break;
                     }

                     if (var20.a_ret_boolean() && var28 > var11.int_c - var11.c_int_ret_int(14)) {
                        var14 = var16;
                     }
                  }
               } else {
                  int var29 = this.int_b;
                  Cls_s var13 = this;
                  int var19 = var29 - 1;

                  int var31;
                  while (true) {
                     if (var19 < 0) {
                        var31 = -1;
                        break;
                     }

                     if (((Cls_r)var13.Vector_a.elementAt(var19)).a_ret_boolean()) {
                        var31 = var19;
                        break;
                     }

                     var19--;
                  }

                  var14 = var31;
                  if (var31 != -1 && this.a_int_ret_int(var14) + ((Cls_r)this.Vector_a.elementAt(var14)).b_ret_int() < this.int_c - this.c_int_ret_int(14)) {
                     var14 = -1;
                  }
               }

               if (var14 == -1) {
                  if (var11.c_int_ret_int(5) == 128 && var11.int_c <= 0) {
                     Cls_s var15 = var11;
                     int var30 = var11.d_ret_int();
                     int var21 = var11.e_ret_int();
                     var11.int_c = var30 - var21;
                     if (var30 < var11.b_int_ret_int(5)) {
                        var11.int_c = 0;
                     }

                     for (int var25 = var11.Vector_a.size() - 1; var25 > 0; var25--) {
                        if (!var15.a_int_ret_boolean(var25)) {
                           var15.a_int_ret_void(-1);
                           return;
                        }

                        if (((Cls_r)var15.Vector_a.elementAt(var25)).a_ret_boolean()) {
                           var15.a_int_ret_void(var25);
                           return;
                        }
                     }

                     return;
                  }

                  var11.int_c = var11.int_c - var11.c_int_ret_int(14);
                  if (var11.int_c < 0) {
                     var11.int_c = 0;
                  }

                  if (var11.int_b != -1 && !var11.a_int_ret_boolean(var11.int_b)) {
                     var11.a_int_ret_void(-1);
                     return;
                  }
               } else {
                  var11.a_int_ret_void(var14);
               }
            }

            return;
         case 2:
            Cls_s var10 = this;
            if (this.Vector_a.size() != 0) {
               int var12 = this.d_ret_int();
               int var3 = this.e_ret_int();
               int var17;
               if (this.int_b == -1) {
                  var17 = -1;

                  for (int var22 = this.Vector_a.size() - 1; var22 >= 0; var22--) {
                     Cls_r var26 = (Cls_r)var10.Vector_a.elementAt(var22);
                     int var7;
                     if ((var7 = var10.a_int_ret_int(var22) + var26.b_ret_int()) < var10.int_c + var3) {
                        break;
                     }

                     if (var26.a_ret_boolean() && var7 <= var10.int_c + var3 + var10.c_int_ret_int(14)) {
                        var17 = var22;
                     }
                  }
               } else {
                  int var5 = this.int_b;
                  Cls_s var4 = this;
                  int var6 = var5 + 1;

                  int var10000;
                  while (true) {
                     if (var6 >= var4.Vector_a.size()) {
                        var10000 = -1;
                        break;
                     }

                     if (((Cls_r)var4.Vector_a.elementAt(var6)).a_ret_boolean()) {
                        var10000 = var6;
                        break;
                     }

                     var6++;
                  }

                  var17 = var10000;
                  if (var10000 != -1 && this.a_int_ret_int(var17) > this.int_c + var3 + this.c_int_ret_int(14)) {
                     var17 = -1;
                  }
               }

               if (var17 == -1) {
                  if (var10.c_int_ret_int(5) == 128 && var10.int_c >= var12 - var3) {
                     Cls_s var18 = var10;
                     var10.int_c = 0;

                     for (int var23 = 0; var23 < var18.Vector_a.size() - 1; var23++) {
                        Cls_r var27 = (Cls_r)var18.Vector_a.elementAt(var23);
                        if (!var18.a_int_ret_boolean(var23)) {
                           var18.a_int_ret_void(-1);
                           return;
                        }

                        if (var27.a_ret_boolean()) {
                           var18.a_int_ret_void(var23);
                           return;
                        }
                     }

                     return;
                  }

                  var10.int_c = var10.int_c + var10.c_int_ret_int(14);
                  if (var12 <= var3) {
                     var10.int_c = 0;
                  } else if (var10.int_c > var12 - var3) {
                     var10.int_c = var12 - var3;
                  }

                  if (var10.int_b != -1 && !var10.a_int_ret_boolean(var10.int_b)) {
                     var10.a_int_ret_void(-1);
                     return;
                  }
               } else {
                  var10.a_int_ret_void(var17);
               }
            }

            return;
         case 5:
            var8 = 1;
            break;
         case 6:
         case 24:
            var8 = 2;
            break;
         case 7:
            var8 = 0;
            break;
         default:
            return;
      }

      if ((this.intArr_c[var8] & 65536) != 0) {
         if ((var8 = (short)this.intArr_c[var8]) == -2) {
            if (var2 != null) {
               Engine.b_a.d_int_ret_void(var2.int_a);
               return;
            }
         } else {
            Engine.b_a.d_int_ret_void(var8);
         }
      }
   }

   public final void c_ret_void() {
      if (this.q_a != null) {
         int var1 = this.int_d != -1 ? Engine.a_int_int_ret_int(this.int_d, 0) : 0;
         int var2 = this.c_ret_int() - (this.c_int_ret_int(8) << 1);
         if (this.c_int_ret_int(1) != 8) {
            var1 = var2 - var1;
         } else {
            var1 = var2;
         }

         if (var1 < this.q_a.int_b) {
            if (this.int_e >= 3000) {
               if (this.int_g > 0) {
                  this.int_f = (this.int_e - 3000) * 20 / 1000;
                  if (this.int_f > this.q_a.int_b - var1) {
                     this.int_f = this.q_a.int_b - var1;
                     this.int_e = 0;
                     this.int_g = -1;
                  }
               } else {
                  this.int_f = this.q_a.int_b - var1 - (this.int_e - 3000) * 20 / 1000;
                  if (this.int_f <= 0) {
                     this.int_f = 0;
                     this.int_e = 0;
                     this.int_g = 1;
                  }
               }
            }

            this.int_e = this.int_e + Engine.int_a;
         }
      }
   }

   public final void d_ret_void() {
      Gfx var1 = Engine.a_ret_Graphics();
      int var2 = this.b_int_ret_int(2);
      int var3 = this.c_int_ret_int(4) == 64
         ? (Engine.int_b - this.c_ret_int() >> 1) + (Engine.b_ret_int() == 3 ? Engine.d_ret_int() : 0)
         : this.c_int_ret_int(9) + (Engine.b_ret_int() == 3 ? Engine.d_ret_int() : 0);
      int var4 = this.c_int_ret_int(4) == 64
         ? Engine.int_c - (Engine.b_ret_boolean() ? Engine.c_ret_int() : 0) - this.b_int_ret_int(1) >> 1
         : this.c_int_ret_int(10) + (Engine.b_ret_int() == 1 ? Engine.c_ret_int() : 0);
      int var5 = this.c_ret_int();
      int var6 = this.b_int_ret_int(1);
      if (Game.a_s_int_int_int_int_int(this, 1, var3, var4, var5, var6)) {
         var1.setColor(this.c_int_ret_int(22));
         var1.fillRect(var3, var4, var5, var6);
         var1.setColor(this.c_int_ret_int(23));
         var1.drawRect(var3, var4, var5 - 1, var6 - 1);
      }

      if (var2 > 0) {
         var1.setClip(var3, var4, var5, var2);
         if (Game.a_s_int_int_int_int_int(this, 2, var3, var4, var5, var2)) {
            var1.setColor(this.c_int_ret_int(20));
            var1.fillRect(var3, var4, var5, var2);
         }

         var1.setClip(var3, var4, var5, var2);
         if (Game.a_s_int_int_int_int_int(this, 3, var3, var4, var5, var2)) {
            var1.setClip(var3, var4, var5, var2);
            int var7 = this.c_int_ret_int(8);
            int var8 = this.int_d != -1 ? Engine.a_int_int_ret_int(this.int_d, 0) : 0;
            int var9 = this.q_a != null ? this.q_a.int_b : 0;
            int var10 = var5 - (var7 << 1);
            int var11;
            if (this.c_int_ret_int(1) != 8) {
               var11 = var10 - var8;
            } else {
               var11 = var10;
            }

            if (this.int_d != -1) {
               int var12 = var7;
               switch (this.c_int_ret_int(1)) {
                  case 4:
                     var12 = var7 + (var10 - var8);
                     break;
                  case 8:
                     var12 = var7 + (var10 - var8 >> 1);
               }

               Engine.a_int_int_int_int(var3 + var12, var4 + this.c_int_ret_int(6), this.int_d, 20);
            }

            if (this.q_a != null) {
               int var38 = var7;
               switch (this.c_int_ret_int(1)) {
                  case 0:
                     var38 = var7 + var8;
                     break;
                  case 4:
                     var38 = var7 + Math.max(var11 - var9, 0);
                     break;
                  case 8:
                     var38 = var7 + (Math.max(var10 - var9, 0) >> 1);
               }

               int var13 = 0;
               if (var5 < Engine.int_b) {
                  var13 = Engine.int_b - var5 - (Engine.a_ret_boolean() ? Engine.d_ret_int() : 0) >> 1;
               }

               var1.setClip(var38 - 1 + var13, var4 - 1, var11 + 2, var2 + 2);
               this.q_a.a_int_int_int_int(var3 + var38 - this.int_f, var4 + this.c_int_ret_int(6), this.c_int_ret_int(24), this.c_int_ret_int(25));
            }
         }
      }

      if (this.c_int_ret_int(2) == 16) {
         int var30 = Engine.c_ret_int();
         int var32 = Engine.d_ret_int();
         var1.setClip(0, 0, Engine.int_b, Engine.int_c);
         var1.setColor(this.c_int_ret_int(21));
         switch (Engine.b_ret_int()) {
            case 1:
               var1.fillRect(0, 0, Engine.int_b, var30);
               break;
            case 2:
               var1.fillRect(0, Engine.int_c - var30, Engine.int_b, var30);
               break;
            case 3:
               var1.fillRect(0, 0, var32, Engine.int_c);
               break;
            case 4:
               var1.fillRect(Engine.int_b - var32, 0, Engine.int_b, Engine.int_c);
         }
      }

      var1.setClip(var3, var4 + var2, var5, var6 - var2);
      Game.a_s_int_int_int_int_int(this, 4, var3, var4 + var2, var5, var6 - var2);
      int var31 = var3 + this.c_int_ret_int(15);
      int var33 = var4 + var2 + this.c_int_ret_int(17);
      int var34 = this.b_ret_int();
      int var35 = this.e_ret_int();
      int var36 = this.d_ret_int();
      int var39 = this.b_int_ret_int(5);
      var1.setClip(var31, var33, var34, var39);
      Game.a_s_int_int_int_int_int(this, 5, var31, var33, var34, var39);
      var1.setClip(var31, var33, var34, var39);
      if (this.int_c > 0) {
         var1.setClip(var31, var33, var34, this.b_int_ret_int(6));
         if (Game.a_s_int_int_int_int_int(this, 6, var31, var33, var34, this.b_int_ret_int(6))) {
            Engine.a_int_int_int(
               var31 + Engine.a_int_int_ret_int(151, 2) + (var34 - Engine.a_int_int_ret_int(151, 0) >> 1), var33 + Engine.a_int_int_ret_int(151, 3), 151
            );
         }
      }

      if (var35 < var36) {
         var33 += this.b_int_ret_int(6);
      }

      if (this.int_c < var36 - var35) {
         var1.setClip(var31, var33 + var35, var34, this.b_int_ret_int(7));
         if (Game.a_s_int_int_int_int_int(this, 7, var31, var33 + var35, var34, this.b_int_ret_int(7))) {
            Engine.a_int_int_int(
               var31 + Engine.a_int_int_ret_int(150, 2) + (var34 - Engine.a_int_int_ret_int(150, 0) >> 1),
               var33 + var35 + 1 + Engine.a_int_int_ret_int(150, 3),
               150
            );
         }
      }

      var6 = this.int_b;
      if (this.int_b != -1 && ((Cls_r)this.Vector_a.elementAt(var6)).a_int_ret_int(7) == 2048) {
         Cls_r var25 = (Cls_r)this.Vector_a.elementAt(var6);
         int var41 = var31 + a_r_int(var25, var34);
         var2 = var33 + this.a_int_ret_int(var6) - this.int_c;
         var3 = var25.a_ret_int();
         var4 = var25.b_ret_int();
         var1.setClip(var41, var2, var3, var4);
         if (Game.a_s_int_int_int_int_int(this, 9, var41, var2, var3, var4)) {
            var1.setColor(var25.a_int_ret_int(21));
            var1.fillRect(var41, var2, var3, var4);
            var1.setColor(var25.a_int_ret_int(22));
            var1.drawRect(var41, var2, var3 - 1, var4 - 1);
         }
      }

      for (int var37 = 0; var37 < this.Vector_a.size(); var37++) {
         Cls_r var26 = (Cls_r)this.Vector_a.elementAt(var37);
         if ((var2 = this.a_int_ret_int(var37)) > this.int_c + var35) {
            break;
         }

         var4 = var26.b_ret_int();
         if (var2 + var4 >= this.int_c) {
            int var42 = var31 + a_r_int(var26, var34);
            var2 = var33 + var2 - this.int_c;
            var3 = var26.a_ret_int();
            var1.setClip(var31, var33, var34, var35);
            Engine.a_int_int_int_int_intArr(var42, var2, var3, var4, intArr_e);
            if (Game.a_s_int_int_int_int_int(this, 8, var42, var2, var3, var4)) {
               boolean var27 = var37 == this.int_b;
               Cls_q var40;
               if ((var40 = var26.q_a) != null) {
                  var40.a_int_int_int_int(
                     var42 + var26.a_int_ret_int(13),
                     var2 + var26.a_int_ret_int(11),
                     var26.a_int_ret_int(var26.boolean_a ? (var27 ? 18 : 15) : (var27 ? 20 : 19)),
                     var26.a_int_ret_int(16)
                  );
               }
            }
         }
      }

      if (var6 != -1 && ((Cls_r)this.Vector_a.elementAt(var6)).a_int_ret_int(7) == 2048) {
         Cls_r var28 = (Cls_r)this.Vector_a.elementAt(var6);
         int var43 = var31 + a_r_int(var28, var34);
         var2 = var33 + this.a_int_ret_int(var6) - this.int_c;
         var3 = var28.a_ret_int();
         var4 = var28.b_ret_int();
         var1.setClip(var43, var2, var3, var4);
         Game.a_s_int_int_int_int_int(this, 10, var43, var2, var3, var4);
      }
   }

   public final void d_int_ret_void(int var1) {
      byte[] var3;
      if ((var3 = (byte[])Engine.a_int_ret_Object(var1)) != null) {
         try {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));
            this.intArr_a = a_DataInputStream_intArr_int_int(var4, intArr_f, 15, 22);
            this.intArr_b = a_DataInputStream_intArr_int_int(var4, intArr_h, 20, 26);
         } catch (Exception var2) {
         }
      }
   }

   private int c_int_ret_int(int var1) {
      return a_int_intArr_int(var1, this.intArr_b, 2);
   }

   public final void a_int_int_ret_void(int var1, int var2) {
      this.intArr_a = a_int_int_intArr_int(var1, var2, this.intArr_a, 1);
   }

   public final void b_int_int_ret_void(int var1, int var2) {
      this.intArr_b = a_int_int_intArr_int(var1, var2, this.intArr_b, 2);
   }

   private static int[] a_DataInputStream_intArr_int_int(DataInputStream var0, int[] var1, int var2, int var3) throws java.io.IOException {
      int var4 = var0.readInt();
      int var8 = var1.length;
      if (var4 == 0) {
         return null;
      } else {
         int var5 = 0;

         for (int var6 = var8; var4 >>> var6 - 1 != 0; var6++) {
            var5 = var6 - var8;
         }

         int[] var11;
         (var11 = new int[var5 + 2])[0] = var4;
         var11[1] = 0;
         if ((var4 & -1 >>> 32 - var8) != 0) {
            var11[1] = var0.readInt();
         }

         for (int var9 = 0; var9 < var5; var9++) {
            if ((var11[0] & 1 << var9 + var8) != 0) {
               var11[var9 + 2] = var0.readShort();
            }
         }

         for (int var10 = var2 + 2 - var8; var10 <= var3 + 2 - var8 && var10 < var11.length; var10++) {
            int var7 = 0 | (var11[var10] & 31744) << 9 | (var11[var10] & 992) << 6 | (var11[var10] & 31) << 3;
            var11[var10] = var7;
         }

         return var11;
      }
   }

   public static int a_int_intArr_int(int var0, int[] var1, int var2) {
      int[] var3;
      int[] var5;
      if (var2 == 1) {
         var5 = intArr_g;
         var3 = intArr_f;
      } else {
         var5 = intArr_i;
         var3 = intArr_h;
      }

      int var4 = var3.length;
      if (!a_int_intArr(var0, var1)) {
         var1 = var5;
      }

      return var0 < var4 ? var1[1] & var3[var0] : var1[var0 + 2 - var4];
   }

   public static boolean a_int_intArr(int var0, int[] var1) {
      return var1 != null && (var1[0] & 1 << var0) != 0;
   }

   public static int[] a_int_int_intArr_int(int var0, int var1, int[] var2, int var3) {
      int[] var4;
      byte var5;
      if (var3 == 1) {
         var5 = 16;
         var4 = intArr_f;
      } else {
         var5 = 23;
         var4 = intArr_h;
      }

      if (var2 == null) {
         var2 = new int[var5];
      } else if (var2.length < var5) {
         int[] var6 = new int[var5];
         System.arraycopy(var2, 0, var6, 0, var2.length);
         var2 = var6;
      }

      var2[0] |= 1 << var0;
      if (var0 < var4.length) {
         var2[1] &= ~var4[var0];
         var2[1] |= var1 & var4[var0];
      } else {
         var2[var0 + 2 - var4.length] = var1;
      }

      return var2;
   }
}
