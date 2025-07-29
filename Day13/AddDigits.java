// Day 13: Add Digits
// Problem: https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        while(num>=10)
        {
            int sum=0;
            int temp=num;
            while(temp>0)
            {
                sum+=temp%10;
                temp/=10;
            }
            num=sum;
        }
        return num;
    }
}
