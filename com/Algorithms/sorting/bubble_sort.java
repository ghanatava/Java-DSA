package com.Algorithms.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,43};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){   //!false==true => no swap; cause if will execute only when true;
                break;
            }
        }
    }
}
