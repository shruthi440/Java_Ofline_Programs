// Source code is decompiled from a .class file using FernFlower decompiler.
package com.arrays.www;

public class duplicateElements {
   public duplicateElements() {
   }

   void method1() {
      int[] arr = new int[]{5, 7, 3, 2, 1, 9, 3, 5, 7, 4};

      for(int i = 0; i < arr.length; ++i) {
         for(int j = i + 1; j < arr.length; ++j) {
            if (arr[i] == arr[j]) {
               System.out.println(arr[i] + " ");
            }
         }
      }

   }

   public static void main(String[] args) {
      (new duplicateElements()).method1();
   }
}
