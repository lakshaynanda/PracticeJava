import java.util.ArrayList;

public class boardPath {
    static int count = 0;

    public static void printBoard(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            count++;
            System.out.println(count + "." + psf);
            return;
        }
        if (sr + 1 <= dr) {
            printBoard(sr + 1, sc, dr, dc, psf + "V");
        }
        if (sc + 1 <= dc) {
            printBoard(sr, sc + 1, dr, dc, psf + "V");
        }
        if (sr + 1 <= dr && sc + 1 <= dc) {
            printBoard(sr + 1, sc + 1, dr, dc, psf + "D");
        }
    }

    public static ArrayList<String> printBoardPath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add(".");
            return baseRes;
        }
        ArrayList<String> myAns = new ArrayList<>();
        if (sr + 1 <= dr) {
            ArrayList<String> Ver = printBoardPath(sr + 1, sc, dr, dc);
            for (String s : Ver) {
                myAns.add("V" + s);
            }
        }
        if (sc + 1 <= dc) {
            ArrayList<String> Hor = printBoardPath(sr, sc + 1, dr, dc);
            for (String s : Hor) {
                myAns.add("H" + s);
            }
        }
        if (sr + 1 <= dr && sc + 1 <= dc) {
            ArrayList<String> Diag = printBoardPath(sr + 1, sc + 1, dr, dc);
            for (String s : Diag) {
                myAns.add("D" + s);
            }
        }
        return myAns;
    }

    public static void printBoardMulti(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            count++;
            System.out.println(count + ". " + psf);
            return;
        }
        for (int i = 1; i <= dr - sr; i++) {
            printBoardMulti(sr + i, sc, dr, dc, psf + "V" + i);
        }
        for (int i = 1; i <= dc - sc; i++) {
            printBoardMulti(sr, sc + i, dr, dc, psf + "H" + i);
        }
        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            printBoardMulti(sr + i, sc + i, dr, dc, psf + "D" + i);
        }
    }

    public static ArrayList<String> printBoardMultiPath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add(".");
            return baseRes;
        }
        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> Hori = printBoardMultiPath(sr + i, sc, dr, dc);
            for (String s : Hori) {
                myAns.add("H" + i + s);
            }
        }
        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> Ver = printBoardMultiPath(sr, sc + i, dr, dc);
            for (String s : Ver) {
                myAns.add("V" + i + s);
            }
        }
        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            ArrayList<String> Diag = printBoardMultiPath(sr + i, sc + i, dr, dc);
            for (String s : Diag) {
                myAns.add("D" + i + s);
            }
        }
        return myAns;
    }

    public static void floodfill(int sr, int sc, int mat[][], boolean[][] visited, String psf) {
        if (sr == mat.length - 1 && sc == mat[0].length - 1) {
            count++;
            System.out.println(count + ". " + psf);
            return;
        }
        if (isAtWrong(sr, sc, mat) == true || visited[sr][sc] == true) {
            return;
        }
        visited[sr][sc] = true;
        floodfill(sr + 1, sc, mat, visited, psf + "D");
        floodfill(sr, sc - 1, mat, visited, psf + "L");
        floodfill(sr - 1, sc, mat, visited, psf + "T");
        floodfill(sr, sc + 1, mat, visited, psf + "R");
        floodfill(sr - 1, sc - 1, mat, visited, psf + "N");
        floodfill(sr + 1, sc + 1, mat, visited, psf + "S");
        floodfill(sr - 1, sc + 1, mat, visited, psf + "E");
        floodfill(sr + 1, sc - 1, mat, visited, psf + "W");

        visited[sr][sc] = false;
    }

    public static boolean isAtWrong(int sr, int sc, int mat[][]) {
        if (sc > mat[0].length - 1 || sr > mat.length - 1) {
            return true;
        } else if (sc < 0 || sr < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int LongestHeight(int sr,int sc,int er,int ec,int[][] board)
    {
        if(sr==er && sc==ec)
        {
            return 0;
        }

        int myHeight=0;
        board[sr][sc]=1;
        for(int d=0;d<dirA.length;d++)
        {
            for(int rad=1;rad<=dirA.length;rad++)
            {
                int x=sr+rad*dirA[d][0];
                int y=sc+rad*dirA[d][1];
                if(x>=0 && y>=0 && x<board.length && y<board[0].length && board[x][y]==0)
                {
                    myHeight=Math.max(myHeight,LongestHeight(x, y, er, ec, board));
                }
            }
        }
        board[sr][sc]=0;

        return myHeight+1;
    }

    public static void main(String args[]) {
        // int[][] mat = { { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 } };
        // boolean[][] visited = new boolean[mat.length][mat[0].length];
        // floodfill(0, 0, mat, visited, "");
        System.out.println(LongestHeight(0, 0,2, 2, board));
    }

}