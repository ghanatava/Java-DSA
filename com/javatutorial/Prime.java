package com.javatutorial;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter an integer to check if it is a prime number:");
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }
    static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
        }
}
