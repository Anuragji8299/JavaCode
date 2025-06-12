package lecture31Recursion;

public class GCD {

    static int gcdOfTwoNumbers(int x,int y){

        int k=Math.min(x,y);

        if(k==1) return k;
       if(k==y){
           int rem=x%k;
          if(rem!=0) return gcdOfTwoNumbers(y,rem);
       }
       if(k==x){
           int rem=y%k;
           if(rem!=0) return gcdOfTwoNumbers(x,rem);
       }
         return k;
    }

    public static void main(String[] args) {
        int gcd=gcdOfTwoNumbers(45,30);
        System.out.println("GCD of these numbers is "+gcd);
    }
}
