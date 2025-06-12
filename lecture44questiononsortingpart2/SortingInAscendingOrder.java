package lecture44questiononsortingpart2;

public class SortingInAscendingOrder {


    public static void sorted(int arr[]){
        int n=arr.length;
        int x=-1;
        int y=-1;
        if(n==1) return;
        for(int i=1;i<n;i++){

            if(arr[i-1]>arr[i]){
             if(x==-1){
                 x=i-1;
                 y=i;
             }
             else{
                 y=i;
             }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public  static void display(int arr[]){
        for(int value:arr){
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={12,19,18,14,20,24};
        sorted(arr);
        display(arr);

    }
}
