import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Snake
{
    int count;
    
    public void act() 
    {
        count++;
        getWorld().addObject(new Blue_tail(), getX(), getY());
        hitObstacle();
<<<<<<< HEAD
        move(34);
        Greenfoot.delay(5);
=======
        move(32);
        Greenfoot.delay(25);
>>>>>>> 5ec85f0ea342434588115b0e551215d4d3428e5f
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
