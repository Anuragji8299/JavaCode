package lecture38selectionsort;

public class SelectionSort {
static void sorting(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[min]>arr[j]){
               min=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }

}
    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={12,54,45,8,9,20};

sorting(arr);
print(arr);
    }
}
