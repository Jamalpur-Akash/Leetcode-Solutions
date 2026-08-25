class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        
        int x=k;
        while(list.contains(x)){
            x+=k;
        }
        return x;
    }
}