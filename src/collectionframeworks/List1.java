package collectionframeworks;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PTB");
        courseList.add("LTB");
        courseList.add("SDET");

        List numList = new ArrayList();
        numList.add(130);
        numList.add(140);
        numList.add(150);
        numList.add(160);
        numList.add(170);

        courseList.addAll(numList);
        System.out.println(courseList);
        System.out.println("------------");

        //we cannot  perform add, delete and any other operations
        Iterator iterator = courseList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
