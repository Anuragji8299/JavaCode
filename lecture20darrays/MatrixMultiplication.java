package lecture20darrays;

public class MatrixMultiplication {

    static void printArr2d(int arr[][]){
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int [][] multiply2D(int arr1[][],int arr2[][]){
        int r1=arr1.length;
        int r2=arr2.length;
        int c1=arr1[0].length;
        int c2=arr2[0].length;

        int result[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){

            for(int j=0;j<c2;j++){
               for(int k=0;k<c1;k++){
                   result[i][j]+=arr1[i][k]*arr2[k][j];
               }


            }
        }
        return result;
    }

    public static void main(String[] args) {

        int [][]arr1={{12,13},{14,15}};
        //3x2 matrix
        int [][]arr2={{12,13,14},{15,16,17}};

        int [][] result=multiply2D(arr1,arr2);
        printArr2d(result);


    }


}
