package collectionframeworks.Set1;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set_explained {
    public static void main(String[] args) {
        //HashSet dont follow any order, it will print values randomly
        //Set<String> fruits = new HashSet();//restricted with String values - you can remove diamond operator and String inside to remove restriction
        //LinkedHashSet-->In order according to the list mentioned below--> insertion order
        Set<String> fruits = new LinkedHashSet<>();
        //TreeSet-->In order according to A to Z
        //Set<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("WaterMElon");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());

    }
}
