package lecture32recursion;

public class SumOfElements {

static int sumOfArray(int arr[],int idx){
    if(idx==0) return arr[idx];
    int subsetSum=sumOfArray(arr,idx-1)+arr[idx];
    return subsetSum;
}
    public static void main(String[] args) {
        int arr[]={12,14,17,8,9};
        System.out.println("Sum of elements in the array is: "+sumOfArray(arr,arr.length-1));
    }
}
