import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the player took too much damage, the player loses and comes to this world.
 * @author Lisa, Ron, Dustin 
 */
public class LosingWorld extends World
{
    /**
     * Constructor for objects of class LosingWorld.
     */
    public LosingWorld()
    {    
        // Create a new world with 632x680 cells with a cell size of 1x1 pixels.
        super(632, 680, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new StartWorld());
        }
    }
}
