import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class point extends score
{
    private GreenfootImage image;
    public point()
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
