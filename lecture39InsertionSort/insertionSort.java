package lecture39InsertionSort;

public class insertionSort {

    public static void sort(int []arr){
        int n=arr.length;
        //5,6,2,7,1,4;
        for(int i=1;i<n;i++){
            int j=i;
           while(j!=0&&arr[j]<arr[j-1]){
               int temp =arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               j--;
           }
        }

    }


    public static void main(String[] args) {

        int []arr={5,6,2,7,1,4};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
