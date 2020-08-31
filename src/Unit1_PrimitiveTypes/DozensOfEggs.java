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
public class DozensOfEggs {
    public static void main(String[] args) {
        
        int numOfEggs = 2100;
        double pricePerDozen = 5.6;       
        int totalDozens = 2100/12;
        double totalPrice = totalDozens * pricePerDozen;
        
        System.out.println("Number of eggs: " + numOfEggs);
        System.out.println("Price per dozen: "+ pricePerDozen);
        System.out.println("Total num of dozens: " + totalDozens);
        System.out.println("Total Price: " + totalPrice);
    }
}
