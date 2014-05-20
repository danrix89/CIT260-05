package sudoku;

/*
Class Description: Representation of a 3x3 cell block on a sudoku game board.
*/

public class Help_Menu 
{

    public Help_Menu()
            // Constructor for Current.
        {
        }
    
    public void display_rules()
            // Displays rules of Sudoku.
        {
            this.display_boarder();
            this.print(
                        "\tRules of Sudoku:"
                      + "\n\t\tFill in each cell with the numbers 1-9, ensuring that"
                      + "\n\t\teach row, column, and 3x3 block has no duplicates."
                      + "\n\t\tEach row should have it's own set of numbers starting"
                      + "\n\t\tfrom 1 going to 9 without duplicates. Each column and"
                      + "\n\t\t3x3 block should do the same. There is only one"
                      + "\n\t\tsolution for each game."
                        );
            this.display_boarder();
        }
    
    public void display_board_help()
            // Displays basic layout and terminology of a Sudoku board.
        {
            this.display_boarder();
            this.print(
                        "\tBasic Board Layout"                
                      + "\n\t\tThe Sudoku board consists of four parts:"
                      + "\n\t\t\tCells - Individual boxes that you place a number into."        
                      + "\n\t\t\tRows - Set of nine cells going horizontally across the board."        
                      + "\n\t\t\tColumns - Set of nine cells going vertically across the board."        
                      + "\n\t\t\tBlocks - 3x3 set of cells \"blocked\" together."        
                      + "\n\t\tThere are nine of each, all holding the numbers"
                      + "\n\t\t1-9 with no duplicates."
                      );
            this.display_boarder();
        }
    
    public void display_difficulty_help()
            // Displays rules of Sudoku.
        {
            this.display_boarder();
            this.print(
                        "\tDifficulty Types:"
                      + "\n\t\tEasy: 25 cells are prefilled at the beginning of"
                      + "\n\t\t\tthe game with 3 hints."
                      + "\n\t\tMedium: 20 cells are prefilled at the beginning of"
                      + "\n\t\t\tthe game with 2 hints."
                      + "\n\t\tHard: 10 cells are prefilled at the beginning of"
                      + "\n\t\t\tthe game with 1 hint."
                      );
            this.display_boarder();
        }
    
     public void display_scoring_help()
            // Displays how scores are calculated.
        {
            this.display_boarder();
            this.print(
                        "\tHow are High Scores Determined?"
                      + "\n\t\tFirst, scoring is calculated by how long it takes"
                      + "\n\t\ta player to complete a game. A hight score is"
                      + "\n\t\tachieved when a player completes a board with less"        
                      + "\n\t\ttime than the three previous high scores. There"
                      + "\n\t\talso three categories of high scores depending on"
                      + "\n\t\tdificulty of the game played."
                      );
            this.display_boarder();
        }
    
   public void display_boarder()
            // Creates a boarder around 
        {       
            this.print(
                       "\n\t***************************************************"
                     + "\n\t***************************************************"
                      );
        }

    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}
