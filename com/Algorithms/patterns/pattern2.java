package com.Algorithms.patterns;

public class pattern2 {
    public static void main(String[] args) {
        pattern_2(5);
    }
    static void pattern_2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = n-row; col>0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
