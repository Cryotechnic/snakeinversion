import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Snake
{
    /**
     * Act - do whatever the Blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        hitObstacle();
        move(4);
        if(Greenfoot.isKeyDown("left")) {
            turn(-180);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(180);
        }
        if(Greenfoot.isKeyDown("up")) {
            turn(-90);
        }
        if(Greenfoot.isKeyDown("down")) {
            turn(90);
        }
        
            
    }    
    
}
