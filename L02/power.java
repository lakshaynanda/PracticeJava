import java.util.*;
public class power
{
    public static int powerto(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        int pow=a*powerto(a, b-1);
        return pow;
    }
    public static int powerBetter(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        int pow=powerBetter(a, b/2);
        pow*=pow;
        return b%2==0?pow:pow*a;
    }
    public static void main(String args[])
    {
        int a=powerBetter(2,5);
        System.out.println(a);
    }
}