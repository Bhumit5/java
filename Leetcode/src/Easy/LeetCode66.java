package Easy;

import java.util.Arrays;

public class LeetCode66 {

    public static void main(String[] args) {
        int[] nums = {1,2,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int n = digits.length;
        int num = digits[n-1] + 1;
        if(num > 9){
            digits[n-1] = 0;
            carry = 1;
            for(int i = 1; i < n; i++){
                int ans = digits[n-1-i] + carry;
                if(ans > 9){
                    digits[n-1-i] = 0;
                    carry = 1;
                }else{
                    digits[n-1-i] = ans;
                    carry = 0;
                    break;
                }
            }
        }else{
            digits[n-1] = num;
        }

        if(carry == 1){
            int[] nums = new int[n+1];
            nums[0] = 1;
            for(int i = 0; i < digits.length; i++){
                nums[i+1] = digits[i];
            }
            return nums;
        }

        return digits;
    }
}
