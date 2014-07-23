package sudoku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static sudoku.Menu_View.print;

/*
Class Description: Representation of the sudoku Main Menu Controls.
*/

public class Main_Menu_Control 
{
    
    public Main_Menu_Control()
            // Constructor for Current.
        {
        }
    
    public void new_game()
            // Starts a new game of Sudoku.
        {
            //Game_View l_game = new Game_View();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Game_JFrame().setVisible(true);
                }
            });

        }
    
    public Game_View load_game_from_file(String a_file_name) throws ClassNotFoundException
            // Load a game from file using a_file_name.
        {
            try
                {
                    FileInputStream l_file_to_load = new FileInputStream(a_file_name + ".sudoku_game");
                    ObjectInputStream l_input_stream = new ObjectInputStream(l_file_to_load);
                    
                    Game l_loaded_game = (Game)l_input_stream.readObject();
                    return new Game_View(l_loaded_game);
                }
            catch (FileNotFoundException l_error) 
                {
                    print("FileNotFoundException: " + l_error.getMessage());
                } 
            catch (IOException l_error) 
                {
                    print("Caught IOException: " + l_error.getMessage());
                }
            return null;
        }
    
    public void display_help_menu()
            // Displays the Help_Menu.
        {
            new Help_Menu_View();
        }
    
    public void display_difficulty_menu()
            // Displays the Difficulty_Menu.
        {
            Difficulty_Menu_View l_difficulty_menu = new Difficulty_Menu_View();
            
        }
    
}
