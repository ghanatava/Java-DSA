package com.Algorithms.sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int [] arr={3,5,2,1,4};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }   
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
