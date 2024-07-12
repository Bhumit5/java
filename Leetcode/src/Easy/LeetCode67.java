package Easy;

public class LeetCode67 {

    public static String addBinary(String a, String b) {
        String res = "";
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0, n = Math.max(i,j);

        for(int k = n; k >= 0; k--){
            int sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            if(sum > 1){
                carry = 1;
            }else{
                carry = 0;
            }

            res = (sum % 2) + res;
        }

        if(carry == 1){
            res = "1" + res;
        }

        return res;
    }
}
