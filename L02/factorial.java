import java.util.*;
public class factorial
{
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fac=n*factorial(n-1);
        return fac;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.println(factorial(n));
    }
}