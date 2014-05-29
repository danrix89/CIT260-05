package sudoku;

import java.util.ArrayList;

/*
Class Description: Representation of a sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks.
*/

public class Board extends ArrayList <Block>
{

    Block block;   
    
    private void capacity()
            // Capacity constant of Current.
        {
            this.ensureCapacity(9);
        }
    
    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}
