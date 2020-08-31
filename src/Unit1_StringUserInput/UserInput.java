/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_StringUserInput;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class UserInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        System.out.println("You entered: " + num);
        
    }
}
