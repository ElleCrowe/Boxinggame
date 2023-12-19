import greenfoot.*;

public class StartScreen extends World {

    public StartScreen()
    {
        super// enter dimensions in these brackets ()

        prepare();
     }
}

private void prepare ()
{
    TitleLetters titleletters = new TitleLetters();
    addObject(titleletters,    )  //enter dimensions in the brackets

}

public void act ()
{
    if (Greenfoot.isKeyDown("Enter"))
    Greenfoot.setWorld (new StartScreen());
}