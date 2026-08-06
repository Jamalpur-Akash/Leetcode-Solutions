class Solution {
    public int smallestNumber(int n, int t) {
        int i=0;
        
        while(n<=100){
            int p=n;
            int pro=1;
            while(p>0){
                pro*=p%10;

                p/=10;
            }
            if(pro%t==0){
                return n;
            }
            n++;
        }
        return -1;

    }
}