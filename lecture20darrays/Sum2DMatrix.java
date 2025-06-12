package lecture20darrays;

public class Sum2DMatrix {

    static int [][] sum2D(int arr1[][],int arr2[][]){
        int result[][]=new int[arr1.length][arr1[0].length];
        for(int i=0;i< arr1.length;i++){

            for(int j=0;j<arr1[0].length;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return result;
    }
    static void printArr2d(int arr[][]){
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int [][]arr1={{12,13},{14,15},{16,17}};
       //3x2 matrix
        int [][]arr2={{12,13},{14,15},{16,17}};

        int [][] result=sum2D(arr1,arr2);
        printArr2d(result);
    }
}
