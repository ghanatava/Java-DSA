package com.Algorithms.binarysearch_QS;

public class split_array {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        System.out.println(splitarray(arr,2));
    }
    static int splitarray(int[] arr, int m){
        int start =0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        //binary search
        while(start < end){
            int mid = start+(end-start)/2;
            //calculate pieces
            int sum=0;
            int pieces=1;
            for(int num:arr){
                if(sum+num>mid){
                    //you can not add in this sub array make new in new subarray sum = num
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if (pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end; //start == end
    }
    
}
