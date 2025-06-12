package Lecture33Recursion;

public class returningLastIndexOfTarget {

    static int count=0;
    static int returnindex(int []arr,int idx,int target){

        if(idx==arr.length) return 0;

        if(arr[idx]==target) count=idx;

        if(idx<arr.length){
        returnindex(arr,idx+1,target);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8,3, 8,6, 1,3,3};
        System.out.println("Last index of target element "+returnindex(arr,0,8));
    }
}
