class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int[] result = new int[k];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    result[i] = entry.getKey();
                }
            }
            frequencyMap.remove(result[i]);
            max=Integer.MIN_VALUE;
        }
        return result;
    }
}
