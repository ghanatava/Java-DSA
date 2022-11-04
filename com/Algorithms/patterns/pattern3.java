package com.Algorithms.patterns;

public class pattern3 {
    public static void main(String[] args) {
        pattern_3(5);
    }
    static void pattern_3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
