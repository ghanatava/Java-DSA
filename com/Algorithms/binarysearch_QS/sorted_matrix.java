package com.Algorithms.binarysearch_QS;



public class sorted_matrix {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},{4,5,6},{7,8,9}
        };
        search(arr,9);
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int column=matrix[0].length; //matrix may be empty so add a check
        if(rows==1){
            return binary_search(matrix,0,0, column-1, target);
        }
        //run till two rows left;
        int rstart=0;
        int rend=rows-1;
        int cmid=column/2;
        while(rstart<rend-1){
            int mid = rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if(matrix[mid][cmid]<target){
                rstart=mid;
            }
            else{
                rend=mid;
            }
        }//now we have 2 rows
        //check weheter target is in column of two rows
        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        else if(matrix[rstart + 1][cmid]==target){
            return new int []{rstart+1,cmid};
        }
        if(matrix[rstart][cmid-1]>=target){
            return binary_search(matrix, rstart,0,cmid-1, target);
        }
        if(matrix[rstart][cmid+1]<=target && target <=matrix[rstart][column-1]){
            return binary_search(matrix, rstart,cmid+1,column-1, target);
        }
        if(matrix[rstart+1][cmid-1]>=target){
            return binary_search(matrix, rstart+1,0,column-1, target);
        }
        else{
            return binary_search(matrix, rstart+1,cmid,column-1, target);
        }

    } 
    static int[] binary_search(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return  new int[]{row,mid};
            }
            else if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
                cend=mid-1;
            }
        }return new int[]{-1,-1};
    }
}
