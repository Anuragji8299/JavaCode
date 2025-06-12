package lecture10numbersystems;

import java.util.Scanner;

public class ConversionOfDecimalToBinary {


    public static void main(String[] args) {
        System.out.println("Enter the decimal number for conversion");
        Scanner sc=new Scanner(System.in);
        int decimal_num=sc.nextInt();
        int binary_num=0;
        int pw10=1;
        while(decimal_num>0){
            int digit=decimal_num%2;
            binary_num+=digit*pw10;
            pw10*=10;
            decimal_num/=2;
        }

        System.out.println("Converted decimal number into binary number is: "+binary_num);

    }
}
