class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);
        int r=1;
        //if(sumOdd>sumEven){
            while(r!=0){
                r=sumOdd%sumEven;
                sumOdd=sumEven;
                sumEven=r;
            }
            return sumOdd;

    }
}