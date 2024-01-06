package src;
import java.util.Scanner;

public class LAB016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 2d array");
        int n1 =  sc.nextInt();
        int n2 =  sc.nextInt();

        int[][] array2d = new int[n1][n2];

        System.out.println("Enter the elements of 2d array");
        for (int i = 0; i<n1; i++){
            for(int j=0; j<n2; j++){
                array2d[i][j] = sc.nextInt();
            }
        }
        System.out.println("----output of 2d array");
        for (int i = 0; i<n1; i++){
            for(int j=0; j<n2; j++){
                System.out.println(array2d[i][j]);

            }
        }

    }
}
