package sudoku;
import java.util.Scanner;

/*
Class Description: Representation of the sudoku Main Menu.
*/

public class Custom_Game_Menu_View extends Menu_View 
{

    public Custom_Game_Menu_View() 
            // default constructor
        {
            get_player_input();
        } 
    
    public final void display()
            // Displays Current.
                {
            print("\n\t===============================================================");
            print("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < Custom_Game_Menu_View.menu_items.length; i++) 
                {
                print("\t   " + menu_items[i][0] + "\t" + menu_items[i][1]);
                }
            print("\t===============================================================\n");
        }

    public final void get_player_input()
            //Display the main menu and get the player's input
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
                    case "P":
                        print("Enter number of prefilled cells of your custom game.");
                        l_command = l_input.nextLine();
                        l_command = l_command.trim();
                        internal_custom_game_menu_control.set_prefilled_amount(l_command);
                        break;
                    case "H":
                        print("Enter number of hints of your custom game.");
                        l_command = l_input.nextLine();
                        l_command = l_command.trim();
                        internal_custom_game_menu_control.set_hint_amount(l_command);
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
    
    public void get_player_name()
            // Gets 'player_name' from the user input.
        {
            Scanner l_input = new Scanner(System.in);
            print("Enter your name: ");
            player_name = l_input.next();
        }   

    String player_name;
            // Name of the player.
    
    private Custom_Game_Menu_Control internal_custom_game_menu_control = new Custom_Game_Menu_Control();
            // Internal instance of Main_Menu_Control
    
    private final static String[][] menu_items = {
                                                    {"P", "Set number of Prefilled cells"},
                                                    {"H", "Set number of Hints"},        
                                                    {"X", "Exit game"}        
                                                 };
    
}
