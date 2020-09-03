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
public class Circle {
    
    //type psvm + press tab
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
    }
}
