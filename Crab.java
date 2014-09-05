import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Crab extends Animal //#constructor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
        /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");       
        wormsEaten =0;
    }
        /**
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        lookForWorm();
        switchImage();
        checkKeyPress();
    } 
        /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(2);
        }
    }
    /** Turn at EDge- when the Crab its the edge, it will turn 17 degrees.**/
    public void turnAtEdge()
    {
        if ( atWorldEdge()) 
        {
            turn(17);
        }    
    }
        /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if(canSee(Worm.class))
        {
          eat(Worm.class);
          wormsEaten=wormsEaten+1;
          ((CrabWorld) getWorld()).createWorm();  
        }
        if(wormsEaten==8) 
        {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    }
    /** Switch IMage- **/
    public void switchImage()
    {
        if(getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    
}
