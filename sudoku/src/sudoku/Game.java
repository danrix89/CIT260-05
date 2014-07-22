package sudoku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DateFormat;

/*
Class Description: Representation of a sudoku game.
*/

public class Game implements java.io.Serializable
{
/**************************
        CONSTRUCTORS:
***************************/
    public Game(String a_name)
            // Creates a brand new version of Current.
        {
            player = new Player();
            player.set_name(a_name);
            board = new Board();
        }
    
    public Game(Game a_loaded_game)
            // Creates a loaded version of Current.
        {
            player = a_loaded_game.player;
            board = a_loaded_game.board;
            board.display();
        }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    String file_name;
    Board board;
    Player player;

    
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
      BASIC METHODS:
***************************/    
    public void set_cell (int Y, int X, int y, int x, String a_number)
            // Makes a call to set_cell.
        {
            board.set_cell(Y, X, y, x, a_number);
        }

    
/**************************
          CONSTANTS:
***************************/    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
