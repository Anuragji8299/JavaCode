package lecture22Arrays;

public class MakingElementsInSpiralOrder {

    static int [][] createSpiral(int n){
        int spiralMatrix[][]=new int[n][n];

        int topRow=0;
        int bottomRow=spiralMatrix.length-1;
        int leftCol=0;
        int rightCol=spiralMatrix.length-1;
        int totalElements=0;
        int count=1;
        while (count<=n*n) {
            //top row printing
            for (int i = leftCol; i <= rightCol; i++) {
                spiralMatrix[topRow][i]=count;
                count++;
            }
            topRow++;


            //right col printing
            for(int i=topRow;i<=bottomRow;i++){
                spiralMatrix[i][rightCol]=count;
                        count++;
            }
            rightCol--;

            //bottom row printing
            for(int i=rightCol;i>=leftCol;i--){
                spiralMatrix[bottomRow][i]=count;
                        count++;

            }
            bottomRow--;


            //left col printing
            for(int i=bottomRow;i>=topRow;i--){
                spiralMatrix[i][leftCol]=count;
                        count++;
            }
            leftCol++;

        }
        return spiralMatrix;
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
        int spiralMatrixCreation[][]=createSpiral(5);

        printArr2d(spiralMatrixCreation);
    }
}
