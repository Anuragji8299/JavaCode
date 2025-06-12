package JavaCodingWithCollegeWallah;

import java.util.Scanner;

public class Lecture34Recursion7 {

    static String removeA(String s,int indx){
        //base case
        if(indx>=s.length()) return "";
        //Recursive Work
      String smallAns=removeA(s,indx+1);
      char currChar=s.charAt(indx);
      //Self Work
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    // Problem 2 Reverse the string

//    static String reverseString(String s,int indx){
//        //Base Work
//
//        if(indx>=s.length()) return "";
//
//        //Self Work
//
//        char currentChar=s.charAt(indx);
//        //Recursive work
//        String smallAns=reverseString(s,indx+1);
//
//        return smallAns+currentChar;
//
//    }

    //Example3:
//static String reverseString(String s){
//    //Base Work
//
//    if(s.length()==0) return "";
//
//    //Self Work
//
//    char currentChar=s.charAt(0);
//    //Recursive work
//    String smallAns=reverseString(s.substring(1));
//
//    return smallAns+currentChar;
//
//}

    static boolean isPalindrome(String s,int l,int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r)&& isPalindrome(s,l+1,r-1));

    }


    public static void main(String[] args) {
//        String s="college";
        Scanner sc= new Scanner(System.in);
//        String s= sc.next();
        //To print with spaces
        String s=sc.nextLine();
//        System.out.println(s.length());
//        System.out.println(s);
//       char ch= s.charAt(0);
//        System.out.println(ch);
//        System.out.println(s.substring(2,6));

        //problem1:Removing char from string
//        System.out.println(removeA(s,0));
// Problem 2 Reverse the string
//        System.out.println(reverseString(s));
//Problem3 Palindrome check
//        String New=reverseString(s);
//
//        if(New.equals(s)){
//            System.out.println("Palindrome");
//
//        }
//        else{
//            System.out.println("Not palindrome number");
//        }
       // problem4 Palindrome check With recursion
//        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}



