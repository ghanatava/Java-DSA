package com.Algorithms.patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattern_1(5);
    }
    static void pattern_1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}