package sudoku;

/*
Class Description: Representation of a sudoku game.
*/

public class Game
{
    public Game(String a_name)
            // Default constructor of Current.
        {
            player = new Player();
            player.set_name(a_name);
            print("\n\tYour player name has been set to: " + a_name);
            
            board = new Board();
            new Player_Input_View();
        }
    
    
    
    Player player;
    Board board;
    int[][][][] p_board;
    Timer timer;

    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
