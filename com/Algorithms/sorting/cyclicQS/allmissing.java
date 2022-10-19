package com.Algorithms.sorting.cyclicQS;

import java.util.ArrayList;
import java.util.List;

public class allmissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,3,2,1};
        System.out.println(missing(arr));
    }
    static List<Integer> missing(int [] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i] && arr[i]<arr.length){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
