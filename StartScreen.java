import greenfoot.*;

public class StartScreen {
    /* 
    First make a class called startScreen
    following on from this select a appropriate background on greenfoot for it
    Then right click on the world that is labelled StartScreen and click 'new Startscreen()' - this should be under MyWorld.
    What ever the size of the world is make it the same dimensions as the startscreen
    Save the start screen (from powerpoint) as a png.file
    under the gamer and enemy class create a subclass called Title. Import in the image of the startscreen(powerpoint) 
    Then click 'compile' and set to the middle of the screen so its clear
    After this is done - go and save the world
    Finally go onto the prepare section (shown below) and add the numbers



     */

public void prepare 
{

    Title title = new Title();
    addObject (title, xxx, yyy)  //where I put 'xxx' and 'yyy' add the appropriate numbers so the message is in the middle of screen.
}

public void act()
{
    if (Greenfoot.isKeyDown("enter"))
    Greenfoot.setWorld(new MyWorld());
    
}
    }

