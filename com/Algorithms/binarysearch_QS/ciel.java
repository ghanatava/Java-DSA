package com.Algorithms.binarysearch_QS;

public class ciel {
    public static void main(String[] args) {
        int [] arr = {1,23,45,67,89};
        System.out.println(search(arr,10));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }
        else{
            while(start<=end){
                int mid=start+(end-start)/2; //might be possible that start+end exceeds range of integer in java
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    return arr[mid];
                }
            }   
            return arr[start];
        }
    }
}
