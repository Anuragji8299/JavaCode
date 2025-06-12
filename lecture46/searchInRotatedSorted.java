package lecture46;

public class searchInRotatedSorted {



    public static int search(int[]arr,int left,int right){

        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;



             if(arr[mid]<=arr[right]){
                 ans=arr[mid];
                right=mid-1;
            }
             else{
                 left=mid+1;
             }

        }
        return ans;

    }

    public static void main(String[] args) {
int []arr={5,6,7,8,9,10,2,3,4};

        System.out.println("Minimum element is "+search(arr,0,arr.length-1));
    }
}
