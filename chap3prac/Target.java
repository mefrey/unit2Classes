import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{

    public void draw(Graphics2D g2)
    {
        //target1
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
       Ellipse2D.Double ring6=
            new Ellipse2D.Double(187.5,187.5,25,25);
       //target2
       Ellipse2D.Double ring7=
            new Ellipse2D.Double(400,400,400,400);
       Ellipse2D.Double ring8=
            new Ellipse2D.Double(450,450,300,300);
       Ellipse2D.Double ring9=
            new Ellipse2D.Double(500,500,200,200);
       Ellipse2D.Double ring10=
            new Ellipse2D.Double(550,550,100,100);
       Ellipse2D.Double ring11=
            new Ellipse2D.Double(575,575,50,50);
       Ellipse2D.Double ring12=
            new Ellipse2D.Double(587.5,587.5,25,25);
       //target3
       Ellipse2D.Double ring13=
            new Ellipse2D.Double(400,0,400,400);
       Ellipse2D.Double ring14=
            new Ellipse2D.Double(450,50,300,300);
       Ellipse2D.Double ring15=
            new Ellipse2D.Double(500,100,200,200);
       Ellipse2D.Double ring16=
            new Ellipse2D.Double(550,150,100,100);
       Ellipse2D.Double ring17=
            new Ellipse2D.Double(575,175,50,50);
       Ellipse2D.Double ring18=
            new Ellipse2D.Double(587.5,187.5,25,25);
       //target4
       Ellipse2D.Double ring19=
            new Ellipse2D.Double(0,400,400,400);
       Ellipse2D.Double ring20=
            new Ellipse2D.Double(50,450,300,300);
       Ellipse2D.Double ring21=
            new Ellipse2D.Double(100,500,200,200);
       Ellipse2D.Double ring22=
            new Ellipse2D.Double(150,550,100,100);
       Ellipse2D.Double ring23=
            new Ellipse2D.Double(175,575,50,50);
       Ellipse2D.Double ring24=
            new Ellipse2D.Double(187.5,587.5,25,25);
       //target1
       g2.draw(ring1);
       g2.draw(ring2);
       g2.draw(ring3);
       g2.draw(ring4);
       g2.draw(ring5);
       g2.draw(ring6);
       g2.setColor(Color.black);
       g2.fill(ring1);
       g2.setColor(Color.blue);
       g2.fill(ring2);
       g2.setColor(Color.cyan);
       g2.fill(ring3);
       g2.setColor(Color.gray);
       g2.fill(ring4);
       g2.setColor(Color.green);
       g2.fill(ring5);
       g2.setColor(Color.magenta);
       g2.fill(ring6);
       //target2
       g2.draw(ring7);
       g2.draw(ring8);
       g2.draw(ring9);
       g2.draw(ring10);
       g2.draw(ring11);
       g2.draw(ring12);
       g2.setColor(Color.orange);
       g2.fill(ring7);
       g2.setColor(Color.pink);
       g2.fill(ring8);
       g2.setColor(Color.red);
       g2.fill(ring9);
       g2.setColor(Color.white);
       g2.fill(ring10);
       g2.setColor(Color.yellow);
       g2.fill(ring11);
       g2.setColor(Color.white);
       g2.fill(ring12);
       //target3
       g2.draw(ring13);
       g2.draw(ring14);
       g2.draw(ring15);
       g2.draw(ring16);
       g2.draw(ring17);
       g2.draw(ring18);
       g2.setColor(Color.red);
       g2.fill(ring13);
       g2.setColor(Color.pink);
       g2.fill(ring14);
       g2.setColor(Color.orange);
       g2.fill(ring15);
       g2.setColor(Color.magenta);
       g2.fill(ring16);
       g2.setColor(Color.green);
       g2.fill(ring17);
       g2.setColor(Color.gray);
       g2.fill(ring18);
       //target4
       g2.draw(ring19);
       g2.draw(ring20);
       g2.draw(ring21);
       g2.draw(ring22);
       g2.draw(ring23);
       g2.draw(ring24);
       g2.setColor(Color.green);
       g2.fill(ring19);
       g2.setColor(Color.gray);
       g2.fill(ring20);
       g2.setColor(Color.cyan);
       g2.fill(ring21);
       g2.setColor(Color.blue);
       g2.fill(ring22);
       g2.setColor(Color.black);
       g2.fill(ring23);
       g2.setColor(Color.blue);
       g2.fill(ring24);
    }

}
