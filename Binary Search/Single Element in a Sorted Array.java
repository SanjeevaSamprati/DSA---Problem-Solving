class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // ensure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // pair is valid, answer is on right
                low = mid + 2;
            } else {
                // pair broken, answer is on left (including mid)
                high = mid;
            }
        }
        return nums[low]; // low == high
    }
}
