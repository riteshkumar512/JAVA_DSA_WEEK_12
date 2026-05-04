package Lecture_19;

import java.util.ArrayList;
import java.util.List;

public class Lc_131_Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques="nitin";
        List<String> ll=new ArrayList<>();
        List<List<String >> ans=new ArrayList<>();
        Partition(ques,ll,ans);
        System.out.println(ans);

    }
    public static void Partition(String ques, List<String> ll,List<List<String >> ans){
        if (ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= ques.length() ; i++) {
            String s=ques.substring(0,i);
            if (isPalindrome(s)) {
                ll.add(s);
                Partition(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
