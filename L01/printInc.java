public class printInc {
    public static void printInc(int n,int m)
    {
        if(n>m)
        {
            return;
        }
        System.out.print(n+" ");
        printInc(n+1, m);
        
    }
    public static void main(String[] args) {
        printInc(0, 10);
    }
    
}