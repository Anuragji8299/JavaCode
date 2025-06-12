package lecture40questiononsorting;

public class MoveZeros {

    static void move(int []arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==false) break;

        }

    }
    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr={1,0,0,5,3,2};
        move(arr);
        print(arr);
    }
}
