package lecture41mergesort;



public class mergeSort {

//    public static void mergeS(int[]arr,int left,int right){
//
//        if(left>=right) return;
//
//        int mid=left+(right-left)/2;
//        mergeS(arr,left,mid);
//        mergeS(arr,mid+1,right);
//        merge(arr,left,mid,right);
//
//    }
//    //2,5,8,1,9,4;
//
//    private static void merge(int[] arr, int left, int mid, int right) {
//        int n1=mid-left+1;
//        int n2=right-mid;
//
//        int []arrLeft=new int[n1];
//        int []arrRight=new int[n2];
//        int i,j,k;
//        for(i=0;i<n1;i++) arrLeft[i]=arr[left+i];
//        for(j=0;j<n2;j++) arrRight[j]=arr[mid+1+j];
//        //2,8,5  1,4,9
//        k=0;
//        i=0;
//        j=0;
//
//      while(i<n1&&j<n2) {
//          if (arrLeft[i] <arrRight[j]) arr[k++] = arrLeft[i++];
//          else arr[k++]=arrRight[j++];
//      }
//
//      while(i<n1){
//          arr[k++]=arrLeft[i++];
//      }
//      while(j<n2) arr[k++]=arrRight[j++];
//
//    }

    public static void mergeSort(int arr[],int left,int right){
        if(left>=right) return;
        int mid=left+(right-left)/2;
        //base case


        //smaller subproblem or recursive work

        //self work
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);

//        merge(arr,left,mid,right);


    }



    public static void print(int[]arr){
        for(int l=0;l<arr.length;l++) System.out.print(arr[l]+" ");
    }

    public static void main(String[] args) {

        int []arr={2,5,8,1,9,4};
//        System.out.println("Array before sorting ");
//        print(arr);
//        mergeS(arr,0,arr.length-1);
//        System.out.println();
//        System.out.println("Array after sorting");
//        print(arr);
    }
}
