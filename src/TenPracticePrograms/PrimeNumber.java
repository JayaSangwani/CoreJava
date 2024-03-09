package src.TenPracticePrograms;

import java.util.Scanner;

public class PrimeNumber {
    //2. Prime Number Checker: Create a program that checks if a given number is prime or not.
    // Use loops to divide the number by all numbers lesser than it to check for divisibility.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number i will tell you if its prime or not");
        int num = sc.nextInt();

        boolean isprime = true;

        for (int i=2; i<num; i++){
            if(num%i == 0) {
                isprime = false;
                break;
            }

        }

        if (isprime == false){
            System.out.println("Its not a prime number");
        }
        else{
            System.out.println("Its a prime number");
        }

    }
}
