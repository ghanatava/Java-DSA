package com.recursion;

public class binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,8,34,70} ;
        System.out.println(search(arr,2 , 0, arr.length-1));
    }
    static int search(int arr[],int target,int start,int end){
    if(start>end){
            return -1;
        }
    int mid = start + (end-start)/2;
    if(arr[mid]<target){
        return search(arr, target,mid+1, end);
    }
    else if(arr[mid]>target){
        return search(arr, target, start, mid-1);
    }
    else{
        return mid;
    }
    }
}
