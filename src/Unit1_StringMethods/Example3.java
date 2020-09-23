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
public class Example3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word #1: ");
        String word1 = input.next();

        System.out.print("Enter word #2: ");
        String word2 = input.next();

        System.out.println("Is word 1 equal to word 2? " + word1.equals(word2));

        String word = "General";
        System.out.println(word.startsWith("g"));
        System.out.println(word.startsWith("G"));

    }
}
