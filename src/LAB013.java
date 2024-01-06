package src;
import java.util.Scanner;

public class LAB013 {
    public static void main(String[] args) {
     //public static void main(String[] jaya) --> this is fine arguments can be anything
        int c= sum(3,4);
        System.out.println(c);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Your Name is "+ sc.next());

    }

    public static int sum(int a, int b){
        return a+b;
    }

}
