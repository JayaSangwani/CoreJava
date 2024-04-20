package collectionframeworks.Set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {
    public static void main(String[] args) {
        Set Courses = new HashSet();
        Courses.add("BBA");
        Courses.add("BCA");
        Courses.add("MSC");
        Courses.add("BSC");
        Courses.add("MBA");

        System.out.println(Courses);
        System.out.println("--------------");
        for (Object o : Courses) {
            System.out.println(o);

        }

        System.out.println("--------------");

        Iterator it = Courses.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
