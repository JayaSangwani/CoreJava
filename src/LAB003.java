package src;


public class LAB003 {
    public static void main(String[] args) {
        //Ternary Operator
        int a = true ? 10 : 20;
        int a1 = (10>20) ? 10 :20 ;
        System.out.println(a);
        System.out.println(a1);

        String str = 10 > 20 ? "Correct" : "Incorrect";
        System.out.println(str);

        //Max between two numbers
        int a2 = 10;
        int b = 20;
        int d = 30;
        int c = (a2>b) ? a2 : b;
        int max = (a2>b) ? ((a2>d) ?  a2 : d) : ((b>d) ?  b: d);
        System.out.println(c);
        System.out.println(max);

        


    }
}
