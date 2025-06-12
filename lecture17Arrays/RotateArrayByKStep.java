package lecture17Arrays;

public class RotateArrayByKStep {
//    static int [] rotateArr(int arr[],int k){
//        int n=arr.length;
//        k=k%n;
//
//        int [] result=new int[n];
//        int j=0;
//        for(int i=n-k;i<n;i++){
//            result[j++]=arr[i];
//        }
//        for(int i=0;i<=n-k-1;i++){
//            result[j++]=arr[i];
//        }
//return result;
//    }

    // rotation in place without extra space
    static void swapArr(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //method to reverse a part of array between the given index
    static void reverseArr(int arr[],int i,int j){
        while(i<j){
            swapArr(arr,i,j);
            i++;
            j--;
        }
    }



    static void rotateArrInPlace(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverseArr(arr,n-k,n-1);
        reverseArr(arr,0,n-k-1);
        reverseArr(arr,0,n-1);
    }

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={3,23,34,25,53,58};
//       int result[]=rotateArr(arr,2);
//        System.out.println("Array after rotation");
//        printArr(result);
 rotateArrInPlace(arr,2);
                System.out.println("Array after rotation");
printArr(arr);
    }
}
