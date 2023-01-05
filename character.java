import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class character extends cat
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -8;
    private GreenfootImage image;
    public character()
    {
        image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    /**
     * Act - do whatever the character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if (vSpeed >= 9)
        {
         vSpeed = 8;
        }
    }
    public void moveAround()
    {
      if (Greenfoot.isKeyDown("right"))
      {
        move(4);
      }
      if(Greenfoot.isKeyDown("left"))
      {
          move(-4);
      }
      if (Greenfoot.isKeyDown("space"))
      {
          vSpeed = jumpHeight;
          fall();
      }
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, ground.class);
        return under != null;
    }
    public void checkFalling()
    {
        if (onGround()==false)
        {
            fall();
            
        }
    }
}
