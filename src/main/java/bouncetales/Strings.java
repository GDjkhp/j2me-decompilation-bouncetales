package bouncetales;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class Strings {
   private static Strings a_a = null;
   private static DataInputStream DataInputStream_a = null;
   private static String String_a;

   private Strings() {
   }

   private static String a_String_String_String(String var0, String var1, String var2) {
      int var3;
      do {
         if ((var3 = var0.indexOf(var1)) >= 0) {
            var0 = var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
         }
      } while (var3 >= 0);

      return var0;
   }

   public static String a_int_ret_String(int var0) {
      return a_int_StringArr(var0, null);
   }

   public static synchronized String a_int_StringArr(int var0, String[] var1) {
      if (String_a == null) {
         String_a = java.util.Locale.getDefault().toLanguageTag();
      }

      int var2 = 0;

      try {
         if (a_a == null) {
            a_a = new Strings();
         }

         if (DataInputStream_a == null) {
            InputStream var3;
            if ((var3 = a_a.getClass().getResourceAsStream("/lang." + String_a)) == null) {
               var3 = a_a.getClass().getResourceAsStream("/lang.xx");
            }

            if (var3 == null) {
               return "X";
            }

            (DataInputStream_a = new DataInputStream(var3)).mark(512);
         }

         DataInputStream_a.skipBytes(var0 << 1);
         var2 = DataInputStream_a.readUnsignedShort();
         DataInputStream_a.skipBytes(var2 - (var0 << 1) - 2);
         String var7 = DataInputStream_a.readUTF();
         if (!DataInputStream_a.markSupported()) {
            DataInputStream_a.close();
            DataInputStream_a = null;
         } else {
            try {
               DataInputStream_a.reset();
            } catch (IOException var4) {
               DataInputStream_a.close();
               DataInputStream_a = null;
            }
         }

         if (var1 != null) {
            if (var1.length == 1) {
               var7 = a_String_String_String(var7, "%U", var1[0]);
            } else {
               for (int var6 = 0; var6 < var1.length; var6++) {
                  var7 = a_String_String_String(var7, "%" + var6 + "U", var1[var6]);
               }
            }
         }

         return var7;
      } catch (IOException var5) {
         DataInputStream_a = null;
         return "E:" + var2;
      }
   }

   private static boolean a_String_String(String var0, String var1) {
      return a_String_String_int_int(var0, var1, 0, 0);
   }

   private static boolean a_String_String_int_int(String var0, String var1, int var2, int var3) {
      while (var2 != var0.length() || var3 != var1.length()) {
         if (var2 == var0.length() || var3 == var1.length()) {
            return false;
         }

         switch (var1.charAt(var3)) {
            case '*':
               if (var3 == var1.length() - 1) {
                  return true;
               }

               if (a_String_String_int_int(var0, var1, var2, var3 + 1)) {
                  return true;
               }

               var2++;
               break;
            case '?':
               var2++;
               var3++;
               break;
            default:
               if (var0.charAt(var2) != var1.charAt(var3)) {
                  return false;
               }

               var2++;
               var3++;
         }
      }

      return true;
   }

   private static StringBuffer a_InputStream(InputStream var0) {
      StringBuffer var1 = new StringBuffer();

      try {
         int var10000 = var0.read();
         int var2 = 0;
         if ((char)var10000 != ' ') {
            return var1;
         }

         while ((var2 = var0.read()) >= 0) {
            if ((char)var2 != '\r') {
               if ((char)var2 == '\n') {
                  var1.append(a_InputStream(var0));
                  break;
               }

               var1.append((char)var2);
            }
         }
      } catch (IOException var3) {
      }

      return var1;
   }
}
