package lecture37bubblesort;
//best case-> O(n)
// average case-> O(n^2)
// worst case-> O(n^2)


public class bubbleSort {

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sorting(int arr[]){

        int n=arr.length;

        //n-1 iterations or passes
        for(int i=0;i<n-1;i++){
boolean swapFlag=false;
            //last i elements are already at corrected position so no need to check
            for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
    swap(arr,j,j+1);
    swapFlag=true;
}
            }
            //It will optimize the code in terms of time complexity
            if(!swapFlag){
                return;
            }
        }

    }

    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static boolean isPrime(int num){

        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){

            if(num%i==0) return false;

        }

        return true;

    }

    public static int ithPrimeNumber(int ithIndex){

        int count=0;
        int num=2;
        boolean condition=true;
        while(condition){
            boolean isPrime=isPrime(num);
            if(isPrime){
                count++;
            }

            if(count==ithIndex){
                condition=false;
            }
            num++;
        }
        return --num;
    }

    public static void main(String[] args) {
//        int arr[]={12,54,45,8,9,20};
//
//sorting(arr);
//print(arr);

        int ithIndexPrimeNumber= ithPrimeNumber(10);
        System.out.println("Prime number will be : "+ithIndexPrimeNumber);

    }
}




