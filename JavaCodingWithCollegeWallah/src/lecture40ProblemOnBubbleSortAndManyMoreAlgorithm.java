package JavaCodingWithCollegeWallah;

public class lecture40ProblemOnBubbleSortAndManyMoreAlgorithm {
    //Problem1 Input  050342
    //        output  534200

//    static void placingZeroRightSide(int[]arr){
//        int n=arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//              if(arr[j]==0&&arr[j+1]!=0){
//                  int temp=arr[j];
//                  arr[j]=arr[j+1];
//                  arr[j+1]=temp;
//              }
//            }
//        }
//
//            }

    static void ArrayTraversal(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    //Problem2:Sorting Fruits in lexicographical order:
    static  void sortingFruits(String [] fruits){
        int n= fruits.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minIndex])<0){
                   minIndex=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[minIndex];
            fruits[minIndex]=temp;

        }
    }



    public static void main(String[] args) {
        //Problem Input  050342
        //        output  534200

// int[]arr={0,5,0,3,4,2};
//        System.out.println("Array before algorithm");
//        ArrayTraversal(arr);
//        placingZeroRightSide(arr);
//        System.out.println("\nArray after applying algorithm");
//        ArrayTraversal(arr);

        //Problem2:Sorting Fruits in lexicographical order:

        String[] fruits={"Apple","Papaya","Mango","Grapes"};

        sortingFruits(fruits);
        System.out.println("Fruits after sorting");
        for(String s:fruits){
            System.out.print(s +" ");
        }
    }
}
