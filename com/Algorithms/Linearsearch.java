package com.Algorithms;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {18,12,8,9,77,50};
        search(arr);
        String name="Ashura";
        char target='u';
        System.out.println(string_search(name,target));
    }
    static void search(int[] arr){
        try (Scanner in = new Scanner(System.in)) {
            int[] arr1=arr;
            System.out.println("enter the number you want to find");
      
                int n=in.nextInt();
                boolean not_found=true;
                for(int i=0;i<arr1.length;i++){
                    if(arr1[i]==n){
                        System.out.println("found at index:"+i);
                        not_found=false;
                        break;
                    }
                }
                if(not_found==true){
                    System.out.println("not found");
                }
        }
    }
    static boolean string_search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i = 0; i<str.length();i++){ 
        
            if(target==str.charAt(i)){
                return true;
            }
        /*
         for(char ch:str.toCharArray()){
            if (ch == target){
                return true;
            }
         }
         */

        }
        return false;
    }
    
}
