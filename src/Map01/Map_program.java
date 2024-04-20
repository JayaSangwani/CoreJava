package Map01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_program {
    public static void main(String[] args) {
        //Map<String, Integer> hm = new HashMap();
        //Map<String, Integer> hm = new LinkedHashMap<>();
        Map<String, Integer> hm = new TreeMap<>();
        hm.put("z", 200);
        hm.put("t", 900);
        hm.put("c", 100);
        hm.put("b", 600);
        hm.put("a", 300);

        for (Map.Entry<String, Integer> me :
            hm.entrySet()) {

            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println(hm);


    }
}
