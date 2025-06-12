package lecture17Arrays;

public class MiscllProblems {

    //swap using temp
//    static void swap(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//    }

    //swap without temp
//    static void swapWithoutTemp(int a,int b){
//        a=a+b;
//        b=a-b;
//        a=a-b;
//    }

    //swapping for array element

    static void swapArr(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //reversing array

    static void reverseArr(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n/2;i++){
            swapArr(arr,i,n-1-i);
        }
    }

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        System.out.println("Array before reversing");
        printArr(arr);
        System.out.println("Array after reversing");
        reverseArr(arr);
        printArr(arr);

    }
}
