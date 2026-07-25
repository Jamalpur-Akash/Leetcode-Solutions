class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int j=0;j<nums.length;j++){
            nums[j]=nums[j]*nums[j];
        }
        Arrays.sort(nums);
        return nums;
    }
}