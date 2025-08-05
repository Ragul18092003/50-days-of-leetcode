// Day 20: Number of Strings That Appear as Substrings in Word
// Problem: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            {
                count++;
            }
        }
        return count;
    }
}
