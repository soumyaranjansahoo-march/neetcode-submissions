class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;

        }
        

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){

                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        
       int count=1;
       int max=1;

        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[i-1]){
                continue;
            }

            if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}
