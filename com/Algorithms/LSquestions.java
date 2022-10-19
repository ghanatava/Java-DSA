package com.Algorithms;

import java.util.Arrays;

public class LSquestions {
    public static void main(String[] args) {
     int [] [] arr={
        {1,2,3},{4,5,6},{7,8,9}
     };  
     int target=10;
     System.out.println(Arrays.toString(search2D(arr,target)));
    }
    static int[]search2D(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
    //no of digits question
    static int digits(int n){  /*for binary log2(n),for octal log8(n) for hex log16(n) etc. */
        if(n<0){
            n=n*-1;
        }
        return (int)(Math.log10(n))+1;
    }
}
