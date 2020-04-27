import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue_tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue_tail extends Snake
{
    int count;
    public Blue_tail(){
        act();
    }
    public void act() 
    {
        count++;
       if(count > 15){
           getWorld().removeObject(this);
        }
    } 
}
