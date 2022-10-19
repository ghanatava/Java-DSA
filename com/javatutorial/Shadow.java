package com.javatutorial;
//overlapping of scopes where higher scope variable is neglected over local variable is SHADOWING
public class Shadow {
    static int x=10; //available to everyone in class block
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }
    static void fun(){
        int x =40;  //local variable 
        System.out.println(x);
    }
}
