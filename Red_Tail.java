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
   int maxCount;
   public Green_Tail(int max){
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
