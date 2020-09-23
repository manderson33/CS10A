/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_StringMethods;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class StringMethods {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-word phrase: ");
        String phrase = input.nextLine();
        
        String fWord = phrase.substring(0, phrase.indexOf(" "));
        System.out.println("First Word: " + fWord + " " + fWord.length() + " characters");
        
        String mWord = phrase.substring(phrase.indexOf(" ") + 1, phrase.lastIndexOf(" "));
        System.out.println("Second Word: " + mWord + " " + mWord.length() + " characters");
        
        String lWord = phrase.substring(phrase.lastIndexOf(" ") + 1);
        System.out.println("Third word: " + lWord + " " + lWord.length() + " characters");
        
        int totalChars = fWord.length() + mWord.length() + lWord.length();
        System.out.println("Total number of characters: " + totalChars);
        
    }
}
