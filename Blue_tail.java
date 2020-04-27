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
    int maxCount;
    public Blue_tail(int max){
        maxCount = max;
        act();
    }
    public void act() 
    {
        count++;
       if(count > maxCount){
           getWorld().removeObject(this);
        }
    } 
}