package com.Algorithms.binarysearch_QS;
//imagine infinite that do not use arr.length
public class infinite_arrays {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,8,10};
        System.out.println("found at index");
        System.out.println(ans(arr,8));
    }
    static int ans(int[] arr,int target){
        //first find range start with a box of size 2
        int start=0;
        int end=1;
        //condition for target to lie in renge
        while(target>arr[end]){ 
            int newstart = end+1;  //can't upgrade start because old start is needed later
            end = end+(end-start +1)*2;  //+1 because index start from 0 and size needs+1
            start=newstart;
        }
        return search(arr,8,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
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
                    return mid;
                }
            }   
            return -1;
        }
    }
}
