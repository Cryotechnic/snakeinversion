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
    int maxcount;
    HealthBar healthBar = new HealthBar();
    public Green(int length){
        maxcount = length;
    }
    public void moveAround(){
        int originalX = getX();
        int originalY = getY();
        
        if (isTouching(RWall.class)) {
            setLocation(originalX, originalY); // FIXME: Add bump sound
        }
    }
    public void hitCheckpoint(){
        Actor checkP = getOneIntersectingObject(Checkpoint.class);
        if(checkP != null){
         maxcount--;
         getWorld().removeObject(checkP);
        }
    }
    public boolean isGameWon()
    {

        if (maxcount == 0){
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
    public void act() 
    {
        getWorld().addObject(healthBar,200,30);
        healthBar.update();
        tailGen();
        hitCheckpoint();
        isGameWon();
        isGameLost(healthBar);
        hitObstacle(healthBar);
        detectVictory();
        move(34);
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
    public void tailGen(){
        count++;
        Green_Tail tail = new Green_Tail(maxcount);
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
