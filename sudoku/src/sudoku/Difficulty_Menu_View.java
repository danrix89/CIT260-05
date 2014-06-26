package sudoku;
import java.util.Scanner;

/*
Class Description: Representation of the sudoku difficulty menu.
*/

public final class Difficulty_Menu_View extends Menu_View
{
    
    public Difficulty_Menu_View() 
            // default constructor
        {   
            super(Difficulty_Menu_View.menu_items);
            get_player_input();  
        } 

    @Override
    public void get_player_input()
            // Display the help menu and get the player's input
        {                    
            String l_command;
            Scanner l_input = new Scanner(System.in);        
            do 
                {
                display();
                l_command = l_input.nextLine();
                l_command = l_command.trim().toUpperCase();
                switch (l_command) 
                    {
                    case "A":
                        // internal_game.set_difficulty
                        break;
                    case "B":
                        // internal_game.set_difficulty
                        break;
                    case "C":
                        // internal_game.set_difficulty
                        break;
                    case "X": 
                        break;
                    default: 
                        new Error_Message().display("Invalid command. Please enter a valid command.");
                        continue;
                    }
                } 
            while (!l_command.equals("X"));
            return;
        }    
    
    public final static String[][] menu_items = {
                                                    {"A", "25 cells are prefilled with 3 hints"},
                                                    {"B", "20 cells are prefilled with 2 hints"}, 
                                                    {"C", "10 cells are prefilled with 1 hints"},
                                                    {"X", "Exit Menu"}        
                                                 };

}


