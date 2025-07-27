// Day 11: Find Numbers with Even Number of Digits
// Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int totalcount=0;
        for(int num:nums)
        {
            int digitcount=0;
            while(num!=0)
            {
                num/=10;
                digitcount++;
            }
            if(digitcount%2==0)
            {
                totalcount++;
            }
        }
        return totalcount;
    }
}
