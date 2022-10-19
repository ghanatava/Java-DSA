package com.javatutorial;
public class Functions {
    public static void main(String[] args) {
        swap(45,54);
    }
    static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
    static String greet(){
        return "HELLO WORLD";
    }
    static void swap(int a,int b){
        int temp = a ;
        a=b;
        b=temp;
        System.out.println(a+ "," +b);
    }
}

