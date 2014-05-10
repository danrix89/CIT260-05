package sudoku;

/*
Class Description: Representation the sudoku game board with 9 columns, 9 rows,
    and 9 square-subsections.
*/

public class Board 
{

    public void display_title()
            // Displays 'board_title'.
        {
            System.out.println(board_title);
        }
    
    String board_title = "Sudoku Board Title Goes Here";
            // Title of Current.
    
    Cell cell;
    
    Cell[] cells;
            // Array of 'cell' on Current
    
    public void set_cell(String a_input, int a_position)
            // Sets 'cell' with 'a_input' using 'a_position'.
        {
            
        }
}
