package Recursion;

public class oldMobile {
    public static void main(String[] args) {
        pad("","18");
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            if(i != 26){
                char ch = (char)('a' + i);
                pad(p + ch, up.substring(1) );
            }
        }
    }
}
