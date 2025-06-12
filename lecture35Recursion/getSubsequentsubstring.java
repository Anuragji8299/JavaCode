package lecture35Recursion;

import java.util.ArrayList;

public class getSubsequentsubstring {

    public static ArrayList<String> getSubsequent(String s){
        ArrayList<String> ans=new ArrayList<>();


        if(s.length()==0){

             ans.add("");
             return ans;
        }
        char currchar=s.charAt(0);
        ArrayList<String> smallAns=getSubsequent(s.substring(1));

        for(String ss:smallAns){
            ans.add(ss);
            ans.add(currchar+ss);
        }



        return ans;


    }

    public static void main(String[] args) {
        String s="abc";
        System.out.println(getSubsequent(s));
    }
}
