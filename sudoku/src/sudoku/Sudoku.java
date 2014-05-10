package sudoku;
import java.util.Scanner;

/*
Class Description: Representation of the Sudoku Game Application.
*/

public class Sudoku 
{

    public static void main(String[] args)
            // Initializes application.
        {
            Sudoku l_game = new Sudoku();
            Board l_board = new Board();
            Timer l_timer = new Timer();
            
            l_game.get_name();
            l_game.display_instructions();
            l_board.display_title();
            l_timer.display();
        }   
    
    public void get_name()
            // Gets 'name' from the user input.
        {
            Scanner l_input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            this.player_name = l_input.next();
        }
    
    public void display_instructions()
            // Displays 'instructions' upon startup.
        {
            System.out.println("\n Welcome " + this.player_name + "\n");
            System.out.println(this.instructions);
        }  

    String player_name;
            // Name of the player.
    
    String instructions = "Instructions: Have fun!";
            // Instructions given to the user.
    
}
