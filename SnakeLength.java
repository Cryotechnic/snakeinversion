import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeLength here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeLength extends Actor
{
    int myLength;
    public SnakeLength() 
    {
        setImage(new GreenfootImage("10", 20, Color.YELLOW, Color.BLACK));
    }
    public void setLength(int length){
        myLength = length;
        setImage(new GreenfootImage("" + myLength, 20, Color.YELLOW, Color.BLACK));
    }
    public int getLength(){
    return(myLength);
    }
}
