import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the player gets to minimal length, and goes through a checkpoint, he goes
 * to the winning world.
 * @author Lisa, Ron, Dustin
 */
public class WinningWorld extends World
{
    /**
     * Constructor for objects of class WinningWorld.
     */
    public WinningWorld()
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
