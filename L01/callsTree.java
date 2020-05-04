public class callsTree {

    public static int calls(int n)
    {
        if(n<=1)
        {
            System.out.println("base:"+n);
            return n+1;
        }

        int count=0;

        System.out.println("Pre:" +n);
        count+=calls(n-1);

        System.out.println("Post:" +n);
        count+=calls(n-1);

        return count+3;
    }
    public static void main(String[] args) {
        calls(5);
        int callsn=calls(5);

        System.out.println(callsn);
    }
    
}