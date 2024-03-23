import java.util.List;

public class CollectionFramework {

    public static void main(String[] args) {
        int [] a = new int[4];
        a[0] = 10;
        List fruits = List.of("orange","apple","pineapple","banana");

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.isEmpty());
        //fruits.add("kiwi"); -- not allowed
        System.out.println(fruits);

    }
}
