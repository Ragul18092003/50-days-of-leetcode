// Day 21: Check Whether Two Strings Are Almost Equivalent
// Problem: https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/


class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq=new int[26];
        for(int i=0;i<word1.length();i++)
        {
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(Math.abs(freq[i])>3)
            {
                return false;
            }
        }
        return true;
    }
}

/*

int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<word1.length();i++)
        {
            a[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++)
        {
            b[word2.charAt(i)-'a']++;
        }
        int[] diff=new int[26];
        for(int i=0;i<26;i++)
        {
            diff[i]=Math.abs(a[i]-b[i]);
        }
        for(int i=0;i<diff.length;i++)
        {
            if(diff[i]>3)
            {
                return false;
            }
        }
        return true;
*/
