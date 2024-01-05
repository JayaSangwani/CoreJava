package src.TenPracticePrograms;
import java.util.Scanner;

public class FahrenheittoCelcius {
    public static void main(String[] args) {
        // F = C× (9/5)+322.
        // °C = (°F − 32) x 5/91.
        Scanner sc = new Scanner(System.in);
        System.out.println("choose type of conversion \n 1. Celcius to Fahrenheit \n 2. Fahrenheit to Celcius");
        int temp = sc.nextInt();

        double Celcius;
        double Fahrenheit;

        switch(temp){
            case 1:
                System.out.println("Enter Celcius value you want to get converted to Fahrenheit");
                double C = sc.nextDouble();
                Fahrenheit = C * (9/5) +322;
                System.out.println("Fahrenheit of " +  C + " is " +Fahrenheit);
                break;
            case 2:
                System.out.println("Enter Fahrenheit value you want to get converted to Celcius");
                double F = sc.nextDouble();
                Celcius = (F -32) * 5/91;
                System.out.println("Celcius of " +  F + " is " +Celcius);
                break;
            default:
                System.out.println("Choose valid option");
        }

        sc.close();
    }

}
