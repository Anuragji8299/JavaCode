package lecture35Recursion;

import java.util.Scanner;

public class getSubsequentstringWithoutArraylist {

    public static void printSSq(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr=s.charAt(0);

                printSSq(s.substring(1),currAns+curr);
        printSSq(s.substring(1),currAns);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        printSSq(st, "");

    }
}
