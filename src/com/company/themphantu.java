package com.company;


import java.util.Scanner;

public class themphantu {
    public static void main(String[] args) {
        int c, i, n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm : ");
        int p = scanner.nextInt();
        int arr[] = new int[n+1];
        for (c = i = 0; i <=n; i++) {
            if (i < p) {
                arr[c] = A[i];
            }else if (i ==p){
                arr[c] = k;
            }else {
                arr[c] = A[i-1];
            }
            c++;
        }

        System.out.println("Mảng sau khi thêm phần tử " + k + "vào vị trí " + p +" là: ");
        for (i = 0; i < c; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
