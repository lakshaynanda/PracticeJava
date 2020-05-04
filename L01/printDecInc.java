public class printDecInc {

    public static void printDecInc(int a,int b)
    {
    if(a==b-1)
    {
        return;
    }
    System.out.print(a+" ");
    printDecInc(a-1,b);
    System.out.print(a+" ");
    }
    public static void main(String[] args) {
       printDecInc(10, 0);
    }
}