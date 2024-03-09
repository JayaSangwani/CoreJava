package src.AllPrograms;

import java.util.Scanner;

public class Mathfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X,Y,Z");

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        double result = 0;

        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

        System.out.println(result);
        //Its a good practice to close scanner
        sc.close();



    }
}
