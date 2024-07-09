package Easy;

import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,8};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    static int[] twoSum(int[] nums, int target) {

//        Using bruteforce
        for(int i = 0; i < nums.length-1; i++){
            for(int j = nums.length-1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};


//        Using Hashmap
//        Map<Integer, Integer> hashMap = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//            int comp = target - nums[i];
//            if(hashMap.containsKey(comp)){
//                 return new int[]{i, hashMap.get(comp)};
//            }
//            hashMap.put(nums[i],i);
//        }
//
//        return new int[]{};

    }
}
