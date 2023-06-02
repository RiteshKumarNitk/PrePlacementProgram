package array;

import java.util.HashMap;

public class Question6 {
    public static boolean containsDuplicateNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,1};
        System.out.println(containsDuplicateNumber(nums));
    }
}
