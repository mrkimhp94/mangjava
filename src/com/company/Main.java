package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY", "Ngày hiện tại: ", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
        System.out.printf("%s %tb %<te, %<ty", "Ngày hiện tại: ", date);
    }
}
