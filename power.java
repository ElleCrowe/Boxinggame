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