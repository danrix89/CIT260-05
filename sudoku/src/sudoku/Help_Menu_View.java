package sudoku;
import java.util.Scanner;

/*
Class Description: Representation of the Help Menu interface.
*/

public class Help_Menu_View extends Menu_View
{

    public Help_Menu_View() 
            // default constructor
        {
            super(Help_Menu_View.menu_items);
            get_player_input();
        } 
    
    @Override
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
                    case "R":
                        this.internal_help_menu.display_rules();
                        break;
                    case "B":
                        this.internal_help_menu.display_board_help();
                        break;
                    case "D":
                        this.internal_help_menu.display_difficulty_help();
                        break;                  
                    case "S":
                        this.internal_help_menu.display_scoring_help();
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
    
    private Help_Menu_Control internal_help_menu = new Help_Menu_Control();
            // Internal instance of Help_Menu_Control
    
    public final static String[][] menu_items = {
                                                    {"R", "Rules of Sudoku"},
                                                    {"B", "Board layout"}, 
                                                    {"D", "Difficulty definitions"},
                                                    {"S", "Scoring in Sudoku"},        
                                                    {"X", "Exit Menu"}        
                                                 };

}
