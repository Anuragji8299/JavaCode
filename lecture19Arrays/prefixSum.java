package lecture19Arrays;

import java.util.Scanner;

public class prefixSum {

    static void makePrefixSum(int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }

    static void queriesForSum(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of queries");
        int p=sc.nextInt();

        while(p>0) {
            int summation=0;
            System.out.println("Enter the range for summation");
            int left=sc.nextInt();
            int right=sc.nextInt();
            summation=arr[right]-arr[left-1];
            System.out.println("Total summation in the given range is :"+summation);
            p--;
        }
    }

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={0,1,4,2,3,9,5};
//        prefixSum= 0,1,5,7,10,19,24
makePrefixSum(arr);
printArr(arr);
queriesForSum(arr);


    }
}

