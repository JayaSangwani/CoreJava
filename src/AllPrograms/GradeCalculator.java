package src.AllPrograms;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int num = sc.nextInt();
        if(num>= 90 && num<=100){
            System.out.println("Your Grade is A");
        }else if(num>=70 && num<90){
            System.out.println("Your Grade is B");
        }else if(num>=50 && num<70){
            System.out.println("Your Grade is C");
        }else {
            System.out.println("You are Fail");
        }

    }
}
