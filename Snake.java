import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the snake actor that helps guide the actions for the rest of 
 * snake subactors.
 * @author Lisa, Ron, Dustin
 */
public class Snake extends Actor
{
    boolean touchingObstacle = false;
    
    int pointCount = 0;
    
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
    public void checkGen(){
        Checkpoint checkpoint = new Checkpoint();
        World world = getWorld();
        int x = Greenfoot.getRandomNumber(813);
        if(x < 90){
            x = 90;
        }
        int y = Greenfoot.getRandomNumber(610);
        if(y < 90){
            y = 90;
        }
        if (world.getObjects(Checkpoint.class).isEmpty()){
            getWorld().addObject(checkpoint, x, y);
        }
        
        
    }
    
    
    public void hitObstacle(HealthBar healthBar)
    {
        GreenfootSound lostGame;
        lostGame = new GreenfootSound("lostGame.mp3");
        Actor lava = getOneIntersectingObject(Lava.class);
        if(lava != null)
        {
            World gameWorld = getWorld();
            GameWorld space = (GameWorld)gameWorld;
            healthBar.loseHealth();
            healthBar.update();
            if(touchingObstacle == false)
            {
                touchingObstacle = true;
            }
        } else {
            touchingObstacle = false;
        }
        
        Actor spikes = getOneIntersectingObject(Spikes.class);
        if(spikes != null)
        {
            World gameWorld = getWorld();
            GameWorld space = (GameWorld)gameWorld;
            if(touchingObstacle == false)
            {
                healthBar.loseHealth();
                touchingObstacle = true;
                if(healthBar.health == 0)
                {
                    lostGame.play();
                    Greenfoot.setWorld(new LosingWorld());
                }
            }
        } else {
            touchingObstacle = false;
        }
    }
    public void isGameLost(HealthBar healthBar){
        GreenfootSound lostGame;
        lostGame = new GreenfootSound("lostGame.mp3");
        if(healthBar.health == 0)
        {
         
            Greenfoot.setWorld(new LosingWorld());
        }
    }
}
