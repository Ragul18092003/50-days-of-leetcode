// Day 3: Maximum Number of Words Found in Sentences
// Problem: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            int wordcount=sentences[i].split(" ").length;
            max=Math.max(max,wordcount);
        }
        return max;
    }
}
