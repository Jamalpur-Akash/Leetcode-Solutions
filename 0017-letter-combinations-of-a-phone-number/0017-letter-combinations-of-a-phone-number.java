class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        
        String[] arr={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,0,"",arr,list);
        return list;
        
    }
    public void solve(String digits, int i, String result, String[] arr, List<String> list){
        //base
        if(i==digits.length()){
            list.add(result);
            return;
        }

        //recursion

        String letters=arr[digits.charAt(i)-'0'];
        for(char ch:letters.toCharArray()){
            solve(digits,i+1,result+ch,arr,list);
        }
    }
}