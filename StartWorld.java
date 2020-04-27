import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The StartWorld presents the game title. You can go to the game menu by
 * pressing space
 * @author Lisa, Ron, Dustin
 */
public class StartWorld extends World
{
    /**
     * Constructor for objects of class StartWorld.
     */
    public StartWorld()
    {    
        // Create a new world with 761x707 cells with a cell size of 1x1 pixels.
        super(761, 707, 1); 
        setBackground("StartWorld.PNG");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new GameMenu());
        }
    }
}
