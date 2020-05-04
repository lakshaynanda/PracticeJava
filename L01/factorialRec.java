public class factorialRec {
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int num=n*fact(n-1);

        return num;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}