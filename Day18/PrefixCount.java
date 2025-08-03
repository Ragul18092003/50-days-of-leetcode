// Day 18: Count Prefixes of a Given String
// Problem: https://leetcode.com/problems/count-prefixes-of-a-given-string/

class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word:words)
        {
            if(s.startsWith(word))
            {
                count++;
            }

        }
        return count;
    }
}

/*
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word:words)
        {
            if(word.length()>s.length())
            {
                continue;
            }
            boolean isprefix=true;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)!=s.charAt(i))
                {
                    isprefix=false;
                    break;
                }
            }
            if(isprefix)
            {
                count++;
            }
        }
        return count;
    }
}
*/
