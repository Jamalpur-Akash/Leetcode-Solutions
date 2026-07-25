class Solution {
    public int[] sortedSquares(int[] nums) {

        int l=0;
        int r=nums.length-1;
        int i=nums.length-1;
        int[] res=new int[nums.length];
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];

            if(ls<rs){
                res[i]=rs;
                r--;
            } else{
                res[i]=ls;
                l++;
            }
            i--;
        }
        return res;
    }
        
    //     for(int j=0;j<nums.length;j++){
    //         nums[j]=nums[j]*nums[j];
    //     }
    //     Arrays.sort(nums);
    //     return nums;
    // }
}