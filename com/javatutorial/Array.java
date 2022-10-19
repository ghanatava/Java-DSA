package com.javatutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int [] nums = {1,2,3,4,5};
            System.out.println(Arrays.toString(nums));
            int[] arr = new int[5];
            for(int i = 0;i<arr.length;i++){
                System.out.println("Enter the integer");
                arr[i]=in.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        //enhanced for loop to directly get the elements
            for(int i:arr){
                System.out.print(i+", ");
            }
        //array of objects
            String[] str = new String[4];
            for(int i =0;i<str.length;i++){
                System.out.println("enter a letter");
                str[i] = in.next();
            }
            System.out.println(Arrays.toString(str));
            //Array passing in functions
            
        }   
    }
}