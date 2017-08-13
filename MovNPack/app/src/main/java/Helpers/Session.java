package Helpers;

/**
 * Created by abdul on 8/13/17.
 */

public class Session {
    public static Session sharedInstance;
    public String name;
    public String password;

    private Session()
    {

    }

    public static Session getInstance()
    {
        if(sharedInstance == null)
        {
            sharedInstance = new Session();
            return  sharedInstance;
        }
        else
            return sharedInstance;
    }


}
