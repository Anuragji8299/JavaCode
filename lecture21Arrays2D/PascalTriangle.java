package lecture21Arrays2D;

import java.util.Scanner;

public class PascalTriangle {

    static int [][] pascal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int row=sc.nextInt();
        int pascalArray[][]=new int[row][];
        for(int i=0;i<pascalArray.length;i++){
            //Intitialising dynamic column in a particular row;
            pascalArray[i]=new int[i+1];
            pascalArray[i][0]=1;
            pascalArray[i][pascalArray[i].length-1]=1;
            for(int j=1;j<i;j++){
                pascalArray[i][j]=pascalArray[i-1][j-1]+pascalArray[i-1][j];
            }
        }
        return pascalArray;
    }

    static void printArr2d(int arr[][]){
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      int pascalArray[][]=pascal();
      printArr2d(pascalArray);



    }
}
