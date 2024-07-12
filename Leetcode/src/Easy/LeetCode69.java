package Easy;
import java.lang.Math;

public class LeetCode69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }

    public static int mySqrt(int x) {
        int start = 1, mid = -1, end = x;

        while(start <= end){
            mid = start + (end - start)/2;

            if((long)mid*mid > x){
                end = mid - 1;
            }else if( (long) mid * mid == x){
                return mid;
            }else{
                start = mid + 1;
            }
        }

        return end;
    }
}
