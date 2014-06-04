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
            /* Sorts 'a_board' eliminating all duplicates from rows and columns.
                While iterating over an integer, the row is first checked for
                any duplicates to its left, and then the column is checked for
                any duplicates above it.
            */
        {
            int l_swap;
            int [] l_checkable_row;
            int [] l_checkable_column;
            int l_cell;
            int l_candidate;
            boolean l_contains_duplicates = true;
            for(int i=1; i<a_board.length; i++)
                {
                    for (int j=0; j<a_board[i].length; j++)
                        {
                            l_cell = a_board[i][j];
                            while(l_contains_duplicates) // executes while not done.
                                {
//                                    if (l_checker_row contains l_cell || l_checker_column contains l_cell)
//                                        {
//                                            l_swap = l_cell;
//                                            l_cell = l_candidate;
//                                            l_candidate = l_swap;
//                                            l_contains_duplicates = false;
//                                        }
                                }
                        }
                }
            return a_board;
        }
    
    private int[] checkable_row(int y)
            // Row for checking duplicates to the left of a cell at 'y'.
    {
        int[] l_array = new int[y-1];
        for(int i=0; i<y; i++)
            {
                for(int j=0; j<y; j++)
                    {
                        // Use for building l_row_comparisson in 'sort_soution'
                    }
            }
       return l_array; 
    }
    
    private int[] checkable_column(int x)
            // Column for checking duplicates to the left of a cell at 'x'.
    {
        int[] l_array = new int[x-1];
        for(int i=0; i<x; i++)
            {
                for(int j=0; j<x; j++)
                    {
                        // Use for building l_column_comparisson in 'sort_soution'
                    }
            }
       return l_array; 
    }

    public int[] cast_to_full_primitive_board(int[][] a_primative_board)
            // Casts Current into the primitive version int[][].
        {
            int [] l_full_primitive_board = new int[81];
            int [][] l_primitive_board = new int[9][9];
            int[] l_primitive_block = new int[9];
            int l_block_index = 0;
            int l_block_counter =1;
            int l_cell_index = 0;
            int l_cell_counter = 1;
            
            for (int i=0; i<=l_full_primitive_board.length; i++)
                {
                    while (l_block_counter<4)
                        {
                            while (l_cell_counter<4)
                                {
                                    l_full_primitive_board[i] = l_primitive_block[l_cell_index];
                                    l_cell_counter++;
                                    l_cell_index++;
                                }
                            l_cell_counter = 0;
                            l_block_counter++;
                        }
                    l_block_index++;
                    l_block_counter = 0;
                }
            return l_full_primitive_board; 
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
    int[] full_primitive_board;
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
