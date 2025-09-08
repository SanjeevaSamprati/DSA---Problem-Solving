class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // mil gaya target
            }

            // Check which half is sorted
            if (nums[low] <= nums[mid]) { 
                // low half sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // target left me hai
                } else {
                    low = mid + 1; // target right me hai
                }
            } else {
                // high half sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // target right me hai
                } else {
                    high = mid - 1; // target left me hai
                }
            }
        }
        return -1; // nahi mila
    }
}

/*
 * Approach: Use binary search on both sides of the mid element. Since one side is always sorted, we can check if the target lies in the sorted side or not. If it does, we search in that side, otherwise we search in the other side.
 */
