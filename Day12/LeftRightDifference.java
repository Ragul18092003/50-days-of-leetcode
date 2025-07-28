// Day 12: Left and Right Sum Differences
// Problem: https://leetcode.com/problems/left-and-right-sum-differences/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        } 
        int rsum=total, lsum=0;
        for(int i=0;i<nums.length;i++)
        {
            rsum-=nums[i];
            ans[i]=Math.abs(rsum-lsum);
            lsum+=nums[i];
        }  
        return ans;
    }
}
