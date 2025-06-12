package lecture17Arrays;

import java.util.Scanner;

public class QueriesElementPresentOrNot {

    static int [] makeFrequencyArr(int arr[]){
        int freqArr[]=new int[100005];
        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]]++;
        }
        return freqArr;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array");

        int arr[]={45,12,13,67,18,45,68,50};

        System.out.println("Enter the number of queries");
        int p=sc.nextInt();
        int freqArray[]=makeFrequencyArr(arr);
        while(p>0){
            System.out.println("Enter the number to check whether it is present or not");
            int value=sc.nextInt();

            if(freqArray[value]>0){
                System.out.println("Yes target number is present");
            }
            else{
                System.out.println("No target number is not present");
            }
            p--;
        }

    }
}
