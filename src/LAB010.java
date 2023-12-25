package src;

public class LAB010 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0) {
                System.out.println("BuzzFizz");
            }
                else if (i%3==0) {
                    System.out.println("Fizz");
                }
                    else if(i%5==0){
                        System.out.println("Buzz");
                    }
                        else {
                            System.out.println(i + " is not divisible by both 3 and 5");
            }
                }
            }
        }


