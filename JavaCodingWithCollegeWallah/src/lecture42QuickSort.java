package JavaCodingWithCollegeWallah;

import java.util.ArrayList;

public class lecture42QuickSort {
    static void quicksort(int[]arr,int left,int right) {
        if (left >= right) {
            return;
        }

        int pivotIndex=partition(arr,left,right);
        quicksort(arr,left,pivotIndex-1);
        quicksort(arr,pivotIndex+1,right);
    }

    static int partition(int []arr,int left,int right){
        int pivot=arr[left];
        int countElementLThanPivot=0;
        for(int i=left+1;i<=right;i++){
            if(arr[i]<=pivot){
                countElementLThanPivot++;
            }
        }
        int pivotIndex=left+countElementLThanPivot;
         swap(arr,left,pivotIndex);

         int l=left;
         int r=right;

         while(l<pivotIndex&&r>pivotIndex){
             while(arr[l]<=pivot){
                 l++;
             }
             while(arr[r]>pivot){
                 r--;
             }
             if(l<pivotIndex&&r>pivotIndex){
                 swap(arr,l,r);
                 l++;
                 r--;
             }
         }
         return pivotIndex;

    }

    static void swap(int[]arr,int left,int right){
          int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

    }

    static void ArrayTraversal(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {

int []arr={18,7,7,11,7,15,16,13,14};
int n=arr.length-1;
quicksort(arr,0,n);
        System.out.println("Array after sorting");
        ArrayTraversal(arr);


    }
}
