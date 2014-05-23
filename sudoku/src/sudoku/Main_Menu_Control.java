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
            new Help_Menu_View();
        }
    
    public void display_difficulty_menu()
            // Displays the Difficulty_Menu.
        {
            Difficulty_Menu_View l_difficulty_menu = new Difficulty_Menu_View();
            
        }
    
}
