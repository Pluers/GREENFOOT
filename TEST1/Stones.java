import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stones extends Actor
{
    /**
     * Act - do whatever the Stones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public void addedToWorld(World world)
    {
        while (isTouching(null))          //check if any overlap occurs
        {
            setLocation(Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(600));     //random location for asteroids        
        }
        
    }
}
