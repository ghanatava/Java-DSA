package com.javatutorial;

import java.util.Arrays;
import java.util.Scanner;
//in java size of rows can be differnt {1,2,3},{4,5},{3,5} is valid;(different than numpy)
public class MultidimensionArray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[][] arr = {
                {1,2,3},{4,5,6},{7,8,9}
            };
            System.out.println(Arrays.toString(arr));
            //input
            int[][] arr1=new int[3][3];
            for(int i = 0;i<arr1.length;i++){  //arr.length returns number of rows
                for(int j = 0;j<arr[i].length;j++){
                    System.out.println("enter a number:");
                    arr1[i][j]=in.nextInt();
                }
            }
            //output
            for(int i = 0;i<arr1.length;i++){  //arr.length returns number of rows
                for(int j = 0;j<arr[i].length;j++){
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
            for(int i = 0; i <arr.length;i++){
                System.out.println(Arrays.toString(arr[i]));
            }
            //enhanced for loop
            for(int[] i:arr){
                System.out.println(Arrays.toString(i));
            }
        }
    }
}
