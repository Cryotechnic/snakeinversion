import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the health is at 0, the player loses. 
 * @author Lisa, Ron, Dustin
 */
public class HealthBar extends Snake
{
    int health;
    int healthBarWidth;
    int healthBarHeight;
    int pixelsPerHealthPoint;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar(){
        this.health = 50;
        this.healthBarWidth = 250;
        this.healthBarHeight = 25;
        this.pixelsPerHealthPoint = (int)healthBarWidth/health;
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
