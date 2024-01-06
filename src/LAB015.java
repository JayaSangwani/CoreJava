package src;
import java.util.Scanner;

public class LAB015 {
    public static void main(String[] args) {
        //take array from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int [] integer_array =new int[n];

        System.out.println("Enter the elements");

        for (int i=0; i<n; i++){
            integer_array[i]= sc.nextInt();
        }

        System.out.println("---output---");

        for (int i=0; i<n; i++){
            System.out.println(integer_array[i]);
        }

    }
}
