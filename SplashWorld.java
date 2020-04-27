import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The SplashWorld appears for 3 seconds when the scenario begins,
 * then transitions automatically to the StartWorld.
 * @author Lisa, Ron, Dustin 
 */
public class SplashWorld extends World
{
  private int counter;
    /**
     * Constructor for objects of class SplashWorld.
     */
    public SplashWorld()
    {    
        // Create a new world with 721x600 cells with a cell size of 1x1 pixels.
        super(721, 600, 1); 
        setBackground("SplashWorld.png");
    }
    
    public void act()
    {
        //Transition to StartWorld after 3 seconds
        if (++counter == 170)
        {
        Greenfoot.setWorld(new StartWorld());
        }
    }
}
