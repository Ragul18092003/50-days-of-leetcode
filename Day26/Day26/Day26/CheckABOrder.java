// Day 26: Check if All A's Appear Before All B's
// Problem: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/

class Solution {
    public boolean checkString(String s) {
        boolean ans=false;
        for(char ch:s.toCharArray())
        {
            if(ch=='b')
            {
                ans=true;
            }
            else if(ans && ch=='a')
            {
                return false;
            }
        }
        return true;
    }
}
