public class MyWorld extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        

       addObject(new Enemy(), getWidth()/2, getHeight()/2);
       addObject(new Gamer(), getWidth()/2, getHeight()/2); 
       HealthBar healthbar = new HealthBar();
       addObject(counter,130,100);
       prepare(); 
    }
    
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
    private void prepare()
    {
        addObject(healthbar,200,40); 

    }
    public void act()
    {
     
    }
}
