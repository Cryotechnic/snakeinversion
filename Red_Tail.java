import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Red_Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red_Tail extends Snake
{
   int count;
   public Green_Tail(){
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
