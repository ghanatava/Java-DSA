package com.recursion;

public class intro {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){ 
        //print first 5 no.
        System.out.println(n);
        if(n==5){
            return;
        }
        number(n+1);
    }
}
