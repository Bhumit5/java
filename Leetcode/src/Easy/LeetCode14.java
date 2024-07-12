package Easy;
import java.util.Arrays;

public class LeetCode14 {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count = 0;
        for(int i = 0; i < strs[0].length(); i++){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                count++;
            }else{
                break;
            }
        }
        return strs[0].substring(0,count);
    }
}
