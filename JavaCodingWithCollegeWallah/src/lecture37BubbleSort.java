package JavaCodingWithCollegeWallah;

public class lecture37BubbleSort {


    static void bubbleSort(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={12,11,9,14,10,8};
        int n= arr.length;
        for(int i:arr){
            System.out.print(i +" ");
        }
        System.out.println();
        bubbleSort(arr,n);
        System.out.println("Array after sorting");
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
