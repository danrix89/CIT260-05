package sudoku;
import java.util.Scanner;

/*
Class Description: Representation of the sudoku Main Menu.
*/

public class Main_Menu_View extends Menu_View
{    

    public Main_Menu_View() 
            // default constructor
        {
            super(Main_Menu_View.menu_items);
            get_player_input();
        } 

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
    
    public void get_player_name()
            // Gets 'player_name' from the user input.
        {
            Scanner l_input = new Scanner(System.in);
            print("Enter your name: ");
            player_name = l_input.next();
        }   

    String player_name;
            // Name of the player.
    
    private Main_Menu_Control internal_main_menu = new Main_Menu_Control();
            // Internal instance of Main_Menu_Control
    
    public final static String[][] menu_items = {
                                                    {"N", "New game"},
                                                    {"H", "Help menu"}, 
                                                    {"D", "Set difficulty"},        
                                                    {"X", "Exit game"}        
                                                };

}
