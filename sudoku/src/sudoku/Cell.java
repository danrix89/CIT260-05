package sudoku;

/*
Class Description: Representation of an individual cell on "Board".
*/

public class Cell 
{

// Method Group: Initilization
    Cell()
            // Creates an new empty cell.
    {
        set_content("");
    }
    
// Method Group: Settings
    public void set_content(String a_content)
        {
            content = a_content;
        }
    
// Method Group: Status Report   
    public boolean is_filled()
            // Is Current filled?
        {
          return false;
        }
  
    public boolean is_editable(boolean a_condition)
            // Is Current editable?
        {
            if (a_condition)
                {
                    return false;
                }
            else
                {
                    return true;
                }
        }

// Method Group: Instance Variables   
    String content;
            // Content of Current.
    
}
