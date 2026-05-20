package Lecture_20;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Print (board,n,0);
    }
    public static void Print(boolean[][] board,int tq,int row){
        if (tq==0){
            Display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isItSafe(board,row,col)){
                board[row][col]=true;
                Print(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
    }
    public static boolean isItSafe(boolean[][] board,int row,int col){
        //left diagonal
        int r=row;
        int c=col;
        while (r>=0 && c>=0){
            if (board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r=row;
        c=col;
        while (r>=0 && c <board.length){
            if (board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        //Up
        r=row;
        while (r>=0){
            if (board[r][col]){
                return false;
            }
            r--;
        }
        return true;
    }
    public static void Display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
