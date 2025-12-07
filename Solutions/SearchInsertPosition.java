public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // target is on the right
            } else {
                right = mid - 1; // target is on the left
            }
        }

        // left is the correct insertion position
        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println("The the index if the target is found is:" + searchInsert(nums, target));
    }
}
