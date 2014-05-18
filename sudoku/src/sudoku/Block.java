/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
