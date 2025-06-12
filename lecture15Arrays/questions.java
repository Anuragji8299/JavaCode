package lecture15Arrays;

public class questions {

//static int countOccurrences(int arr[],int target){
//    int count=0;
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==target){
//            count++;
//        }
//    }
//    return count;
//}

//    static  int lastOccurrences(int arr[],int target){
//        int index=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                index=i;
//            }
//        }
//        return index;
//    }

//        static  int strictlyGreater(int arr[],int target){
//        int elements=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>target){
//                elements++;
//            }
//        }
//        return elements;
//    }

//    static boolean isSorted(int arr[]){
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<arr[i-1]){
//                return false;
//            }
//        }
//        return true;
//    }

    static int [] smallestAndLargest(int []arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else {
                if (arr[i] > max) max = arr[i];
            }
        }
        int []result={min,max};
        return result;
    }


    public static void main(String[] args) {
        int arr[]={1,1,3,4,3,6,2,5};
//        System.out.println("The occurrences of given target is: "+countOccurrences(arr,1));
//        System.out.println("The occurrences of last index of target element is: "+lastOccurrences(arr,4));
//        System.out.println("Number of elements strictly greater than target element is: "+strictlyGreater(arr,3));
//        System.out.println("Is given array sorted: "+isSorted(arr));
        int result[]=smallestAndLargest(arr);
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }

    }
}
