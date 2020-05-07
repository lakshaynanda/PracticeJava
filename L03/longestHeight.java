import java.util.*;

public class longestHeight
{
    public static int longestheightTree(int sr,int sc,int er,int ec,int board[][])
    {

        int dirA[][]={{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};

        if(sr==er && sc==ec)
        {
            return 0;
        }

        int myHeight=0;
        board[sr][sc]=1;

        for(int d=0;d<dirA.length;d++)
        {
            for(int rad=1;rad<=board.length;rad++)
            {
                int x=sr+rad*dirA[d][0];
                int y=sc+rad*dirA[d][1];

                if(x>=0 && y>=0 && x<board.length && y<board.length && board[x][y]==0)
                {
                    myHeight=Math.max(myHeight,longestheightTree(x,y,er,ec,board));
                }
            }
        }
        board[sr][sc]=0;
        return myHeight+1;
    }
    public static void main(String[] args) {
        
        String[] dirS = {"L", "N", "U", "E", "R", "S", "D", "W"};

        int board[][]=new int[3][3];
        System.out.println(longestheightTree(0, 0, 2, 2,board));
      
    }
}