package Lecture33Recursion;

public class returnAllIndices {

public static void returnIndices(int []arr,int idx,int target){

    //Base Case
    if(idx==arr.length) return;
    //self work
    if(arr[idx]==target) System.out.print(idx+" ");

    //recursive work
   if(idx<=arr.length-1){
        returnIndices(arr,idx+1,target);
    }





}

    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8,3, 6, 1,3};
        System.out.print("All Indices of targeted element are: ");
        returnIndices(arr,0,3);
    }
}
