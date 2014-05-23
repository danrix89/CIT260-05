package sudoku;
import java.util.ArrayList;
import java.util.Scanner;

/*
Class Description: Representation of the sudoku difficulty menu.
*/

public final class Difficulty_Menu_View 
{
            public Difficulty_Menu_View() 
            // default constructor
        {   
                get_player_input();
        } 
    
    public final void display()
            // Displays Current.
        {
            print("\n\t===============================================================");
            print("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < Difficulty_Menu_View.menu_items.length; i++) 
                {
                print("\t   " + menu_items[i][0] + "\t" + menu_items[i][1]);
                }
            print("\t===============================================================\n");
        }

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
                    case "E":
                        //internal_game.set_difficulty(l_command)
                        break;
                    case "M":
                        //internal_game.set_difficulty(l_command)
                        break;
                    case "H":
                        //internal_game.set_difficulty(l_command)
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
    
    private Game internal_game = new Game();
            // Internal instance of Game.
    
    private final static String[][] menu_items = {
                                                    {"E", "Easy - 25 cells are prefilled at the beginning of the game with 3 hints"},
                                                    {"M", "Medium - 20 cells are prefilled at the beginning of the game with 2 hints"}, 
                                                    {"H", "Hard - 10 cells are prefilled at the beginning of the game with 1 hints"},
                                                    {"X", "Exit Menu"}        
                                                 };
    
    private static void print(String a_message)
        {
            System.out.println(a_message);
        }

}