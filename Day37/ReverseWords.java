// Day 37: Reverse Words in a String
// Problem: https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        String str="";
        for(int i=arr.length-1;i>=0;i--)
        {
            str+=arr[i];
            if(i!=0)
            {
                str+=" ";
            }
        }
        return str;
    }
}
