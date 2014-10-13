import javax.swing.JFrame;

/**
 * Class that creates the frame for the cityscape component
 * 
 * @author @mefrey
 * @version 3 October 2014
 */
public class CityscapeViewer
{
    /**
     * main method that creates and configures the frame for the program
     *
     */
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1000 /* x */, 1000 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }

}
