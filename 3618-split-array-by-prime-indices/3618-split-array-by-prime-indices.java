class Solution {
    public long splitArray(int[] nums) {
        long sumA=0;
        long sumB=0;
        for(int i=0;i<nums.length;i++){
            if(i<2){
                sumB+=nums[i];
                continue;
            }
            int k=2;
            boolean is_prime=true;
            while(k*k<=i){
                if(i%k==0){
                    is_prime=false;
                    break;
                }
                k++;
            }
            if(is_prime){
                sumA+=nums[i];
            } else{
                sumB+=nums[i];
            }
        }
        return Math.abs(sumA-sumB);
    }
}