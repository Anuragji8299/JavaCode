package lecture10numbersystems;

import java.util.Scanner;

public class ConversionOfBinaryToDecimal {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number");
       int binary=sc.nextInt();
        int decimal=0;
        int pw2=1;
       while(binary>0){
           int n=binary%10;
           decimal+=pw2*n;
           pw2*=2;
           binary=binary/10;
       }
        System.out.println("Conversion of given binary is: "+decimal);


    }
}
