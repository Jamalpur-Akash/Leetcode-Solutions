class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
            list1.add(nums[i]);
        }

        for(int i=min+1;i<max;i++){
            if(!list1.contains(i)){
                list2.add(i);
            }
        }
        return list2;
    }
}