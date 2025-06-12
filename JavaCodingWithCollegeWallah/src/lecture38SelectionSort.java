package JavaCodingWithCollegeWallah;

public class lecture38SelectionSort {

    static void SelectionMin(int[]arr) {
        //7,5,4,1,3
        int n=arr.length;
        for (int i = 0; i < n-2; i++) {
                int currindx = i;
                for (int j = i+1; j < n ; j++){
                    if (arr[j] < arr[currindx]) {
                        currindx = j;
                    }
                }
                int temp=arr[currindx];
                arr[currindx]=arr[i];
                arr[i]=temp;
        }
    }
 static void ArrayTraversal(int []arr){
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i] +" ");
     }
 }

    public static void main(String[] args) {
  int[]arr={7,5,4,1,3};
        System.out.println("Array before sorting");
  ArrayTraversal(arr);
        SelectionMin(arr);
        System.out.println("\nArray after sorting");
   ArrayTraversal(arr);

    }
}
