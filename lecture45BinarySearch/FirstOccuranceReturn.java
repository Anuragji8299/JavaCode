package lecture45BinarySearch;

public class FirstOccuranceReturn {

    public static int findFirstOccurredTarget(int arr[],int st,int end,int target){
        int fo=-1;
        while(st<end){
            int mid=st+(end-st)/2;

            if(arr[mid]==target){
                fo=mid;
                end=mid-1;
            }

            else if(arr[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }


            return fo;
    }

    public static void main(String[] args) {
        int arr[]={1,1,3,3,5,5,5,5,8,8,9,9};
        //target is 9

        System.out.println("Index of target element is: "+findFirstOccurredTarget(arr,0,arr.length-1,7));
    }
}
