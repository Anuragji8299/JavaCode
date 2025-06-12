package lecture18;

public class NonDecreasingOrder {

    static int[] nonDecreasing(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
int ans[]=new int[n];
int k=-1;
        while (left<right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[++k]= (int) Math.pow(arr[left],2);
                left++;
            }
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                ans[++k]=(int) Math.pow(arr[right],2);
                right--;
            }

        }
return ans;
    }

    static void swapArr(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseArray(int arr[],int i,int j){
        while (i<j){
            swapArr(arr,i,j);
            i++;
            j--;
        }

    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={-10,-6,-3,4,8,9};
        printArr(arr);
   int [] ans=nonDecreasing(arr);
reverseArray(ans,0,arr.length-1);

printArr(ans);

    }
}
