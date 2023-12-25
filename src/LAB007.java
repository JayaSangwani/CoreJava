package src;

import java.util.Scanner;

public class LAB007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println(a+" is the biggest number among all");
        } else if ((b>c) && (b>a)) {
            System.out.println(b+" is the biggest number among all");
        } else {
            System.out.println(c+" is the biggest number among all");
        }


    }
}
