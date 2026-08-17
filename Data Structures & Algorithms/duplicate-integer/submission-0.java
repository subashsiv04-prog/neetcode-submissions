class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len;i++) {
            boolean exists = map.containsKey(nums[i]);
            if (exists == true) {
                return true;
            }
            map.put(nums[i],exists);
        }
        return false;
    }
}