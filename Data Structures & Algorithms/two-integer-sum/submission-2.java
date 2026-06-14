class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map1.put(nums[i],i);
        }

        for(int j=0;j<nums.length;j++){
                int targetNum=target-nums[j];
                if(map1.containsKey(targetNum)&&map1.get(targetNum)!=j){
                    return new int[]{j,map1.get(targetNum)};
                }
        }

        return new int[]{};
    }
}
