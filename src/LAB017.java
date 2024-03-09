package src;

public class LAB017 {
    public static void main(String[] args) {
        String name = "Jaya";
        char [] char_array = name.toCharArray();

        for (int i=name.length()-1; i>=0; i--){
            System.out.println(char_array[i]);
        }
    }
}
