package Lecture61HashmapQuestion;

import java.util.HashMap;

public class isIsomorphic {

    public static boolean isIso(String s,String t){
        HashMap<Character,Character> map=new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            Character sCh=s.charAt(i);
            Character tCh=t.charAt(i);
            if(map.containsKey(sCh)){
                if(map.get(sCh)!=tCh) return false;
            }
            else if(map.containsValue(tCh)) return false;
            else{
                map.put(sCh,tCh);
            }
        }

     return true;
    }

    public static void main(String[] args) {

        String s="EGG";
        String t="AND";

        System.out.println("Are Strings Isomorphic: "+isIso(s,t));
    }
}
