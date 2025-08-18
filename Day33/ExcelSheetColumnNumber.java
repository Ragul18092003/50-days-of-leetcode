// Day 33: Excel Sheet Column Number
// Problem: https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String columnTitle) {
        char[] ch=columnTitle.toCharArray();
        int ans=0;
        for(int i=0;i<ch.length;i++)
        {
            int value=ch[i]-'A'+1;
            ans=ans*26+value;
        }
        return ans;
    }
}
