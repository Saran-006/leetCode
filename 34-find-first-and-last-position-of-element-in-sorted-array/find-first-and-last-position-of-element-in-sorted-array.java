class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = -1, end = -1;
        int l = 0, r = nums.length - 1;

        // Find first occurrence
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

            if (nums[mid] == target) {
                start = mid;
            }
        }

        // Find last occurrence
        l = 0;
        r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

            if (nums[mid] == target) {
                end = mid;
            }
        }

        return new int[]{start, end};
    }
}
