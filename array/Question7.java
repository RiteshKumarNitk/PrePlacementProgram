package array;

import java.util.Arrays;

public class Question7 {
    public static void moveZeroesFrom(int[] nums) {
        int j;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){

                for(j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[j]=0;
            }
        }
    }
    public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
       moveZeroesFrom(nums);
        System.out.println(Arrays.toString(nums));
    }
}
