 import javax.swing.JFrame;


/**
 * Write a description of class DrawingEditorComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{   

    public DrawingEditor()
    {
        LogSpiralPanel panel=new LogSpiralPanel();
        add(panel);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main()
    {
        DrawingEditor start=new DrawingEditor();
    }
}