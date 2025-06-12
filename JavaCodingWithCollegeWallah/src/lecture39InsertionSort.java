package JavaCodingWithCollegeWallah;

public class lecture39InsertionSort {
 static void insertionSort(int[]arr){
//     12,18,15,17,13,16,14
     int n=arr.length;
     for(int i=1;i<arr.length;i++){
  int j=i;
   while(j>0 && arr[j-1]>arr[j]){
       int temp=arr[j];
       arr[j]=arr[j-1];
       arr[j-1]=temp;
       j--;

   }
     }
 }
    static void ArrayTraversal(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
int []arr={12,18,15,17,13,16,14};
        System.out.println("Array before sorting");
        ArrayTraversal(arr);
        insertionSort(arr);
        System.out.println("\nArray after sorting");
        ArrayTraversal(arr);
    }
}
