class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if (nums[i]== 0){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j]!= 0){
                        int swap = nums[j];
                        nums[j] = nums[i];
                        nums[i] = swap;
                        break;
                    }
                }
            }

        }
    }
}
