import java.util.Scanner;
public class NumberReader
{

    public static void main(String[] args)
    {
        Scanner number=new Scanner(System.in);
        System.out.println("please enter a number between 1,000 and 999,999 including the comma: ");
        String strnumber=number.next();
        System.out.println(strnumber.replace(",",""));
    }

}
