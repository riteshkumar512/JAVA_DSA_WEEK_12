package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc_46_Permutations {
    public static void main(String[] args) {
        int[]nums={1,1,2};
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        boolean[] num2=new boolean[nums.length];
        Permute(nums,num2,0,ll,ans);
        System.out.println(ans);

    }
    public static void Permute(int[]arr,boolean[]nums,int idx,List<Integer>ll,List<List<Integer>>ans){
        if (idx== arr.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i=0;i< arr.length;i++){
            int num=arr[i];
            if (i>0 &&arr[i]==arr[i-1] && !nums[i-1] ){
                continue;
            }
            if (!nums[i] ){
                nums[i]=true;
                ll.add(num);
                Permute(arr,nums,idx+1,ll,ans);
                ll.remove(ll.size()-1);
                nums[i]=false;
            }
        }
    }
}
