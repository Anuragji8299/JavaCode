package lecture47BinarySearchIn2DMatrix;

public class SearchA2DMatrix {

    public static boolean search(int [][]arr,int target){
int n=arr.length;
    int m=arr[0].length;
    int end=m*n-1;
int start=0;
    while(start<=end){
        int mid=end-(end-start)/2;
        if(arr[mid/m][mid%m]==target){
            return true;
        } else if (arr[mid/m][mid%m]<target) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }


    }


        return false;
    }

    public static void main(String[] args) {
int [][] arr={{1,3,5,7},{10,13,18,20},{21,23,27,29,32}};

        System.out.println("The target element is present: "+search(arr,22));
    }
}
