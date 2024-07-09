package HAckerRank;

import java.util.ArrayList;
import java.util.List;

public class MonthDay {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int n = s.size(), total = 0;
        int result = 0;

        for(int i = 0; i < n; i++){
            if(i + m < n){
                System.out.println("j");
                break;
            }

            for(int j = i; j < i + m; j++){
                total += s.get(j);
            }

            //System.out.println(total);

            if(total == d){
                result++;
            }

            total = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(birthday(s,3,2));
    }

}

