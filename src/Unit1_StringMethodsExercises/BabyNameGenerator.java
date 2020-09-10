/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_StringMethodsExercises;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class BabyNameGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Parent 1 first name? ");
        String p1FN = input.next(); //assuming that fn is one word

        System.out.print("Parent 2 first name? ");
        String p2FN = input.next();

        System.out.print("Child Gender? ");
        String gender = input.next();

        String firstFourLetters = p1FN.substring(0, 4);
        String firstTwoLetters = p2FN.substring(0, 2);
        String genderLetter = gender.substring(0, 1);

        String childName = firstFourLetters+ firstTwoLetters + " " + genderLetter;
        
        System.out.println("Suggested by name: " + childName.toUpperCase());

    }
}
