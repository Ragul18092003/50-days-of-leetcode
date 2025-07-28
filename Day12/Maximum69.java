// Day 12: Maximum 69 Number
// Problem: https://leetcode.com/problems/maximum-69-number/


class Solution {
    public int maximum69Number (int num) {
        char[] ch=String.valueOf(num).toCharArray();
        int max=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='6')
            {
                ch[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}
