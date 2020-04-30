import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the health is at 0, the player loses. 
 * @author Lisa, Ron, Dustin
 */
public class HealthBar extends Snake
{
    int health = 50;
    int healthBarWidth = 250;
    int healthBarHeight = 25;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
        update();
        loseHealth();
    }
    public void act() 
    {
        update();
    }    
    //Draw the health bar
    public void update()
    {
       setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight +2));
       GreenfootImage myImage = getImage();
       myImage.setColor(Color.WHITE);
       myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight +1);
       myImage.setColor(Color.RED);
       myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }
    //Lose health when touching obstacles
    public void loseHealth()
    {
        health = health-1;
    }
}
