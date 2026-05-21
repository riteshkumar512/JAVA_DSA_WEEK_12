package Leetcode;

import java.util.Scanner;

public class Tower_Of_Honai {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TOH(n,"A","C","B");
    }
    public static void TOH(int n,String src,String hlp,String des){
        if (n==0){
            return;
        }
        TOH(n-1,src,des,hlp);
        System.out.println("Moving ring " + n +" from " + src +" to "+ des);
        TOH(n-1,hlp,src,des);
    }
}
