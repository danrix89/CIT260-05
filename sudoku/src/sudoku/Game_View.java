/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;

/**
 *
 * @author drix
 */
public class Game_View 
{
/**************************
        CONSTRUCTORS:
***************************/
    public Game_View()
            // Creates current with a new game using player_name.
        {
            String l_name = get_player_name();
            new Game(l_name);            
        }
    
    public Game_View(Game a_loaded_game)
            // Creates Current with a_loaded_game.
        {
            new Game(a_loaded_game);
        }
    
    
/**************************
      BASIC METHODS:
***************************/
    public String get_player_name()
            //
        {
            String l_name = null;
            Scanner l_input = new Scanner(System.in);
            boolean l_boolean = true;
            
            while (l_boolean) 
                {
                print("\n\tPlease enter your name or \"R\" to return. \n");          
                l_name = l_input.nextLine();
                
                if (l_name == null  || l_name.length() < 1) 
                    {
                    continue;
                    }
                
                else if (l_name.equals("R"))
                    {
                    return null;
                    }
                l_boolean = false;
                }
            return l_name;
        }


/**************************
          CONSTANTS:
***************************/    
    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
