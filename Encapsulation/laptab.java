// Source code is decompiled from a .class file using FernFlower decompiler.
package java_with.Encapsulation;

public class laptab {
   int laptab;
   private int bal; // variable

   public laptab(int var1) { // constructor 
      this.bal = var1;
      System.out.println("i am a laptab");
   }

   public int getbal() { // getter
      return this.bal;
   }

   public void setbal(int var1, int var2) { // setter
      if (var2 == 123456) {
         System.out.println("this is new laptab");
         this.bal = var1;
      } else {
         System.out.println("you can buy");
      }

   }
}
