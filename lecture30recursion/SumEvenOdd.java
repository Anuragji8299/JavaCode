package lecture30recursion;

public class SumEvenOdd {

    static int seriesSum(int n){
        if(n==0) return n;
        int subProblem;
      if(n%2!=0)  subProblem=seriesSum(n-1)+n;
      else{
          subProblem=seriesSum(n-1)-n;
      }
      return subProblem;
    }

    public static void main(String[] args) {
        System.out.println("The sum of series upto nth term is: "+seriesSum(5));
    }
}
