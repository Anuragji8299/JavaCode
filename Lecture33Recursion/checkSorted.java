package Lecture33Recursion;

public class checkSorted {

    static boolean isSorted(int []arr ,int idx){

        //Base work
        if(idx==arr.length-1) return true;
        //self work

        if(arr[idx]<arr[idx+1]) {
            if (isSorted(arr, idx + 1)) return true;
            //recursive work
        }

   return false;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 12, 54, 14, 3, 8,3, 6, 1,3};
//        int[] arr = {1,2,3,5};
        int[] arr = {1,2,3,5,4};
        if(isSorted(arr,0)){
        System.out.println("Array is sorted");
        }
        else System.out.println("Array is not sorted");
    }
}
