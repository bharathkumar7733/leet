import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        int c=0;
        for(int key:hm.keySet()){
            int n = hm.get(key);
            c+=n*(n-1)/2;
        

        }
        return c;



        
    }
}