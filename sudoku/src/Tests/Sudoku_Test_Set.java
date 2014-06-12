package Tests;
import java.util.ArrayList;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sudoku.Board;

/*
    Class Description: The test set for testing all functions of the sudoku game.
*/

public class Sudoku_Test_Set {

    
    public Sudoku_Test_Set()
            // Default constructor.
        {
        }

//TESTS:
    public void test_row_for_checking()
            //
        {
            Board l_class_board = new Board();
            int[][][][] l_board = testable_board();
            //int[] l_row_for_checking = l_class_board.getClass().getDeclaredMethod("row_for_checking", ???);
            //int[] l_row_for_checking = l_class_board.row_for_checking;
        
        }
    
//CONSTANTS (MOCKS):    
    private int[][][][] testable_board()
            // Testable version of the 3x3x3x3 board.
    {
        int[][][][] l_board = new int [3][3][3][3];
        //Block #1
        l_board [0][0][0][0] = 3;
        l_board [0][0][0][1] = 5;
        l_board [0][0][0][2] = 4;
        l_board [0][0][1][0] = 9;
        l_board [0][0][1][1] = 2;
        l_board [0][0][1][2] = 1;
        l_board [0][0][2][0] = 7;
        l_board [0][0][2][1] = 8;
        l_board [0][0][2][2] = 6;
        //Block #2
        l_board [0][1][0][0] = 9;
        l_board [0][1][0][1] = 1;
        l_board [0][1][0][2] = 4;
        l_board [0][1][1][0] = 3;
        l_board [0][1][1][1] = 8;
        l_board [0][1][1][2] = 5;
        l_board [0][1][2][0] = 7;
        l_board [0][1][2][1] = 2;
        l_board [0][1][2][2] = 6;
        //Block #3
        l_board [0][2][0][0] = 4;
        l_board [0][2][0][1] = 1;
        l_board [0][2][0][2] = 8;
        l_board [0][2][1][0] = 6;
        l_board [0][2][1][1] = 5;
        l_board [0][2][1][2] = 3;
        l_board [0][2][2][0] = 9;
        l_board [0][2][2][1] = 2;
        l_board [0][2][2][2] = 7;
        //Block #4
        l_board [1][0][0][0] = 9;
        l_board [1][0][0][1] = 6;
        l_board [1][0][0][2] = 3;
        l_board [1][0][1][0] = 4;
        l_board [1][0][1][1] = 2;
        l_board [1][0][1][2] = 5;
        l_board [1][0][2][0] = 1;
        l_board [1][0][2][1] = 7;
        l_board [1][0][2][2] = 8;
        //Block #5
        l_board [1][1][0][0] = 7;
        l_board [1][1][0][1] = 1;
        l_board [1][1][0][2] = 5;
        l_board [1][1][1][0] = 2;
        l_board [1][1][1][1] = 4;
        l_board [1][1][1][2] = 3;
        l_board [1][1][2][0] = 9;
        l_board [1][1][2][1] = 8;
        l_board [1][1][2][2] = 6;
        //Block #6
        l_board [1][2][0][0] = 6;
        l_board [1][2][0][1] = 7;
        l_board [1][2][0][2] = 5;
        l_board [1][2][1][0] = 9;
        l_board [1][2][1][1] = 8;
        l_board [1][2][1][2] = 2;
        l_board [1][2][2][0] = 1;
        l_board [1][2][2][1] = 4;
        l_board [1][2][2][2] = 3;
        //Block #7
        l_board [2][0][0][0] = 3;
        l_board [2][0][0][1] = 9;
        l_board [2][0][0][2] = 7;
        l_board [2][0][1][0] = 4;
        l_board [2][0][1][1] = 2;
        l_board [2][0][1][2] = 1;
        l_board [2][0][2][0] = 8;
        l_board [2][0][2][1] = 6;
        l_board [2][0][2][2] = 5;
        //Block #8
        l_board [2][1][0][0] = 1;
        l_board [2][1][0][1] = 7;
        l_board [2][1][0][2] = 5;
        l_board [2][1][1][0] = 6;
        l_board [2][1][1][1] = 9;
        l_board [2][1][1][2] = 3;
        l_board [2][1][2][0] = 7;
        l_board [2][1][2][1] = 8;
        l_board [2][1][2][2] = 2;
        //Block #9
        l_board [2][2][0][0] = 8;
        l_board [2][2][0][1] = 9;
        l_board [2][2][0][2] = 6;
        l_board [2][2][1][0] = 5;
        l_board [2][2][1][1] = 2;
        l_board [2][2][1][2] = 4;
        l_board [2][2][2][0] = 7;
        l_board [2][2][2][1] = 3;
        l_board [2][2][2][2] = 1;
        
        return l_board;
    }
    
    private void print (String a_message)
        {
            System.out.println(a_message);
        }


    
    
    
    
    // Test code provided by Devin Bost...
    
    public void board_is_cast_to_primitive_version_working_returns_true() 
        {
            Board l_board = new Board();
            print("board_is_cast_to_primitive_version_working_returns_true() starting.");
            l_board.populate();
            for (int i = 0; i < 9; i++) 
                {
                    for (int j = 0; j < 9; j++) 
                        {
                        print("l_board[" + i + "][" + j + "] = " + l_board.get(i).get(j) + ";");
                        }
                }
            // I was planning to create a test object from the string contents printed in the above text, but I figured out how to solve the problem first.
            // A proper unit test will still contain this test object because it is not good for a unit test to depend on your code's data.
            print("Done printing board contents.");
            int [][] l_primitive_board = new int[9][9];

            ArrayList <Integer> l_block = new ArrayList <Integer>();

            for (int i=0; i<9; i++)//iterating over blocks
                {
                    l_block = l_board.get(i);
                    int[] l_primitive_block = new int[9];
                    for (int j=0; j<9; j++)//iterating over the cells (or integers)
                        {
                            l_primitive_block[j] = l_block.get(j);
                        }
                    l_primitive_board[i] = l_primitive_block;

                }       
            print("board_is_cast_to_primitive_version_working_returns_true() done.");
            // This is where we should perform an assertion to check if the test data matches what the loop produces.
            //assertTrue(question instanceof Question);
        }    
    
    
}


