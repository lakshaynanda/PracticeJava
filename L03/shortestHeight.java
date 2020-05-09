public class shortestHeight {

    public static int shortestheightTree(int sr, int sc, int er, int ec, int board[][]) {

        int dirA[][] = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
        String[] dirS = { "L", "N", "U", "E", "R", "S", "D", "W" };
        if (sr == er && sc == ec) {
            return 0;
        }

        int myHeight = board.length * board[0].length;
        board[sr][sc] = 1;

        for (int d = 0; d < dirA.length; d++) {

            int x = sr + dirA[d][0];
            int y = sc + dirA[d][1];

            if (x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == 0) {
                myHeight = Math.min(myHeight, shortestheightTree(x, y, er, ec, board));
            }

        }
        board[sr][sc] = 0;
        return myHeight + 1;
    }
    static class pair{
        String path;
        int len;
        pair(String path_,int len_)
        {
            path=path_;
            len=len_;
        }
    }

    public static pair shortestHeightTree(int sr,int sc,int er,int ec,int[][] board)
    {
        int dirA[][] = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
        String[] dirS = { "L", "N", "U", "E", "R", "S", "D", "W" };
        if(sr==er && sc==ec)
        {
            return new pair("",0);
        }
        board[sr][sc]=1;
        pair myAns=new pair("",board.length*board[0].length);

        for(int d=0;d<dirA.length;d++)
        {
            int x = sr + dirA[d][0];
            int y = sc + dirA[d][1];

            if (x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == 0) {
                pair smallAns=shortestHeightTree(x,y, er, ec, board);
                if(smallAns + 1 < myAns.len)
                {
                    myAns.len=smallAns.len+1;
                    myAns.path=dirS[d]+smallAns.path;
                }
                
            }
        }
        board[sr][sc]=0;
        return myAns;
        
    }

    public static void main(String[] args) {

        

        int board[][] = new int[3][3];
        System.out.println(shortestHeightTree(0, 0, 2, 2, board));

    }

}