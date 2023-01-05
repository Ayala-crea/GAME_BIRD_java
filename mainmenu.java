import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends World
{
    private GreenfootImage image;
    /**
     * Constructor for objects of class mainmenu.
     * 
     */
    public mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(582, 362, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start start = new start();
        addObject(start,281,217);
        removeObject(start);
        button button = new button();
        addObject(button,297,199);
    }
}
