

public class PhoneNum
{

    public static void main(String[] args)
    {
        String num="4155551212";
        num= "("+num.substring(0,3)+") "+num.substring(3,6)+"-"+num.substring(6);
        System.out.println(num);
    }

}
