package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_40_Combination_Sum_II {
    public static void main(String[] args) {
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>ans =new ArrayList<>();
        int[] arr={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        Combination(arr,ll,8,0,ans);
        System.out.println(ans);

    }
    public static void Combination(int[] arr,List<Integer>ll,int target,int idx,List<List<Integer>>ans){
        if (target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < arr.length ; i++) {
            if (target >= arr[i]){
                if (i> idx && arr[i]==arr[i-1]){
                    continue;
                }
                ll.add(arr[i]);
                Combination(arr,ll,target-arr[i],i+1,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
