class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] ==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if(nums[i]+nums[left]+nums[right] >0){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}