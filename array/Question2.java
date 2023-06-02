package array;

import java.util.Arrays;

public class Question2 {
    public static int removeEle(int[] nums, int val) {

        int count=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int  nums[] = {3,2,2,3}, val = 3;
        System.out.println(removeEle(nums,val));

    }

}
