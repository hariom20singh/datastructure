#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       int l=0;
       int r=1;
       while(l<nums.size()-1){
           while(r<nums.size()){
               if(nums[l] + nums[r] == target){
                   return {l,r};
               }
               r++;
           }
           l++;
           r=l+1;
       }
       return {};
    }
};