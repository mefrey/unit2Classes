import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

/**
 * Class draws a street for the buildings to be on
 * 
 * @author @mefrey 
 * @version october 6 2014
 */
public class Street
{
    /** top left corner of the street */
    public int top;

    /**
     * Creates a new street object with top location at 700
     */
    public Street()
    {
        this.top=700;
    }

    /**
     * Creates rectangle and draws it on screen
     *    
     * @param    g2    the graphics object used to draw the building
     */
    public void draw(Graphics2D g2)
    {
       Rectangle street= new Rectangle(0,this.top,1000,300);
       g2.draw(street);
    }

}
