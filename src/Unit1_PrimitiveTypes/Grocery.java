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
public class Grocery {

    public static void main(String[] args) {
        
        int numOfMangos = 234;
        double pricePer5 = 4.8;
        double pricePerMango = 1.2;
        double discount = 0.25;

        double totalPricePer5 = (234 / 5) * pricePer5;
        double totalPricePer1 = (234 % 5) * pricePerMango;

        double totalPrice = (totalPricePer5 + totalPricePer1) * (1 - discount);

        System.out.println("Number of Mangos: " + numOfMangos);
        System.out.println("Price per 5 mangos: " + pricePer5);
        System.out.println("Price per mango: " + pricePerMango);
        System.out.println("Discount: " + discount);
        System.out.println("Total price of mangos: " + totalPrice);
    }

}



