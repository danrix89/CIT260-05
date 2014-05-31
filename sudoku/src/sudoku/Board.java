package sudoku;

import java.util.ArrayList;
import java.util.Random;

/*
Class Description: Representation of a sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks.
*/

public class Board extends ArrayList <Block>
{

    public Board()
            //
        {
            this.populate();
            this.display();
        }

    public Board populate()
                /* Populates Current (which is a 9 element array representing a 
                    3x3 Cartesian board of blocks) with generated unique random 
                    blocks.
                */
        {          
            for (int i=0; i<=8; i++)
                {
                block = new Block();
                this.add(i, block.populate());
                }
            return this;
        }    
    
    public void display()
            //
        {
            Block l_block = new Block();
            
            for(int i=0; i<=8; i=i+3)
                {
                    print("\nBlock # " + (i+1) + "\t\t     Block # " + (i+2) + "\t\t     Block # " + (i+3) + "\n\t\t");
                    Block l_block_1 = this.get(i);
                    Block l_block_2 = this.get(i + 1);
                    Block l_block_3 = this.get(i + 2);
                    
                    for (int j=0; j<=8; j=j+3)
                        {
                            Integer l_cell_1 = l_block_1.get(j);
                            Integer l_cell_2 = l_block_1.get(j + 1);
                            Integer l_cell_3 = l_block_1.get(j + 2);
                            Integer l_cell_4 = l_block_2.get(j);
                            Integer l_cell_5 = l_block_2.get(j + 1);
                            Integer l_cell_6 = l_block_2.get(j + 2);
                            Integer l_cell_7 = l_block_3.get(j);
                            Integer l_cell_8 = l_block_3.get(j + 1);
                            Integer l_cell_9 = l_block_3.get(j + 2);

                            print(
                                  l_cell_1.toString() + "\t" + l_cell_2.toString() + "\t" + l_cell_3.toString() + "\t" 
                                + l_cell_4.toString() + "\t" + l_cell_5.toString() + "\t" + l_cell_6.toString() + "\t"
                                + l_cell_7.toString() + "\t" + l_cell_8.toString() + "\t" + l_cell_9.toString() + "\t"
                                 );
                            
                        }
                }
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
