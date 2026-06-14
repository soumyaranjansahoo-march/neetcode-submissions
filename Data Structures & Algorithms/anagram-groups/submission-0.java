class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
        for(String res:strs){
            char[] charArray=res.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String(charArray);

            map.putIfAbsent(sorted,new ArrayList<>());

            map.get(sorted).add(res);
        }
        return new ArrayList<>(map.values());
    }
}
