package lecture18;

public class TwoPointerApproach{
    static void swapArr(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //method to reverse a part of array between the given index
//    static void reverseArr(int arr[],int i,int j){
//        int n=arr.length;
//        while(i<j){
//            swapArr(arr,i,j);
//            i++;
//            j--;
//        }
//    }

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//    static void separateEvenOdd(int arr[]){
//        int n=arr.length;
//        int left=0;
//        int right=n-1;
//
//        while(left<right){
//
//            if(arr[left]%2==0) left++;
//            if(arr[left]!=0&&arr[right]%2==0){
//                swapArr(arr,left,right);
//                left++;
//                right--;
//            }
//            if(arr[left]%2!=0 && arr[right]%2!=0){
//                right--;
//            }
//        }
//    }


    public static void main(String[] args) {
        int arr[]={12,13,11,15,18,20,22};

// printArr(arr);
// separateEvenOdd(arr);
// printArr(arr);
    }
}
