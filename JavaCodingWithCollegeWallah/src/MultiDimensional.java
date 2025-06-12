package JavaCodingWithCollegeWallah;

import java.util.Scanner;

public class MultiDimensional {
      static void printArray(int[][]arr,int a,int b){
          for(int i=0;i<a;i++){
              for(int j=0;j<b;j++){
                  System.out.print(arr[i][j]+" ");
              }
              System.out.println();
          }
      }

//      static void sumOfTwoMatrices(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2){
//          if(r1!=r2||c1!=c2){
//              System.out.println("Additon of matrices not possible");
//              return;
//          }
//          int[][]sum=new int[r1][c1];
//          for(int i=0;i<r1;i++){
//              for(int j=0;j<c1;j++){
//                  sum[i][j]=arr1[i][j]+arr2[i][j];
//              }
//          }
//          printArray(sum,r1,c1);
//      }

//    static void multiplicationOfMatrix(int[][]arr1,int r1,int c1,int[][]arr2,int r2,int c2) {
//        if (c1 != r2) {
//            System.out.println("Multiplication not possible");
//            return;
//        }
//        int[][] multiMatrix = new int[r1][c2];
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k = 0; k < c1; k++) {
//                    multiMatrix[i][j] += arr1[i][k] * arr2[k][j];
//
//                }
//            }
//        }
//        printArray(multiMatrix,r1,c2);
//    }

//    **Transpose of matrix**

//    static void transposeOfMatrix(int[][]arr1,int r1,int c1){
//          int[][]transpose=new int[c1][r1];
//          for(int i=0;i<r1;i++){
//              for(int j=0;j<c1;j++){
//                  transpose[j][i]=arr1[i][j];
//              }
//          }
//          printArray(transpose,c1,r1);
//    }
/*static void transposeOfMatrix(int[][]arr1,int r1,int c1){
    for(int i=0;i<c1;i++){
        for(int j=i;j<r1;j++){
            int temp=arr1[i][j];
            arr1[i][j]=arr1[j][i];
            arr1[j][i]=temp;
        }
    }
          printArray(arr1,c1,r1);
}*/

//    **Transpose of matrix without taking extra array Possible only for square matrix**

    /*static void reverseArray(int[]arr){
          int i=0;
          int j=arr.length-1;
          while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

          }
    }*/

    //        ****Problem5:Rotation of Square matrix***
    /*static void rotationOfMatrix(int[][]arr1,int r1){
          transposeOfMatrix(arr1,r1,r1);
          for(int i=0;i<r1;i++){
              reverseArray(arr1[i]);
            }
          printArray(arr1,r1,r1);
    }*/
    public static void main(String[] args) {
//        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//
//        System.out.println("Enter the number of columns");
//        int b=sc.nextInt();
//      int [][]arr=new int[a][b];

//        System.out.println("Enter the elements");
//      for(int i=0;i<a;i++){
//          for(int j=0;j<b;j++){
//              arr[i][j]=sc.nextInt();
//          }
//      }
//        System.out.println("The 2D array is given below:");
//      printArray(arr,a,b);

        //Problem2:Addition of two matrices
        System.out.println("Enter the number of rows for first matrix");
        int r1= sc.nextInt();
        System.out.println("Enter the number of columns for first matrix");
        int c1= sc.nextInt();
        int[][]arr1= new int[r1][c1];

        System.out.println("Enter the elements of 1st matrix");
      for(int i=0;i<r1;i++){
          for(int j=0;j<c1;j++){
              arr1[i][j]=sc.nextInt();
          }
      }
//        System.out.println("Enter the number of rows for second matrix");
//        int r2= sc.nextInt();
//        System.out.println("Enter the number of columns for second matrix");
//        int c2= sc.nextInt();
//        int [][]arr2=new int[r2][c2];
//        System.out.println("Enter the elements of 2nd matrix");
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                arr2[i][j]=sc.nextInt();
//            }
//        }
//          System.out.println("Addition of two matrix is given below");
//          sumOfTwoMatrices(arr1,r1,c1,arr2,r2,c2);

//          Problem:3 Multiplication of matrix
//        System.out.println("Multiplication of two matrices");
//            multiplicationOfMatrix(arr1, r1, c1, arr2, r2, c2);

//        Probem4:Transpose of matrix
        System.out.println("Original matrix is:");
        printArray(arr1,r1,c1);
//        System.out.println("Transpose of matrix is given below:");
//        transposeOfMatrix(arr1,r1,c1);

//        Problem5:Transpose without taking extra array Possible only for Square Matrix
//        System.out.println("Transpose of square matrix is given below:");
//        transposeOfMatrix(arr1,r1,c1);

//        Problem5:Rotation of matrix
//        Basically It is reverse of Transpose of matrix

//        1  2  3  4          13 9  5 1
//        5  6  7  8    ----> 14 10 6 2
//        9  1  11 12         15 11 7 3
//        13 14 15 16         16 12 8 4
//        System.out.println("Rotation of square matrix is given below:");
//   rotationOfMatrix(arr1,r1);
//
//   Problem6:Pascal`s Triangle

    }


    }




