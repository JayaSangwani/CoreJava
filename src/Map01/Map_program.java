package Map01;

import java.util.HashMap;
import java.util.Map;

public class Map_program {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        hm.put("e", 500);

        for (Map.Entry<String, Integer> me :
            hm.entrySet()) {

            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }

    }
}
