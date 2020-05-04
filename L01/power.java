import java.util.*;
public class power {
    
    public static int powerFunc(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        int ans=a*powerFunc(a, b-1);

        return ans;
    }
    public static int powerBtr(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        int halfAns=powerBtr(a,b/2);
        halfAns*=halfAns;

        return halfAns*(b%2!=0?a:1);
    }
    public static void main(String[] args) {
        System.out.println(powerBtr(2, 10));
    }
}