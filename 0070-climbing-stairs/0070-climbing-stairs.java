class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        
        //JAVA SUPPORTS UNICODE CHARACTERS
        int ఒకటి = 1;
        int రెండు = 2;
        for(int i=3;i<=n;i++){
            int మూడు = ఒకటి + రెండు;
            ఒకటి = రెండు;
            రెండు = మూడు;
        }
        return రెండు;
    }
}