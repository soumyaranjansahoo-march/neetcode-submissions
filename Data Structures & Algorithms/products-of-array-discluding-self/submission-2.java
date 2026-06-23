class Solution {
    public int[] productExceptSelf(int[] nums) {


int numLength=nums.length;
int [] result=new int[numLength];
        for(int i=0;i<numLength;i++){

            int prod=1;
            for(int j=0;j<numLength;j++){

                if(i!=j){
                    prod= prod*nums[j];
                }

                result[i] = prod;


            }

            
        }
        return result;
        
    }
}  
