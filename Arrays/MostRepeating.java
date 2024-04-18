// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays.www;

public class MostRepeating {
   public MostRepeating() {
   }

   void method() {
      int[] arr = new int[]{2, 6, 5, 9, 1, 2, 7, 6, 5, 5, 1, 5};
      int element = 0;
      int maxCount = 0;

      for(int i = 0; i < arr.length; ++i) {
         int cnt = 0;

         for(int j = 0; j < arr.length; ++j) {
            if (arr[i] == arr[j]) {
               ++cnt;
            }
         }

         if (maxCount < cnt) {
            maxCount = cnt;
            element = arr[i];
         }
      }

      System.out.println(element + "is repeating for " + maxCount);
   }

   public static void main(String[] args) {
      (new MostRepeating()).method();
   }
}
