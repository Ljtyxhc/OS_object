import java.awt.*;
import javax.swing.*;

/**
 * @version 1.34 2018-04-10
 * @author Cay Horstmann
 */
public class Example
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            var frame = new NotHelloWorldFrame();
            frame.setTitle("Not hello world");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 600;


    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        add(new MyComponent());
        pack();
    }
}
class MyComponent extends JComponent
{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 600;

    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    public void paintComponent(Graphics g)
    {
        g.drawString("say hellow to this world",MESSAGE_X,MESSAGE_Y);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}

