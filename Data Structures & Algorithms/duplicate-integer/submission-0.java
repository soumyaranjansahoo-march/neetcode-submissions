class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Boolean result;
        Map<Integer,Integer> resultMap= new HashMap<>();

        for (int i:nums){
            resultMap.put(i,resultMap.getOrDefault(i,0)+1);
        }
        for(int count:resultMap.values()){
 if(count> 1) return true;
        }
        return false;
    }

}