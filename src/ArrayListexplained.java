import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListexplained {
    public static void main(String[] args) {

        List<String>  mylist = new ArrayList<>();
        mylist.add("P");
        mylist.add("t");
        mylist.add("y");
        mylist.add("m");
        mylist.add("h");
        //mylist.add(1);

        System.out.println(mylist);
        mylist.set(1,"Yak");
        mylist.remove("Yak");
        System.out.println(mylist);

        for(int i=0; i <mylist.size(); i++){
            System.out.println(mylist.get(i));

        }

        for(Object a : mylist){
            System.out.println(a);
        }

        System.out.println("----------");
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
