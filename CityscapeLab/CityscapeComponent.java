import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes within cityscape and draws these object.
 * 
 * @author @mefrey
 * @version 3 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Creates objects and draws them
     *
     * @param    g    the graphics object used to draw the building
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Background citysky=new Background();
        Sun citysun=new Sun(500);
        Street citystreet=new Street();
        RectangleBuilding building1=new RectangleBuilding(citystreet.top,10,5);
        RectangleBuilding building2=new RectangleBuilding(citystreet.top,200,3);
        RectangleBuilding building3=new RectangleBuilding(citystreet.top,400,12);
        RectangleBuilding building4=new RectangleBuilding(citystreet.top,600,7);
        RectangleBuilding building5=new RectangleBuilding(citystreet.top,800,9);
        citysky.draw(g2);
        citysun.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        citystreet.draw(g2);
    }

}
