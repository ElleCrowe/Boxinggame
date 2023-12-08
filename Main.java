public class Opponent extends Actor
{
    /**
     * Act - do whatever the Opponent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Opponent()
    {
        getImage().scale(90,90);
    }
    private int speed = 7; 
    
    /** Check keyboard input and act accordingly */
     
    public void act()
    {
        // Add your action code here.
        checkKeys();
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            move(-4);
    
        }
        if (Greenfoot.isKeyDown("right") )
        {
            move(4);
        }
    }

    }