package collectionframeworks;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration12 {
    public static void main(String[] args) {
        Vector v = new Vector();

        Vector<String> v2 = new Vector<>();
        v2.add("P");
        v2.add("V");
        v2.add("A");

        //Enumeration is same as Iterator but only available for Vector so not recommended
        //Lisiteration is same as Iterator but only available for List so not recommended
        Enumeration e = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

}
