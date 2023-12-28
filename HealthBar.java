import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    
    int health = 4; //how many times the enemy can hit you till you lose 
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
        update(); 
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void act()
    {
       //GifImage myGif = new GifImage("Health Bar.gif"); //uploading gif image
       //GreenfootImage myGif = getGifImage();
        update();
        
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED); 
        myImage.fillRect(1,1, health*pixelsPerHealthPoint, healthBarHeight); 
        //loseHealth();
    }
    
    public void loseHealth()
    {
        health--;
    }

}
