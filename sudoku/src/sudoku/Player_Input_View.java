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
                    case "S":
                        set_cell_with_coordinates();
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
                    do 
                        {
                            print("\n\tPlease enter a block # (1-9 starting and the top left and ending at the bottom right)");
//                            try
//                                {
                                    l_command = l_input.nextLine();
                                    l_command = l_command.trim().toUpperCase();

                                    l_block[0] = (Integer.parseInt(l_command) - 1) / 3;
                                    l_block[1] = (Integer.parseInt(l_command) - 1) % 3;
//                                }
//                            catch
//                                {
//                                    
//                                }
                        } 
                    while (l_command.equals(""));
                    do 
                        {
                            print("\n\tPlease enter a cell # (1-9 starting and the top left and ending at the bottom right)");
                            l_command = l_input.nextLine();
                            l_command = l_command.trim().toUpperCase();

                            l_cell[0] = (Integer.parseInt(l_command) - 1) / 3;
                            l_cell[1] = (Integer.parseInt(l_command) - 1) % 3;
                        } 
                    while (l_command.equals(""));
                    do 
                        {
                            print("\n\tPlease enter a number 1-9");
                            l_command = l_input.nextLine();
                            l_command = l_command.trim().toUpperCase();
                            l_number = Integer.parseInt(l_command);
                        } 
                    while (l_command.equals("") || l_number<1 || l_number>9);

                    game.board.set_cell(l_block[0], l_block[1], l_cell[0], l_cell[1], l_number);
                    game.board.display();
                }
            while (!(game.board.is_winner()));
        }
    
 
/**************************
        CONSTANTS:
***************************/
    public final static String[][] menu_items = {
                                                {"S", "Set cell"},        
                                                {"B", "Back to Main Menu"}        
                                                };

}
