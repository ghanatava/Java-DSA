package com.Algorithms;

public class binary_search {  //complexity = O(log2N);
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(search(arr,7)); 
    }
    //return -1 if not found
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; //might be possible that start+end exceeds range of integer in java
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}