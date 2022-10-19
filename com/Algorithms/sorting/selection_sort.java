package com.Algorithms.sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={4,5,2,8,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=max_index(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int max_index(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
