package src.TenPracticePrograms;
import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for multiplication table");
        int num = sc.nextInt();
        System.out.println("Enter range");
        int range = sc.nextInt();

        int result;

        for (int i=1; i<=range; i++){
            result= num*i;
            System.out.println(num + "*" + i + "=" +result);
        }

    }
}
