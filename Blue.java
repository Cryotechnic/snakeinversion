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
    HealthBar healthBar = new HealthBar();
    int maxcount;
    GreenfootSound bumping;
    GreenfootSound gameMusic;
    public Blue(int length){
        maxcount = length;
        bumping = new GreenfootSound("bumping.wav");
        gameMusic = new GreenfootSound("gameplaySound.wav");
    }
    public void moveAround(){
        int originalX = getX();
        int originalY = getY();
        
        if (isTouching(RWall.class)) {
            setLocation(originalX, originalY);
        }
    }
    public void hitCheckpoint(){
        Actor checkP = getOneIntersectingObject(Checkpoint.class);
        if(checkP != null){
         maxcount--;
         getWorld().removeObject(checkP);
         bumping.play();
        }
    }
    public boolean isGameWon()
    {

        if (maxcount == 0){
            gameMusic.stop();
            return(true);
        } 
        return(false);
    }
    public void detectVictory()
    {
        if (isGameWon() == true)
        {
            Greenfoot.setWorld(new WinningWorld());
        }
    }
    public void isGameLost(HealthBar healthBar){
        if(healthBar.health == 0)
        {
            gameMusic.stop();
            Greenfoot.setWorld(new LosingWorld());    
        }
    }
    public void act() 
    {
        getWorld().addObject(healthBar,200,30);
        gameMusic.playLoop();
        healthBar.update();
        tailGen();
        hitCheckpoint();
        isGameWon();
        isGameLost(healthBar);
        hitObstacle(healthBar);
        detectVictory();
        move(34);
        Greenfoot.delay(5);
        checkGen();

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
    public void tailGen(){
        
        Blue_tail tail = new Blue_tail(maxcount);
        if(getRotation() == 180){
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(0);
        }
        if(getRotation() == 0){
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(180);            
        }
        if(getRotation() == 270){
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(90);            
        }
        if(getRotation() == 90){
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(270);
        }
    }
    
}
