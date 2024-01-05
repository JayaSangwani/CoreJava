package src.TenPracticePrograms;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for addition");
        int num = sc.nextInt();

        int sum=0;
        int num1;

        while(num>0){
            num1 = num%10;
            sum = sum+num1;
            num=num/10;

        }
        System.out.println("sum of digits "+sum);



    }
}
