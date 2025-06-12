package lecture60Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {


    public static void main(String[] args) {

        Map<String,String> mp=new HashMap<>();

        mp.put("Mamta","Anurag");

        mp.put("Vibha","Vishal");

        mp.put("Prachi","Ritik");

        System.out.println(mp.containsKey("hello"));
        System.out.println(mp.containsValue("Anurag"));
        System.out.println(  mp.get("Mamta"));
        mp.putIfAbsent("Kiran","Shailesh");

        System.out.println(mp.entrySet());


    }
}
