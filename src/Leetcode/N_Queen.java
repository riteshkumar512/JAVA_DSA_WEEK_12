package Leetcode;

import java.util.Scanner;

public class N_Queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       boolean[][] board=new boolean[n][n];
       char[][] PBoard=new char[n][n];
       QueenProblem(board,n,0,PBoard);
       if (!val){
           System.out.println(-1);
       }
    }
    static boolean val=false;
    public static void QueenProblem(boolean[][]board,int tq,int row,char[][] PBoard){
            if (tq==0){
                val=true;
                Display(board,PBoard);
                return;
            }
        for (int col = 0; col < board[0].length; col++) {
            if(isSafe(board, row, col)){
                board[row][col]=true;
                QueenProblem(board,tq-1,row+1,PBoard);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        //up
        int r=row;
        while (r>=0){
            if (board[r][col]){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        int c=col;
        while (r>=0 && c >=0){
            if (board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r=row;
        c=col;
        while (r>=0 && c<board[0].length){
            if (board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void Display(boolean[][] board,char[][] PBoard) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]){
                    PBoard[i][j]='Q';
                }else {
                    PBoard[i][j]='.';
                }
                System.out.print(PBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
