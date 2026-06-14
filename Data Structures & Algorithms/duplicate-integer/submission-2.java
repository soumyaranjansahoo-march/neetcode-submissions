class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> value=new HashMap<>();


        for(int i: nums){

           value.put(i,value.getOrDefault(i,0)+1);


        }
        for(int j:nums){
            if(value.get(j)>=2){
                return true;
            }
        }
        return false; 
        
    }
}