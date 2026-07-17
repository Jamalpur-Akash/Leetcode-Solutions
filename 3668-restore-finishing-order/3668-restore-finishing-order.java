class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int f=friends.length;
        int[] ans=new int[f];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<f;j++){
                if(friends[j]==order[i]){
                    ans[k]=order[i];
                    k++;
                    break;
                }
            }
        }
        return ans;

    }
}