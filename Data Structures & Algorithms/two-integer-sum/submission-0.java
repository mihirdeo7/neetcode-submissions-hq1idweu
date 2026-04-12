class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complement =new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(complement.containsKey(target-nums[i])){

            
            result[0] = complement.get(target-nums[i]);

            result[1] = i;
            }
            else
            complement.put(nums[i], i);
        }
        return result;
    }
}
