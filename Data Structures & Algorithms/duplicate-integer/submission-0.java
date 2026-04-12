class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(sets.contains(nums[i]))
            return true;
            else
            sets.add(nums[i]);
        }
        return false;
    }
}