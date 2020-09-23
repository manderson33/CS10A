/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeSequence;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String fN = input.nextLine();
        System.out.println("Enter your address: ");
        String add = input.nextLine();
       // System.out.println("Name: " + fN + "\nAddress: " + add);
        
        System.out.println("Enter your name: ");
        String fN1 = input.nextLine();      
        System.out.println("Enter your address: ");
        String add1 = input.nextLine();
       // System.out.println("Name: " + fN1 + "\nAddress: " + add1);
        
        System.out.println("Name\t\tAddress");
        System.out.println(fN + "\t\t" + add);
        System.out.println(fN1 + "\t" + add1);
        
    }
}
