package com.Algorithms.patterns;

public class pattern5 {
    public static void main(String[] args) {
        pattern_5(5);
    }
    static void pattern_5(int n){
        for (int row = 0; row < 2*n ; row++) {
            int c=row > n ? 2*n-row : row;   //checking condition in this line only (somehow similar to lambda in  python)
            int space=n-c;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();   
                
            
        }
    }
}
