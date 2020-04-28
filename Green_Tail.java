import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green_Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green_Tail extends Snake
{
   int count;
   int maxcount;
   public Green_Tail(int max){
       maxcount = max;
       act();
    }
    public void act() 
    {
        count++;
        if(count > maxcount){
            getWorld().removeObject(this);
        }
   }    
}
