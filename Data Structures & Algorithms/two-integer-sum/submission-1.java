class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<len;i++){
            int diff = target - nums[i];
            map.put(diff,i);
        }
        for (int i =0; i<len;i++){
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i!=j)
                return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
