package src.AllPrograms;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter Side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter Side 3");
        int side3 = sc.nextInt();

        if (side1==side2 && side2==side3){
            System.out.println("Triangle is Equilateral");
        }else if (side1==side2 || side2==side3 || side3==side1){
            System.out.println("Triangle is isosceles");
        }else {
            System.out.println("Triangle is scalene");
        }

    }
}
