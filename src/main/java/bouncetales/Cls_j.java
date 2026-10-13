package bouncetales;


public final class Cls_j extends Cls_f {
   private short[] shortArr_b;
   private short[] shortArr_c;
   short[] shortArr_a;
   private short[] shortArr_d;

   public Cls_j() {
      this.byte_d = 5;
   }

   public final int a_byteArr_int_ret_int(byte[] var1, int var2) {
      var2 = super.a_byteArr_int_ret_int(var1, var2);
      int var3 = var1[var2++] & 255;
      this.shortArr_b = new short[var3];
      this.shortArr_c = new short[var3];
      this.shortArr_a = new short[var3];
      this.shortArr_d = new short[var3];
      if (var3 > 0) {
         int var4 = var1[var2++] & 255;
         short var5 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
         short var6 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
         if (var4 > 0) {
            var2 = a_shortArr_int_int_byteArr_int_int(this.shortArr_b, var3, var5, var1, var2, var4);
            var2 = a_shortArr_int_int_byteArr_int_int(this.shortArr_c, var3, var6, var1, var2, var4);
         } else {
            for (int var15 = 0; var15 < var3; var15++) {
               this.shortArr_b[var15] = (short)var5;
               this.shortArr_c[var15] = (short)var6;
            }
         }

         var2 = a_shortArr_int_int_byteArr_int_int(this.shortArr_a, var3, 0, var1, var2, 16);

         for (int var16 = 0; var16 < var3; var16++) {
            this.shortArr_d[var16] = -1;
         }
      }

      return var2;
   }

   public final void a_ret_void() {
      for (int var1 = 0; var1 < this.shortArr_a.length; var1++) {
         short var2 = this.shortArr_a[var1];
         short var3 = -1;
         short var4 = 0;
         switch (var2) {
            case 118:
               var3 = 485;
               var4 = 9999;
               break;
            case 334:
               var3 = 474;
               var4 = 750;
               break;
            case 342:
               var3 = 480;
               var4 = 9999;
         }

         if (var3 >= 0) {
            this.shortArr_d[var1] = var3;
            this.shortArr_a[var1] = var4;
         }
      }
   }

   private static int a_int_ret_int(int var0) {
      switch (var0) {
         case 474:
            return 150;
         case 480:
            return 150;
         case 485:
            return 150;
         default:
            return 0;
      }
   }

   public final void c_ret_void() {
      super.c_ret_void();

      for (int var1 = 0; var1 < this.shortArr_a.length; var1++) {
         int var2 = (Engine.a_int_int_ret_int(this.shortArr_a[var1], 0) << 16) / Cls_f.l_g.int_a;
         int var3 = (Engine.a_int_int_ret_int(this.shortArr_a[var1], 1) << 16) / Cls_f.l_g.int_a;
         int var4 = (Engine.a_int_int_ret_int(this.shortArr_a[var1], 2) << 16) / Cls_f.l_g.int_a;
         int var5 = (Engine.a_int_int_ret_int(this.shortArr_a[var1], 3) << 16) / Cls_f.l_g.int_a;
         int var8;
         var2 = (var8 = this.shortArr_b[var1] - var4) + var2;
         int var9;
         var3 = (var9 = this.shortArr_c[var1] - (var3 - var5)) + var3;
         if (var8 < this.int_e) {
            this.int_e = var8;
         }

         if (var2 > this.int_g) {
            this.int_g = var2;
         }

         if (var9 < this.int_f) {
            this.int_f = var9;
         }

         if (var3 > this.int_h) {
            this.int_h = var3;
         }
      }

      this.int_e <<= 16;
      this.int_g <<= 16;
      this.int_f <<= 16;
      this.int_h <<= 16;
   }

   public final void d_ret_void() {
      super.d_ret_void();

      for (int var1 = 0; var1 < this.shortArr_a.length; var1++) {
         if (this.shortArr_d[var1] >= 0) {
            int var2 = Engine.int_a;
            if (this.shortArr_a[var1] != 9999) {
               this.shortArr_a[var1] = (short)(this.shortArr_a[var1] - var2);
            }

            if (this.shortArr_a[var1] <= 0) {
               if (this.shortArr_d[var1] != 474) {
                  this.j();
                  return;
               }

               if (this.shortArr_a[var1] < -1500) {
                  this.j();
                  return;
               }
            }
         }
      }
   }

   public final void a_Graphics_DirectGraphics_l(Gfx var1, Gfx var2, Cls_l var3) {
      this.a_l(Cls_f.l_a);
      Cls_l.a_l_l_l(var3, Cls_f.l_a, Cls_l.l_a);

      for (int var12 = 0; var12 < this.shortArr_a.length; var12++) {
         Cls_l.l_a.a_int_int_ret_void(this.shortArr_b[var12] << 16, this.shortArr_c[var12] << 16);
         int var13 = Cls_l.int_g >> 16;
         int var4 = Cls_l.int_h >> 16;
         if (this.shortArr_d[var12] < 0) {
            Engine.a_int_int_int(var13, var4, this.shortArr_a[var12]);
         } else {
            int var5 = 0;
            int var6;
            if (this.shortArr_a[var12] != 9999) {
               var6 = this.shortArr_a[var12];
            } else {
               var6 = Game.int_a;
            }

            if (this.shortArr_a[var12] <= 0 && this.shortArr_d[var12] == 474) {
               var6 = 1;
               var5 = (Math.abs(this.shortArr_a[var12]) * 255 / 1500 & 0xFF) << 24;
            }

            int var7 = Cls_l.int_g >> 16;
            int var8 = Cls_l.int_h >> 16;
            Gfx var9 = Engine.a_ret_Graphics();
            if (var5 != 0) {
               Game.Graphics_b.setColor(255);
               Game.Graphics_b.fillRect(0, 0, Game.Image_b.getWidth(), Game.Image_b.getHeight());
               var13 = Game.Image_b.getWidth() >> 1;
               var4 = Game.Image_b.getHeight();
               Engine.a_Graphics(Game.Graphics_b);
            }

            int var10 = Engine.b_int_ret_int(this.shortArr_d[var12]);
            if (this.shortArr_a[var12] != 9999) {
               short var10000;
               switch (this.shortArr_d[var12]) {
                  case 474:
                     var10000 = 750;
                     break;
                  case 480:
                  case 485:
                     var10000 = 9999;
                     break;
                  default:
                     var10000 = 0;
               }

               var6 = (var10000 - var6) / a_int_ret_int(this.shortArr_d[var12]) % var10;
            } else {
               var6 = var6 / a_int_ret_int(this.shortArr_d[var12]) % var10;
            }

            if (var6 > var10 - 1) {
               var6 = var10 - 1;
            }

            Engine.b_int_int_int_int(var13, var4, this.shortArr_d[var12], var6);
            if (var5 != 0) {
               Engine.a_Graphics(var9);
               Game.Image_b.getRGB(Game.intArr_b, 0, Game.Image_b.getWidth(), 0, 0, Game.Image_b.getWidth(), Game.Image_b.getHeight());
               int var11 = 0;

               for (int var14 = 0; var14 < Game.Image_b.getHeight(); var14++) {
                  for (int var16 = 0; var16 < Game.Image_b.getWidth(); var16++) {
                     if (Game.intArr_b[var11] == -16776961) {
                        Game.intArr_b[var11] = 0;
                     } else {
                        Game.intArr_b[var11] = Game.intArr_b[var11] - var5;
                     }

                     var11++;
                  }
               }

               int var15 = var7 - (Game.Image_b.getWidth() >> 1);
               var4 = var8 - Game.Image_b.getHeight();
               Engine.a_ret_Graphics().drawRGB(Game.intArr_b, 0, Game.Image_b.getWidth(), var15, var4, Game.Image_b.getWidth(), Game.Image_b.getHeight(), true);
            }
         }
      }
   }
}
