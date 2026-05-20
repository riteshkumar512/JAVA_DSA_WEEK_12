package Lecture_19;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
            int[][] ans=new int[n][m];
            Path(maze,0,0,ans);
            if (val==0){
            System.out.println("NO PATH FOUND");
        }
    }
    static int val=0;

    public static void Path(char[][] maze, int cr , int cc,int[][] ans) {
        if (cr<0 || cc<0 ||cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X'){
            return;
        }
        if (cr==maze.length-1 && cc==maze[0].length-1){
            val=1;
            ans[cr][cc]=1;
            Display(ans);
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        Path(maze,cr-1,cc,ans);//up
        Path(maze,cr,cc-1,ans);//left
        Path(maze,cr+1,cc,ans);//down
        Path(maze,cr,cc+1,ans);//right
        maze[cr][cc]='0';
        ans[cr][cc]=0;
    }

    public static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
