package sudoku;
import java.util.Scanner;

/*
Class Description: View that gets and handles player input during the game.
*/

public class Player_Input_View {

    public Player_Input_View(Game a_game)
            // Default constructor of Current.
        {
            this.game = a_game;
            get_player_input(game.player);
        } 
    
    public String get_player_input(Player a_player)
            //
        {

            String l_input = null;      
            boolean l_boolean = true;
            while (l_boolean) 
                {
                print("\n\n\t" + a_player.name + ", please enter something or \"R\" to return.");          
                l_input = new Scanner(System.in).nextLine();
                if (l_input == null  || l_input.length() < 1) 
                    {
                    continue; // Resets the loop.
                    }
                l_input = l_input.substring(0, 1).toUpperCase();
                if (l_input.equals("R")) 
                    {
                    return null;
                    }
                l_boolean = false;
                }
            return l_input;
        }
    
    private Game game;
    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
     
}
