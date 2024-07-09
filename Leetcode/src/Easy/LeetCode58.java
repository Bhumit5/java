package Easy;

public class LeetCode58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("    "));
    }

    static int lengthOfLastWord(String s) {
        String a = s.trim();
        int n = a.length();
        for(int i = 0; i < n; i++){
            if(i == n-1){
                return i + 1;
            }
            if(a.charAt(n-i-1) == ' '){
                return i;
            }
        }
        return 0;
    }
}
