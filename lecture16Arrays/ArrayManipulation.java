package lecture16Arrays;

import java.util.Scanner;

public class ArrayManipulation {

//    static int findUnique(int arr[]){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    arr[i]=arr[j]=-1;
//                    break;
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]!=-1){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

//    static int maxElement(int arr[]){
//        int n=arr.length;
//        int max =Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
    static int firstRepeat(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int arr[]= {1,3,2,3,4,2,};

//        System.out.println("Unique element is: "+findUnique(arr));
//        int max=maxElement(arr);
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                arr[i]=Integer.MIN_VALUE;
//            }
//        }
//        System.out.println("Second maximum element in the array is: "+maxElement(arr));

        System.out.println("First repeating number is: "+firstRepeat(arr));
    }
}
