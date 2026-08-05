class Solution {
    public int maxVowels(String s, int k) {
        // String convert=s.replaceAll("[b-df-hj-np-tv-z]","_");
        char[] c=s.toCharArray();
        
        int length=0;
        for(int i=0;i<k;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
                length++;
            }
        }
        int maxLength=length;
        
        for(int j=k;j<c.length;j++){
            if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u'){
                length++;
            }
            if(c[j-k]=='a' || c[j-k]=='e' || c[j-k]=='i' || c[j-k]=='o' || c[j-k]=='u'){
                length--;
            }
            maxLength=Math.max(length, maxLength);
        }
        return maxLength;
    }
}