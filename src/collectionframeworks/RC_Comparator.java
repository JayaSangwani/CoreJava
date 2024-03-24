package collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RC_Comparator {

    public static void main(String[] args) {
       Student c = new Student(1,"R");
       Student c2 = new Student(3,"P");
       Student c3 = new Student(2,"Q");

       List<Student> slist = new ArrayList<>();
       slist.add(c);
       slist.add(c2);
       slist.add(c3);
        System.out.println(slist);

        //Collections.sort(slist);

        Collections.sort(slist, new SortbyName());
        System.out.println(slist);


        //Comparable -- only one way either by id or name
        //Comparator -- can sort with any field id, name etc, both are allowed
    }
}
