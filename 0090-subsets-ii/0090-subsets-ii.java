class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),list);
        return list;
    }
    public void solve(int[] nums, int i, List<Integer> ans, List<List<Integer>> list){
        //base
        list.add(new ArrayList<>(ans)); 

        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
        

        //recursion
        ans.add(nums[j]);
        solve(nums,j+1,ans,list);
        ans.remove(ans.size()-1);
        }
        //solve(nums,i+1,ans,list);
    }
}