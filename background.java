import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        level1 level1 = new level1();
        addObject(level1,258,195);
        level1.setLocation(257,215);
        level1.setLocation(332,177);
        start start = new start();
        addObject(start,544,352);
        start.setLocation(294,352);
        level1.setLocation(308,123);
        start.setLocation(304,273);
        start.setLocation(302,266);
        removeObject(start);
        addObject(start,305,277);
        start.setLocation(319,293);
    }
}
