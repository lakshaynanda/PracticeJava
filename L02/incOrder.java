import java.util.*;
public class incOrder
{
    public static void increasingOrder(int n)
    {
        if(n==0)
        {
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
        
    }
    public static void decreasingOrder(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void InceDec(int n)
    {
        if(n==-1)
        {
            return;
        }
        System.out.print(n+" ");
        InceDec(n-1);
        System.out.print(n+" ");
    }
    public static void printEvenOdd(int n)
    {
        if(n==-1)
        {
            return;
        }
        if(n%2==0)
        {
            System.out.print(n+" ");
        }
        printEvenOdd(n+1);
        if(n%2!=0)
        {
            System.out.print(n+" ");
        }
    }
    public static int calls(int n)
    {
        if(n<=1)
        {
            System.out.println("base: "+n);
            return n+1;
        }
        int count=0;
        System.out.println("Pre: "+n);
        count+=calls(n-1);
        System.out.println("In: "+n);
        count+=calls(n-2);
        System.out.println("Post: "+n);


        return count+3;
    }
    public static void main(String args[])
    {
        // int n=1;
        // int b=10;
        // increasingOrder(n);
        // System.out.println();
        // decreasingOrder(n);
        // System.out.println();
        // InceDec(n);
        // System.out.println();
        // printEvenOdd(n);
        int n=5;
        calls(n);
    }
}