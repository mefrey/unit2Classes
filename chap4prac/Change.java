
import java.util.Scanner;

public class Change
{

    public static void main(String[] args)
    {
        final int DOLLAR=100;
        final int QUARTER=25;
        final int DIME=10;
        final int NICKEL=5;
        final int PENNY=1;
        Scanner input=new Scanner(System.in);
        System.out.println("cost: ");
        int cost= input.nextInt();
        System.out.println("costumer input: ");
        int costumerInput= input.nextInt();
        int change=costumerInput-cost;
        //calculate change
        int dollarReturn=change/DOLLAR;
        change=change%DOLLAR;
        int quarterReturn=change/QUARTER;
        change=change%QUARTER;
        int dimeReturn=change/DIME;
        change=change%DIME;
        int nickelReturn=change/NICKEL;
        change=change%NICKEL;
        int pennyReturn=change/PENNY;
        //print
        System.out.println("dollars: "+dollarReturn);
        System.out.println("quarters: "+quarterReturn);
        System.out.println("dimes: "+dimeReturn);
        System.out.println("nickels: "+nickelReturn);
        System.out.println("pennies: "+pennyReturn);
    }

}
