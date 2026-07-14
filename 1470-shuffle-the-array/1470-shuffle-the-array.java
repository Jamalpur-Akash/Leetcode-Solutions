class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j,k;
        int[] ans=new int[2*n];
        for(i=0,j=n,k=0;i<n;i++,j++){

            ans[k++]=nums[i];
            ans[k++]=nums[j];
        }
        return ans;
    }
}