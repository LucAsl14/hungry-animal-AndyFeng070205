import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenApple extends Actor
{
    /**
     * Act - do whatever the GreenApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
    }
}
