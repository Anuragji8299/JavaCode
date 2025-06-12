package lecture45BinarySearch;

public class SquareRootUsingBinarySearch {

public static int findSquareRoot(int n,int st,int end){
    int ans=-1;
    while(st<end){
        int mid=st+(end-st)/2;
        int value=mid*mid;

        if(value==n) return mid;

        else if(value>n){
           end=mid-1;
        }
        else{
            st=mid+1;
            ans=mid;
        }
    }
    return ans;
}

    public static void main(String[] args) {
        int n=37;
        System.out.println("Approximate or exact Square root of the "+n+" is: "+findSquareRoot(n,0,n));
    }
}
