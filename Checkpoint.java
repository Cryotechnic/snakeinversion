import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checkpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint extends Snake
{
    int count = 0;
    int maxCount = 3;
    public void act() 
    {
        Actor lava = getOneIntersectingObject(Lava.class);
        Actor spikes = getOneIntersectingObject(Spikes.class);
        if(lava != null || spikes != null){
            getWorld().removeObject(this);
            
        }
    }
    }  
