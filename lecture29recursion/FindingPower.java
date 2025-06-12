package lecture29recursion;

public class FindingPower {

    static int pow(int p,int q){

        if(q==1) return p;
        return p*pow(p,q-1);

    }

    public static void main(String[] args) {

        System.out.println("The value of p to the power q is: " +pow(4,3));

    }
}
