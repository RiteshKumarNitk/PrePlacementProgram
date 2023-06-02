package array;

import java.util.Arrays;

public class Question4 {
    public static int[] plusandOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;

    }
    public static void main(String[] args) {
        int [] digits = {1,2,3};
        int []output=plusandOne(digits);
        System.out.println(Arrays.toString(output));
    }
}
