package lecture32recursion;

public class MaxValueOfTheArray {

//print the values of an array recursively
//    static void printArray(int arr[],int index){
//
//        if(index<0) return;
//        printArray(arr,index-1);
//        System.out.print(arr[index]+" ");
//    }


    static int maxArray(int arr[],int idx){
        if(idx==0) return arr[idx];
            int subProblem=Math.max(maxArray(arr,idx-1),arr[idx]);
            return subProblem;
    }

    public static void main(String[] args) {
int arr[]={12,14,17,8,9};
//printArray(arr,arr.length-1);
        System.out.println("Maximum element in the array is: "+maxArray(arr,arr.length-1));
    }
}
