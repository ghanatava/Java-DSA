package com.Algorithms.patterns;

public class pattern4 {
    public static void main(String[] args) {
        pattern_4(5);
    }
    static void pattern_4(int n){
        for (int row = 0; row < 2*n ; row++) {
            int c=row > n ? 2*n-row : row;   //checking condition in this line only (somehow similar to lambda in  python)
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();   
                
            
        }
    }
}
