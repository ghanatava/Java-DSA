package com.javatutorial;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter a line");
            System.out.println(input.nextLine());
            int a = input.nextInt();
            System.out.println("enter an integer");
            System.out.println(a);
        }

    }
}