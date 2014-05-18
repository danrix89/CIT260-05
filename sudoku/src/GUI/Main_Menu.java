package GUI;

import java.util.Scanner;

/*
Class Description: Representation of the Sudoku Game's Main Menue.
*/

public class Main_Menu
{

    public void get_player_name()
            // Gets 'player_name' from the user input.
        {
            Scanner l_input = new Scanner(System.in);
            log("Enter your name: ");
            this.player_name = l_input.next();
        }   

    String player_name;
            // Name of the player.
    
    private static void log(String a_message)
        {
            System.out.println(a_message);
        }

}
