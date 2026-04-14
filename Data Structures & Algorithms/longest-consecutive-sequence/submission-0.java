class Solution {
    public int longestConsecutive(int[] nums) {
        // TODO: Write your solution here
        Set<Integer> values = new HashSet<>();
        for (int i : nums) {
            values.add(i);

        } 
        int maxCount =0;
        for (Integer integer : values) {
            int count=1;
            
            if(!values.contains(integer-1)){
                for (int i = 0; i < nums.length; i++) {
                    if(values.contains(integer+i+1))
                        count++;
                    else
                        break;
                }
                maxCount=count>maxCount?count:maxCount;
            }
        }
        return maxCount;

    }
}
