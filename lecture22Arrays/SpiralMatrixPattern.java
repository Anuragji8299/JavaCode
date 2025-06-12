package lecture22Arrays;

public class SpiralMatrixPattern {

    static void printSpiral(int arr[][],int row,int col){
        int topRow=0;
        int bottomRow=arr.length-1;
        int leftCol=0;
        int rightCol=arr.length-1;
        int totalElements=0;
      while (totalElements<row*col) {
          //top row printing
          for (int i = leftCol; i <= rightCol; i++) {
              System.out.print(arr[topRow][i]+" ");
              totalElements++;
          }
          topRow++;


          //right col printing
for(int i=topRow;i<=bottomRow;i++){
    System.out.print(arr[i][rightCol]+" ");
    totalElements++;
}
          rightCol--;

          //bottom row printing
          for(int i=rightCol;i>=leftCol;i--){
              System.out.print(arr[bottomRow][i]+" ");
              totalElements++;

          }
          bottomRow--;


          //left col printing
          for(int i=bottomRow;i>=topRow;i--){
              System.out.print(arr[i][leftCol]+" ");
              totalElements++;
          }
          leftCol++;

      }
    }

    static void printArr2d(int arr[][]){
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

//            12 13 18
//            14 15 32
//            16 17 53
    public static void main(String[] args) {

        int arr[][]={{12,13,18},{14,15,32},{16,17,53}};
printArr2d(arr);
        printSpiral(arr,3,3);

    }
}
