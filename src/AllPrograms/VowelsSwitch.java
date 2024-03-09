package src.AllPrograms;

import java.util.Scanner;

public class VowelsSwitch {
    public static void main(String[] args) {
        float a=10.09f;
        float b= 12.890f;
        //aeiou
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char input_user = sc.next().toCharArray()[0];

        switch(input_user){
            //multiple expressions case 'a','e','i','o','u':
            case 'a':
                System.out.println("Its a vowel");
                break;
            case 'e':
                System.out.println("Its a vowel");
                break;
            case 'i':
                System.out.println("Its a vowel");
                break;
            case 'o':
                System.out.println("Its a vowel");
                break;
            case 'u':
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its not a vowel");

        }
        //IMPORTANT FEATURE AFTER JDK13
        switch(input_user){
            case 'm' -> System.out.println("Just checking the arrow feature");

        }
        System.out.println(Math.max(a,b));
    }
}
