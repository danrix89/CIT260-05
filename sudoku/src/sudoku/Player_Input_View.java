package sudoku;
import java.util.Scanner;

/*
Class Description: View that gets and handles player input during the game.
*/

public class Player_Input_View extends Menu_View
{
    
    public Player_Input_View() 
            // default constructor
        {
            super(Player_Input_View.menu_items);
            get_player_input();
        }
    
    private Game game;
    
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
                        set_coordinates_and_cell();
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

    public final static String[][] menu_items = {
                                                    {"S", "Set cell"},        
                                                    {"B", "Back to Main Menu"}        
                                                };

    private void set_coordinates_and_cell()
            //
        {
            String l_command;
            Scanner l_input = new Scanner(System.in); 
            int[]l_block = new int[2];
            int[]l_cell = new int[2];
            int l_number = 0;

            do 
                {
                    print("Please enter a block # (0-8 starting and the top left and ending at the bottom right)");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();

                    l_block[0] = (Integer.parseInt(l_command)) / 3;
                    l_block[1] = (Integer.parseInt(l_command)) % 3;
                } 
            while (l_command.equals(""));
            do 
                {
                    print("Please enter a cell # (0-8 starting and the top left and ending at the bottom right)");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();

                    l_cell[0] = (Integer.parseInt(l_command)) / 3;
                    l_cell[1] = (Integer.parseInt(l_command)) % 3;
                } 
            while (l_command.equals(""));
            do 
                {
                    print("Please enter a number 1-9");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                    l_number = Integer.parseInt(l_command);
                } 
            while (l_command.equals("") || l_number<1 || l_number>9);
            
            game.board.set_cell(l_block[0], l_block[1], l_cell[0], l_cell[1], l_number);
            return;            
        }
}
