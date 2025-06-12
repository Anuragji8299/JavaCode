package lecture30recursion;

public class PrintMultiple {

    static void print(int n,int k){
        if(k==0) return;


        print(n,k-1);
        System.out.print(n*k+" ");


    }
    public static void main(String[] args) {
        print(7,5);
    }
}
