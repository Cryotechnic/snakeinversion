import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameMenu gives the options for the user
 * @author Lisa, Ron, Dustin 
 */
public class GameMenu extends World
{
    /**
     * Constructor for objects of class GameMenu.
     */
    public GameMenu()
    {    
        // Create a new world with 600x450 cells with a cell size of 1x1 pixels.
        super(600, 450, 1); 
        setBackground("GameMenu.PNG");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("D"))
        {
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
