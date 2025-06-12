package lecture60Hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxFrequency {


    public static void main(String[] args) {
        int [] arr={1,2,1,3,3,1,2,3,1,4,4,5,1};

        Map<Integer,Integer> freq=new HashMap<>();

        for(int element: arr){
            if(!freq.containsKey(element)) freq.put(element,1);

            else{
                freq.put(element,freq.get(element)+1);
            }
        }
        int maxFreq=0,ansKey=-1;
        for(var key:freq.keySet()){
            if(maxFreq< freq.get(key)){
                maxFreq=freq.get(key);
                ansKey=key;
            }
        }



        System.out.printf("%d has max frequency and it has occurred %d times",ansKey,maxFreq);
    }
}
