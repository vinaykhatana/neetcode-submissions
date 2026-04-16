class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sum = 0;
        int j=1;
        for(int i=j-1;i<nums.length;i++){
            for(j=1;j<nums.length;j++){
                if(target == nums[i]+nums[j] && i!=j){
                  return new int[]{i, j};  
                }
            }
        }
      return new int[]{};  
        
    }
}
