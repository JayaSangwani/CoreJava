package src;

public class LAB004 {
    public static void main(String[] args) {
        //Increment operator
        int a = 10;
        int b = 20;
        System.out.println(++a + a++ + a++ );
        System.out.println(a);
        System.out.println(b++  + b++ + ++b );
        //Explaining
        // b++ --> Exp : 20 b: 21 o/p --> 21
        // b++ --> Exp : 21 b : 22 o/p --> 21
        // ++b --> Exp : 23 b: 23 o/p --> 12
        //total 21+21+23 -->64  a--> 23
        System.out.println(b);

        //Explaining
        // ++a --> Exp : 11 a: 11 o/p --> 11
        // a++ --> Exp : 11 a : 12 o/p --> 12
        // a++ --> Exp : 12 a: 13 o/p --> 12
        //total 11+11+12 -->34  a--> 13

        System.out.println(a++);
        System.out.println(++a);
    }
}
