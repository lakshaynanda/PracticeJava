
import java.util.ArrayList;
public class subsequence {
    public static ArrayList<String> subse(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseRes=new ArrayList<>();
            baseRes.add(".");
            return baseRes;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> myAns=new ArrayList<>();
        ArrayList<String> recAns=subse(roq);

        for(String s:recAns)
        {
            myAns.add(s);
            myAns.add(ch+s);
        }
        return myAns;
    }
    static int count=0;
    public static void subseqVoid(String str,String ans)
    {
        if(str.length()==0)
        {
            count++;
            System.out.println(count+" "+ans);
            return;
        }

        char ch=str.charAt(0);
        String roq=str.substring(1);
        subseqVoid(roq, ans+ch);
        subseqVoid(roq, ans);
    }
    public static void main(String[] args) {
        // System.out.println(subse("abcd"));
        subseqVoid("abcd", "");
    }
}