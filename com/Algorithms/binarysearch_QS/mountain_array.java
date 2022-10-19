package com.Algorithms.binarysearch_QS;

//find a target in mountain array
public class mountain_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,6,4,0};
        System.out.println(search(arr,3));
    }
    static int search(int[] arr,int target){
        int peak=peakIndex(arr);
        int firstTry=binar_search(arr,target,0,peak);
        if(firstTry!= -1){
            return firstTry;
        }
        return order_search(arr, target,peak+1,arr.length-1);
    }
    static int binar_search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //decreasing part 
                end=mid;
            }
            else{
                //ascending part
                start=mid+1;
            }
        }
        return start;
    }
    static int order_search(int[] arr, int target,int start,int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
