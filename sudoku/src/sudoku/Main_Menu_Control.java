package sudoku;

/*
Class Description: Representation of the sudoku Main Menu Controls.
*/

public class Main_Menu_Control 
{
    
    public Main_Menu_Control()
            // Constructor for Current.
        {
        }
    
    public Game new_game()
            // Starts a new game of Sudoku.
        {
            Game l_game = new Game();
            
            return l_game;
        }
    
    public void display_help_menu()
            // Displays the Help_Menu.
        {
            Help_Menu l_help_menu = new Help_Menu();
            
            l_help_menu.display();
            l_help_menu.get_player_input();
        }
    
    public void display_difficulty_menu()
            // Displays the Difficulty_Menu.
        {
            Difficulty_Menu l_difficulty_menu = new Difficulty_Menu();
            
            //l_difficulty_menu.display();
            //l_difficulty_menu.get_player_input();
        }
    
}
