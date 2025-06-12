package lecture17Arrays;
import java.util.*;

public class RotateArrayRevision {


    public static int [] rotate(int [] arr,int k){

        // 3 ,4 ,5, 8, 10
        // k=2       n-k n-1 0    n-k-1
        //new output 8, 10 ,3, 4, 5;
        int n=arr.length;
        int [] result= new int[n];
        int j=0;
        for(int i=n-k;i<=n-1;i++){
            result[j++]=arr[i];
        }

        for(int i=0;i<=n-k-1;i++){
            result[j++]=arr[i];
        }

        return result;
    }

    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation you need:");
        int k= sc.nextInt();


       int [] result=  rotate(arr,k);

       for(int num:result){
           System.out.print(num+" ");
       }


    }
}
