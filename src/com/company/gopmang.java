package com.company;

public class gopmang {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,56,4,3};
        int arr2[] = {3,23,6,76,5,8};
        int arr3[] = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i <arr1.length){
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[i-arr1.length];
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
