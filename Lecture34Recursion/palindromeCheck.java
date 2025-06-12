package Lecture34Recursion;

public class palindromeCheck {

    public static boolean palindrome(String s,int left , int right){
        //base condition
        if(left>right) return true;



        //self work
      if(s.charAt(left)==s.charAt(right)){
          boolean smallans=palindrome(s,left+1,right-1);
          return true;
      }
      return false;
        //recursive work
    }
    public static void main(String[] args) {
     String s="malayala";
        System.out.println("Is given string palindrome--> "+palindrome(s,0,s.length()-1));
    }


}
