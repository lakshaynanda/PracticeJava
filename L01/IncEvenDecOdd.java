import java.util.*;
public class IncEvenDecOdd {
    
    public static void incEvDecOdd(int n,int m)
    {
        if(n==m+1)
        {
            return;
        }

        if(n%2==0)
        {
            System.out.print(n+" ");
        }
        incEvDecOdd(n+1, m);
        if(n%2!=0)
        {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        incEvDecOdd(0,10);
    }
}