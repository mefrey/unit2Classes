


public class DistanceConverter
{
    static final int FEET_IN_YARD=3;
    static final int INCHES_IN_FOOT=12;
    public static void main(String[] args)
    {
        double yards=3.5;
        double feet=yards*FEET_IN_YARD;
        double inches=feet*INCHES_IN_FOOT;
        
        
        System.out.println(yards+" yards is "+feet+" feet");
        System.out.println(yards+" yards is "+inches+" inches");
    }

}
