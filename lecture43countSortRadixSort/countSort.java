package lecture43countSortRadixSort;

public class countSort {

    public static int findMax(int []arr){
        //      1 0 2 4 6 2 0 4 5
        // idx  0 1 2 3 4 5 6 7 8
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void countSort(int []arr){
        int n=arr.length;
        int max=findMax(arr);
        int [] output=new int[n];

        int []count=new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
          output[idx]=arr[i];
          count[arr[i]]--;

        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }


    }

    public static void main(String[] args) {
        // 0 2 4 6 3 4 5
int [] arr={  1 ,0 ,2, 4, 6, 2 ,0, 4, 5};


countSort(arr);
display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
