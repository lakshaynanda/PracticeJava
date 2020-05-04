public class printIncDec {

    public static void printIncDec(int a,int b)
    {
        if(a==b+1)
        {
            return;
        }
        System.out.print(a+" ");
        printIncDec(a+1, b);
        System.out.print(a+" ");
    }
    public static void main(String[] args) {
        printIncDec(0, 10);
    }
    
}