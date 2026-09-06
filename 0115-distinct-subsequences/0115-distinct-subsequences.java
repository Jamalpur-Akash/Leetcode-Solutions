class Solution {
    public int numDistinct(String s, String t) {
        int[] a=new int[t.length()+1];
        a[0]=1;

        for(int i=0;i<s.length();i++){
            for(int j=t.length()-1;j>=0;j--){
                if(s.charAt(i)==t.charAt(j)){
                    a[j+1]+=a[j];
                }
            }

        }
        return a[t.length()];
    }
}