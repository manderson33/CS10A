/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_PrimitiveTypes;

/**
 *
 * @author maanderson
 */
public class AverageGrade {
    public static void main(String[] args) {
        
        double mGrade = 89.2;
        double pGrade = 67.3, lGrade = 88.0;
        
        double average = (mGrade + pGrade + lGrade)/3;
        
        System.out.println("Math Grade: " + mGrade);
        System.out.println("Physics Grade: " + pGrade);
        System.out.println("Literature Grade: " + lGrade);
        System.out.println("Average: " + average);
                

    }
}
