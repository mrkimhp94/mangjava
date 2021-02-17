package com.company;

import java.util.Scanner;

public class demsokytu {
    public static void main(String[] args) {
        
    String x = "songcokhucnguoicoluc";
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ký tự");
    String input = scanner.next();
    char c = input.charAt(0);
    int index = 0;
    for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)==c){
                index++;
            }
        }
    System.out.println(index);
}}
