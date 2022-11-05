package com.recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci_no(6));
    }
    static int fibonacci_no(int n){
    //base conditions
    if(n < 2){
        return n;
    }

        return fibonacci_no(n-1)+fibonacci_no(n-2);
    }
}
