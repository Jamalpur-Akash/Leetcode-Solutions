class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map=new HashMap<>();
        for(String st:strs){
            char[] c=st.toCharArray();
            Arrays.sort(c);

            String key=new String(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
    }
}