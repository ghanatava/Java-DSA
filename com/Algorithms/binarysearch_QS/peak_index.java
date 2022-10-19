package com.Algorithms.binarysearch_QS;
//mountain array, numbers increase and then decrease
public class peak_index {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,6,4,0};
        System.out.println(peakIndex(arr));
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
        return start; //finally start=end=peak index
    }
}
