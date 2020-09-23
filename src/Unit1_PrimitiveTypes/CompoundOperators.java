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
public class CompoundOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Num is: " + num);

        num++;
        num++;
        num--;

        System.out.println("Final num: " + num);

    }
}
