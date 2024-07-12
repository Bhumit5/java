package Easy;

public class LeetCode2582 {

    public static void main(String[] args) {
        System.out.println(passThePillow(15,400));
    }

    public static int passThePillow(int n, int time) {
        int num = time / (n - 1);
        int curr = time % (n - 1);
        if (num % 2 == 0)
            return curr + 1;
        return n - curr;
    }
}
