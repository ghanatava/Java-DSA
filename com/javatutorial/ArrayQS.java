package com.javatutorial;
import java.util.Arrays;

public class ArrayQS {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
    //Max value problem
    static int max(int[] arr){
        int max=arr[1];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    //reversing arrays
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1 ;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;   
        }
    }
}
