package sudoku;
import java.util.Scanner;

/*
Class Description: View that gets and handles player input during the game.
*/

public class Player_Input_View extends Menu_View
{
/**************************
        CONSTRUCTORS:
***************************/    
    public Player_Input_View(Game a_game) 
            // default constructor
        {
            super(Player_Input_View.menu_items);
            game = a_game;
            get_player_input();
        }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    private Game game;
    boolean return_to_menu;
    boolean save_game;
    

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
                    case "C":
                        set_cell_with_coordinates();
                        break;
                    case "B":
                        return_to_menu = true;
                        break;
                    case "S":
                        save_game = true;
                        break;
                    default: 
                        new Error_Message().display("Invalid command. Please enter a valid command.");
                        continue;
                    }
                } 
            while (!l_command.equals("B"));
            return;
        }    


/**************************
        SETTINGS:
***************************/
    private void set_cell_with_coordinates()
            //
        {
            String l_command;
            Scanner l_input = new Scanner(System.in); 
            int[]l_block = new int[2];
            int[]l_cell = new int[2];
            int l_number = 0;
            do 
                {
                    print("\n\tPlease enter a block # (1-9 starting and the top left and ending at the bottom right)");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                    try
                        {
                            l_block[0] = (Integer.parseInt(l_command) - 1) / 3;
                            l_block[1] = (Integer.parseInt(l_command) - 1) % 3;
                        }
                    catch (NumberFormatException l_error) 
                        {
                            print("\nPlease enter enter an integer only.");
                        }
                } 
            while (l_command.equals(""));
            do 
                {
                    print("\n\tPlease enter a cell # (1-9 starting and the top left and ending at the bottom right)");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                    try
                        {
                            l_cell[0] = (Integer.parseInt(l_command) - 1) / 3;
                            l_cell[1] = (Integer.parseInt(l_command) - 1) % 3;
                        }
                    catch (NumberFormatException l_error) 
                        {
                            print("\nPlease enter enter an integer only.");
                        }
                } 
            while (l_command.equals(""));
            do 
                {
                    print("\n\tPlease enter a number 1-9");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                    try
                        {
                            l_number = Integer.parseInt(l_command);
                        }
                    catch (NumberFormatException l_error) 
                        {
                            print("\nPlease enter enter an integer only.");
                        }
                } 
            while (l_command.equals("") || l_number<1 || l_number>9);

            game.set_cell(l_block[0], l_block[1], l_cell[0], l_cell[1], l_number);
            game.display_board();
        }
    
 
/**************************
        CONSTANTS:
***************************/
    public final static String[][] menu_items = {
                                                {"C", "set Cell"},        
                                                {"B", "Back to main menu"}, 
                                                {"S", "Save Game"} 
                                                };

}
