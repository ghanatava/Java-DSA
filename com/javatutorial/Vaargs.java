package com.javatutorial;

import java.util.Arrays;

public class Vaargs { //same as args and kwargs in python3
    public static void main(String[] args){

        fun(1,2,3,4,5,6);
        mul(7,"Deadly","Sins","season","1");
    }
    static void fun(int ...v){//array of int
        System.out.println(Arrays.toString(v));

    }
    static void mul(int a , String b, String ...v){
        System.out.println(a+","+b+","+ Arrays.toString(v));
    }
}
