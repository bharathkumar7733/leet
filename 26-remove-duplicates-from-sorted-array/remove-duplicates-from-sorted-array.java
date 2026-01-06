class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
          if (nums.length == 0) return 0;
        int i =0;
        for(int j=0;j<l;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
        
    }
}