package Easy;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCode70 {

    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
        System.out.println(getAnswerTab(n));
    }

    public static int climbStairs(int n) {
        int[] nums = new int[n+1];
        Arrays.fill(nums, Integer.MIN_VALUE);
        return getAnswerRecMem(n, nums);
    }

    public static int getAnswerRecMem(int n, int[] ans) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (ans[n] != Integer.MIN_VALUE) {
            return ans[n];
        }

        int ones = getAnswerRecMem(n - 1, ans);
        int twos = getAnswerRecMem(n - 2, ans);

        ans[n] = ones + twos;
        return ans[n];
    }

    static int getAnswerTab(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
