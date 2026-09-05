class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLength=0;
        int length=0;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i+1]-nums[i]==1 ){
                length++;
                if(maxLength<length){
                    maxLength=length;
                }
            } else if(nums[i+1]==nums[i] && i!=0){
                continue;
            } else{
                length=0;
            }
        }
        return maxLength+1;
    }
}