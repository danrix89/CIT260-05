package MODEL;
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
            // Creates a brand new version of Current.
        {
            player = new Player();
            player.set_name(a_name);
            board = new Board();
        }
    
    public Game(Game a_loaded_game)
            // Creates a loaded version of Current.
        {
            set_player(a_loaded_game.player);
            set_board(a_loaded_game.board);
        }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    String file_name;
    public Board board;
    Player player;


/**************************
         SETTINGS:
***************************/
    public boolean is_winner()
            //
        {
            return board.is_winner();
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
