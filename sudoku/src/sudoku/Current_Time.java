package sudoku;

import java.util.Calendar;

/**
 *
 * @author Janghun Yu
 */
public class Current_Time {
    public void display()
    
    {         
        Current_Time time = new Current_Time();
        
        Calendar rightNow = Calendar.getInstance();
        int year = rightNow.get(Calendar.YEAR);
        int month =rightNow.get(Calendar.MONTH)+1;
        int dayOfMonth =rightNow.get(Calendar.DAY_OF_MONTH);
        int hour= rightNow.get(Calendar.HOUR_OF_DAY);
        int min =rightNow.get(Calendar.MINUTE);
        System.out.println("Today: " + year+ "/" + month + "/" + dayOfMonth + " Current Hour:" + hour + ":" + min); // Just doing this for the time being
    }
}

