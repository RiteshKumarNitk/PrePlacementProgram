package array;

import java.util.Arrays;

public class Question8 {
    public static int[] findNumError(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=(n*(n+1))/2;
        int s=0;
        int arr[]=new int[2];
        for(int i=0;i<n-1;i++){
            s=s+nums[i];
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
            }
        }
        ;
        arr[1]=sum-(s+nums[n-1]-arr[0]);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        int []output=findNumError(nums);
        System.out.println(Arrays.toString(output));

    }
}
