package lecture44questiononsortingpart2;

public class SortWithThreePointer {
 public static void swap(int arr[],int x,int y){
     int temp=arr[x];
     arr[x]=arr[y];
     arr[y]=temp;
 }

 public static void sort012(int arr[]){
     int n=arr.length;
     int mid=0;
     int low=0;
     int high=n-1;

     while(mid<=high){
         if(arr[mid]==0){
             swap(arr,mid,low);
             low++;
             mid++;
         }
        else if(arr[mid]==1){
             mid++;
         }
        else{
             swap(arr,mid,high);
             high--;
         }
     }
 }

    public  static void display(int arr[]){
        for(int value:arr){
            System.out.print(value+" ");
        }
    }


    public static void main(String[] args) {
int arr[]={2,2,0,0,1,1,2,0,1,0};

sort012(arr);
display(arr);
    }


}
