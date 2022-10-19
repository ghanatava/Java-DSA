package com.Algorithms.sorting.cyclicQS;

public class mising_no {
    public static void main(String[] args) {
        int[] arr = {0,4,1,2};
        cyclic_sort(arr);
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }return arr.length;
    }
    static void cyclic_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }   
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
