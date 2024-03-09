package src;

import java.util.Scanner;

public class LAB006 {
    public static void main(String[] args) {

        //Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();

        if(a%2 == 1){
            System.out.println("Its Odd Number");
        } else {
            System.out.println("Its Even");
        }
    }
}
