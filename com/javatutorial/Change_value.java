package com.javatutorial;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = {1,3,0,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 10;
        /*here the original object is modfied that is original array is changed
        in case of string or int variable the copy of reference variable points to a different object 
        when modified*/
    }

}
