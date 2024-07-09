package Easy;

public class LeetCode26 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,6};
        int count = removeDuplicates(arr);
        for (int i = 0; i <count ; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }


    static int removeDuplicates(int[] nums) {
//        ==> My solution
//        int i = 0, j = 1;
//        for(int k = 1; k < nums.length; k++){
//            if(nums[i] != nums[k]){
//                if(j != k){
//                    nums[j] = nums[k];
//                }
//                i++;
//                j++;
//            }
//        }
//        return j;

        // Can be enhanced by reducing space complexity
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
