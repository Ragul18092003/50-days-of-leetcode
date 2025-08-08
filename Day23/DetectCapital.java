
// Day 23: Detect Capital
// Problem: https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                count++;
            }
        }
        if(count==n)
        {
            return true;
        }
        if(count==0)
        {
            return true;
        }
        if(count==1 && word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            return true;
        }
        return false;
    }
}
