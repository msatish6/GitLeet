class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] checker = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int check= nums[i];
            for(int j = 0; j < i; j++){
                if(checker[j]==check){
                    return true;
                }
            }
            checker[i]=check;
            System.out.println(check);
        }
        return false;
    }
}
