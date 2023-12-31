import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import greenfoot.*;

public void collectPowerUp()
{
    if (isTouching(PowerUps.class))
    {
        removeTouching(PowerUps.class);
    }
}

public class PowerUps extends Actor
{
    int LineScaleDown;
    int acrossScaleDown;


public void act()
{

}

public void scaleDownImage(int x, int y)
{
    // put the scaling factors instead of 'x' and 'y'
    lineScaleDown = x;
    acrossScaleDown = y;

    //Scaling the image down so its small
    // the getWidth and height methods are used to scale down the image eg dividing height and width
    getImage().scale(getImage().getWidth()/LineScaleDown, getImage().getHeight()/acrossScaleDown);
}
}

public class WaterBottle extends PowerUps 
{
    int healthBoost = 5;
    public WaterBottle()
    {
        //resizes the image
        scaleDownImage(x,y);
    }
}

Public class ProteinBar extends PowerUps
{
    int healthBoost = 10;
    public ProteinBar()
    {
        //resizes the image
        scaleDownImage(x,y);
    }
}

public class ChickenLeg extends PowerUps
{
    int healthBoost = 10;
    public ChickenLeg()
    {
        //resizes the image
        scaleDownImage(x,y);
    }
}



















public class HealthBar extends Actor {
    private int HealthBar = 100;
    private int HealthBarHeight;  //input how many pixels high the health bar will be
    private int HealthBarWidth;   // input how many pixels wide HealthBar will be
    private int pixelsPerHealthPoint = (int) HealthBarWidth/Health;

     public HealthBar(int barWidth, int barHeight) {
        healthBarWidth = barWidth;   // Set the width based on the dimensions
        healthBarHeight = barHeight; // Set the height based on dimensions

    
     public void act() {
        // input additional behavior for the health bar here if need be
    }

    public void loseHealth() {
        health -= 5;
        health = Math.max(0, health); // Math is there to ensure the health doesn't go below 0
        updateImage();
    }

    private void updateImage() {
    GreenfootImage image = new GreenfootImage(healthBarWidth, healthBarHeight);
    image.setColor(Color.RED);

    // Calculate the width of the filled portion based on the current health percentage
    int barWidth = (int) (health * healthBarWidth / 100.0);

    // Draw the filled portion of the health bar
    image.fillRect(0, 0, barWidth, healthBarHeight);

    setImage(image);
}


    }
     }





   

    


