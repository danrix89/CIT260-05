package sudoku;

import java.util.ArrayList;
import java.util.Random;

/*
Class Description: Representation of a sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks.
*/

public class Board extends ArrayList <Block>
{

    public Block populate_block() 
                /* Populates a 9 element array representing a 3x3 Cartesian 
                    block with generated unique random integers in the range 
                    1-9. Temporarily prints to the console to prove it works.
                */
        {          
            Block l_block = new Block();
            Random l_random = new Random();

            l_block.cell.set(0, generate_random_integer(l_random));
            for (int i = 1; i <= 8; i++)
                {
                l_block.cell.set(i, generate_random_integer(l_random));
                for (int j = 0; j < i; j++)
                    {
                    if (l_block.cell.get(i) == l_block.cell.get(j))
                        {
                        l_block.cell.set(i, generate_random_integer(l_random));
                        j = 0;
                        }
                    }
                }
            return l_block;
        }
  
    private static Integer generate_random_integer(Random a_random)
        {
          // calculate the range, casting int --> long
          int l_start = 1;
          int l_end = 9;
          long l_range = (long)l_end - (long)l_start + 1;
          // calculate a percentage of the range, where 0 <= frac < range
          long l_fraction = (long)(l_range * a_random.nextDouble());
          int l_random_number =  (int)(l_fraction + l_start);
          // return generated random number in a range of l_start to l_end
          return l_random_number;
        }

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
