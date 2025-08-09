// Day 24: Reverse Words in a String III
// Problem: https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String res="";
        for(int k=0;k<str.length;k++)
        {
            char[] ch=str[k].toCharArray();
            int i=0,j=ch.length-1;
            while(i<j)
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            for(char c:ch)
            {
                res+=c;
            }
            if(k!=(str.length-1))
            {
                res+=" ";
            }
        }
        return res;
    }
}
