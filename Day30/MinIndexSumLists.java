// Day 30: Minimum Index Sum of Two Lists
// Problem: https://leetcode.com/problems/minimum-index-sum-of-two-lists/

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    int sum=i+j;
                    if(sum<min)
                    {
                        min=i+j;
                    }
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    int sum=i+j;
                    if(sum==min)
                    {
                        list.add(list1[i]);
                    }
                }
            }
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
