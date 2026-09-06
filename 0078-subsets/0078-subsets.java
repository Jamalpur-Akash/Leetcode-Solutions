class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
        solve(nums,list,0,new ArrayList<>());
        return list;
    }
    public void solve(int[] nums, List<List<Integer>> list, int i, List<Integer> current){
        //int val=nums[i];
        //base
        if(i==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }

        //recursion
        current.add(nums[i]);
        solve(nums, list, i+1, current);
        
        current.remove(current.size()-1);
        solve(nums, list, i+1, current);
    }
}