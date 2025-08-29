// Day 44: Find Peak Element
// Problem: https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        while(left<right)
        {
            int mid=left+(right-left) / 2;
            if(nums[mid]<nums[mid+1])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
}
/*
int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max==nums[i])
            {
                index=i;
            }
        }
        return index;
    */
