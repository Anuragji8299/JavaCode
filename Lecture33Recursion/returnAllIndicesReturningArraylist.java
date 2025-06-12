package Lecture33Recursion;

import java.util.ArrayList;

public class returnAllIndicesReturningArraylist {

    static ArrayList<Integer> returnIndices(int []arr,int idx, int target){
        //base case
        if(idx==arr.length) return new ArrayList<>();

        ArrayList<Integer> result=new ArrayList<>();


        //self work
        if(arr[idx]==target) result.add(idx);

        //recursive work
        ArrayList<Integer> smallResult=returnIndices(arr,idx+1,target);
       result.addAll(smallResult);

       return result;

    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8,3, 6, 1,3};

        ArrayList<Integer> result=returnIndices(arr,0,3);
        System.out.println(result);


    }
}
