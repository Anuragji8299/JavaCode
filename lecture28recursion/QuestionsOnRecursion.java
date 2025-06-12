package lecture28recursion;

public class QuestionsOnRecursion {

    static int fibonacci(int n){
        if(n==0||n==1) return n;
        int subproblem=fibonacci(n-1)+fibonacci(n-2);
        return subproblem;
    }

    public static void main(String[] args) {

        System.out.println("Nth term of fibonacci series is: "+fibonacci(6));
    }
}


