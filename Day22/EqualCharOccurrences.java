// Day 22: Check if All Characters Have Equal Number of Occurrences
// Problem: https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq=new int[26];
        int max=0;
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
            if(freq[ch-'a']>0)
            {
                max=freq[ch-'a'];
            }
        }
        for(int i:freq)
        {
            if(i>0 && i!=max)
            {
                return false;
            }
        }
        return true;
    }
}

/*
int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int max=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]>max)
            {
                max=freq[i];
            }
        }
        for(int i=0;i<26;i++)
        {
            if(!(freq[i]==max || freq[i]==0))
            {
                return false;
            }
        }
        return true;
 */
