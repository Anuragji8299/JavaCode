package lecture42quicksort;

public class QuickSort {

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int arr[],int left,int right){
        int pivotElement=arr[left];
        int cnt=0;
        for(int i=left+1;i<right;i++){
            if(arr[i]<=pivotElement) cnt++;
        }

        int pivotIndex=left+cnt;
        swap(arr,left,pivotIndex);
        int i=left;
        int j=right;

        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivotElement) i++;
            while(arr[j]>pivotElement) j--;
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,left,right);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int arr[],int left,int right){
        if(left>=right) return;
            int pivot=partition(arr,left,right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+ 1, right);
    }

    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int []arr={5,6,2,7,1,4};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
