/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallons_to_liters;

/**
 *
 * @author Larry
 */
public class Gallons_to_liters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; // contains number of gallons
        double liters; // contains number of liters
        
        gallons = 10; // initialized number of gallons
        liters = gallons * 3.8754; // initialized number of liters
        
        // outputs the converstion to the screen
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
