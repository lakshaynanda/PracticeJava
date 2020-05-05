import java.util.ArrayList;

public class permutation {

    public static ArrayList<String> permutations(String str) {
        if (str.length() == 0) {
            ArrayList<String> basRes = new ArrayList<>();
            basRes.add(".");
            return basRes;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> myAns = new ArrayList<>();
        ArrayList<String> recAns = permutations(roq);

        for (String s : recAns) {
            for (int i = 0; i <= s.length(); i++) {
                String ans = s.substring(0, i) + ch + s.substring(i);
                myAns.add(ans);
            }
        }
        return myAns;
    }

    static int count = 0;

    public static void permutationVoid(String str, String ans) {
        if (str.length() == 0) {
            count++;
            System.out.println(count + " " + ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String roq = str.substring(0, i) + str.substring(i + 1);
            permutationVoid(roq, ans + ch);
        }
    }

    public static void permutationUnique(String str, String ans) {
        if (str.length() == 0) {
            count++;
            System.out.println(count + " " + ans);
        }
        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch - 'a']) {
                visited[ch-'a']=true;
                String roq = str.substring(0, i) + str.substring(i + 1);
                permutationUnique(roq, ans + ch);
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(permutations("abcd"));
        permutationUnique("abc", "");
    }

}