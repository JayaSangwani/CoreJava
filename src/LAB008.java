package src;

public class LAB008 {
    public static void main(String[] args) {
        //[] --> array
        int [] marks = {97,78,67,54};
        String [] grocery = {"bread", "milk", "chocolate"};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        System.out.println(marks[3]);
        //System.out.println(marks[4]); //Exception in thread main

        marks[0]=0;
        System.out.println(marks[0]);

        //make the length fixed using final keyword
        final int [] a1 = new int[4];


    }
}
