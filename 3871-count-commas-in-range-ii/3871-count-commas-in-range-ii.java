class Solution {
    public long countCommas(long n) {
        long commas=n-999;
        long extra1=0;
        long extra2=0;
        long extra3=0;
        long extra4=0;
        if(n>=1000000){
            extra1=(n-1000000)+1;
        }
        if(n>=1000000000){
            extra2=(n-1000000000)+1;
        }
        if(n>=1000000000000L){
            extra3=(n-1000000000000L)+1;
        }
        if(n>=1000000000000000L){
            extra4=(n-1000000000000000L)+1;
        }



        if(n<1000) return 0;
        else if(n>=1000 && n<1000000) return commas;
        else if(n>=1000000 && n<1000000000) return commas+extra1;
        else if(n>=1000000000 && n<1000000000000L) return commas+extra1+extra2;
        else if(n>=1000000000000L && n<1000000000000000L) return commas+extra1+extra2+extra3;
        return commas+extra1+extra2+extra3+extra4;
    }
}