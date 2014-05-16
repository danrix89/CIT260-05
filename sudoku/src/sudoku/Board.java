package sudoku;

import java.util.Random;

/*
Class Description: Representation the sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks.
*/

public class Board 
{

    public int[] populate_block() 
                /* Populates a 9 element array representing a 3x3 Cartesian 
                    block with generated unique random integers in the range 
                    1-9. Temporarily prints to the console to prove it works.
                */
        {          
            int[] l_block = new int[9];
            Random l_random = new Random();

            l_block[0] = generate_random_integer(l_random);
            log("Generated: " + l_block[0]);
            for (int i = 1; i <= 8; i++)
                {
                l_block[i] = generate_random_integer(l_random);
                for (int j = 0; j < i; j++)
                    {
                    if (l_block[i] == l_block[j])
                        {
                        while (l_block[i] == l_block[j])
                            {
                            l_block[i] = generate_random_integer(l_random);
                            j = 0;
                            }
                        }
                    }
                log("Generated: " + l_block[i]);
                }
            return l_block;
        }
  
    private static int generate_random_integer(Random a_random)
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
  
    private static void log(String a_message)
        {
            System.out.println(a_message);
        }

}
