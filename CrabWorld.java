import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        populateWorld();
    }
    public void populateWorld()
    {
        int randomNumberParameter=500;
        addObject(new Crab(), Greenfoot.getRandomNumber(randomNumberParameter), Greenfoot.getRandomNumber(randomNumberParameter) );// Crab #1
        addObject(new Lobster(), Greenfoot.getRandomNumber(randomNumberParameter), Greenfoot.getRandomNumber(randomNumberParameter));//Lobster #1
        addObject(new Lobster(), Greenfoot.getRandomNumber(randomNumberParameter), Greenfoot.getRandomNumber(randomNumberParameter));//#lobster #2
        addObject(new Lobster(), Greenfoot.getRandomNumber(randomNumberParameter), Greenfoot.getRandomNumber(randomNumberParameter));//Lobster#3
        for(int i=0; i<10; i++){
            addObject(new Worm(), Greenfoot.getRandomNumber(randomNumberParameter), Greenfoot.getRandomNumber(randomNumberParameter));
        }
       
                                                                                        
    }
    public void createWorm()
    {
      addObject(new Worm(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
    }
}
