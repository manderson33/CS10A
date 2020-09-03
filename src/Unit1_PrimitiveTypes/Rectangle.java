/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_PrimitiveTypes;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class Rectangle {
    
    //psvm + tab
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        
        double area = length * width;
        double perimeter = (2*length)+ (2 * width);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        
    }
}
