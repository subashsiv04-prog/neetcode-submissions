class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        j = 0
        count = []
        for i in range(len(nums)):
            if nums[i] == 1:
                j += 1
            else:
                count.append(j)
                j = 0
        count.append(j)
        return max(count)
