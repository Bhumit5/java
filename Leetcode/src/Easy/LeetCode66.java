package Easy;

import java.util.Arrays;

public class LeetCode66 {

    public static void main(String[] args) {
        int[] nums = {1,2,9};
        nums = new int[nums.length+1];
        System.out.println(Arrays.toString(nums));
        System.out.println("Added : "+Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
         for(int i = digits.length - 1; i >= 0; i--){
             if(digits[i] < 9){
                 digits[i]++;
                 return digits;
             }
             digits[i] = 0;
         }

         int[] nums = new int[digits.length + 1];
         nums[0] = 1;
         return nums;
    }
}
