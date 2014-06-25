package sudoku;

import java.util.ArrayList;
import java.util.Random;

/*
Class Description: Representation of a 3x3 block of cells on a sudoku game board.
*/

public class Block extends ArrayList <Integer>
{
    
    Block()
            // Default constructor.
        {
            //populate_with_prefilled_cells(3);
        }
    
    public Block populate()
            /* 
            Populates an entire block with generated unique random integers
            in the range 1-9 (no duplicates).
            */
        {
            this.add(0, generate_random_integer());
            for (int i = 1; i <= 8; i++)
                {
                this.add(i, generate_random_integer());
                for (int j = 0; j < i; j++)
                    {
                    if (this.get(i) == this.get(j))
                        {
                        this.set(i, generate_random_integer());
                        while (this.get(i) == this.get(j))
                            {
                            this.set(i, generate_random_integer());
                            }
                        j = -1;
                        }
                    }
                }
            return this;
        }
    
    public Block populate_with_prefilled_cells(int a_prefilled_amount)
            /* 
            Populates a block with unique random numbers between 1 - 9
            based on a_prefilled_amount (no duplicates).
            */
        {
            Integer l_index = generate_random_integer();
            Integer l_previous_index = l_index;
            
            for(int i=1; i<=a_prefilled_amount; i++)
                {
                    if (l_index == l_previous_index && i != 1)
                        {
                            while (l_index == l_previous_index)
                                {
                                    l_index = generate_random_integer();
                                }
                        }
                    else
                        {
                            this.set(l_index, generate_random_integer());
                        }
                    l_previous_index = l_index;
                    l_index = generate_random_integer();
                }

            return this;
        }
    
    private static Integer generate_random_integer()
        {
          Random l_random = new Random();
          // calculate the range, casting int --> long
          int l_start = 1;
          int l_end = 9;
          long l_range = (long)l_end - (long)l_start + 1;
          // calculate a percentage of the range, where 0 <= frac < range
          long l_fraction = (long)(l_range * l_random.nextDouble());
          int l_result =  (int)(l_fraction + l_start);
          // return generated random number in a range of l_start to l_end
          return l_result;
        }
    
    private void capacity()
            // Capactiy constant of Current.
        {
            this.ensureCapacity(9);
        }
}
