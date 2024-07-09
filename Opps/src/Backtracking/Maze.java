package Backtracking;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(findWays(3,3));
//        findWays("",3,3);
//        findWaysDiagonal("",3,3);

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

//        findWaysRestriction("",board,0,0);
        allPath("",board,0,0);
    }

    static int findWays(int r,int c){
        if(c == 1 || r == 1){
            return 1;
        }

        int right = findWays(r,c-1);
        int down = findWays(r-1,c);

        return right + down;
    }

    static void findWays(String p,int r,int c){
        if(c == 1 && r == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            findWays(p + "R",r-1,c);
        }

        if(c > 1){
            findWays(p + "D",r,c-1);
        }

    }


    static void findWaysDiagonal(String p,int r,int c){
        if(c == 1 && r == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            findWaysDiagonal(p + "Right ",r-1,c);
        }

        if(r > 1 && c > 1){
            findWaysDiagonal(p + "Cross ",r-1,c-1);
        }

        if(c > 1){
            findWaysDiagonal(p + "Down ",r,c-1);
        }
    }

    static void findWaysRestriction(String p,boolean[][] board,int r,int c){
        if(r == board.length - 1 && c == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!board[r][c]){
            return;
        }

        if(r < board.length - 1){
            findWaysRestriction(p + "Down ",board,r+1,c);
        }

        if(c < board[0].length - 1){
            findWaysRestriction(p + "Right ",board,r,c+1);
        }
    }

    static void allPath(String p,boolean[][] board,int r,int c){
        if(r == board.length - 1 && c == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!board[r][c]){
            return;
        }

        board[r][c] = false;

        if(r < board.length - 1){
            allPath(p + "Down ",board,r+1,c);
        }

        if(c < board[0].length - 1){
            allPath(p + "Right ",board,r,c+1);
        }

        if(c > 0){
            allPath(p + "Left ",board,r,c-1);
        }

        if(r > 0){
            allPath(p + "Up ",board,r-1,c);
        }

//      Changes those were made should be restored, So it is called Backtracking
        board[r][c] = true;
    }
}
