package com.company;

public class tongcot {
    public static void main(String[] args) {
        double[][] distances = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };
        for (int column = 0; column < distances[0].length; column++) {
            int total = 0;
            for (int row = 0; row < distances.length; row++)
                total += distances[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
    }
}
