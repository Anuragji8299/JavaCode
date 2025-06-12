package Lecture61HashmapQuestion;
import java.util.*;
public class validAnagram {

    static HashMap<Character,Integer> makeFreqMap(String st){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<st.length();i++){
            Character ch=st.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        else{
            HashMap<Character,Integer> h1=makeFreqMap(s);
            HashMap<Character,Integer> h2=makeFreqMap(t);

            return h1.equals(h2);
        }

    }

    public static void main(String[] args) {

    }
}
