/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package Tests;

import java.util.ArrayList;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sudoku.Board;

/**
*
* @author devinbost
*/
public class Sudoku_Test_Set {

public Sudoku_Test_Set() 
    {
    }

// @BeforeClass
// public static void setUpClass() {
// }
// 
// @AfterClass
// public static void tearDownClass() {
// }
//@Test
public void Board_IsCast_to_primitive_versionWorking_ReturnsTrue() {
Board a_board = new Board();
System.out.println("Board_IsCast_to_primitive_versionWorking_ReturnsTrue() starting.");
a_board.populate();
for (int i = 0; i < 9; i++) {
for (int j = 0; j < 9; j++) {
System.out.println("a_board[" + i + "][" + j + "] = " + a_board.get(i).get(j) + ";");
}
}
// I was planning to create a test object from the string contents printed in the above text, but I figured out how to solve the problem first.
// A proper unit test will still contain this test object because it is not good for a unit test to depend on your code's data.

System.out.println("Done printing board contents.");
int [][] l_primitive_board = new int[9][9];

ArrayList <Integer> l_block = new ArrayList <Integer>();

for (int i=0; i<9; i++)//iterating over blocks
{
l_block = a_board.get(i);
int[] l_primitive_block = new int[9];
for (int j=0; j<9; j++)//iterating over the cells (or integers)
{
l_primitive_block[j] = l_block.get(j);
}
l_primitive_board[i] = l_primitive_block;

}
System.out.println("Board_IsCast_to_primitive_versionWorking_ReturnsTrue() done.");

// This is where we should perform an assertion to check if the test data matches what the loop produces.
//assertTrue(question instanceof Question);
}
// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}
}
