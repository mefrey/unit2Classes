


public class Annuity
{

    public static void main(String[] args)
    {
        int pmt=10000;
        int num_of_payments=20;
        double interest=.08;
        double present_value=pmt*((((Math.pow((1+interest),(num_of_payments-1))))/interest)/
        (Math.pow((1+interest),(num_of_payments-1))+1));
        System.out.println(present_value);
    }

}
