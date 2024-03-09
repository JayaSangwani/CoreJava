package src.TenPracticePrograms;

import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word we will count vowels");
        String word = sc.next();

        word = word.toLowerCase();

        int len = word.length();

        int vowels=0;
        int consonants;

        for(int i=0; i<len; i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||
                    word.charAt(i)=='o' ||word.charAt(i)=='u'){
                vowels=vowels+1;
            }

        }
        consonants = len-vowels;
        System.out.println("In the given word "+word+" vowels="+vowels+ " consonants = "+consonants);
    }
}
