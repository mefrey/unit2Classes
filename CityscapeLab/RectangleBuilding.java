import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Class that creates a rectangle that makes the basic structure of buildings
 * 
 * @author @mefrey
 * @version 3 October 2014
 */
public class RectangleBuilding
{
    /** bottomPosition: is the location of the bottom of the building*/
    private int bottomPosition;
    /**leftPosition: is the location of the left of the */
    private int leftPosition;
    /**height: is how tall the building */
    private int height;
    /**width: is the width of the building*/
    private int width;

    /**
     * Constructor for objects of class RectangleBuilding that must include 
     * parameters for the dimension of the building
     * 
     * @param   bottom  a y value representing the bottom location of the building
     * @param   left    a x value representing the far left side of the building
     * @param   floors  number of floors the building is (each floor is 50px)
     */
    public RectangleBuilding(int bottom, int left, int floors)
    {
        this.height=floors*50;
        this.bottomPosition=bottom;
        this.leftPosition=left;
        this.width=100;
    }

    /**
     * Creates a gray rectangle and draws it on the screen
     *
     * @param    g2    the graphics object used to draw the building
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building= 
            new Rectangle(// y = bottom-height because it has to be top corner of rectangle
             this.leftPosition,this.bottomPosition-this.height,this.width,this.height
             );
        g2.setColor(Color.gray);
        g2.fill(building);
        g2.draw(building);
        g2.setColor(Color.black);
    }

}
