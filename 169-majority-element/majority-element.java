import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
         for(int key:hm.keySet()){
            if (hm.get(key)>nums.length/2){
                return key;
            }
         }   
        return -1;
    }

}   

