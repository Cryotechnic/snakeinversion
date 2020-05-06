import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeColor extends Actor
{
    String myColor;
    public SnakeColor() 
    {
        setImage(new GreenfootImage("Blue", 20, Color.YELLOW, Color.BLACK));
    }
    public void setColor(String color){
        myColor = color;
        setImage(new GreenfootImage("" + myColor, 20, Color.YELLOW, Color.BLACK));
    }
    public String getColor(){
    return(myColor);
    }
}
