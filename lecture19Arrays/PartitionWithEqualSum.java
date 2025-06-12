package lecture19Arrays;

public class PartitionWithEqualSum {

    static int sumOfArray(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
static boolean  arrayPartitionEqually(int arr[]){
        int n=arr.length;
    int totalSum=sumOfArray(arr);
    int prefixSum=0;
    int suffixSum=0;

    for(int i=0;i<n;i++){
        prefixSum+=arr[i];
        suffixSum=totalSum-prefixSum;
        if(prefixSum==suffixSum) return true;
    }


return false;
}


    public static void main(String[] args) {

        int []arr={5,3,2,6,3,1};
       boolean ans= arrayPartitionEqually(arr);
        System.out.println("Does it possible to partiton with equal sum: "+ans);

    }
}
