import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * GameMenu gives the options for the user
 * @author Lisa, Ron, Dustin 
 */
public class GameMenu extends World
{
    boolean position = false;
    int snakeLength = 10;
    String snakeColor = "Blue";
    int snakeColorNum = 1;
    GreenfootSound gameMenu;
    SnakeLength snakeShowLength = new SnakeLength();
    SnakeColor snakeShowColor = new SnakeColor();
    Snake snake = new Snake();
    
    public GameMenu()
    {    
        // Create a new world with 600x450 cells with a cell size of 1x1 pixels.
        super(600, 450, 1);
        setBackground("GameMenu.PNG");
        gameMenu = new GreenfootSound("gameMenu.mp3");
        
        addObject(snakeShowLength, 243, 244);
        addObject(snakeShowColor, 243, 377);
    }

    public void act()
    {
        if(!position){
            if(Greenfoot.isKeyDown("left")){
                Greenfoot.delay(10);
                if(snakeLength > 2){
                    snakeLength--;
                    
                }
            }
            if(Greenfoot.isKeyDown("right")){
                Greenfoot.delay(10);
                if(snakeLength < 20){
                    snakeLength++;
                    
                }
            }  
        }
        snakeShowLength.setLength(snakeLength);
        if(position){
            if(Greenfoot.isKeyDown("left")){
                Greenfoot.delay(10);
                if(snakeColorNum > 1 ){
                    snakeColorNum--;
                }
            }
            if(Greenfoot.isKeyDown("right")){
                Greenfoot.delay(10);
                if(snakeColorNum < 3){
                    snakeColorNum++;
                }
            }  
        }
        
        if(snakeColorNum == 1){
            snakeColor = "Blue";
        }
        if(snakeColorNum == 2){
            snakeColor = "Green";
        }
        if(snakeColorNum == 3){
            snakeColor = "Red";
        }
        snakeShowColor.setColor(snakeColor);
        if(Greenfoot.isKeyDown("space"))
        {
            position = true;
        }
        if(Greenfoot.isKeyDown("D"))
        {
            Greenfoot.setWorld(new GameWorld(snakeColor,snakeLength));
           
        }
        gameMenu.playLoop();
        
    }
    
    
}
