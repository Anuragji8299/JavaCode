package lecture44questiononsortingpart2;

public class NegativeAndPositiveSort {

    public  static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int arr[],int left,int right){

        while(left<right){

            while(arr[left]<0) left++;
            while(arr[right]>=0) right--;

            if(arr[left]>0 && arr[right]<0){
                swap(arr,left,right);
                left++;
                right--;
             }
        }
    }

    public  static void display(int arr[]){
        for(int value:arr){
            System.out.print(value+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={19,-20,7,-4,-13,11,-5,3};
        sort(arr,0,arr.length-1);
        display(arr);
    }
}
