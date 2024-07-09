package Easy;

public class LeetCode35 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,7));
        System.out.println(findIndex(arr,7,0,arr.length-1));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

         while (start <= end) {
         int mid = start + (end - start) / 2;
         if (nums[mid] == target)
         return mid;
         else if (nums[mid] > target)
         end = mid - 1;
         else
         start = mid + 1;
         }

         return start;
    }

    public static int findIndex(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start; // Target not found, return insertion index (start)
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid; // Target found, return index
        } else if (nums[mid] > target) {
            return findIndex(nums, target, start, mid - 1); // Search left half recursively
        } else {
            return findIndex(nums, target, mid + 1, end); // Search right half recursively
        }
    }

}
