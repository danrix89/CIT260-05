package sudoku;

import java.util.ArrayList;

/*
Class Description: Representation of a 3x3 cell block on a sudoku game board.
*/

public class Block extends ArrayList <Cell>
{
    Cell cell;
    
    private void capacity()
            // Capactiy constant of Current.
        {
            this.ensureCapacity(9);
        }
}
