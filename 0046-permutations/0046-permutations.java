class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        solve(nums,new ArrayList<>(),new boolean[nums.length],list);
        return list;
    }
    public void solve(int[] nums, List<Integer> ans, boolean used[], List<List<Integer>> list){
        if(ans.size()==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            ans.add(nums[i]);
            used[i]=true;

            solve(nums,ans,used,list);

            ans.remove(ans.size()-1);
            used[i]=false;
        }

        
    }
}