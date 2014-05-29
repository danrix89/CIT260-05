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
    public Game_View()
            //
        {
            new Game();
        }

    public String get_player_name()
            //
        {
            String l_name = null;
            Scanner l_input = new Scanner(System.in);
            boolean l_boolean = true;
            
            while (l_boolean) 
                {
                print("\n\tPlease enter your name or \"Q\" to return.");          
                l_name = l_input.nextLine();
                
                if (l_name == null  || l_name.length() < 1) 
                    {
                    continue;
                    }
                
                else if (l_name.equals("Q"))
                    {
                    return null;
                    }
                
                else
                    {
                    //internal_game.set_player_name(l_name);
                    // is_name_set = true;
                    }
                l_boolean = false;
                }
            return "Your player name is now set to: " + l_name;
        }
        
    private Game internal_game = new Game();
            // Internal instance of Main_Menu_Control

    private void print(String a_message)
        {
            System.out.println(a_message);
        }
    
}
