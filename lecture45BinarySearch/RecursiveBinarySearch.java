package lecture45BinarySearch;

public class RecursiveBinarySearch {

    public static boolean recBinarySearch(int arr[],int st,int end,int target){
        //base case
        if(st>end) return false;
        //self work

int mid=st+(end-st)/2;
if(target==arr[mid]) return true;
else if(target<arr[mid])  return recBinarySearch(arr,st,mid-1,target);

        else return recBinarySearch(arr,mid+1,end,target);
        //recursive work

    }


    public static void main(String[] args) {
int arr[]={12,14,18,20,27,33};
        System.out.println("Is target variable present: "+recBinarySearch(arr,0,arr.length-1,24));

    }
}
