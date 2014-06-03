package sudoku;

import java.util.ArrayList;
import java.util.Random;

/*
Class Description: Representation of a sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks.
*/

public class Board extends ArrayList <Block>
{

    
// CONSTRUCTORS:   
    public Board()
            // Default constructor of Current.
        {
            this.populate();
            set_primitive_version(this);
            // correct_duplications(this);
            // create_playable_version(this);
            this.display();
        }

    
// BASIC METHODS:
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
    
    public int[][] cast_to_primitive_version(Board a_board)
            // Casts Current into the primitive version int[][].
        {
            int [][] l_primitive_board = new int[block.size()][this.size()];
            for (int i=0; i<l_primitive_board.length; i++)
                {
                    int[] l_primitive_block = new int[block.size()];
                    for (int j=0; j<l_primitive_block.length; j++)
                        {
                            l_primitive_block[j] = a_board.block.get(j).intValue();
                        }
                }
            return l_primitive_board; 
        }
    
    public int[][] sort_solution(int[][] a_board)
            // Sorts 'a_board' eliminating all duplicates from rows and columns.
        {
            int l_swap;
            int l_cell;
            boolean l_done = false;
            for(int i=1; i<a_board.length; i++)
                {
                    for (int j=0; j<a_board[i].length; j++)
                        {
                            l_cell = a_board[i][j];
                            while(!l_done) // Do this while you're not done.
                                {
                                    l_done = true; // assumes that your done
//                                    if (l_cell == a_board[i][j-1]) 
//                                        {
//                                            l_swap = a_board[i][j];
//                                            a_board[i] = a_board[i+1];
//                                            a_board[i+1][j] = l_swap;
//                                            l_done = false;
//                                        }
                                }
                        }
                }
            return a_board;
        }

    public void display()
            // Displays the 'playable_version' of Current.
        {            
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
    
    

// ATTRIBUTES:   
    int[][] primitive_version;
    Block block;
    

    
// SETTINGS:    
    private void set_primitive_version(Board a_board)
            // Sels 'primitive_version' with the post cast version of 'a_board'.
        {
            int[][] l_primitive_version = cast_to_primitive_version(a_board);
            primitive_version = l_primitive_version;
        }   

    
    
// CONSTANTS:    
    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}
