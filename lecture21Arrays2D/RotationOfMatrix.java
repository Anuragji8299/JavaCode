package lecture21Arrays2D;

public class RotationOfMatrix {

    static void rotateBy90(int arr[][]){
        transposeInPlace(arr);
        for(int i=0;i<arr.length;i++){
            reverseArray(arr[i]);
        }

    }

    static void reverseArray(int arr[]){
     int left=0;
     int right=arr.length-1;
     while(left<right){
         swapArr1D(arr,left,right);
         left++;
         right--;
     }
    }

    static void swapArr1D(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void swapArr(int arr[][],int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }

    //allows only when matrix is square
    static void transposeInPlace(int arr[][]){
        int r1=arr.length;
        for(int i=0;i<r1;i++){

            for(int j=i;j<r1;j++){
                swapArr(arr,i,j);
            }
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


    public static void main(String[] args) {
        int arr[][]={{12,13,18},{14,15,32},{16,17,53}};
        printArr2d(arr);

        System.out.println("Array after rotating 90 degree");
        rotateBy90(arr);
        printArr2d(arr);
    }
}
