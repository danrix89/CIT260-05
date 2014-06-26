
package sudoku;

import java.util.Scanner;

/*
Class Description: Representation of a basic Menu.
*/

public class Menu_View 
{
    public Menu_View()
            // Default constructor.
        { 
        }
    
    public Menu_View(String[][] a_menu_items)
            // Consrtuctor for specifying menu_items.
        {
            this();
            this.menu_items = a_menu_items;
        }
    
    public final void display()
            // Displays Current.
        {
            print("\n\t===============================================================");
            print("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < menu_items.length; i++) 
                {
                print("\t   " + menu_items[i][0] + "\t" + menu_items[i][1]);
                }
            print("\t===============================================================\n");
        }
    
    public void get_player_input()
            // Displays the main menu and gets the player's input
        {
            // Is defined (overridden) in subclasses.
        }    
    
    public String[][] menu_items;
    
    public static void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
