package array;

import java.util.Arrays;
import java.util.HashMap;

public class Question1 {
    private static int[] twoofSum(int nums[],int target){
        int ans[]=new int[2];

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
       int  nums[] = {2,7,11,15}, target = 9;
       int []output=new int[2];
       output=twoofSum(nums,target);
        System.out.println(Arrays.toString(output));

    }
}
