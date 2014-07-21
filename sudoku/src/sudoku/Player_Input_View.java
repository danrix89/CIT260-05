package sudoku;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
    boolean save_game;
    String file_name;
    
    
/**************************
        SETTINGS:
***************************/ 
    public void set_file_name(String a_file_name) 
        {
            this.file_name = a_file_name;
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
                    case "C":
                        set_cell_with_coordinates();
                        break;
                    case "B":
                        return;
                    case "S":
                        save_game = true;
                        set_user_specified_file_name();
                        save_game_to_file(file_name);
                        break;
                    default: 
                        new Error_Message().display("Invalid command. Please enter a valid command.");
                        continue;
                    }
                } 
            while (!game.board.is_winner());
        }    
    
    
    private void set_cell_with_coordinates()
            //
        {
            String l_command;
            Scanner l_input = new Scanner(System.in); 
            int[]l_block = new int[2];
            int[]l_cell = new int[2];
            String l_number = "";
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
                            print("\nInvalid input.");
                            set_cell_with_coordinates(); // Restart the function
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
                            print("\nInvalid input.");
                            set_cell_with_coordinates(); // Restart the function
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
                            l_number = l_command;
                        }
                    catch (NumberFormatException l_error) 
                        {
                            print("\nInvalid input.");
                            set_cell_with_coordinates(); // Restart the function
                        }
                } 
            while (l_command.equals("") || Integer.parseInt(l_number)<1 || Integer.parseInt(l_number)>9);
                       
            game.set_cell(l_block[0], l_block[1], l_cell[0], l_cell[1], l_number);
            game.display_board();
        }
    
    private void set_user_specified_file_name()
            //
        {
            String l_command;
            Scanner l_input = new Scanner(System.in);
            
            do 
                {
                    print("\n\tPlease enter a the name you wish to save your game as:");
                    l_command = l_input.nextLine();
                    l_command = l_command.trim().toUpperCase();
                } 
            while (l_command.equals(""));
            set_file_name(l_command);
        }

    public void save_game_to_file(String a_file_name)
            // Saves Current to file.
        {
            Game l_game = game;
                    
            try
                {
                    FileOutputStream l_file_to_save = new FileOutputStream(a_file_name + ".sudoku_game");
                    ObjectOutputStream l_output_stream = new ObjectOutputStream(l_file_to_save);
                    l_output_stream.writeObject(l_game);
                    l_output_stream.close();
                }
            catch (FileNotFoundException l_exception) 
                {
                    print("FileNotFoundException: " + l_exception.getMessage());
                } 
            catch (IOException l_io_exception) 
                {
                    print("Caught IOException: " + l_io_exception.getMessage());
                }
            print("Your file " + a_file_name + ".sudoku_game was saved to file"); 
        }

    public void load_game_from_file(String a_file_name) throws ClassNotFoundException
            // Load a game from file using a_file_name.
        {
            try
                {
                    FileInputStream l_file_to_load = new FileInputStream(a_file_name + ".sudoku_game");
                    ObjectInputStream l_input_stream = new ObjectInputStream(l_file_to_load);
                    
                    Game l_loaded_game = (Game)l_input_stream.readObject();
                }
            catch (FileNotFoundException l_error) 
                {
                    print("FileNotFoundException: " + l_error.getMessage());
                } 
            catch (IOException l_error) 
                {
                    print("Caught IOException: " + l_error.getMessage());
                }
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
