class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        for(int i = 0 ; i < nums.length - 1 ;i++) {
            if(nums[i] != nums[i+1]) {
                if(nums[i+1] - nums[i] == 1) {
                    count++;
                } else {
                    maxCount = Integer.max(count,maxCount);
                    count = 0;
                }
            }
        }
        return Integer.max(count,maxCount) + 1;
    }
}
