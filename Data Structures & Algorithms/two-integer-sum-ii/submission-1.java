class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int l = 0;
       int r = numbers.length - 1;

       while(l < r) {
        int currentSum = numbers[l] + numbers[r];
        if(currentSum < target) 
            l++;
        if(currentSum > target)
            r--;
        if(currentSum == target)
            return new int[] {l + 1, r + 1};
       }
       return new int[2];
    }
}
