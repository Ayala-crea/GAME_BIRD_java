import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dead extends Actor
{
        private GreenfootImage image;
    public dead()
    {
        image = getImage();
        image.scale(image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
