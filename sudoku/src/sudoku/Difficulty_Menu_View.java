
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;
import java.util.Scanner;
/**
 * You can type D now and low level of sudoku A. 
 * @author Janghun Yu
 */
public final class Difficulty_Menu_View
{
            public Difficulty_Menu_View() 
            // default constructor
        {   
              get_player_input();  
        } 
    
    public final void display()
            // Displays Current.
        {
            print("\n\t===============================================================");
            print("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < Difficulty_Menu_View.menu_items.length; i++) 
                {
                print("\t   " + menu_items[i][0] + "\t" + menu_items[i][1]);
                }
            print("\t===============================================================\n");
        }

    public void get_player_input()
            // Display the help menu and get the player's input
        {                    
            String l_command;
            Scanner l_input = new Scanner(System.in);        
            do 
                {
                display();
                l_command = l_input.nextLine();
                l_command = l_command.trim().toUpperCase();
                switch (l_command) 
                    {
                    case "A":
                      Board generateNumbers = new Board();
                      generateNumbers.populate_block();// I called board class but board class is not work. Maybe my code is worng. Idon know 
                        break;
                    case "B":
                      //  generateNumbers.populate_block(); <<< I think we need make another Board
                        break;
                    case "C":
                      //  generateNumbers.populate_block(); << for this too
                        break;
                    case "X": 
                        break;
                    default: 
                        new Error_Message().display("Invalid command. Please enter a valid command.");
                        continue;
                    }
                } 
            while (!l_command.equals("X"));
            return;
        }    
    
    private Difficulty_Menu_Control internal_main_menu = new Difficulty_Menu_Control();
            // Internal instance of Help_Menu_Control
    
    private final static String[][] menu_items = {
                                                    {"A", "25 cells are prefilled with 3 hints"},
                                                    {"B", "20 cells are prefilled with 2 hints"}, 
                                                    {"C", "10 cells are prefilled with 1 hints"},
                                                    {"X", "Exit Menu"}        
                                                 };
    
    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}


