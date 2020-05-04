import java.util.*;

public class nokiaKeypad
{
    public static ArrayList<String> keypad(String str,String[] st)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseRes=new ArrayList<>();
            baseRes.add(".");
            return baseRes;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        int f=ch-'0';
        String code=st[f];
        ArrayList<String> myAns=new ArrayList<>();
        ArrayList<String> recAns=keypad(roq, st);
        for(int i=0;i<code.length();i++)
        {
            for(String s:recAns)
            {
                myAns.add(code.charAt(i)+s);
            }
        }
        return myAns;
    }
    static int count=0;
    public static void keypad_void(String ques,String ans)
    {
        if(ques.length()==0)
        {
            count++;
            System.out.println(count+" "+ans);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        int f=ch-'0';
        String code=st[f];
        for(int i=0;i<code.length();i++)
        {
            keypad_void(roq,ans+st[i]);
        }

       

    }
    public static void main(String[] args) {
        String str="478";
        String[] st={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        System.out.println(keypad(str, st));
    }
}