package com.javatutorial;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            //Take input till user no press X
            while(true){
                System.out.println("Please chose + , - ,* ,/,% or x(exit)");
                char op = in.next().trim().charAt(0);
                if(op == '+' ||op == '-'||op == '*' || op == '/'|| op == '%'){
                    //input two numbers
                    System.out.println("enter first number: ");
                    int n1 = in.nextInt();
                    System.out.println("enter second number:");
                    int n2 = in.nextInt();
                    if(op=='+'){
                        System.out.println(n1+n2);
                    }
                    if(op=='-'){
                        System.out.println(n1-n2);
                    }
                    if(op=='*'){
                        System.out.println(n1*n2);
                    }
                    if(op=='/'){
                        if(n2==0){
                            System.out.println("can not divide with zero");
                        }
                        else{
                            System.out.println(n1/n2);
                        }
                    }
                   if(op=='%'){
                        System.out.println(n1%n2);
                    }
            }   else if(op =='X' || op == 'x'){
                        break ;
                    }
                else{
                        System.out.println("Invalid operation");
                    }

                }

            }
        }

    }

