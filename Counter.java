import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score; 
    int money;
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score + "\n Cash:" + money, 10, Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        //setting image for score and money count 
        setImage(new GreenfootImage("Score: " + score  + "\n Cash:" + money, 10, Color.BLACK, new Color(0,0,0,0)));
    }
    public void addScore() // supposed to add 1 each time to the score 
    {
        score++; 
    }    
}
