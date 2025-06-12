import java.util.Scanner;

public class prefixSumArray06 {
//    static int[] makePrefixSum(int[]arr){
//        int n=arr.length;
//        int[]pref=new int[n];
//        pref[0]=arr[0];
//        for(int i=1;i<n;i++){
//            pref[i]=pref[i-1]+arr[i];
//        }
//        return pref;
//    }
//    static int[] makeSuffixSum(int[]arr){
//        int n=arr.length;
//        int []suffix=new int[n];
//        suffix[0]=arr[n-1];
//        for(int i=1;i<n;i++){
//            suffix[i]=suffix[i-1]+arr[n-i-1];
//        }
//        return suffix;
//    }
//    static void makePrefixSum(int[]arr){
//        int n=arr.length;
//        for(int i=1;i<arr.length;i++){
//            arr[i]=arr[i]+arr[i-1];
//        }
//    }

//    static void printArray(int[]arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Make equal partition

    static int arrayTotalSum(int[]arr){
        int totalsum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean equalPartition(int[]arr){
        int total=arrayTotalSum(arr);
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
           prefixSum+=arr[i];
           int suffixSum=total-prefixSum;
           if(prefixSum==suffixSum){
               return true;
           }
        }
        return false;
    }


    //Make equal partition;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        System.out.println("Enter "+size+" elements");
        int[]arr=new int[size];

//        for(int i=0;i<size;i++){
//            arr[i]= sc.nextInt();
//        }
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
//        printArray(arr);
//        System.out.println("Array after prefix sum");
//       int []pref=makePrefixSum(arr);
//       int query= sc.nextInt();
//       while(query!=0){
//           System.out.println("Enter range");
//           int l=sc.nextInt();
//           int r= sc.nextInt();
//
//           int ans=pref[r]-pref[l-1];
//           System.out.println("Sum "+ans);
//           query--;
//       }
        printArray(arr);
//       int[]suffixSum=makeSuffixSum(arr);
        boolean k=equalPartition(arr);
        System.out.println("Array can be partitioned equally: "+k);
//        printArray(suffixSum);


    }
}
