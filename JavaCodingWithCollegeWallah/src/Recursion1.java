package JavaCodingWithCollegeWallah;

import java.util.concurrent.RecursiveTask;

public class Recursion1 {

//    static int factorial(int data){
//        if(data==0){
//            return 1;
//        }
//        else{
//            return data*factorial(data-1);
//
//        }
//    }

//    static int fib(int n){
//        if (n == 0) {
//            return n;
//        }
//        if (n == 1) {
//            return n;
//        }
//        else {
//            return fib(n - 1) + fib(n - 2);
//        }
//
//    }
//    static int sumOfDigits(int n){
//        if(n>=0&&n<=9){
//            return n;
//        }
//
//
//        return n%10+sumOfDigits(n/10);
//
//    }

//    static  int countOfDigits(int n){
//        if(n>=0&&n<=9){
//            return 1;
//        }
//        int count=0;
//        int ans=n%10;
//        count++;
//       int ans1= countOfDigits(n/10);
//       return count;
//    }
// static int pow(int p,int q){
//     if(q==0){
//         return 1;
//     }
//     return pow(p,q-1)*p;
// }

    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            return pow(p,q/2)*pow(p,q/2);
        }

            return p*pow(p,q/2)*pow(p,q/2);

        
    }
    public static void main(String[] args) {
        //problem:1 Factorial
//        System.out.println(factorial(5));

        //problem2:Fibonacci Series

//        System.out.println(fib(0));

        //Problem3:Sum of digits in given number

//        System.out.println(sumOfDigits(543));

  //Problem4:Count of digits in given number
//        System.out.println(countOfDigits(2345));

        //problem5:Power calculation of  given number
        //problem5:METHOD 2



        System.out.println(pow(5,5));
    }
}
