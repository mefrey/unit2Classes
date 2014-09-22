import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{

    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double ring1=
            new Ellipse2D.Double(0,0,400,400);
       Ellipse2D.Double ring2=
            new Ellipse2D.Double(50,50,300,300);
       Ellipse2D.Double ring3=
            new Ellipse2D.Double(100,100,200,200);
       Ellipse2D.Double ring4=
            new Ellipse2D.Double(150,150,100,100);
       Ellipse2D.Double ring5=
            new Ellipse2D.Double(175,175,50,50);
       g2.draw(ring1);
       g2.draw(ring2);
       g2.draw(ring3);
       g2.draw(ring4);
       g2.draw(ring5);
       g2.setColor(Color.black);
       g2.fill(ring1);
       g2.setColor(Color.white);
       g2.fill(ring2);
       g2.setColor(Color.black);
       g2.fill(ring3);
       g2.setColor(Color.white);
       g2.fill(ring4);
       g2.setColor(Color.black);
       g2.fill(ring5);
    }

}
