package lecture47BinarySearchIn2DMatrix;

public class SearchA2DMatrixII {

    public  static  boolean search2DMatrix(int [][] arr,int target){
int n=arr.length;
int m=arr[0].length;

int j=m-1;
int i=0;
while (i<n && j>=0){

    if(arr[i][j]==target){
        return true;
    }
    else if(arr[i][j]<target) {
        i++;
    }
    else{
        j--;
    }
}



        return false;
    }
    public static void main(String[] args) {
        int [][] arr={{1,4,7,11}
                     ,{2,5,8,12},
                      {3,6,9,16}};


        System.out.println("The target element is present: "+search2DMatrix(arr,17));
    }
}
