// Day 34: Largest Number At Least Twice of Others
// Problem: https://leetcode.com/problems/largest-number-at-least-twice-of-others/

class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=index && max<(2*nums[i]))
            {
                return -1;
            }
        }
        return index;
    }
}
