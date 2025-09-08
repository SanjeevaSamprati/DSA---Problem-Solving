class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1; 

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            } else if(target > nums[mid]){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return low;
    }
}

// int mid = low + (high - low)/2; is used to prevent integer overflow that can occur with (low + high)/2 when low and high are large values.
// If the target is not found, 'low' will be at the position where the target