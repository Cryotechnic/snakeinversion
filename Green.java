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
    public void moveAround(){
        int originalX = getX();
        int originalY = getY();
        
        if (isTouching(RWall.class)) {
            setLocation(originalX, originalY); // FIXME: Add bump sound
        }
    }
    public void act() 
    {
        tailGen();
        hitCheckpoint();
        isGameWon();
        hitObstacle();
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
