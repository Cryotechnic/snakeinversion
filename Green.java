import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Snake
{
    /**
     * Act - do whatever the Green wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hitObstacle();
        move(4);
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
}
