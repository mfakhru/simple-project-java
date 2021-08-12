package com.zi.project.consonantvowel;

import java.util.Scanner;

public class ConsonantVowel {
    
    public static void main(String[] args) {
        /* Directory */
        String word = " ";
        int vowel = 0;
        int consonant = 0;

        /* Program */
        // input sentence
        System.out.println("Enter a sentence : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        // calling procedure return int value
        vowel = num_vowel(word);
        consonant = num_consonant(word);

        System.out.println("Total vowels : " + vowel);
        System.out.println("Total consonants :" + consonant);
    }
    
    private static int num_vowel(String word) {
        int i;
        int total_vowel = 0;
        
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                total_vowel++;
            }
        }
        return total_vowel;
    }
    
    private static int num_consonant(String word) {
        int i;
        int total_consonant = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' || word.charAt(i) != 'i' || word.charAt(i) != 'u' || word.charAt(i) != 'e' || word.charAt(i) != 'o') {
                total_consonant++;
            }
        }
        return total_consonant;
    }
}
