import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the snake actor that helps guide the actions for the rest of 
 * snake subactors.
 * @author Lisa, Ron, Dustin
 */
public class Snake extends Actor
{
    boolean touchingObstacle = false;
    int maxcount = 2;
    int pointCount = 0;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void hitCheckpoint(){
        Actor checkP = getOneIntersectingObject(Checkpoint.class);
        if(checkP != null){
         maxcount--;
         getWorld().removeObject(checkP);
        }
    }
    public void hitObstacle()
    {
        Actor lava = getOneIntersectingObject(Lava.class);
        if(lava != null)
        {
            World gameWorld = getWorld();
            GameWorld space = (GameWorld)gameWorld;
            HealthBar healthBar = space.getHealthBar();
            if(touchingObstacle == false)
            {
                healthBar.loseHealth();
                touchingObstacle = true;
                if(healthBar.health == 0)
                {
                    Greenfoot.setWorld(new LosingWorld());
                }
            }
        } else {
            touchingObstacle = false;
        }
        
        Actor spikes = getOneIntersectingObject(Spikes.class);
        if(spikes != null)
        {
            World gameWorld = getWorld();
            GameWorld space = (GameWorld)gameWorld;
            HealthBar healthBar = space.getHealthBar();
            if(touchingObstacle == false)
            {
                healthBar.loseHealth();
                touchingObstacle = true;
                if(healthBar.health == 0)
                {
                    Greenfoot.setWorld(new LosingWorld());
                }
            }
        } else {
            touchingObstacle = false;
        }
    }
    
    public int getMaxcount(){
        return maxcount;
    }
}
