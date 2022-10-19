package com.javatutorial;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first integer");
            int num1 = input.nextInt();
            System.out.println("Enter second integer");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum = "+sum);
        }

    }
    
}
