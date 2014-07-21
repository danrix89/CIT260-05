package sudoku;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Class Description: Representation of the sudoku Main Menu.
*/

public class Main_Menu_View extends Menu_View
{    

/**************************
        CONSTRUCTORS:
***************************/    
    public Main_Menu_View() 
            // Default constructor
        {
            super(Main_Menu_View.menu_items);
            get_player_input();
        }
    
    
/**************************
     INSTANCE VARIABLES:
***************************/    
    private String file_name_to_load;
            // User speified file name used to load a game.

    
/**************************
        SETTINGS:
***************************/    
    private void set_user_specified_file_name()
            // Sets file_name_to_load from user input.
        {
            String l_command;
            Scanner l_input = new Scanner(System.in);
            
            do 
                {
                    print("\n\tPlease enter a the name of the file you wish to load:");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                    file_name_to_load = l_command;
                } 
            while (l_command.equals(""));
        }

    
/**************************
        BASIC METHODS:
***************************/    
    @Override
    public void get_player_input()
            //Display the main menu and get the player's input
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
                    case "N":
                        internal_main_menu.new_game();
                        break;
                    case "L":
                        try {
                                set_user_specified_file_name();
                                internal_main_menu.load_game_from_file(file_name_to_load);
                            } 
                        catch (ClassNotFoundException ex) 
                            {
                                Logger.getLogger(Main_Menu_View.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        break;
                    case "H":
                        internal_main_menu.display_help_menu();
                        break;
                    case "D":
                        internal_main_menu.display_difficulty_menu();
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
        
    
/**************************
        CONSTANTS:
***************************/    
    private Main_Menu_Control internal_main_menu = new Main_Menu_Control();
            // Internal instance of Main_Menu_Control
    
    public final static String[][] menu_items = {
                                                    {"N", "New game"},
                                                    {"L", "Load game"},
                                                    {"H", "Help menu"}, 
                                                    {"D", "Set difficulty"},        
                                                    {"X", "Exit game"}        
                                                };

}
