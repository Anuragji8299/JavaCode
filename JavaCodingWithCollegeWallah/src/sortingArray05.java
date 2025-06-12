import java.util.Scanner;

public class sortingArray05 {
//    static void  sortZeroesAndOnes(int[]arr){
//        int n=arr.length;
//      int left=0;
//      int right=n-1;
//      while(left<right){
//          if(arr[left]==1&&arr[right]==0){
//          int temp=arr[left];
//          arr[left]=arr[right];
//          arr[right]=temp;
//              right--;
//              left++;
//          }
//          else if(arr[left]==0){
//              left++;
//          }
//          else if (arr[right]==1){
//              right--;
//          }
//      }
//    }
//    static void sortEvenAndOdd(int[]arr){
//        int n=arr.length;
//        int left=0;
//        int right=n-1;
//        while(left<right){
//            if(arr[left]%2!=0&&arr[right]%2==0){
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//                left++;
//                right--;
//
//            }
//            else if (arr[left]%2==0){
//                left++;
//            }
//            else if (arr[right]%2!=0){
//                right--;
//            }
//        }
//    }
    static  void swap(int[]arr){
        for(int i=0;i<(arr.length)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    static int[] sortSquared(int[]arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int k=0;
        int []ans=new int[n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the "+size+"elements ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting");
        printArray(arr);
//        sortZeroesAndOnes(arr);
//        sortEvenAndOdd(arr);
        int[]ans=sortSquared(arr);
        swap(ans);
        System.out.println("Array after sorting ");
        printArray(ans);
    }
}
