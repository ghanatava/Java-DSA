package com.Algorithms.sorting.cyclicQS;

import java.util.ArrayList;
import java.util.List;

public class set_mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2};
        System.out.println(mismatch(arr));
    }
    static List<Integer> mismatch(int [] arr){  //find duplicate number and the missing no. in the range 1 to n
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
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(arr[j]);
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
