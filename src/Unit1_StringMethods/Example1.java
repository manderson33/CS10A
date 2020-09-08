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
public class Example1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

              System.out.println("The sentence entered is " + sentence.length() + " characters long");
        System.out.print("Enter index number: ");
        int start = input.nextInt();
        
        System.out.println("The substring is: " + sentence.substring(start));
        
        System.out.print("Enter start index: ");
        int index1 = input.nextInt();
        System.out.print("Enter end index: ");
        int index2 = input.nextInt();
        
        System.out.println("The substring is: " + sentence.substring(index1, index2) );
        
        
        System.out.println("Sentence in lowercase: " + sentence.toLowerCase());
        System.out.println("Sentence in uppercase: " + sentence.toUpperCase());
        
        System.out.println("Sentence with spaces before and after: " + sentence);
        System.out.println("Sentence with trim: " + sentence.trim());
        System.out.print("Enter the word to replace: ");
        String word1 = input.next();
        System.out.print("Enter the replacement: ");
        String word2 = input.next();
        
        System.out.println("Sentence with words replaced: " + sentence.replaceFirst(word1, word2));
        
        System.out.print("Enter the word to replace: ");
        String w1 = input.next();
        System.out.print("Enter the replacement: ");
        String w2 = input.next();
        
        System.out.println("Sentence with all words replaced: " + sentence.replaceAll(w1, w2));
        System.out.print("Enter a word or character from the sentence: ");
        String wo = input.next();
        
        System.out.println(wo + " is at index " + sentence.indexOf(wo));
        System.out.println("The last occurence of " + wo +  " is at index: " + sentence.lastIndexOf(wo));
        
        System.out.print("Enter index number: ");
        int ind = input.nextInt();
        
        System.out.println("The character at the index " + ind + " is: " + sentence.charAt(ind));
        
    }
}
