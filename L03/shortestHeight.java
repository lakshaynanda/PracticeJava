public class shortestHeight {

    public static int shortestheightTree(int sr, int sc, int er, int ec, int board[][]) {

        int dirA[][] = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };

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

    public static void main(String[] args) {

        String[] dirS = { "L", "N", "U", "E", "R", "S", "D", "W" };

        int board[][] = new int[3][3];
        System.out.println(shortestheightTree(0, 0, 2, 2, board));

    }

}