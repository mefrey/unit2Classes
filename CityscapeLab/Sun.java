import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Class creates a sun object
 * 
 * @author @mefrey 
 * @version october 7 2014
 */
public class Sun
{
    /** the x position of the sun signifying the time of day
     * 100--morning
     * 500--noon
     * 850--evening
     */
    int timeOfDay;

    /**
     * Makes sun object with given x position
     * 
     * @param   x   the x coordinate of the left side of the sun
     */
    public Sun(int x)
    {
        this.timeOfDay=x;
    }

    /**
     * Creates a yellow circle and draws it on screen

     * @param    g2    the graphics object used to draw the building
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun=
            new Ellipse2D.Double(timeOfDay,20,100,100);
            
        g2.setColor(Color.yellow);
        g2.fill(sun);
        g2.draw(sun);
        g2.setColor(Color.black);
    }

}
