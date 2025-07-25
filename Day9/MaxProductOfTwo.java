// Day 9: Maximum Product of Two Elements in an Array
// Problem: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        int first=0,second=0;
        for(int num:nums)
        {
            if(num>first)
            {
                second=first;
                first=num;
            }
            else if(num>second)
            {
                second=num;
            }
        }
        return (first-1)*(second-1);
    }
}
