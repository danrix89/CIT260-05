package MODEL;

/*
Class Description: Representation of the Sudoku Game Player.
*/

public class Player implements java.io.Serializable
{
/**************************
     INSTANCE VARIABLES:
***************************/   
    String name;

    
/**************************
        SETTINGS:
***************************/    
    public void set_name(String a_name)
            // Sets 'name' with 'a_name'.
        {
            this.name = a_name;
        }
    
}
