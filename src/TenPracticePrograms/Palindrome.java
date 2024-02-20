package src.TenPracticePrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.next();
        String rev= "";

        for(int j=name.length()-1; j>=0; j--){
            rev= rev + name.charAt(j);
            }
        if (name.equalsIgnoreCase(rev)){
            System.out.println("Its a panlindrome");
        }else {
            System.out.println("Its not a palindrome");
        }


    }

}
