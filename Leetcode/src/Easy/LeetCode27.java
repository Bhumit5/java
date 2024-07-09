package Easy;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

        // int j = 0, count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == val)
        //         count++;
        // }
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == val && nums[j] != val){
        //         j = i;
        //     }else if(nums[i] != val && nums[j] == val){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++;
        //     }
        // }

        // return nums.length - count;
    }
}
