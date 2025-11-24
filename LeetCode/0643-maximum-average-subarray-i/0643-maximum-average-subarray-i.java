class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l = k-1;

        double max = 0;

        while (l >= 0){
            max += nums[l];
            --l;
        }
        double result = max;
        int start = 0;
        for (int i = k; i < nums.length ;i++){
            result += nums[i];
            result -= nums[start];

            if(result > max){
                max = result;
            }
            start++;
        }

        return max/k;
    }
}