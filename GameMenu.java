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

    public GameMenu()
    {    
        // Create a new world with 600x450 cells with a cell size of 1x1 pixels.
        super(600, 450, 1);
        setBackground("GameMenu.PNG");
        
    }

    public void act()
    {
        GreenfootSound gameMenu = new GreenfootSound("gameMenu.mp3");
        if(!position){
            if(Greenfoot.isKeyDown("left")){
                if(snakeLength > 2){
                    snakeLength--;
                }
            }
            if(Greenfoot.isKeyDown("right")){
                if(snakeLength < 20){
                    snakeLength++;
                }
            }  
        }
        if(position){
            if(Greenfoot.isKeyDown("left")){
                if(snakeColorNum > 1 ){
                    snakeColorNum--;
                }
            }
            if(Greenfoot.isKeyDown("right")){
                if(snakeColorNum < 3){
                    snakeColorNum++;
                }
            }  
        }
        
        if(snakeColorNum == 1){
            snakeColor = "blue";
        }
        if(snakeColorNum == 2){
            snakeColor = "Green";
        }
        if(snakeColorNum == 3){
            snakeColor = "Red";
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            position = true;
        }
        if(Greenfoot.isKeyDown("D"))
        {
            Greenfoot.setWorld(new GameWorld());
        }
        gameMenu.playLoop();
        GreenfootImage bg = getBackground();
        Font font = new Font(50);
        bg.setFont(font);
        bg.setColor(Color.YELLOW);
        bg.drawString(Integer.toString(snakeLength), 200, 240);
        bg.drawString(snakeColor, 200, 390);
    }
}
