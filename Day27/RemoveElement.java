// Day 27: Remove Element
// Problem: https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int k) {
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            if(nums[i]==k)
            {
                nums[i]=nums[j];
                j--;
            }
            else
            {
                i++;
            }
        }   
        return i;
    }
}
