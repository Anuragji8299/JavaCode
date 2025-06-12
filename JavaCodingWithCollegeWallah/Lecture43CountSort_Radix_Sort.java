package JavaCodingWithCollegeWallah;

public class Lecture43CountSort_Radix_Sort {

//Ptoblem1:Arranging in sorted format if two words are disarrange;

//    static void sort(int []arr){
//        int n=arr.length;
//        int x=-1;
//        int y=-1;
//        for(int i=1;i<n;i++){
//            if(arr[i-1]>arr[i]){
//                if(x==-1){
//                    x=i-1;
//                }
//                else{
//                    y=i;
//                }
//            }
//        }
//        int temp=arr[x];
//        arr[x]=arr[y];
//        arr[y]=temp;
//    }

    //Problem2:Sorting negative numbers and positive numbers:

//    static void SortingNegativeNo(int arr[]){
//            int n=arr.length;
//    int l=0;
//    int r=n-1;
//
//    while(l<r){
//
//        while(arr[l]<=0){
//            l++;
//        }
//
//        while(arr[r]>0){
//            r--;
//        }
//
//        if(l<r){
//            int temp=arr[l];
//            arr[l]=arr[r];
//            arr[r]=temp;
//        }
//    }
//
//    }

    static int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }

//    static void basicCountSort(int[]arr){
//        int max=findMax(arr);
//        int[]count=new int[max+1];
//        for(int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        int k=0;
//        for(int i=0;i<count.length;i++){
//           for(int j=0;j<count[i];j++){
//               arr[k++]=i;
//           }
//        }
//
//    }
static void basicCountSort(int[]arr){
        int n=arr.length;
    int max=findMax(arr);
    int[] output=new int[n];

    int[]count=new int[max+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }

    //make prefix sum of array
   for(int i=1;i<count.length;i++){
       count[i]+=count[i-1];
   }

   //find the sum of each element int original array
for(int i=n-1;i>=0;i--) {
    int indx = count[arr[i]] - 1;
    output[indx] = arr[i];
    count[arr[i]]--;
//    int k=0;
    int k = 0;
    for (int i1 = 0; i1< count.length; i1++) {
        for (int j = 0; j < count[i1]; j++) {
            arr[k++] = i1;
        }

    }
}
}

    static void ArrayTraversal(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
//       int[]arr={12,13,18,15,17,14};
        //Ptoblem1:Arranging in sorted format if two words are disarrange;
//       sort(arr);

// ArrayTraversal(arr);

        //Problem2:Sorting negative numbers and positive numbers:

//        int[]arr={-12,-2,18,-9,7,3};
//SortingNegativeNo(arr);
//        System.out.println("After applying the algorithm to sort negative number left side and positive number after that,Array Is:-->");
//ArrayTraversal(arr);

        //Problem3:Problem of 0`s 1`s 2`s Sorting:

        int[]arr={0,2,1,0,2,0,1};
        basicCountSort(arr);
        
        ArrayTraversal(arr);
    }

}
