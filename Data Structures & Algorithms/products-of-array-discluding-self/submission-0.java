class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] interA = new int[nums.length];
        interA[0] = 1;
        for(int j = 1; j < nums.length;j++) {
            interA[j] = interA[j-1] * nums[j-1];
        }

        int[] interB = new int[nums.length];
        interB[nums.length -1] = 1;
        for(int j = nums.length-2; j >= 0;j--) {
            interB[j] = interB[j+1] * nums[j+1];
        }

        int[] res = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++) {
            res[i] = interA[i] * interB[i];
        }

        return res;

    }
}  
