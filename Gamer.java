import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gamer extends Actor
{
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count;
    int health = 100; 
    
    // time player has to move away from enemy before health reduces again
    private final int PUNCH_TIMEOUT = 50;
    public int punchTimer = 0;
    private MyWorld myworld;

    Enemy enemy; 
    Counter counter;
    
    public Gamer()
    {
        this.counter = counter; 
        setImage("Opponent .png");
        getImage().scale(80,80);
    }
    public void act()
    {
        moveAround();
        hitbyEnemy();
        youLose();
    }
    @Override
    protected void addedToWorld(World world) { 
        // get all the base stuff done first.
        super.addedToWorld(world);
 
        MyWorld homeWorld = (MyWorld)world;
        this.myworld = homeWorld;
        counter = homeWorld.getCounter();
    }
    
    public void moveGamer()
    {
        setLocation(getX(),getY());
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +5,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -5,getY());
        }
    }
    public boolean hitbyEnemy()
    {
        
        Actor enemy = getOneIntersectingObject(Enemy.class);
        System.out.println(punchTimer);
        // enemy is overlapping with gamer
        if (enemy != null) {
            if (this.punchTimer == 0) {
                // decrease health on the healthbar
                myworld.healthbar.loseHealth();
            
                if (myworld.healthbar.getHealth() <= 0) {
                    System.out.println("Knock out! Game over.");
                    Greenfoot.stop();
                }
                // reset timer
                this.punchTimer = PUNCH_TIMEOUT;
            } else {
                // decrease timer by 1
                this.punchTimer = this.punchTimer - 1;
                return true;
            }
        } else {
            this.punchTimer = PUNCH_TIMEOUT;
        }
        
        //getWorld().removeObject(Enemy); 
        return false;
    
    }
    public void youLose()
    {
        if (myworld.healthbar.getHealth() <= 0) {
        getWorld().addObject(new YouLose(),500,500);
        System.out.println("Knock out! Game over.");
        Greenfoot.stop();
    }
}
}

