package src;
import java.util.Scanner;

public class LAB014 {
    public static void main(String[] args) {
        //swapping
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();

        //int temp = a;
        //a=b;
        //b=temp;
        //System.out.println("a= "+a+"   "+"b= "+b);

        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+"   "+"b= "+b);
    }
}
