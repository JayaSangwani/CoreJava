package Map01;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Pineapple");
        map.put(1,"Grapes");

        System.out.println(map);
        map.remove(1);
        System.out.println(map);
        map.remove(103);// removes only if key is present
        System.out.println(map);
        map.putIfAbsent(103, "Litchi");
        System.out.println(map);
    }
}
