public class printDec {
    public static void printDec(int n,int m)
    {
        if(n>m)
        {
            return;
        }
        printDec(n+1, m);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        printDec(0, 10);
    }
}