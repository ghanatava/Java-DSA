package com.Algorithms.binarysearch_QS;

public class rotated_searchadv {
    public static void main(String[] args) {
        int[] arr={2,9,2,2,2,2,4,6};
        System.out.println(pivot(arr));
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
            //skippin duplicates
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                //what if start or end were pivots
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[end]<arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
