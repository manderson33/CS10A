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
public class Prints_Practice {
    public static void main(String[] args) {
        
        int numOfPages = 1550;
        double pricePerHundred = 12.5;
        double pricePerPage = 1.7;
        
        double priceHundreds = (numOfPages / 100) * pricePerHundred;
        double priceExtraPages = (numOfPages % 100) * pricePerPage;
        double totalPrice = priceHundreds + priceExtraPages;
        
        System.out.println("Number of pages: " + numOfPages);
        System.out.println("Price per 100 pages: " + pricePerHundred);
        System.out.println("Price per page: " + pricePerPage);
        
        System.out.println("Total price of prints: " + totalPrice);
        
    }        
}




