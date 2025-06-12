package Lecture34Recursion;

public class removeAllTargetaWithoutPassingIdx {

    static String remove(String s){
        if(s.length()==0) return "";
        // recursive work
        String smallAns=remove(s.substring(1));


        //self work
        char currChar=s.charAt(0);
       if(currChar!='a') return currChar+smallAns;

        return smallAns;
    }

    public static void main(String[] args) {
        String s="abadx";
        System.out.println(remove(s));
    }
}
