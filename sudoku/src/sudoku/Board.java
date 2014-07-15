package sudoku;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
Class Description: Representation of a sudoku game board with 9 columns, 9 rows,
                    and 9 3x3 blocks. The board is laid out as a 4 dimensional
                    board (see below explantation).
                
    * The upper-case  Y  or  Y_index  is to represent the Y axis on the entire board. 
    * The upper-case  X  or  X_index  is to represent the X axis on the entire board.
    * The lower-case  y  or  y_index  is to represent the y axis on a block.
    * The lower-case  x  or  x_index  is to represent the x axis on a block.
            
The first two set of coordinates give the coordinates of the block. The last two coordinates 
give the coordinates of the cell. The entire board coordinates look like this: 

    [Y][X][y][x]   OR   [Y_index][X_index][y_index][x_index]

                                                X axis
                                 0                 1                 2 
                        _______________________________________________________
                        |                 |                 |                 |
                                 x
                        ___0_____1_____2___
               _      _ |_____|_____|_____|____________________________________
              |      |  |     |     |     |     |     |     |     |     |     |
              |     0|  |     |     |     |     |     |     |     |     |     |
              |      |_ |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |      |  |     |     |     |     |     |     |     |     |     |
           0  |  y  1|  |     |     |  A  |     |     |     |     |     |     |
              |      |_ |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |      |  |     |     |     |     |     |     |     |     |     |
              |     2|  |     |     |     |     |     |     |     |     |     |
              |_     |_ |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
              |         |     |     |     |     |     |     |  $  |  $  |  $  |
              |         |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
Y axis    1   |         |     |     |     |     |     |     |  $  |  $  |  $  |
              |         |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
              |         |     |     |     |     |     |     |  $  |  $  |  $  |
              |_        |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
              |         |     |     |     |     |     |     |     |     |     |
              |         |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
           2  |         |     |     |     |     |     |     |     |     |     |
              |         |_____|_____|_____|_____|_____|_____|_____|_____|_____|
              |         |     |     |     |     |     |     |     |     |     |
              |         |     |     |     |  Z  |     |     |     |     |     |
              |_        |_____|_____|_____|_____|_____|_____|_____|_____|_____|


        The A symbol represents the cell at [0][0][1][2]
        The Z symbol represents the cell at [2][1][2][0]
        The $ symbol represents the block at [2][1]
*/

public class Board
{   
/**************************
        CONSTRUCTORS:
***************************/
    public Board()
            // Default constructor of Current.
            // This method is called whenever a new Board instance is created.
        {
            set_four_dimensional_board(pre_filled_solution());
            set_four_dimensional_playable(pre_filled_playable());
            this.display();
        }
    

/**************************
    INSTANCE VARIABLES:
***************************/
    private int[][][][] four_dimensional_solution;
            // Four dimensional version of the solution Board.
    
    private int[][][][] four_dimensional_playable;
            // Four dimensional version of the playable Board.
    
    public int difficulty = 5;
    
/**************************
         SETTINGS:
***************************/
    public void set_four_dimensional_board(int[][][][] a_board)
        {
            assert a_board.length==3 : "require_3_element_four_dimensional_board";
            four_dimensional_solution = a_board;
        }    

    public void set_four_dimensional_playable(int[][][][] a_board)
        {
            assert a_board.length==3 : "require_3_element_four_dimensional_board";
            four_dimensional_playable = a_board;
        }    
    

/**************************
          BASIC:
***************************/
    public void display()
            // Displays the board.
                {            
            for(int Y=0; Y<=2; Y++)
                {
                    print ("\n_____________________________________");
                    for(int y=0; y<=2; y++)
                        {
                            print ("\n|           |           |           |\n");
                            for(int X=0; X<=2; X++)
                                {
                                    for(int x=0; x<=2; x++)
                                        {
                                            if (x==0)
                                                {
                                                    print("|");
                                                }
                                            else
                                                {
                                                    print(" "); 
                                                }
                                            print (" " + four_dimensional_playable[Y][X][y][x] + " ");
                                            if (X==2 && x==2)
                                                {
                                                    print("|");
                                                }
                                        }
                                }
                        }
                }
            print ("\n_____________________________________");
            print("\n");
        }
    
    public void set_cell(int Y, int X, int y, int x, int a_number)
            //
        {
            int[][][][] l_board = four_dimensional_playable;
            int l_number = a_number;
            l_board[Y][X][y][x] = l_number;
            four_dimensional_playable = l_board;
        }

    private int[][][][] make_four_dimensional_playable()
            // Makes four dimensional version of the playable Board.
        {
            int[][][][] l_result = four_dimensional_solution;
            
            for(int Y=0; Y<=2; Y++) // Going across the 'Y' coordinate of the Board
                {
                    for(int X=0; X<=2; X++) // Going across the 'X' coordinate of the Board
                        {
                            ArrayList<ArrayList> l_already_used_coordinates = new ArrayList<>();
                            for (int i=1; i<=difficulty; i++)
                                {
                                    int x = (random_integer() - 1) / 3;
                                    int y = (random_integer() - 1) / 3;
                                    ArrayList<Integer> l_coordinates = new ArrayList<>(2);
                                    l_coordinates.add(0);
                                    l_coordinates.add(0);
                                    
                                    l_already_used_coordinates.add(l_coordinates);
                                    
                                    for (ArrayList ic_coordinates : l_already_used_coordinates)
                                        {
                                            if (ic_coordinates.contains(x) && ic_coordinates.contains(y))
                                                {
                                                    while (ic_coordinates.contains(x) && ic_coordinates.contains(y))
                                                        {
                                                            x = (random_integer() - 1) / 3;
                                                            y = (random_integer() - 1) / 3;
                                                            ic_coordinates.set(0, x);
                                                            ic_coordinates.set(1, y);
                                                        }
                                                    l_result[Y][X][x][y] = 0;
                                                }
                                            else
                                                {
                                                    ic_coordinates.set(0, x);
                                                    ic_coordinates.set(1, y);
                                                    l_result[Y][X][x][y] = 0;
                                                }
                                        }
                                }
                        }
                }
            return l_result;
        }
    

/**************************
       STATUS REPORT:
***************************/  
    public boolean is_winner()
            // Is four_dimensional_playable a winning board?
        {
            boolean l_result = false;
            
            for (int Y=0; Y<=2; Y++)
                {
                    for (int X=0; X<=2; X++)
                        {
                            for (int y=0; y<=2; y++)
                                {
                                    for (int x=0; x<=2; x++)
                                        {
                                            if (four_dimensional_playable[Y][X][y][x] == four_dimensional_solution[Y][X][y][x])
                                                {
                                                    l_result = true;
                                                }
                                            else
                                                {
                                                    Y = 3;
                                                    X = 3;
                                                    y = 3;
                                                    x = 3;
                                                    l_result = false;
                                                }
                                        }
                                }
                        }
                }
            return l_result;
        }   
    
    
/**************************
        CONSTANTS:
***************************/    
    private static void print(String a_message)
        {
            System.out.print(a_message);
        }

    private static Integer random_integer()
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
          
          assert l_result>=1 : "ensure_result_gte_1";
          assert l_result<=9 : "ensure_result_lte_9";
          
          return l_result;
        }    

    private int[][][][] pre_filled_solution()
            // This is a statically set pre-filled solution board.
        {
            int[][][][] l_board = new int [3][3][3][3];
            //Block #1
            l_board [0][0][0][0] = 2;
            l_board [0][0][0][1] = 9;
            l_board [0][0][0][2] = 6;
            l_board [0][0][1][0] = 5;
            l_board [0][0][1][1] = 8;
            l_board [0][0][1][2] = 4;
            l_board [0][0][2][0] = 7;
            l_board [0][0][2][1] = 1;
            l_board [0][0][2][2] = 3;
            //Block #2
            l_board [0][1][0][0] = 3;
            l_board [0][1][0][1] = 1;
            l_board [0][1][0][2] = 8;
            l_board [0][1][1][0] = 9;
            l_board [0][1][1][1] = 7;
            l_board [0][1][1][2] = 2;
            l_board [0][1][2][0] = 6;
            l_board [0][1][2][1] = 4;
            l_board [0][1][2][2] = 5;
            //Block #3
            l_board [0][2][0][0] = 5;
            l_board [0][2][0][1] = 7;
            l_board [0][2][0][2] = 4;
            l_board [0][2][1][0] = 6;
            l_board [0][2][1][1] = 1;
            l_board [0][2][1][2] = 3;
            l_board [0][2][2][0] = 2;
            l_board [0][2][2][1] = 8;
            l_board [0][2][2][2] = 9;
            //Block #4
            l_board [1][0][0][0] = 6;
            l_board [1][0][0][1] = 2;
            l_board [1][0][0][2] = 5;
            l_board [1][0][1][0] = 9;
            l_board [1][0][1][1] = 3;
            l_board [1][0][1][2] = 1;
            l_board [1][0][2][0] = 4;
            l_board [1][0][2][1] = 7;
            l_board [1][0][2][2] = 8;
            //Block #5
            l_board [1][1][0][0] = 8;
            l_board [1][1][0][1] = 9;
            l_board [1][1][0][2] = 7;
            l_board [1][1][1][0] = 4;
            l_board [1][1][1][1] = 2;
            l_board [1][1][1][2] = 6;
            l_board [1][1][2][0] = 5;
            l_board [1][1][2][1] = 3;
            l_board [1][1][2][2] = 1;
            //Block #6
            l_board [1][2][0][0] = 3;
            l_board [1][2][0][1] = 4;
            l_board [1][2][0][2] = 1;
            l_board [1][2][1][0] = 8;
            l_board [1][2][1][1] = 5;
            l_board [1][2][1][2] = 7;
            l_board [1][2][2][0] = 9;
            l_board [1][2][2][1] = 2;
            l_board [1][2][2][2] = 6;
            //Block #7
            l_board [2][0][0][0] = 1;
            l_board [2][0][0][1] = 6;
            l_board [2][0][0][2] = 7;
            l_board [2][0][1][0] = 8;
            l_board [2][0][1][1] = 5;
            l_board [2][0][1][2] = 9;
            l_board [2][0][2][0] = 3;
            l_board [2][0][2][1] = 4;
            l_board [2][0][2][2] = 2;
            //Block #8
            l_board [2][1][0][0] = 2;
            l_board [2][1][0][1] = 5;
            l_board [2][1][0][2] = 3;
            l_board [2][1][1][0] = 7;
            l_board [2][1][1][1] = 6;
            l_board [2][1][1][2] = 4;
            l_board [2][1][2][0] = 1;
            l_board [2][1][2][1] = 8;
            l_board [2][1][2][2] = 9;
            //Block #9
            l_board [2][2][0][0] = 4;
            l_board [2][2][0][1] = 9;
            l_board [2][2][0][2] = 8;
            l_board [2][2][1][0] = 1;
            l_board [2][2][1][1] = 3;
            l_board [2][2][1][2] = 2;
            l_board [2][2][2][0] = 7;
            l_board [2][2][2][1] = 6;
            l_board [2][2][2][2] = 5;

            return l_board;
        }

    private int[][][][] pre_filled_playable()
            // This is a statically set pre-filled playable board.
        {
            int[][][][] l_board = new int [3][3][3][3];
            //Block #1
            l_board [0][0][0][0] = 2;
            l_board [0][0][0][1] = 0;
            l_board [0][0][0][2] = 6;
            l_board [0][0][1][0] = 0;
            l_board [0][0][1][1] = 0;
            l_board [0][0][1][2] = 0;
            l_board [0][0][2][0] = 7;
            l_board [0][0][2][1] = 1;
            l_board [0][0][2][2] = 0;
            //Block #2
            l_board [0][1][0][0] = 0;
            l_board [0][1][0][1] = 1;
            l_board [0][1][0][2] = 8;
            l_board [0][1][1][0] = 0;
            l_board [0][1][1][1] = 0;
            l_board [0][1][1][2] = 0;
            l_board [0][1][2][0] = 6;
            l_board [0][1][2][1] = 0;
            l_board [0][1][2][2] = 5;
            //Block #3
            l_board [0][2][0][0] = 5;
            l_board [0][2][0][1] = 0;
            l_board [0][2][0][2] = 4;
            l_board [0][2][1][0] = 6;
            l_board [0][2][1][1] = 1;
            l_board [0][2][1][2] = 0;
            l_board [0][2][2][0] = 0;
            l_board [0][2][2][1] = 0;
            l_board [0][2][2][2] = 0;
            //Block #4
            l_board [1][0][0][0] = 6;
            l_board [1][0][0][1] = 0;
            l_board [1][0][0][2] = 5;
            l_board [1][0][1][0] = 9;
            l_board [1][0][1][1] = 0;
            l_board [1][0][1][2] = 0;
            l_board [1][0][2][0] = 0;
            l_board [1][0][2][1] = 7;
            l_board [1][0][2][2] = 0;
            //Block #5
            l_board [1][1][0][0] = 0;
            l_board [1][1][0][1] = 9;
            l_board [1][1][0][2] = 7;
            l_board [1][1][1][0] = 0;
            l_board [1][1][1][1] = 0;
            l_board [1][1][1][2] = 0;
            l_board [1][1][2][0] = 5;
            l_board [1][1][2][1] = 0;
            l_board [1][1][2][2] = 1;
            //Block #6
            l_board [1][2][0][0] = 3;
            l_board [1][2][0][1] = 0;
            l_board [1][2][0][2] = 0;
            l_board [1][2][1][0] = 0;
            l_board [1][2][1][1] = 5;
            l_board [1][2][1][2] = 0;
            l_board [1][2][2][0] = 9;
            l_board [1][2][2][1] = 0;
            l_board [1][2][2][2] = 6;
            //Block #7
            l_board [2][0][0][0] = 1;
            l_board [2][0][0][1] = 0;
            l_board [2][0][0][2] = 0;
            l_board [2][0][1][0] = 0;
            l_board [2][0][1][1] = 5;
            l_board [2][0][1][2] = 0;
            l_board [2][0][2][0] = 0;
            l_board [2][0][2][1] = 4;
            l_board [2][0][2][2] = 2;
            //Block #8
            l_board [2][1][0][0] = 2;
            l_board [2][1][0][1] = 0;
            l_board [2][1][0][2] = 3;
            l_board [2][1][1][0] = 0;
            l_board [2][1][1][1] = 0;
            l_board [2][1][1][2] = 0;
            l_board [2][1][2][0] = 0;
            l_board [2][1][2][1] = 8;
            l_board [2][1][2][2] = 9;
            //Block #9
            l_board [2][2][0][0] = 0;
            l_board [2][2][0][1] = 0;
            l_board [2][2][0][2] = 8;
            l_board [2][2][1][0] = 0;
            l_board [2][2][1][1] = 3;
            l_board [2][2][1][2] = 0;
            l_board [2][2][2][0] = 7;
            l_board [2][2][2][1] = 0;
            l_board [2][2][2][2] = 5;

            return l_board;
        }
    
    
    
    
    
/****************************************************************** 
*******************  JUNK FUNCTIONS & METHODS:  *******************
*******************************************************************/


//    public void display_board()
//            // Displays the board.
//            // This method will be re-written later when the sorting method is working.
//        {            
//            for(int i=0; i<=8; i=i+3)
//                {
//                    print("\nBlock # " + (i+1) + "\t\t     Block # " + (i+2) + "\t\t     Block # " + (i+3) + "\n\t\t");
//                    Block l_block_1 = this.get(i);
//                    Block l_block_2 = this.get(i + 1);
//                    Block l_block_3 = this.get(i + 2);
//                    
//                    for (int j=0; j<=8; j=j+3)
//                        {
//                            Integer l_cell_1 = l_block_1.get(j);
//                            Integer l_cell_2 = l_block_1.get(j + 1);
//                            Integer l_cell_3 = l_block_1.get(j + 2);
//                            Integer l_cell_4 = l_block_2.get(j);
//                            Integer l_cell_5 = l_block_2.get(j + 1);
//                            Integer l_cell_6 = l_block_2.get(j + 2);
//                            Integer l_cell_7 = l_block_3.get(j);
//                            Integer l_cell_8 = l_block_3.get(j + 1);
//                            Integer l_cell_9 = l_block_3.get(j + 2);
//
//                            print(
//                                  l_cell_1.toString() + "\t" + l_cell_2.toString() + "\t" + l_cell_3.toString() + "\t" 
//                                + l_cell_4.toString() + "\t" + l_cell_5.toString() + "\t" + l_cell_6.toString() + "\t"
//                                + l_cell_7.toString() + "\t" + l_cell_8.toString() + "\t" + l_cell_9.toString() + "\t"
//                                 );
//                        }
//                }
//        }
//
//    
//    private int[][] cast_to_primitive_version(Board a_board)
//            // Casts the 'Board' into int[][].
//        {
//            int [][] l_primitive_board = new int[9][9];
//            ArrayList <Integer> l_block = new ArrayList <>();
//            
//            for (int i=0; i<9; i++)
//                {
//                    int[] l_primitive_block = new int[9];
//                    l_block = a_board.get(i);
//                    for (int j=0; j<9; j++)
//                        {
//                            l_primitive_block[j] = l_block.get(j);
//                        }
//                    l_primitive_board[i] = l_primitive_block;
//                }
//            return l_primitive_board;
//        }
//    
//    private int[][][][] cast_to_four_dimensional_board(int[][] a_primative_board)
//            // Casts int[][] into a for dimensional board int[][][][] (3x3x3x3).
//        {
//            int[][][][] l_four_dimensional_board = new int[3][3][3][3];
//            
//            for (int i=0; i<=2; i++)
//                { 
//                    for (int j=0; j<=2; j++)
//                        {
//                            switch (i)
//                                {
//                                    case 0: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j]);
//
//                                    case 1: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j+3]);
//
//                                    case 2: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j+6]);
//                                }                            
//                        }
//                }
//            return l_four_dimensional_board;
//        }    
//
//    private int[][] cast_to_two_dimensional_block (int[] a_block)
//            //
//        {
//            int[][] l_block = new int[3][3];
//            for (int i=0; i<=8; i++)
//                {
//                    switch(i)
//                        {
//                            case 0: l_block[0][0] = a_block[i];
//                        
//                            case 1: l_block[0][1] = a_block[i];
//                        
//                            case 2: l_block[0][2] = a_block[i];
//                        
//                            case 3: l_block[1][0] = a_block[i];
//                        
//                            case 4: l_block[1][1] = a_block[i];
//                        
//                            case 5: l_block[1][2] = a_block[i];
//                        
//                            case 6: l_block[2][0] = a_block[i];
//                        
//                            case 7: l_block[2][1] = a_block[i];
//                       
//                            case 8: l_block[2][2] = a_block[i];
//                        }
//                }
//            return l_block;
//        }    
//
//    private void set_primitive_version(Board a_board)
//            // Sets 'primitive_version' with the post cast version of 'a_board'.
//        {
//            int[][] l_board = cast_to_primitive_version(a_board);
//            primitive_version = l_board;
//        }   
//
//    private void set_four_dimensional_primitive_board(int[][] a_primitive_board)
//            // Sets 'four_dimensional_primitive_board' with the post cast version of 'a_primitive_board'.
//                {
//            int[][][][] l_board = cast_to_four_dimensional_board(a_primitive_board);
//            four_dimensional_solution = l_board;
//        } 
//    
//    private int[][]primitive_version;
//        // Primitive version of the Board.
//
//
//    private Block block;
//    
//    public void populate_board()
//            // Populates the board with generated unique random blocks.
//        {          
//            for (int i=0; i<=8; i++) // Loops across each block in the board.
//                {
//                block = new Block();
//                this.add(i, block.populate()); // Each time it creates a new block to place inside the board.
//                }
//        }
//
//    private void sort_solution(int[][][][] a_board)
//            /* Sorts 'a_board' eliminating all duplicates from rows and columns.
//                While iterating over an integer, the row is first checked for
//                any duplicates to its left, and then the column is checked for
//                any duplicates above it.
//            */
//        {
//            for(int Y=0; Y<=2; Y++) // Going across the 'Y' coordinate of the Board
//                {
//                    for(int X=0; X<=2; X++) // Going across the 'X' coordinate of the Board
//                        {
//                            for(int y=0; y<=2; y++) // Going across the 'y' coordinate of the Board
//                                {
//                                    for(int x=0; x<=2; x++) // Going across the 'x' coordinate of the Board
//                                        {
//                                            if(Y==0 && X==0) // This is the first block, which can be skipped
//                                                {
//                                                    // Skip over the first block (it does not need to be checked)
//                                                }
//                                            else if (y==2 && x==2) // If the iterator is on the last cell of a block...
//                                                {
//                                                    // ...check if there are any row duplicates...
//                                                    int[] l_row = row_for_checking(a_board, Y, X, y, x);
//                                                    boolean l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
//                                                    // ...check if there are any column duplicates...
//                                                    int[] l_column = column_for_checking(a_board, Y, X, y, x);
//                                                    boolean l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
//                                                    // ...If there are any duplicates...
//                                                    if (l_has_row_duplicates==true || l_has_column_duplicates==true)
//                                                        {
//                                                            // ...re-generate the current block...
//                                                            a_board[Y][X] = new_generated_block();
//                                                            // ...reset the the iterators for the cells and block so it will re-check that block
//                                                            x=3;
//                                                            y=3;
//                                                            X--;
//                                                        }
//                                                }
//                                            else
//                                                {
//                                                    int[] l_row;
//                                                    int[] l_column;
//                                                    boolean l_has_duplicates = true;
//                                                    boolean l_has_row_duplicates = true;
//                                                    boolean l_has_column_duplicates = true;
//                                                    boolean l_recheck_current_block = false;
//                                                    
//                                                    while(l_has_duplicates)
//                                                        {
//                                                            /*********************************
//                                                               CHECKING ROWS FOR DUPLICATES
//                                                            **********************************/
//                                                                if (X==0 && x==0) // This means there are no cells to the left of the current cell...
//                                                                    {
//                                                                        l_has_row_duplicates = false; //...since there is nothing to the left, there can't be duplicates
//                                                                    }
//                                                                else
//                                                                    {
//                                                                        l_row = row_for_checking(a_board, Y, X, y, x);
//                                                                        l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
//                                                                        int i = 0;
//                                                                        while(l_has_row_duplicates)
//                                                                            {
//                                                                                int[] l_candidates = candidates_for_swapping(a_board, Y, X, y, x);
//                                                                                int l_swap;
//                                                                                // Swap the current cell with the candidate value...
//                                                                                l_swap = a_board[Y][X][y][x];
//                                                                                a_board[Y][X][y][x] = l_candidates[i];
//                                                                                l_candidates[i] = l_swap;
//                                                                                // ...after swapping check for row duplicates
//                                                                                l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
//                                                                                // If there are still duplicates after swapping...
//                                                                                if (l_has_row_duplicates)
//                                                                                    {
//                                                                                        //...swap the numbers back and re-do the loop
//                                                                                        l_swap = a_board[Y][X][y][x];
//                                                                                        a_board[Y][X][y][x] = l_candidates[i];
//                                                                                        l_candidates[i] = l_swap;
//                                                                                        // ...increment 'i' to try the next candidate number
//                                                                                        i++;
//                                                                                        if (i > l_candidates.length - 1)
//                                                                                            {
//                                                                                                a_board[Y][X] = new_generated_block();
//                                                                                                l_recheck_current_block = true;
//                                                                                                l_has_row_duplicates = false;
//                                                                                            }
//                                                                                    }
//                                                                            }
//                                                                    }
//                                                            /***********************************
//                                                               CHECKING COLUMNS FOR DUPLICATES
//                                                            ************************************/
//                                                                if (l_recheck_current_block)
//                                                                    {
//                                                                        // Mark all of these false, so all the 'while' loops will break... 
//                                                                        l_has_column_duplicates = false;
//                                                                        l_has_row_duplicates = false;
//                                                                        l_has_duplicates = false;
//                                                                        // ...reset the iterators so the current block will be rechecked.
//                                                                        x=3;
//                                                                        y=3;
//                                                                        X--;
//                                                                    }
//                                                                else if (Y==0 && y==0) // This means there are no cells above the current cell...
//                                                                    {
//                                                                        l_has_column_duplicates = false; // ...since there is nothing above, there are no duplicates
//                                                                    }
//                                                                else
//                                                                    {
//
//                                                                        l_column = column_for_checking(a_board, Y, X, y, x);
//                                                                        l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
//                                                                        int i = 0;
//                                                                        while(l_has_column_duplicates)
//                                                                            {
//                                                                                int[] l_candidates = candidates_for_swapping(a_board, Y, X, y, x);
//                                                                                int l_swap;
//                                                                                // Swap the current cell with the candidate value...
//                                                                                l_swap = a_board[Y][X][y][x];
//                                                                                a_board[Y][X][y][x] = l_candidates[i];
//                                                                                l_candidates[i] = l_swap;
//                                                                                // ...after swapping check for column duplicates
//                                                                                l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
//                                                                                // If there are still duplicates after swapping...
//                                                                                if (l_has_column_duplicates)
//                                                                                    {
//                                                                                        //...swap the numbers back and re-do the loop
//                                                                                        l_swap = a_board[Y][X][y][x];
//                                                                                        a_board[Y][X][y][x] = l_candidates[i];
//                                                                                        l_candidates[i] = l_swap;
//                                                                                        // ...increment 'i' to try the next candidate number
//                                                                                        i++;
//                                                                                        if (i > l_candidates.length - 1)
//                                                                                            {
//                                                                                                a_board[Y][X] = new_generated_block();
//                                                                                                l_recheck_current_block = true;
//                                                                                                l_has_column_duplicates = false;
//                                                                                            }                                                             
//                                                                                    }
//                                                                            }
//                                                                    }
//                                                            // If there are no row or column duplicates then then has_duplicates = false
//                                                            if (l_has_row_duplicates==false && l_has_column_duplicates==false)
//                                                                {
//                                                                    l_has_duplicates = false;
//                                                                }
//                                                        }
//                                                }
//                                        }
//                                }
//                        }
//                }
//        }
//            
//    private int[] candidates_for_swapping (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
//            // Creates an array of candidates for swapping within the same block as the cell at [Y][X][y][x
//            // FYI THIS FUNCTION WORKS!!! :)
//        {
//            ArrayList<Integer> l_list = new ArrayList<>();
//            boolean l_first_loop_through = true;
//            for(int y=y_index; y>=y_index && y<3; y++)
//                {
//                    for(int x=0; x<=2; x++)
//                            {
//                                if(y_index==2 && x_index==2)
//                                    {
//                                        // do nothing (there are no cells below and no cells to the right of the current cell)
//                                    }
//                                else if(x_index==0 && l_first_loop_through)
//                                    {
//                                        x=x+1;
//                                        l_list.add(a_board[Y_index][X_index][y][x]);
//                                        l_first_loop_through = false;
//                                    }                                
//                                else if(x_index==1 && l_first_loop_through)
//                                    {
//                                        x=x+2;
//                                        l_list.add(a_board[Y_index][X_index][y][x]);
//                                        l_first_loop_through = false;
//                                    }                                
//                                else if (x_index==2 && l_first_loop_through)
//                                    {
//                                        // There are no cells to the right...
//                                        x = 3; // ...needs to break the loop and increment y
//                                        l_first_loop_through = false;
//                                    }
//                                else 
//                                    {
//                                        l_list.add(a_board[Y_index][X_index][y][x]);
//                                    }
//                            }
//                }
//            int[] l_candidates = new int[l_list.size()];
//            for(int i=0; i<l_candidates.length; i++)
//                {
//                    l_candidates[i] = l_list.get(i);
//                }
//            return l_candidates;
//        }
//
//    
////ROW METHODS:    
//    private int[] row_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
//            // Creates an array for checking duplicates in the row to the left of a cell at [Y][X][y][x].
//            // FYI THIS FUNCTION WORKS!!! :)
//        {
//            ArrayList<Integer> l_list = new ArrayList<>();
//            for(int X=0; X<=X_index; X++)
//                {
//                    for(int x=0; x<=2 && !(x==x_index && X==X_index); x++)
//                            {
//                                l_list.add(a_board[Y_index][X][y_index][x]);
//                            }
//                }
//            int[] l_row = new int[l_list.size()];
//            for(int i=0; i<l_row.length; i++)
//                {
//                    l_row[i] = l_list.get(i);
//                }
//            return l_row;
//        }
//    
//    private boolean has_row_duplicates (int[][][][] a_board, int[] a_row, int Y, int X, int y, int x)
//            // Checks for duplicates in the row to the left of the cell at [Y][X][y][x].
//        {
//            boolean l_result = false;
//
//            for (int ic_int : a_row) // Loops across the row to the left of the current cell...
//                {
//                    if (ic_int == a_board[Y][X][y][x]) // ...checks for duplicates
//                    {
//                        l_result = true;
//                    }
//                }
//            return l_result;
//        }
// 
//    
////COLUMN METHODS:     
//    private int[] column_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
//            // Creates an array for checking duplicates in the column above a cell at [Y][X][y][x].
//            // FYI THIS FUNCTION WORKS!!! :)
//        {
//            ArrayList<Integer> l_list = new ArrayList<>();
//            for(int Y=0; Y<=Y_index; Y++)
//                {
//                    for(int y=0; y<=2 && !(y==y_index && Y==Y_index); y++)
//                        {
//                            l_list.add(a_board[Y][X_index][y][x_index]);
//                        }
//                }
//            int[] l_column = new int[l_list.size()];
//            for(int i=0; i<l_column.length; i++)
//                {
//                    l_column[i] = l_list.get(i);
//                }
//            return l_column;
//        }
//    
//    private boolean has_column_duplicates (int[][][][] a_board, int[] a_column, int Y, int X, int y, int x)
//            // Checks for duplicates in the column above the cell at [Y][X][y][x].
//        {
//            boolean l_result = false;
//
//            for (int ic_int : a_column) // Loops across the column above the current cell...
//                {
//                    if (ic_int == a_board[Y][X][y][x]) // ...checks for duplicates
//                    {
//                        l_result = true;
//                    }
//                }
//            return l_result;
//        }
//
//    private int[][] new_generated_block()
//            // Genarates the current block selected from 'a_board' using Y and X.
//        {
//            // Create a local l_block...
//            int[][] l_block = new int[3][3];
//            // ...create a list of numbers 1-9 to repopulate the block with...
//            List<Integer> l_list = new ArrayList<>(9);
//            int l_number=1;
//            for(int i=0; i<=8; i++)
//                {
//                    l_list.add(i, l_number);
//                    l_number++;
//                }
//            // ...shuffle the list of numbers...
//            Collections.shuffle(l_list);
//            // ...place the numbers into the block...
//            int k = -1;
//            for (int i=0; i<=2; i++)
//                {
//                    for (int j=0; j<=2; j++)
//                    {
//                        k++;
//                        l_block[i][j] = l_list.get(k);
//                    }
//                }
//            // ...returns the entire board with the newly generated block.
//            return l_block;
//        }
//
//    public int[][][][] populate_four_dimensional()
//            //
//        {
//            int[][][][] l_board = new int[3][3][3][3];
//            for(int Y=0; Y<=2; Y++)
//                {
//                    for(int X=0; X<=2; X++)
//                        {
//                            l_board[Y][X] = new_generated_block();
//                        }
//                }
//            return l_board;
//        }
//
//// SWEEPING APPROACH:     
//    private void build_board()
//            // Builds board with a sweeping approach starting at the top left moving diagonally to the bottom right.
//                {
//            four_dimensional_solution[0][0][0][0] = generate_random_integer(); // Randomly generate the very first cell.
//            for(int l_boundary=1; l_boundary<=8; l_boundary++)
//                {
//                    int y = l_boundary;
//                    int x;
//
//                    for(x=0; x<l_boundary; x++) // This line (loop iterating logic) is correct
//                                                {
//                            int i = 1; // An iterator to count how many times the 'while' loop executes within the 'for' loop.
//                            int l_random = generate_random_integer(); // A randomly generated number between 1-9.
//                            int[] l_full_coordinates = full_coordinates(x, y); // All coordinates for the four dimensional board depending on the location coordinates of the two dimensional board.
//                            while (constraints_array(l_boundary, y, x).contains(l_random)) // 
//                                {
//                                    l_random = generate_random_integer();
//                                    i++;
//                                    if (i>100)
//                                        {
//                                            set_four_dimensional_board(pre_filled_solution());
//                                            break;
//                                        }
//                                }
//                            four_dimensional_solution[l_full_coordinates[0]][l_full_coordinates[1]][l_full_coordinates[2]][l_full_coordinates[3]] = l_random;
//                        }
//                    x = l_boundary;
//                    for(y=l_boundary; y>=0; y--)
//                        {
//                            int i = 1;
//                            int l_random = generate_random_integer();
//                            int[] l_full_coordinates = full_coordinates(l_boundary, y);
//                            while (constraints_array(l_boundary, y, x).contains(l_random))
//                                {
//                                    l_random = generate_random_integer();
//                                    i++;
//                                    if (i>100)
//                                        {
//                                            set_four_dimensional_board(pre_filled_solution());
//                                            break;
//                                        }
//                                }
//                            four_dimensional_solution[l_full_coordinates[0]][l_full_coordinates[1]][l_full_coordinates[2]][l_full_coordinates[3]] = l_random;
//                        }
//                }
//        }
//
//    private int[] full_coordinates (int x, int y)
//            // Gives the full coordinates of a board (eg. board[Y][X][y][x])
//        {
//            assert x>=0 && x<=8 && y>=0 && y<=8 : "require_x_y_values_within_bounds: x = " + x + " y = " + y;
//            
//            int[] l_result = new int[4];
//            l_result[0] = big_coordinate(y);
//            l_result[1] = big_coordinate(x);
//            l_result[2] = little_coordinate(y);
//            l_result[3] = little_coordinate(x);
//            
//            return l_result;
//        }
//  
//    private int[] block_coordinates (int x, int y)
//            // Gives the block coordinates of a board (eg. board[Y][X])
//        {
//            assert x>=0 && x<=8 && y>=0 && y<=8 : "require_x_y_values_within_bounds: x = " + x + " y = " + y;
//            
//            int[] l_result = new int[2];
//            l_result[0] = big_coordinate(y);
//            l_result[1] = big_coordinate(x);
//            
//            return l_result;
//        }
//    
//    private int big_coordinate (int a_cartesian)
//            // Calculates big_coordinate from a_cartesian.
//            // NOTE: The logic on this is full proof and works
//        {
//            assert a_cartesian>=0 && a_cartesian<=8 : "require_a_cartesian_within_bounds: a_cartesian = " + a_cartesian;
//            
//            int l_result = a_cartesian / 3;
//            
//            assert l_result>=0 && l_result<=2: "ensure_result_within_bounds: l_result = " + l_result + " a_cartesian = " + a_cartesian;
//            
//            return l_result;
//        }
//    
//    private int little_coordinate (int a_cartesian)
//            // Calculates little_coordinate from a_cartesian.
//            // NOTE: The logic on this is full proof and works
//        {
//            assert a_cartesian>=0 && a_cartesian<=8 : "require_a_cartesian_within_bounds: a_cartesian = " + a_cartesian;
//            
//            int l_one_based_cartesian = a_cartesian + 1;
//            int l_value_in_block = a_cartesian / 3;
//            int l_remainder = l_one_based_cartesian - (l_value_in_block * 3);
//            assert l_remainder>0 : "check_positive_remainder = " + l_remainder + " one_based = " + l_one_based_cartesian + " l_value_in_block = " + l_value_in_block;
//            int l_result = l_remainder - 1;
//            
//            assert l_result>=0 && l_result<=2: "ensure_result_within_bounds: l_result = " + l_result + " l_remainder = " + l_remainder + " one_based = " + l_one_based_cartesian + " l_value_in_block = " + l_value_in_block;
//            
//            return l_result;
//        } 
//    
//    private int[] up_array(int a_boundary, int x)
//            //
//                {
//            assert x <= a_boundary : "require_x_lte_a_boundary";
//            
//            int[] l_result = new int[a_boundary];
//            
//            for(int y=0; y<a_boundary; y++)
//                {
//                    assert y < a_boundary : "check_y_lt_a_boundary";
//                    int[] l_coordinates = full_coordinates(x, y);
//                    l_result[y] = four_dimensional_solution[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
//                }            
//            
//            assert l_result.length == a_boundary : "ensure_result_is_proper_length";
//            
//            return l_result;
//        }
//    
//    private int[] left_array(int y, int x)
//            // Calculate array of all values to the left of x.
//                {
//            assert y >= 0 : "require_non_negative_y";
//            
//            int[] l_result = new int[x];
//            
//            for(int xi=0; xi<x; xi++)
//                {
//                    int[] l_coordinates = full_coordinates(xi, y);
//                    l_result[xi] = four_dimensional_solution[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
//                }
//            
//            assert l_result.length == x : "ensure_result_is_proper_length";
//            
//            return l_result;
//        }
//            
//    private int[] down_array(int a_boundary, int y, int x)
//            //
//                {
//            assert y <= a_boundary : "require_y_lte_a_boundary";
//            
//            int[] l_result = new int[a_boundary - y];
//            int l_y_index = a_boundary + 1;
//            
//            for(int yi=0; yi<l_result.length; yi++)
//                {
//                    l_y_index--;
//                    int[] l_coordinates = full_coordinates(x, l_y_index);
//                    l_result[yi] = four_dimensional_solution[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
//                }
//            return l_result;
//        }
//
//    private int[] block_array(int y, int x)
//            //
//                {
//            ArrayList<Integer> l_list = new ArrayList<>();
//            
//            int[] l_block_coordinates = block_coordinates(x, y);
//            int[][] l_block = four_dimensional_solution[l_block_coordinates[0]][l_block_coordinates[1]];
//            
//            for(int yi=0; yi<=2; yi++)
//                {
//                    for(int xi=0; xi<=2; xi++)
//                        {
//                            if(!(l_block[yi][xi]==0))
//                                {
//                                    l_list.add(l_block[yi][xi]);
//                                }
//                        }
//                }
//            
//            int[] l_result = new int[l_list.size()];
//            for(int i=0; i<l_result.length; i++)
//                {
//                    l_result[i] = l_list.get(i);
//                }
//            return l_result;            
//        }
//    
//    private ArrayList<Integer> constraints_array(int a_boundary, int y, int x)
//            /* 
//                Builds the ArrayList with all of the numbers that have already been set within the block, row, and column.
//                So in essence it builds an array of numbers that "contstrain" which number to generate. (e.g. If the block has 1,2,3 
//                and the row as 3,4 and the column 2,5 then the "constraints_array" will have in it, {1,2,3,3,4,2,5} which the buld_board
//                function will check to make sure the number place in a cell does not match any of the numbers in the constraints array)
//            */
//        {
//            ArrayList<Integer> l_result = new ArrayList<>();
//            // Set the length of the arrays depending on the (x, y) coordinates
//            int[] l_up_array = new int[0]; // Automatically set to length of 0 assuming that there are no numbers above (x, y)
//            if (!(x==a_boundary)) // If x is NOT all the way to the right of the "L" formation, l_up will be set
//                {
//                    l_up_array = up_array(a_boundary, x);
//                    assert l_up_array.length > 0 && l_up_array.length == a_boundary : "check_l_up_array_proper_length";
//                }
//            
//            int[] l_left_array = new int[0]; // Automatically set to length of 0 assuming that there are no numbers to the left (x, y)
//            if (!(x==0)) // If x is NOT all the way to the left of the "L" formation, l_left will be set
//                {
//                    l_left_array = left_array(y, x);
//                    assert l_left_array.length > 0  && l_left_array.length == x : "check_l_left_array_proper_length";
//                }
//            
//            int[] l_down_array = new int[0]; // Automatically set to length of 0 assuming that there are no numbers below (x, y)
//            if (!(y==a_boundary)) // If x is NOT at the bottom of the "L" formation, l_down will be set
//                {
//                    l_down_array = down_array(a_boundary, y, x);
//                    assert l_down_array.length > 0  && l_down_array.length == (a_boundary - y) : "check_l_down_array_proper_length";
//                }
//            // Set the block array
//            int[] l_block = block_array(y, x);
//            // Transfer all of the values from the 4 arrays above into a l_result if they have a lenght greater than 0
//            if (!(l_up_array.length==0))
//                {
//                    for(int i=0; i<=l_up_array.length-1; i++)
//                        {
//                            l_result.add(l_up_array[i]);
//                        }
//                }
//            if (!(l_left_array.length==0))
//                {
//                    for(int i=0; i<=l_left_array.length-1; i++)
//                        {
//                            l_result.add(l_left_array[i]);
//                        }
//                }
//            if (!(l_down_array.length==0))
//                {
//                    for(int i=0; i<=l_down_array.length-1; i++)
//                        {
//                            l_result.add(l_down_array[i]);
//                        }
//                }
//            if (!(l_block.length==0))
//                {
//                    for(int i=0; i<=l_block.length-1; i++)
//                        {
//                            l_result.add(l_block[i]);
//                        }
//                }
//            
//            return l_result;
//        }

}
