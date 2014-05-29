package sudoku;

/*
Class Description: Representation of a sudoku game.
*/

public class Game
{
    public Game()
            // Default constructor of Current.
        {
        }
    
    Player player;
    Board board;
    Timer timer;
    
    public void set_player_name(String a_name)
            //
    {
        if (!(a_name == null))
        {
           player.set_name(a_name);
        }
    }
    

    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
