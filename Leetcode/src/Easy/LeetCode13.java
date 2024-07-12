package Easy;
import java.util.*;

public class LeetCode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("IiIv"));
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();
        Map<Character, Integer> nums = new HashMap<>();

        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);

        int ans = 0;


        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && nums.get(s.charAt(i)) < nums.get(s.charAt(i + 1))) {
                ans -= nums.get(s.charAt(i));
            } else {
                ans += nums.get(s.charAt(i));
            }
        }

        return ans;
    }
}
