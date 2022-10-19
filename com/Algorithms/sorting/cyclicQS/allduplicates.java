package com.Algorithms.sorting.cyclicQS;

import java.util.ArrayList;
import java.util.List;

public class allduplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicate_no(arr));
    }
    static List<Integer> duplicate_no(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
                }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }

        return ans;

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
