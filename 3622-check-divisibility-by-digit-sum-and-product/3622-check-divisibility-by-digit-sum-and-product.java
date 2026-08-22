class Solution {
    public boolean checkDivisibility(int n) {
        int d=n;
        int pro=1;
        int sum=0;
        while(d>0){
            pro=pro*(d%10);
            sum=sum+(d%10);
            d/=10;
        }
        int val=sum+pro;

        if(n%val==0){
            return true;
        }
        return false;
    }
}