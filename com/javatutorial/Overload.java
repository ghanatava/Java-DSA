package com.javatutorial;
// Two functions with same name can exist if arguments are different in type or number
public class Overload {
    public static void main(String[] args) {
     fun(100);
     fun("times");   
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
}
