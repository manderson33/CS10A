/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * For cloning test
 */
package Unit1_Exercises_FirstName;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class ObjectHeight {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter a time less than 4.5 seconds: ");
        double time = input.nextDouble();
        
        double h = 100 - 4.9 * time * 2;
        
        System.out.println("The height of an object is: " + h);
        
    }
}
