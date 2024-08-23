import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Game extends JFrame
{
    Game(String s1)
    {
        super(s1);
    }
    Game()
    {

    }
    void setComponent()
    {

    }

    public static void main(String[] args)
    {
        Game obj=new Game("Calculation Game")   ;
        obj.setVisible(true);
        obj.setSize(500,600);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
