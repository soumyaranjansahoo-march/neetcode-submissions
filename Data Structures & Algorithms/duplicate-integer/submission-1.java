class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> value=new HashSet<>();


        for(int i: nums){

            if(value.contains(i)){
                return true;
            }
            value.add(i);


        }
        return false; 
        
    }
}