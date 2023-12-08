import greenfoot.*;

public class PowerUp extends Actor {
    protected int energyBoost;

    public PowerUp(int energyBoost) {
        this.energyBoost = energyBoost;
    } 

public void act() {
    checkCollision();
}

protected void checkCollision() {
    if (isTouching(Player.class)) {
        Player player = (Player) getOneIntersectingObject(Player.class);
        applyPowerUp(player);
        getWorld().removeObject(this);
    }
}

protected void applyPowerUp(Player player) {
    player.applyEnergyBoost(energyBoost);
    }

}

    public class WaterBottle extends PowerUp {
        public WaterBottle() {
            super(5);
            setImage(new GreenfootImage("water_bottle.png"));
        }
    }

    public class ProteinBar extends PowerUp {
        public ProteinBar() {
            super(10);
            setImage(new GreenfootImage("protein_bar.png"));
        }
    }

public class ChickenLeg extends PowerUp {
    public ChickenLeg() {
        super(20);
        setImage(new GreenfootImage("chicken.leg.png"));
    }
}

public class Player extends Actor (
    private int energy = 100;

    public void act() {
        checkCollisionWithPowerUps();
}

private void checkCollisionWithPowerUps() {
    if (isTouching(PowerUp.class)) {
        PowerUp powerUp = (PowerUp) getOneIntersectingObject(PowerUp.class);
        applyEnergyBoost(powerUp.getEnergyBoost());
        getWorld().removeObject(powerUp);
    
    }
}

public void applyEnergyBoost(int Boost) {
    energy += (energy*boost) /100;

    //add any other actions for when the player/ actor gets boost. OR obtains powerups.

    }

)



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


public class EnergyBar extends Actor {
    private int energy = 100;
    private int energyBarHeight;  //height of the energybar in pixels
    private int energyBarWidth;   // height of the energy bar in pixels
    private int pixelsPerEnergyPoint;
    private int energyRegenerationRate = 2; //2% energy regen every 10 seconds 

public EnergyBar (int barWidth, int barHeight) {
        energyBarWidth = barWidth;
        energyBarHeight = barHeight;

        calculatePixelsPerEnergyPoint();  
        updateImage();
    }

public void loseEnergyOnPunch() {
    loseEnergy(5);
}

 private void loseEnergy(int amount) {
        energy -= amount;
        energy = Math.max(0, energy);  //This is so the energy never goes below 0
        updateImage();
    }

private void regenerateEnergy() {
    energy += energyRegenerationRate;
    energy = Math.max(100, energy); 
    updateImage();
}

private void calculatePixelsPerEnergyPoint() {
    pixelsPerEnergyPoint = Math.max(1, energyBarWidth / 5);

    }

    private void updateImage() {
    GreenfootImage image = new GreenfootImage(energyBarWidth, energyBarHeight);
    image.setColor(Colour.BLUE);



}


}
    
     

   

    


