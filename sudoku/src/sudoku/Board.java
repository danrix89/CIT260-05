package sudoku;

import java.util.ArrayList;

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
            set_four_dimensional_primitive_board(primitive_version);
            //set_one_dimensional_version(this);
            sort_solution(four_dimensional_board);
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
    
    
// IMPLEMENTION:
    private void sort_solution(int[][][][] a_board)
            /* Sorts 'a_board' eliminating all duplicates from rows and columns.
                While iterating over an integer, the row is first checked for
                any duplicates to its left, and then the column is checked for
                any duplicates above it.
            */
        {
            for(int Y=0; Y<=2; Y++)
                {
                    for(int X=0; X<=2; X++)
                        {
                            for(int y=0; y<=2; y++)
                                {
                                    for(int x=0; x<=2; x++)
                                        {
                                            if(Y==0 && X==0)
                                                {
                                                    // Skip over the first block (it does not need to be checked).
                                                }
                                            if (y==2 && x==2)
                                                {
                                                    int[] l_row = row_for_checking(a_board, Y, X, y, x);
                                                    boolean l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                    int[] l_column = column_for_checking(a_board, Y, X, y, x);
                                                    boolean l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                    if (l_has_row_duplicates==true || l_has_column_duplicates==true)
                                                        {
                                                            print("Please create a function to fix the last cell of a block having duplicates.");
                                                        }
                                                }
                                            else
                                                {
                                                    int[] l_row;
                                                    int[] l_column;
                                                    int[] l_candidates = candidates_for_swapping(a_board, Y, X, y, x);
                                                    boolean l_has_duplicates = true;
                                                    boolean l_has_row_duplicates = true;
                                                    boolean l_has_column_duplicates = true;
                                                    
                                                    int i = -1;
                                                    int j = -1;
                                                    while(l_has_duplicates)
                                                        {
                                                            //ROW CHECKING
                                                            if (X==0 && x==0)
                                                                {
                                                                    l_has_row_duplicates = false; // There are no cells to the left.
                                                                }
                                                            else
                                                                {
                                                                    l_row = row_for_checking(a_board, Y, X, y, x);
                                                                    l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                                    while(l_has_row_duplicates)
                                                                        {
                                                                            i++;
                                                                            int l_swap = a_board[Y][X][y][x];
                                                                            a_board[Y][X][y][x] = l_candidates[i];
                                                                            l_candidates[i] = l_swap;
                                                                            l_has_row_duplicates = has_row_duplicates (a_board, l_row, Y, X, y, x);
                                                                            if (l_has_row_duplicates)
                                                                                {
                                                                                    l_swap = a_board[Y][X][y][x];
                                                                                    a_board[Y][X][y][x] = l_candidates[i];
                                                                                    l_candidates[i] = l_swap;
                                                                                }
                                                                        }
                                                                }
                                                            //COLUMN CHECKING
                                                            if (Y==0 && y==0)
                                                                {
                                                                    l_has_column_duplicates = false; // There are no cells above.
                                                                }
                                                            else
                                                                {
                                                                    l_column = column_for_checking(a_board, Y, X, y, x);
                                                                    l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                                    while(l_has_column_duplicates)
                                                                        {
                                                                            j++;
                                                                            int l_swap = a_board[Y][X][y][x];
                                                                            a_board[Y][X][y][x] = l_candidates[j];
                                                                            l_candidates[j] = l_swap;
                                                                            l_has_column_duplicates = has_column_duplicates (a_board, l_column, Y, X, y, x);
                                                                            if (l_has_column_duplicates)
                                                                                {
                                                                                    l_swap = a_board[Y][X][y][x];
                                                                                    a_board[Y][X][y][x] = l_candidates[j];
                                                                                    l_candidates[j] = l_swap;
                                                                                }
                                                                        }
                                                                }
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
    
    private boolean has_row_duplicates (int[][][][] a_board, int[] a_row, int Y, int X, int y, int x)
            //
    {
        boolean l_result = false;
        
        for (int ic_int : a_row)
            {
                if (ic_int == a_board[Y][X][y][x])
                {
                    l_result = true;
                }
            }
        return l_result;
    }

    private boolean has_column_duplicates (int[][][][] a_board, int[] a_column, int Y, int X, int y, int x)
            //
    {
        boolean l_result = false;
        
        for (int ic_int : a_column)
            {
                if (ic_int == a_board[Y][X][y][x])
                {
                    l_result = true;
                }
            }
        return l_result;
    }
    
    private int[] candidates_for_swapping (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Array of candidates for swapping within the same block as the cell at (x_index, y_index).
        {
            int[] l_candidates = new int [8];
            if(y_index==0)
            {
                l_candidates = new int[9-(x_index+1)];
            }
            if(y_index==1)
            {
                l_candidates = new int[6-(x_index+1)];
            }
            if(y_index==2)
            {
                l_candidates = new int[3-(x_index+1)];
            }
        
            int i = -1;
            boolean l_first_loop_through = true;
            for(int y=y_index; y>=y_index && y<3; y++)
                {
                    for(int x=0; x<=2; x++)
                            {
                                if(y_index==2 && x_index==2)
                                    {
                                        // do nothing (there are no cells for candidacy)
                                    }
                                else if(x_index==0 && l_first_loop_through)
                                    {
                                        x=x+1;
                                        i++;
                                        l_candidates[i] = a_board[Y_index][X_index][y][x];
                                        l_first_loop_through = false;
                                    }                                
                                else if(x_index==1 && l_first_loop_through)
                                    {
                                        x=x+2;
                                        i++;
                                        l_candidates[i] = a_board[Y_index][X_index][y][x];
                                        l_first_loop_through = false;
                                    }                                
                                else if (x_index==2 && l_first_loop_through)
                                    {
                                        // do nothing (there are no cells to the right)
                                        x = 3; // Needs to break the loop and increment y.
                                        l_first_loop_through = false;
                                    }
                                else 
                                    {
                                        i++;
                                        l_candidates[i] = a_board[Y_index][X_index][y][x];
                                    }
                            }
                }
           return l_candidates;
        }
    
    private int[] row_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Row for checking duplicates to the left of a cell at (X,Y)(x,y).
        {
            int[] l_row = new int [(X_index*3)];
            if(x_index==1)
                {
                    if(X_index==0)
                        {
                            l_row = new int [1];
                        }
                    else
                        {
                            l_row = new int [((X_index+1)*3)+1];
                        }
                }
            if(x_index==2)
                {
                    if(X_index==0)
                        {
                            l_row = new int [2];
                        }
                    else
                        {
                            l_row = new int [((X_index+1)*3)-1];
                        }
                }
            int i = -1;

            for(int X=0; X<=X_index; X++)
                {
                    for(int x=0; x<=2 && !(x==x_index && X==X_index); x++)
                            {
                                i++;
                                l_row[i] = a_board[Y_index][X][y_index][x];
                            }
                }
           return l_row;
        }
    
    private int[] column_for_checking (int[][][][] a_board, int Y_index, int X_index, int y_index, int x_index)
            // Column for checking duplicates above a cell at (X,Y)(x,y).
        {
            int[] l_column = new int [(Y_index+1*3)];
            if(y_index==1)
                {
                    if(Y_index==0)
                        {
                            l_column = new int [1];
                        }
                    else
                        {
                            l_column = new int [((Y_index+1)*3)+1];
                        }
                }
            if(y_index==2)
                {
                    if(Y_index==0)
                        {
                            l_column = new int [2];
                        }
                    else
                        {
                            l_column = new int [((Y_index+1)*3)-1];
                        }
                }
            int i = -1;

            for(int Y=0; Y<=Y_index; Y++)
                {
                    for(int y=0; y<=2 && !(y==y_index && Y==Y_index); y++)
                            {
                                i++;
                                l_column[i] = a_board[Y][X_index][y][x_index];
                            }
                }
           return l_column;
        }

    private int[] cast_to_full_board (int[][][][] a_board)
            //
        {
            int l_index = -1;
            int[] l_board = new int[81];

            for (int Y=0; Y<3; Y++)
                    {
                            for (int y=0; y<3; y++)
                                    {
                                            for (int X=0; X<3; X++)
                                                    {
                                                            for (int x=0; x<3; x++)
                                                                    {
                                                                            l_index ++;
                                                                            l_board[l_index] = a_board[Y][X][y][x];
                                                                    }
                                                    }
                                    }
                    }
            return l_board;        
        }
    
    private int[][] cast_to_primitive_version(Board a_board)
            // Casts 'a_board' into int[][].
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
            // Casts Current into a for dimensional board (3x3x3x3).
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
    
    
// PROPERTIES:   
    int[] one_dimensional_board;
    int[][]primitive_version;
    int[][][][] four_dimensional_board;
    Block block; 
    

    
// SETTINGS:    
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

    private void set_one_dimensional_version(Board a_board)
            // Sets 'primitive_version' with the post cast version of 'a_board'.
        {
            int[] l_one_dimensional_board;
            int[][] l_two_dimensional_board;
            int[][][][] l_four_dimensional_board; 
        
            l_two_dimensional_board = cast_to_primitive_version(a_board);
            l_four_dimensional_board = cast_to_four_dimensional_board(l_two_dimensional_board);
            l_one_dimensional_board = cast_to_full_board(l_four_dimensional_board);
            
            one_dimensional_board = l_one_dimensional_board;
        }           
    
    
// CONSTANTS:    
    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}
