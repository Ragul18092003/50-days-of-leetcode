// Day 8: Defanging an IP Address
// Problem: https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
