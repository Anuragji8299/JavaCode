package lecture29recursion;

public class SumOfDigits {

    static int sumDigits(int n) {
        if(n>=0&&n<=9) return n;
        return sumDigits(n/10)+n%10;
    }

    public static void main(String[] args) {

        System.out.println("The sum of digits of given number is: "+sumDigits(56789));

    }
}
