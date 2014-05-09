/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;

/**
 *
 * @author danrix
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku l_game = new Sudoku();
        l_game.get_name();
        l_game.display_help();
    }
    
    String name;
    String instructions = "";
    
    public void get_name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        }
    
    public void display_help(){
        System.out.println("\n Welcom " + this.name + "\n");
        System.out.println(this.instructions);
        }  
    
}
