package sudoku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;

/*
Class Description: Representation of a sudoku game.
*/

public class Game implements java.io.Serializable
{
    public Game(String a_name)
            // Default constructor of Current.
        {
            player = new Player();
            player.set_name(a_name);
            print("\n\tYour player name has been set to: " + a_name);
            
            board = new Board();
            Player_Input_View l_player_view = new Player_Input_View(this);
            
            while (!(board.is_winner()) && !(l_player_view.return_to_menu))
                {
                    l_player_view.get_player_input();
                    if (l_player_view.save_game)
                        {
                            save_game_to_file();
                        }
                }
            
        }
    
    private String file_name;
    private Board board;
    private Player player;

    public void save_game_to_file()
        {
            Game l_game = this;
            file_name="game";
            try
                {
                    FileOutputStream fileOut = new FileOutputStream("foo.file");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(l_game);
                }
            catch (FileNotFoundException l_error) 
                {
                    System.err.println("FileNotFoundException: " + l_error.getMessage());
                } 
            catch (IOException l_error) 
                {
                    System.err.println("Caught IOException: " + l_error.getMessage());
                }
        }

    public void set_cell (int Y, int X, int y, int x, int a_number)
            // Makes a call to set_cell.
        {
            board.set_cell(Y, X, y, x, a_number);
        }
    
    public void display_board()
            // Makes a call to display the board.
        {
            board.display();
        }
    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
