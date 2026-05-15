package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_78_Subsets {
     public  static void main(String[] args) {
       int[] nums={1,2,3};
         List<Integer>ll=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
         PrintSubset(nums,0,ll,ans);
         System.out.println(ans);
    }
    public static void PrintSubset(int[] arr,int idx,List<Integer>ll,List<List<Integer>> ans){
         if(idx== arr.length){
            ans.add(new ArrayList<>(ll));
             return;
         }
        int num=arr[idx];
        PrintSubset(arr,idx+1,ll,ans);
        ll.add(num);
        PrintSubset(arr,idx+1,ll,ans);
        ll.remove(ll.size()-1);

    }
}
