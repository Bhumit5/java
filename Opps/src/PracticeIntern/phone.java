package PracticeIntern;

import static java.lang.Integer.parseInt;

public class phone {

    static void result(String number){
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] pre = {"double","triple"};
        int[] numb = new int[10];
        int prev = -1,cur = parseInt(String.valueOf(number.charAt(0))),count = 0;
        String curstr;

        for (int i = 0;i<number.length();i++) {
            numb[i] = parseInt(String.valueOf(number.charAt(i)));
        }

        for (int n:numb) {
            curstr = nums[n];
            if(prev != -1){
                if(prev == cur){
                    count++;
                }else{
                    
                    count = 0;
                }
            }
        }
        System.out.println(cur);
    }
    public static void main(String[] args) {
    result("35");
    }
}
