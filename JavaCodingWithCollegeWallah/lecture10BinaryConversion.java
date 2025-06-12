package JavaCodingWithCollegeWallah;

import java.util.Scanner;

public class lecture10BinaryConversion {
    public static void main(String[] args) {
        System.out.println("Enter the binary number which you want to convert in decimal number system");
        Scanner sc=new Scanner(System.in);

        //Binary to decimal conversion
//        int binary_num=sc.nextInt();
//
//        int ans=0;
//        int powerOf2=1;
//        while (binary_num>0){
//            int unitDigit=binary_num%10;
//            ans+=unitDigit*powerOf2;
//            powerOf2*=2;
//            binary_num/=10;
//        }
//        System.out.println("Your desired binary to decimal conversion is:"+ans);


        //conversion of decimal to binary
        int decimal_num=sc.nextInt();
        int ans=0;
        int multiplier=1;
        while(decimal_num>0){
            int unitDigit=decimal_num%2;
            unitDigit*=multiplier;
            ans+=unitDigit;
            multiplier*=10;
            decimal_num/=2;

        }
        System.out.println("Your desired decimal to binary conversion is: "+ans);

    }
}
