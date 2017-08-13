package Helpers;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by abdul on 8/13/17.
 */

public class Utility {


    public static void makeToast(String text, Context c)
    {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
    }


}
