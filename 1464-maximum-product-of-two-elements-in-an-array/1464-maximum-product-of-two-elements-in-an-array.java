class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(nums==null || nums.length<2){
            return -1;
        }
        Arrays.sort(nums);
        int max1=(nums[n-1]-1)*(nums[n-2]-1);
        int max2=(nums[0]-1)*(nums[1]-1);
        int realMax=Math.max(max1, max2);
        return realMax;
    }
}