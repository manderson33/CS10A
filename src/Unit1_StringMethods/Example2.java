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
public class Example2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter comments: ");
        String comments = input.nextLine();
        
        //prints the comments and converts it into lowercase
        System.out.println("Comments: " + comments.toLowerCase());
        
        //counting the number of characters of the string
        int numOfChars = comments.length();
        System.out.println("Number of characters: " + numOfChars);
        
        //getting a portion of the bigger string
        String substring1 = comments.substring(6);
        System.out.println("Substring 1: " + substring1.toUpperCase());
        
        String substring2 = comments.substring(5, 9);
        System.out.println("Substring 2: " + substring2.toUpperCase());
        
        //replacing texts
        System.out.print("Enter a text in the comments to replace: ");
        String text1 = input.next(); //assuming that the user enters a single word
        System.out.print("Enter a text as replacement: ");
        String text2 = input.next();
        
        System.out.println("Replace first: " + comments.replaceFirst(text1, text2));
        System.out.println("Replace all: " + comments.replaceAll(text1, text2));
        
        //find the location of a text
        System.out.print("Enter a text: ");
        String t = input.next();
        System.out.println(t + " first appeared at index: " + comments.indexOf(t));
        System.out.println(t + " last appeared at index: " + comments.lastIndexOf(t));
        
        //finding a single character
        System.out.print("Enter index number: ");
        int index = input.nextInt();
        System.out.println("The character at index " + index + " is: " + comments.charAt(index));
        
        
        
        
        
        
        
        
        
    }
}
