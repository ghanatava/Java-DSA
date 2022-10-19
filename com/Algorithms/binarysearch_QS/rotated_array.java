package com.Algorithms.binarysearch_QS;

public class rotated_array {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,0,1,2};
        System.out.println(search(arr,0));
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
    static int search(int arr[],int target){
        int pivot=pivot(arr);
        //if no pivot no rotated array
        int start=0;
        int end=arr.length-1;
        if(pivot==-1){
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
        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[start]<target){
           return binary_search(arr, target,0, pivot-1);
        }
        else{
            return binary_search(arr, target, pivot+1, end);
        }
        
    }
    static int binary_search(int arr[],int target,int start,int end){
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
