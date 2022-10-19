package com.Algorithms.binarysearch_QS;

public class rotation_count { //array is rotated pivot times.
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
        System.out.println(count(arr));
    }
    static int count(int arr[]){
        return pivot(arr)+1;
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid<end){
                return mid;
            }
            else if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
