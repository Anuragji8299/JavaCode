package Lecture23Arrays;

public class AreaOfRectangle {

//
//    static int areaUsingSuffixAndPrefix(int arr[][],int l1,int r1,int l2,int r2 ){
//
//
//
//
//    }

    static void areaSum(int arr[][]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }

    }


    public static void main(String[] args) {
        int arr[][]={{12,13,18},{14,15,32},{16,17,53}};
    }

}
