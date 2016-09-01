

public class elevator
{
    // instance variables - replace the example below with your own
    private int current_level;
    private int top_level;  
    private int bottom_level;
    public elevator()
    {
        // initialise instance variables
        current_level = 0;
        top_level = 7;
        bottom_level = 0;
    }

    public void ascend()
    {
        if (current_level < top_level)
        {
            current_level = current_level + 1;
        }
        else{
            System.out.println("Sorry you are on the top level");
        }
    }
 
    public void decend()
    {
        if (current_level > bottom_level)
        {
            current_level = current_level - 1;
        }
        else{
            System.out.println("Sorry you are at the bottom");
        }
    }
}
