package Lecture34Recursion;

public class removingAllTargetchar {

    static String removeAllA(String s,int idx){

        //base work
        if(idx==s.length()){
            return "";
        }


        String smallAns=removeAllA(s,idx+1);

char currChar=s.charAt(idx);

if(currChar!='a'){
    return currChar+smallAns;
}

return smallAns;
    }

    public static void main(String[] args) {

        String s="abadx";

        System.out.println(removeAllA(s,0));


    }
}
