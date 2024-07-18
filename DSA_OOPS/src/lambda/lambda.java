package lambda;

import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }

        nums.forEach((num)->{
            System.out.print(num+" ");
        });
    }
}
