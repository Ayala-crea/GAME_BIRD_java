import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arena1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arena1 extends World
{

    /**
     * Constructor for objects of class arena1.
     * 
     */
    public arena1()
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
        build1 build1 = new build1();
        addObject(build1,79,313);
        build1.setLocation(38,336);
        build2 build2 = new build2();
        addObject(build2,136,339);
        build2.setLocation(124,347);
        build3 build3 = new build3();
        addObject(build3,210,323);
        build2 build22 = new build2();
        addObject(build22,332,349);
        build1 build12 = new build1();
        addObject(build12,427,343);
        build12.setLocation(417,334);
        jalanatas jalanatas = new jalanatas();
        addObject(jalanatas,370,195);
        build4 build4 = new build4();
        addObject(build4,494,322);
        build3 build32 = new build3();
        addObject(build32,563,312);
        build32.setLocation(571,320);
        character character = new character();
        addObject(character,1,-8);
        character.setLocation(33,256);
        point point = new point();
        addObject(point,137,267);
        point.setLocation(128,273);
        point point2 = new point();
        addObject(point2,206,223);
        point2.setLocation(210,228);
        point point3 = new point();
        addObject(point3,356,153);
        point3.setLocation(317,167);
        point point4 = new point();
        addObject(point4,427,170);
        point4.setLocation(418,167);
        awan awan = new awan();
        addObject(awan,173,64);
        awan awan2 = new awan();
        addObject(awan2,469,57);
        bird2 bird2 = new bird2();
        addObject(bird2,549,148);
        bird2.setLocation(550,148);
        bird1 bird1 = new bird1();
        addObject(bird1,575,203);
        bird1.setLocation(529,214);
        bird1.setLocation(523,212);
        bird2 bird22 = new bird2();
        addObject(bird22,345,243);
        bird22.setLocation(345,215);
        bird22.setLocation(344,226);
    }
}
