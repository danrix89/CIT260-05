package sudoku;

import java.util.ArrayList;
import java.util.Random;

/*
Class Description: Representation of a 3x3 block of cells on a sudoku game board.
*/

public class Block extends ArrayList <Integer>
{
    
    public Block populate()
                /* Populates Current (which is a 9 element array representing a 
                    3x3 Cartesian block of cells) with generated unique random integers
                    in the range 1-9.
                */
        {          
            Random l_random = new Random();

            this.add(0, generate_random_integer(l_random));
            for (int i = 1; i <= 8; i++)
                {
                this.add(i, generate_random_integer(l_random));
                for (int j = 0; j < i; j++)
                    {
                    if (this.get(i).intValue() == this.get(j).intValue())
                        {
                        this.set(i, generate_random_integer(l_random));
                        while (this.get(i).intValue() == this.get(j).intValue())
                            {
                            this.set(i, generate_random_integer(l_random));
                            }
                        j = -1;
                        }
                    }
                }
            return this;
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
    
    private void capacity()
            // Capactiy constant of Current.
        {
            this.ensureCapacity(9);
        }
}