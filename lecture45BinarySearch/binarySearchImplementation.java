package lecture45BinarySearch;

public class binarySearchImplementation {

  public static boolean binarySearch(int []arr,int target){
      int n=arr.length;
      int st=0;
      int end=n-1;
      int mid=-1;
      while(st<=end){
          mid=st+(end-st)/2;

          if(target==arr[mid]){
            return true;
          }
          else if(target<arr[mid]){
              end=mid-1;
          }
          else st=mid+1;
      }
      return false;
  }

    public static void main(String[] args) {
        int []arr={1,9,13,16,17,18};
        System.out.println("Target element is found in the array: "+binarySearch(arr,13));

    }
}
