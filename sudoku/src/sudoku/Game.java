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
            // Creates a brand version of Current.
        {
            player = new Player();
            player.set_name(a_name);
            //print("\n\tYour player name has been set to: " + a_name);
            
            board = new Board();
            //new Player_Input_View(this);
            //check_for_winner();
        }
    
    public Game(Game a_loaded_game)
            // Creates a loaded version of Current.
        {
            player = a_loaded_game.player;
            board = a_loaded_game.board;
            board.display();
            new Player_Input_View(this);
            check_for_winner();
        }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    String file_name;
    Board board;
    Player player;

    private void check_for_winner()
            // Checks to see if the board is a winner.
        {
            if(board.is_winner())
                {
                    print(
                            "\n\n\t**************************************" +
                            "\n\n\t************** YOU WON! **************" +
                            "\n\n\t**************************************"
                            );
                }
        }

    
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

    
/**************************
          CONSTANTS:
***************************/    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
