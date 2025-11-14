class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            int a = nums[index];
            if(a != 0) {
                index++;
                continue;
            }
            for (int l = index+1;l < nums.length; l++){
                nums[l-1] = nums[l];
            }
            nums[nums.length-1] =0;
        }
    }
}