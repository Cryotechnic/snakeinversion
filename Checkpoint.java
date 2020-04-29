import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checkpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint extends Snake
{
    public void act() 
    {
        isGameWon();
        detectVictory();
    }   
    
    public boolean isGameWon()
    {

        if (maxcount == 1){
            return true;
        } 
        return false;
    }
    
    public void detectVictory()
    {
        if (isGameWon() == true)
        {
            Greenfoot.setWorld(new WinningWorld());
        }
    }
}
