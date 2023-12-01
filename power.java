package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

class PowerUp {
    String name;
    int coinsRequired, energyBoost, x, y;

    public PowerUp(String name, int coinsRequired, int energyBoost, int x, int y) {
        this.name = name;
        this.coinsRequired = coinsRequired;
        this.energyBoost = energyBoost;
        this.x = x;
        this.y = y;
    }
}

class Player {
    int energy, coins;

    public Player() {
        energy = 100;
        coins = 0;
    }

    public void collectCoin() {
        coins++;
    }

    public void buyPowerUp(PowerUp powerUp) {
        if (coins >= powerUp.coinsRequired) {
            coins -= powerUp.coinsRequired;
            energy += powerUp.energyBoost;
            System.out.println("Bought " + powerUp.name + "! Energy boosted by " + powerUp.energyBoost + "%");
        } else {
            System.out.println("Not enough coins to buy " + powerUp.name);
        }
    }
}

class GamePanel extends JPanel {
    private Player player;
    private Timer energyTimer;
    private PowerUp[] powerUps;

    public GamePanel() {
        player = new Player();
        powerUps = new PowerUp[]{
                new PowerUp("Water Bottle", 3, 5, 100, 100),
                new PowerUp("Protein Bar", 5, 10, 300, 200),
                new PowerUp("Chicken Leg", 10, 20, 500, 300)
        };

        energyTimer = new Timer();
        energyTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                player.collectCoin();
                repaint();
            }
        }, 0, 10000);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handlePowerUpClick(e);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Energy: " + player.energy + "%", 10, 20);
        g.drawString("Coins: " + player.coins, 10, 40);

        for (PowerUp powerUp : powerUps) {
            g.setColor(Color.BLUE);
            g.fillRect(powerUp.x, powerUp.y, 20, 20);
            g.setColor(Color.BLACK);
            g.drawString(powerUp.name, powerUp.x + 25, powerUp.y + 15);
        }
    }

    private void handlePowerUpClick(MouseEvent e) {
        for (PowerUp powerUp : powerUps) {
            if (isClickedOnPowerUp(e, powerUp)) {
                player.buyPowerUp(powerUp);
                break;
            }
        }
    }

    private boolean isClickedOnPowerUp(MouseEvent e, PowerUp powerUp) {
        return e.getX() >= powerUp.x &&
               e.getX() <= powerUp.x + 20 &&
               e.getY() >= powerUp.y &&
               e.getY() <= powerUp.y + 20;
    }
}

public class power {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boxing Game");
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

