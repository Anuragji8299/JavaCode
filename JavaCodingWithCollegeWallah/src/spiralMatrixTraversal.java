package JavaCodingWithCollegeWallah;

import java.util.Scanner;

public class spiralMatrixTraversal {
    static void printMatrix(int[][]arr,int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralmatrixTraversal(int[][]arr,int r1,int c1){
    int topRow=0;
    int rightcol=c1-1;
    int leftCol=0;
    int bottomRow=r1-1;
    int toatlElements=0;
    while(toatlElements<r1*c1){
        for(int j=leftCol;j<=rightcol&&toatlElements<r1*c1;j++){
            System.out.print(arr[topRow][j]+" ");
            toatlElements++;
        }
        topRow++;
        for(int i=topRow;i<=bottomRow&&toatlElements<r1*c1;i++){
            System.out.print(arr[i][rightcol]+" ");

            toatlElements++;
        }
        rightcol--;
        for(int j=rightcol;j>=leftCol&&toatlElements<r1*c1;j--){
            System.out.print(arr[bottomRow][j]+" ");

            toatlElements++;
        }
        bottomRow--;
        for(int i=bottomRow;i>=topRow&&toatlElements<r1*c1;i--){
            System.out.print(arr[i][leftCol]+" ");

            toatlElements++;
        }
        leftCol++;
    }
}
  static void generateSpiral(int n){
        int[][]matrix=new int[n][n];
      int topRow=0;
      int rightcol=n-1;
      int leftCol=0;
      int bottomRow=n-1;
      int toatlElements=0;
      int a=1;
      while(toatlElements<n*n){
          for(int j=leftCol;j<=rightcol&&toatlElements<n*n;j++){
             matrix[topRow][j]=a++;
              toatlElements++;
          }
          topRow++;
          for(int i=topRow;i<=bottomRow&&toatlElements<n*n;i++){
              matrix[i][rightcol]=a++;
              toatlElements++;
          }
          rightcol--;
          for(int j=rightcol;j>=leftCol&&toatlElements<n*n;j--){
              matrix[bottomRow][j]=a++;

              toatlElements++;
          }
          bottomRow--;
          for(int i=bottomRow;i>=topRow&&toatlElements<n*n;i--){
              matrix[i][leftCol]=a++;

              toatlElements++;
          }
          leftCol++;
      }
      spiralmatrixTraversal(matrix,n,n);
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter the number of rows for square matrix");
//        int r1= sc.nextInt();
        /*System.out.println("Enter the number of columns for square matrix");
        int c1= sc.nextInt();
        int[][]arr1= new int[r1][c1];

        System.out.println("Enter the elements of 1st matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }*/
//        printMatrix(arr1,r1,c1);
//        System.out.println("Spiral Matrix is given below");
//        spiralmatrixTraversal(arr1,r1,c1);
//        Problem 2:Spiral matrix generation
        System.out.println("Enter the spiral matrix row number");
        int n= sc.nextInt();
        System.out.println("Generation and traversal of "+n+"*"+n+" order spiral matrix");
        generateSpiral(n);


    }
}
