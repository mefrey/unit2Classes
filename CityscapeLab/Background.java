import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Class draws the background for the cityscape
 * 
 * @author @mefrey 
 * @version october 6 2014
 */
public class Background
{
    /**
     * Creates cyan rectangle and draws it on screen
     * 
     * @param    g2    the graphics object used to draw the building
     */
    public void draw(Graphics2D g2)
    {
       Rectangle sky= new Rectangle(1000,700);//has to be 1000,700 to cover the whole city
       g2.setColor(Color.cyan);
       g2.fill(sky);
       g2.draw(sky);
       g2.setColor(Color.black);
    }

}
