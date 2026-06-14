class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mapList=new HashMap<>();

        for(String str:strs){


char[] charArr=str.toCharArray();
             Arrays.sort(charArr);
String sorted=String.valueOf(charArr);
            mapList.putIfAbsent(sorted,new ArrayList<>());
            mapList.get(sorted).add(str);


        }

        return new ArrayList<>(mapList.values());

        
    }
}
