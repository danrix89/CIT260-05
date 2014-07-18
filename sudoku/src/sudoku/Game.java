package sudoku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.io.Serializable;

/*
Class Description: Representation of a sudoku game.
*/

public class Game implements java.io.Serializable
{
/**************************
        CONSTRUCTORS:
***************************/
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
                            save_game_to_file(l_player_view.file_name);
                        }
                }
            if (board.is_winner())
                {
                    print("\n\n\n\n\n************** YOU ARE A WINNER! **************");
                }
            
        }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    private String file_name;
    private Board board;
    private Player player;

    
/**************************
         SETTINGS:
***************************/    
    public void set_file_name(String a_file_name) 
        {
            this.file_name = a_file_name;
        }

    public void set_board(Board a_board) 
        {
            this.board = a_board;
        }

    public void set_player(Player a_player) 
        {
            this.player = a_player;
        }

    
/**************************
          BASIC:
***************************/    
    public void save_game_to_file(String a_file_name)
            // Saves Current to file.
        {
            Game l_game = this;
            set_file_name(a_file_name);
            try
                {
                    FileOutputStream l_file_to_save = new FileOutputStream("C:\\Users\\drix\\Documents\\NetBeansProjects\\CIT260-05\\saved_games\\" + a_file_name + ".sudoku_game");
                    ObjectOutputStream l_output_stream = new ObjectOutputStream(l_file_to_save);
                    l_output_stream.writeObject(l_game);
                    l_output_stream.close();
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

//    public void save_game_to_file(String a_file_name)
//            // Saves Current to file.
//        {
//            Game l_game = this;
//            set_file_name(a_file_name);
//            try
//                {
//                    FileOutputStream l_file_to_save = new FileOutputStream("C:\\Users\\drix\\Documents\\NetBeansProjects\\CIT260-05\\saved_games\\" + a_file_name + ".sudoku_game");
//                    ObjectOutputStream l_output_stream = new ObjectOutputStream(l_file_to_save);
//                    l_output_stream.writeObject(l_game);
//                    l_output_stream.close();
//                }
//            catch (FileNotFoundException l_error) 
//                {
//                    print("FileNotFoundException: " + l_error.getMessage());
//                } 
//            catch (IOException l_error) 
//                {
//                    print("Caught IOException: " + l_error.getMessage());
//                }
//        }
    
    
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
