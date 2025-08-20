// Day 35: Plus One
// Problem: https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            i--;
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
