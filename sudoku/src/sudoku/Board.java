package sudoku;

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

public class Board extends ArrayList <Block>
{
    
// CONSTRUCTORS:   
    public Board()
            // Default constructor of Current.
            // This method is called whenever a new Board instance is created.
        {
            set_four_dimensional_board(new int[3][3][3][3]);
            //sort_solution(four_dimensional_board);
            build_board();
            this.display();
        }

// VARIABLES:   
    private int[][][][] four_dimensional_board;
            // Four dimensional version of the Board.


// SETTERS (PRIVATE):    
    public void set_four_dimensional_board(int[][][][] a_board)
        {
            assert a_board.length==3 : "require_3_element_four_dimensional_board";
            four_dimensional_board = a_board;
        }    
    

// BASIC METHODS:    
    public int[][][][] populate_four_dimensional()
            //
        {
            int[][][][] l_board = new int[3][3][3][3];
            for(int Y=0; Y<=2; Y++)
                {
                    for(int X=0; X<=2; X++)
                        {
                            l_board[Y][X] = new_generated_block();
                        }
                }
            return l_board;
        }
    
    private int[][] new_generated_block()
            // Genarates the current block selected from 'a_board' using Y and X.
        {
            // Create a local l_block...
            int[][] l_block = new int[3][3];
            // ...create a list of numbers 1-9 to repopulate the block with...
            List<Integer> l_list = new ArrayList<>(9);
            int l_number=1;
            for(int i=0; i<=8; i++)
                {
                    l_list.add(i, l_number);
                    l_number++;
                }
            // ...shuffle the list of numbers...
            Collections.shuffle(l_list);
            // ...place the numbers into the block...
            int k = -1;
            for (int i=0; i<=2; i++)
                {
                    for (int j=0; j<=2; j++)
                    {
                        k++;
                        l_block[i][j] = l_list.get(k);
                    }
                }
            // ...returns the entire board with the newly generated block.
            return l_block;
        }
    
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
                                            print (" " + four_dimensional_board[Y][X][y][x] + " ");
                                            if (X==2 && x==2)
                                                {
                                                    print("|");
                                                }
                                        }
                                }
                        }
                }
            print ("\n_____________________________________");
        }
    
    
// IMPLEMENTION:
    private void sort_solution(int[][][][] a_board)
            /* Sorts 'a_board' eliminating all duplicates from rows and columns.
                While iterating over an integer, the row is first checked for
                any duplicates to its left, and then the column is checked for
                any duplicates above it.
            */
        {
            for(int Y=0; Y<=2; Y++) // Going across the 'Y' coordinate of the Board
                {
                    for(int X=0; X<=2; X++) // Going across the 'X' coordinate of the Board
                        {
                            for(int y=0; y<=2; y++) // Going across the 'y' coordinate of the Board
                                {
                                    for(int x=0; x<=2; x++) // Going across the 'x' coordinate of the Board
                                        {
                                            if(Y==0 && X==0) // This is the first block, which can be skipped
                                                {
                                                    // Skip over the first block (it does not need to be checked)
                                                }
                                            else if (y==2 && x==2) // If the iterator is on the last cell of a block...
                                                {
                                                    // ...check if there are any row duplicates...
                                                    int[] l_row = row_for_checking(a_board, Y, X, y, x);
                                                    boolean l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                    // ...check if there are any column duplicates...
                                                    int[] l_column = column_for_checking(a_board, Y, X, y, x);
                                                    boolean l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                    // ...If there are any duplicates...
                                                    if (l_has_row_duplicates==true || l_has_column_duplicates==true)
                                                        {
                                                            // ...re-generate the current block...
                                                            a_board[Y][X] = new_generated_block();
                                                            // ...reset the the iterators for the cells and block so it will re-check that block
                                                            x=3;
                                                            y=3;
                                                            X--;
                                                        }
                                                }
                                            else
                                                {
                                                    int[] l_row;
                                                    int[] l_column;
                                                    boolean l_has_duplicates = true;
                                                    boolean l_has_row_duplicates = true;
                                                    boolean l_has_column_duplicates = true;
                                                    boolean l_recheck_current_block = false;
                                                    
                                                    while(l_has_duplicates)
                                                        {
                                                            /*********************************
                                                               CHECKING ROWS FOR DUPLICATES
                                                            **********************************/
                                                                if (X==0 && x==0) // This means there are no cells to the left of the current cell...
                                                                    {
                                                                        l_has_row_duplicates = false; //...since there is nothing to the left, there can't be duplicates
                                                                    }
                                                                else
                                                                    {
                                                                        l_row = row_for_checking(a_board, Y, X, y, x);
                                                                        l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                                        int i = 0;
                                                                        while(l_has_row_duplicates)
                                                                            {
                                                                                int[] l_candidates = candidates_for_swapping(a_board, Y, X, y, x);
                                                                                int l_swap;
                                                                                // Swap the current cell with the candidate value...
                                                                                l_swap = a_board[Y][X][y][x];
                                                                                a_board[Y][X][y][x] = l_candidates[i];
                                                                                l_candidates[i] = l_swap;
                                                                                // ...after swapping check for row duplicates
                                                                                l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                                                // If there are still duplicates after swapping...
                                                                                if (l_has_row_duplicates)
                                                                                    {
                                                                                        //...swap the numbers back and re-do the loop
                                                                                        l_swap = a_board[Y][X][y][x];
                                                                                        a_board[Y][X][y][x] = l_candidates[i];
                                                                                        l_candidates[i] = l_swap;
                                                                                        // ...increment 'i' to try the next candidate number
                                                                                        i++;
                                                                                        if (i > l_candidates.length - 1)
                                                                                            {
                                                                                                a_board[Y][X] = new_generated_block();
                                                                                                l_recheck_current_block = true;
                                                                                                l_has_row_duplicates = false;
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            /***********************************
                                                               CHECKING COLUMNS FOR DUPLICATES
                                                            ************************************/
                                                                if (l_recheck_current_block)
                                                                    {
                                                                        // Mark all of these false, so all the 'while' loops will break... 
                                                                        l_has_column_duplicates = false;
                                                                        l_has_row_duplicates = false;
                                                                        l_has_duplicates = false;
                                                                        // ...reset the iterators so the current block will be rechecked.
                                                                        x=3;
                                                                        y=3;
                                                                        X--;
                                                                    }
                                                                else if (Y==0 && y==0) // This means there are no cells above the current cell...
                                                                    {
                                                                        l_has_column_duplicates = false; // ...since there is nothing above, there are no duplicates
                                                                    }
                                                                else
                                                                    {

                                                                        l_column = column_for_checking(a_board, Y, X, y, x);
                                                                        l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                                        int i = 0;
                                                                        while(l_has_column_duplicates)
                                                                            {
                                                                                int[] l_candidates = candidates_for_swapping(a_board, Y, X, y, x);
                                                                                int l_swap;
                                                                                // Swap the current cell with the candidate value...
                                                                                l_swap = a_board[Y][X][y][x];
                                                                                a_board[Y][X][y][x] = l_candidates[i];
                                                                                l_candidates[i] = l_swap;
                                                                                // ...after swapping check for column duplicates
                                                                                l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                                                // If there are still duplicates after swapping...
                                                                                if (l_has_column_duplicates)
                                                                                    {
                                                                                        //...swap the numbers back and re-do the loop
                                                                                        l_swap = a_board[Y][X][y][x];
                                                                                        a_board[Y][X][y][x] = l_candidates[i];
                                                                                        l_candidates[i] = l_swap;
                                                                                        // ...increment 'i' to try the next candidate number
                                                                                        i++;
                                                                                        if (i > l_candidates.length - 1)
                                                                                            {
                                                                                                a_board[Y][X] = new_generated_block();
                                                                                                l_recheck_current_block = true;
                                                                                                l_has_column_duplicates = false;
                                                                                            }                                                             
                                                                                    }
                                                                            }
                                                                    }
                                                            // If there are no row or column duplicates then then has_duplicates = false
                                                            if (l_has_row_duplicates==false && l_has_column_duplicates==false)
                                                                {
                                                                    l_has_duplicates = false;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
            
    private int[] candidates_for_swapping (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Creates an array of candidates for swapping within the same block as the cell at [Y][X][y][x
            // FYI THIS FUNCTION WORKS!!! :)
        {
            ArrayList<Integer> l_list = new ArrayList<>();
            boolean l_first_loop_through = true;
            for(int y=y_index; y>=y_index && y<3; y++)
                {
                    for(int x=0; x<=2; x++)
                            {
                                if(y_index==2 && x_index==2)
                                    {
                                        // do nothing (there are no cells below and no cells to the right of the current cell)
                                    }
                                else if(x_index==0 && l_first_loop_through)
                                    {
                                        x=x+1;
                                        l_list.add(a_board[Y_index][X_index][y][x]);
                                        l_first_loop_through = false;
                                    }                                
                                else if(x_index==1 && l_first_loop_through)
                                    {
                                        x=x+2;
                                        l_list.add(a_board[Y_index][X_index][y][x]);
                                        l_first_loop_through = false;
                                    }                                
                                else if (x_index==2 && l_first_loop_through)
                                    {
                                        // There are no cells to the right...
                                        x = 3; // ...needs to break the loop and increment y
                                        l_first_loop_through = false;
                                    }
                                else 
                                    {
                                        l_list.add(a_board[Y_index][X_index][y][x]);
                                    }
                            }
                }
            int[] l_candidates = new int[l_list.size()];
            for(int i=0; i<l_candidates.length; i++)
                {
                    l_candidates[i] = l_list.get(i);
                }
            return l_candidates;
        }

    
//ROW METHODS:    
    private int[] row_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Creates an array for checking duplicates in the row to the left of a cell at [Y][X][y][x].
            // FYI THIS FUNCTION WORKS!!! :)
        {
            ArrayList<Integer> l_list = new ArrayList<>();
            for(int X=0; X<=X_index; X++)
                {
                    for(int x=0; x<=2 && !(x==x_index && X==X_index); x++)
                            {
                                l_list.add(a_board[Y_index][X][y_index][x]);
                            }
                }
            int[] l_row = new int[l_list.size()];
            for(int i=0; i<l_row.length; i++)
                {
                    l_row[i] = l_list.get(i);
                }
            return l_row;
        }
    
    private boolean has_row_duplicates (int[][][][] a_board, int[] a_row, int Y, int X, int y, int x)
            // Checks for duplicates in the row to the left of the cell at [Y][X][y][x].
        {
            boolean l_result = false;

            for (int ic_int : a_row) // Loops across the row to the left of the current cell...
                {
                    if (ic_int == a_board[Y][X][y][x]) // ...checks for duplicates
                    {
                        l_result = true;
                    }
                }
            return l_result;
        }
 
    
//COLUMN METHODS:     
    private int[] column_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Creates an array for checking duplicates in the column above a cell at [Y][X][y][x].
            // FYI THIS FUNCTION WORKS!!! :)
        {
            ArrayList<Integer> l_list = new ArrayList<>();
            for(int Y=0; Y<=Y_index; Y++)
                {
                    for(int y=0; y<=2 && !(y==y_index && Y==Y_index); y++)
                        {
                            l_list.add(a_board[Y][X_index][y][x_index]);
                        }
                }
            int[] l_column = new int[l_list.size()];
            for(int i=0; i<l_column.length; i++)
                {
                    l_column[i] = l_list.get(i);
                }
            return l_column;
        }
    
    private boolean has_column_duplicates (int[][][][] a_board, int[] a_column, int Y, int X, int y, int x)
            // Checks for duplicates in the column above the cell at [Y][X][y][x].
        {
            boolean l_result = false;

            for (int ic_int : a_column) // Loops across the column above the current cell...
                {
                    if (ic_int == a_board[Y][X][y][x]) // ...checks for duplicates
                    {
                        l_result = true;
                    }
                }
            return l_result;
        }
     
    
// CONSTANTS:    
    private static void print(String a_message)
        {
            System.out.print(a_message);
        }

    
// SWEEPING APPROACH:     
    private void build_board()
            // Builds board...
        {
            for(int yb=0; yb<=8; yb++)
                {
                    for(int xb=0; xb<=8; xb++)
                        {
                            int yi = yb;
                            for(int xi=0; xi<=xb; xi++)
                                {
                                    int i = 1;
                                    int l_random = generate_random_integer();
                                    int[] l_full_coordinates = full_coordinates(xi, yi);
                                    do 
                                        {
                                            print("" + i + "/r=" + l_random + "\n");
                                            l_random = generate_random_integer();
                                            i++;
                                            assert i<=25 : "check_i_lte_25";
                                        } 
                                    while (constraints_array(yi, yb, xi).contains(l_random));
                                    four_dimensional_board[l_full_coordinates[0]][l_full_coordinates[1]][l_full_coordinates[2]][l_full_coordinates[3]] = l_random;
                                }
                            for(yi=yb; yi>=0; yi--)
                                {
                                    int l_random = generate_random_integer();
                                    int[] l_full_coordinates = full_coordinates(xb, yi);
                                    do 
                                        {
                                            l_random = generate_random_integer();
                                        } 
                                    while (constraints_array(yi, yb, xb).contains(l_random));
                                    four_dimensional_board[l_full_coordinates[0]][l_full_coordinates[1]][l_full_coordinates[2]][l_full_coordinates[3]] = l_random;
                                }
                        }
                }
        }

    private int big_coordinate (int a_cartesian)
            // Calculates big_coordinate from a_cartesian.
        {
            assert a_cartesian>=0 : "require_positive_cartesian: a_cartesian = " + a_cartesian;
            assert a_cartesian<=8 : "require_<=_8: a_cartesian = " + a_cartesian;
            
            int l_result = a_cartesian / 3;
            
            assert l_result>=0 : "ensure_non_negative_result";
            assert l_result<=2 : "ensure_result_<=_2: l_result = " + l_result + " a_cartesian = " + a_cartesian;
            
            return l_result;
        }
    
    private int little_coordinate (int a_cartesian)
            // Calculates little_coordinate from a_cartesian.
        {
            assert a_cartesian>=0 : "require_non_negative_a_cartesian =" + a_cartesian;
            assert a_cartesian<=8 : "require_<=_8: a_cartesian = " + a_cartesian;
            
            int l_one_based_cartesian = a_cartesian + 1;
            int l_value_in_block = a_cartesian / 3;
            int l_remainder = l_one_based_cartesian - (l_value_in_block * 3);
            assert l_remainder>0 : "check_positive_remainder = " + l_remainder + " one_based = " + l_one_based_cartesian + " l_value_in_block = " + l_value_in_block;
            int l_result = l_remainder - 1;
            
            assert l_result>=0 : "ensure_non_negative_result = " + l_result;
            assert l_result<=2 : "ensure_result_<_2 = " + l_result + " l_remainder = " + l_remainder + " one_based = " + l_one_based_cartesian + " l_value_in_block = " + l_value_in_block;
            
            return l_result;
        } 
    
    private int[] full_coordinates (int xc, int yc)
            //
        {
            assert xc>=0 : "require_non_negative_xc";
            assert yc>=0 : "require_non_negative_yc";
            int[] l_result = new int[4];
            l_result[0] = big_coordinate(yc);
            l_result[1] = big_coordinate(xc);
            l_result[2] = little_coordinate(yc);
            l_result[3] = little_coordinate(xc);
            return l_result;
        }
  
    private int[] block_coordinates (int xc, int yc)
            //
        {
            assert xc>=0 : "require_non_negative_xc";
            assert yc>=0 : "require_non_negative_yc";
            int[] l_result = new int[2];
            l_result[0] = big_coordinate(yc);
            l_result[1] = big_coordinate(xc);
            return l_result;
        }
    
    private int[] left_array(int a_x_boundary, int yc)
            // Calculate array from 1 - a_x_boundary on yc.
        {
            assert a_x_boundary>=0 : "require_non_negative_a_x_boundary";
            assert yc>=0 : "require_non_negative_yc";
            int[] l_result = new int[a_x_boundary];
            
            for(int xc=0; xc<a_x_boundary; xc++)
                {
                    int[] l_coordinates = full_coordinates(xc, yc);
                    l_result[xc] = four_dimensional_board[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
                }
            return l_result;
        }
            
    private int[] down_array(int a_y_start, int a_y_boundary, int xc)
            //
        {
            int[] l_result = new int[(a_y_boundary - a_y_start) + 1];
            
            for(int yc=a_y_start; yc<=a_y_boundary; yc++)
                {
                    int[] l_coordinates = full_coordinates(xc, yc);
                    
//                    print("0 = " + l_coordinates[0] + "\n");
//                    print("1 = " + l_coordinates[1] + "\n");
//                    print("2 = " + l_coordinates[2] + "\n");
//                    print("3 = " + l_coordinates[3] + "\n");
//                    print("yc = " + yc + "\n");
//                    print("a_y_start = " + a_y_start + "\n");
                    
                    l_result[yc-a_y_start] = four_dimensional_board[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
                }
            return l_result;
        }

    private int[] up_array(int a_y_boundary, int xc)
            //
        {
            int[] l_result = new int[0];
            
            for(int yc=0; yc<=(a_y_boundary - 1); yc++)
                {
                    int[] l_coordinates = full_coordinates(xc, yc);
                    l_result[yc] = four_dimensional_board[l_coordinates[0]][l_coordinates[1]][l_coordinates[2]][l_coordinates[3]];
                }            
            
            return l_result;
        }
    
    private int[] block_array(int xc, int yc)
            //
        {
            ArrayList<Integer> l_list = new ArrayList<>();
            
            int[] l_block_coordinates = block_coordinates(xc, yc);
            int[][] l_block = four_dimensional_board[l_block_coordinates[0]][l_block_coordinates[1]];
            
            for(int y=0; y<=2; y++)
                {
                    for(int x=0; x<=2; x++)
                        {
                            if(!(l_block[y][x]==0))
                                {
                                    l_list.add(l_block[y][x]);
                                }
                        }
                }
            
            int[] l_result = new int[l_list.size()];
            for(int i=0; i<l_result.length; i++)
                {
                    l_result[i] = l_list.get(i);
                }
            return l_result;            
        }
    
    private ArrayList<Integer> constraints_array(int yc, int a_y_boundary, int xc)
            //
        {
            ArrayList<Integer> l_result = new ArrayList<>();    
            int[] l_left = left_array(xc, yc);
            int[] l_down = down_array(yc, a_y_boundary, xc);
            int[] l_up = up_array(a_y_boundary, xc);
            int[] l_block = block_array(xc, yc);
            
            if (!(l_left.length==0))
                {
                    for(int i=0; i<=l_left.length-1; i++)
                        {
                            l_result.add(l_left[i]);
                        }
                }
            if (!(l_down.length==0))
                {
                    for(int i=0; i<=l_down.length-1; i++)
                        {
                            l_result.add(l_down[i]);
                        }
                }
            if (!(l_up.length==0))
                {
                    for(int i=0; i<=l_up.length-1; i++)
                        {
                            l_result.add(l_up[i]);
                        }
                }
            if (!(l_block.length==0))
                {
                    for(int i=0; i<=l_block.length-1; i++)
                        {
                            l_result.add(l_block[i]);
                        }
                }
            
            return l_result;
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
          
          assert l_result>=1 : "ensure_result_gte_1";
          assert l_result<=9 : "ensure_result_lte_9";
          
          return l_result;
        }    
    
    
    
    
    
    
    
// JUNK FUNCTIONS & METHODS:

    public void display_board()
            // Displays the board.
            // This method will be re-written later when the sorting method is working.
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

    
    private int[][] cast_to_primitive_version(Board a_board)
            // Casts the 'Board' into int[][].
        {
            int [][] l_primitive_board = new int[9][9];
            ArrayList <Integer> l_block = new ArrayList <>();
            
            for (int i=0; i<9; i++)
                {
                    int[] l_primitive_block = new int[9];
                    l_block = a_board.get(i);
                    for (int j=0; j<9; j++)
                        {
                            l_primitive_block[j] = l_block.get(j);
                        }
                    l_primitive_board[i] = l_primitive_block;
                }
            return l_primitive_board;
        }
    
    private int[][][][] cast_to_four_dimensional_board(int[][] a_primative_board)
            // Casts int[][] into a for dimensional board int[][][][] (3x3x3x3).
        {
            int[][][][] l_four_dimensional_board = new int[3][3][3][3];
            
            for (int i=0; i<=2; i++)
                { 
                    for (int j=0; j<=2; j++)
                        {
                            switch (i)
                                {
                                    case 0: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j]);

                                    case 1: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j+3]);

                                    case 2: l_four_dimensional_board[i][j] = cast_to_two_dimensional_block(a_primative_board[j+6]);
                                }                            
                        }
                }
            return l_four_dimensional_board;
        }    

    private int[][] cast_to_two_dimensional_block (int[] a_block)
            //
        {
            int[][] l_block = new int[3][3];
            for (int i=0; i<=8; i++)
                {
                    switch(i)
                        {
                            case 0: l_block[0][0] = a_block[i];
                        
                            case 1: l_block[0][1] = a_block[i];
                        
                            case 2: l_block[0][2] = a_block[i];
                        
                            case 3: l_block[1][0] = a_block[i];
                        
                            case 4: l_block[1][1] = a_block[i];
                        
                            case 5: l_block[1][2] = a_block[i];
                        
                            case 6: l_block[2][0] = a_block[i];
                        
                            case 7: l_block[2][1] = a_block[i];
                       
                            case 8: l_block[2][2] = a_block[i];
                        }
                }
            return l_block;
        }    

    private void set_primitive_version(Board a_board)
            // Sets 'primitive_version' with the post cast version of 'a_board'.
        {
            int[][] l_board = cast_to_primitive_version(a_board);
            primitive_version = l_board;
        }   

    private void set_four_dimensional_primitive_board(int[][] a_primitive_board)
            // Sets 'four_dimensional_primitive_board' with the post cast version of 'a_primitive_board'.
        {
            int[][][][] l_board = cast_to_four_dimensional_board(a_primitive_board);
            four_dimensional_board = l_board;
        } 
    
    private int[][]primitive_version;
        // Primitive version of the Board.


    private Block block;
    
    public void populate_board()
            // Populates the board with generated unique random blocks.
        {          
            for (int i=0; i<=8; i++) // Loops across each block in the board.
                {
                block = new Block();
                this.add(i, block.populate()); // Each time it creates a new block to place inside the board.
                }
        }


}
