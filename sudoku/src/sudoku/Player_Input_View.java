package sudoku;
import java.util.Scanner;

/*
Class Description: View that gets and handles player input during the game.
*/

public class Player_Input_View {

    public Player_Input_View(Game game)
            // Default constructor of Current.
        {
            this.game = game;

        } 
    
    public String get_player_input(Player a_player)
            //
        {

            String l_number = null;
            Scanner l_input = new Scanner(System.in);       
            boolean l_boolean = true;
            while (l_boolean) 
                {
                print("\n\t" + a_player.name + ", enter a single character that will be used to mark your squares in the game.");          
                l_number = l_input.nextLine();
                if (l_number == null  || l_number.length() < 1) 
                    {
                    continue;
                    }
                l_number = l_number.substring(0, 1).toUpperCase();
                if (l_number.equals("Q")) 
                    {
                    return null;
                    }

                // Check to see if the marker is already in use
//                if (this.game.player.marker.equals(l_number)) 
//                    {
//                    new Error_Message().display("This marker is currently in use. Select a different character");
//                    continue; 
//                    }
                l_boolean = false; // signal that a valid marker was entered
                }
            return l_number;
        }
    
    private Game game;
    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
     
}
