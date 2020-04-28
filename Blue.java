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
        if(getRotation() == 180){
            Blue_tail tail = new Blue_tail(maxcount);
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(0);
            hitObstacle();
        }
        if(getRotation() == 0){
            Blue_tail tail = new Blue_tail(maxcount);
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(180);
            hitObstacle();
        }
        if(getRotation() == 270){
            Blue_tail tail = new Blue_tail(maxcount);
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(90);
            hitObstacle();
        }if(getRotation() == 90){
            Blue_tail tail = new Blue_tail(maxcount);
            getWorld().addObject(tail, getX(), getY());
            tail.setRotation(270);
            hitObstacle();
        }
    }
}
