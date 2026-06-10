class Solution {
    public int search(int[] nums, int target) {
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target) return mid;

            //check if it's present inside left half (if sorted)
            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid])
                {
                     right = mid - 1;
                 }else{
                        left = mid + 1;
                        }
              // Right half is sorted (any one half is sorted for sure)
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else { 
                    right = mid - 1;
                }
            }
            
        }
        return -1;
    }
}
