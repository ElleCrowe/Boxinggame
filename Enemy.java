import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor 
{
    GifImage myGif = new GifImage("enemy fighter.gif"); //uploading gif image 
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 1; 
    Gamer gamer; 
    Counter counter; 
    public Enemy ()
    {
        this.counter = counter;
        //gamer = mainGamer; 
        getImage().scale(80,80);
    }

    
    public void act() //act function allowing image and user to move/act 
    {
       setImage( myGif.getCurrentImage() );
       boxerMovement();
       hitByPunchingFighter(); 
    }
    @Override
    protected void addedToWorld(World world) {
        // get all the base stuff done first.
        super.addedToWorld(world);
 
        MyWorld homeWorld = (MyWorld)world;
        counter = homeWorld.getCounter();
        //HealthBar healthbar = homeWorld.getHealthBar(); 
    }