import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Snake
{
    int count;
    public void moveAround(){
        int originalX = getX();
        int originalY = getY();
        
        if (isTouching(RWall.class)) {
            setLocation(originalX, originalY); // FIXME: Add bump sound
        }
    }
    public void act() 
    {
        count++;
        getWorld().addObject(new Green_Tail(maxcount), getX(), getY());
        hitObstacle();
        hitCheckpoint();
        move(4);
        Greenfoot.delay(5);
        
        if(Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right")) {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up")) {
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
        }
    }    
}
