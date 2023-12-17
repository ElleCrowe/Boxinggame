import greenfoot.*;

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor 
{
    GifImage myGif = new GifImage("enemy fighter.gif"); //uploading gif image 
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public enemy ()
    {
        getImage().scale(80,80);
    }

    
    public void act() //act function allowing image and user to move/act 
    {
       setImage( myGif.getCurrentImage() );
       boxerMovement();
    }
    
    private void boxerMovement() // allowing the user to move key to left or right to move fighter 
    {
        if (Greenfoot.isKeyDown("left") )
        {
            move(-4); 
        }
        
        {
        if (Greenfoot.isKeyDown("right") )
        {
            move(4);
        }
    }
    }
    public void moveAround()
    {
        //if (getX() >= 
    }
    
}
