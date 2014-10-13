import java.util.Scanner;
import java.lang.Math;

public class Rectangle
{

    public static void main(String[] args)
    {
        Scanner printer=new Scanner(System.in);
        System.out.println("side 1: ");
        int side1= printer.nextInt();
        System.out.println("side 2: ");
        int side2= printer.nextInt();
        double diag=Math.sqrt((side1*side1+side2*side2));
        int perim=2*side1+2*side2;
        int area=side1*side2;
        System.out.println("area: "+area);
        System.out.println("perimeter: "+perim);
        System.out.println("diagonal: "+diag);
        
    }

}
