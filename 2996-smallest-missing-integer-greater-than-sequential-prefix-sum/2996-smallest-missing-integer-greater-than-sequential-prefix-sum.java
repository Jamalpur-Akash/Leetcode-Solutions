class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int prefix=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                prefix+=nums[i];
            } else{
                break;
            }

        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(set.contains(prefix)){
                prefix+=1;
            }
        }
        return prefix;

    }
}