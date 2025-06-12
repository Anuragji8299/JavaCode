package Lecture34Recursion;

public class ReverseString {

    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        char current=s.charAt(idx);

        String smallAns=reverse(s,idx+1);
        return smallAns+current;



    }

    public static void main(String[] args) {

        String s="abcd";
        String reverseString=reverse(s,0);
        System.out.println(reverseString);
    }
}
