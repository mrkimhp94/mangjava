package com.company;

public class timmaxmang2chieu {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,4,56,4,3},
                {3,23,6,76,5,8},
        };
        int max =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
}}
