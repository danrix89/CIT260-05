
package sudoku;

public class Custom_Game_Menu_Control 
{
     public Custom_Game_Menu_Control()
            // Constructor for Current.
        {
        }
    
    public void set_prefilled_amount(String a_amount)
            // Sets number of prefilled cells in a 'game' with 'a_amount'.
        {
            int l_amount = Integer.parseInt(a_amount);
            //game.set_prefilled_amount(l_amount);
            print("Your custom game will have " + l_amount + " prefilled cells.");
        }

       public void set_hint_amount(String a_amount)
            // Sets number of hints in a 'game' with 'a_amount'.
        {
            int l_amount = Integer.parseInt(a_amount);
            //game.set_hint_amount(l_amount);
            print("Your custom game will have " + l_amount + " hints.");
        }

    private static void print(String a_message)
        {
            System.out.println(a_message);
        }     
}
