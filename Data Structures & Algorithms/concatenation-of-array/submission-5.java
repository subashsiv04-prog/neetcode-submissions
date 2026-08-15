class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];
        int its = 0;
        while(its < 2) {
            for (int i=0; i<len;i++) {
                ans[len * its + i] = nums[i];
            }
            its++;
        }
        return ans;
    }
}