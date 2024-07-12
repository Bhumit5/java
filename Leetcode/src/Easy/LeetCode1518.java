package Easy;

public class LeetCode1518 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
        System.out.println(numWaterBottlesRec(15,4));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int filled = numBottles, res = filled;
        while(numBottles >= numExchange && numBottles > 0){
            filled = numBottles / numExchange;
            numBottles = numBottles % numExchange + filled;
            res += filled;
        }

        return res;
    }
    public static int numWaterBottlesRec(int numBottles, int numExchange) {
        int filled = numBottles;
        while(numBottles >= numExchange){
            filled += numBottles / numExchange;
            numBottles = numBottles % numExchange + numBottles / numExchange;
        }

        return filled;
    }
}
