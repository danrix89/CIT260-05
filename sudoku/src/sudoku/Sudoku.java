package sudoku;

/*
Class Description: Representation of the Sudoku Game Application.
*/

public class Sudoku 
{

    public static void main(String[] args)
            // Initializes application.
        {
            //Board l_board = new Board();
            Help_Menu l_help_menu = new Help_Menu();
            
            //l_board.populate_block();
            l_help_menu.display();
            l_help_menu.get_player_input();
        }   
    
}
