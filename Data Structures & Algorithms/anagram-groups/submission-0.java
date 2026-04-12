class Solution {
    

public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<Integer>> counts = new ArrayList();
        Map<List<Integer>,List<String>> map = new HashMap();
        for(String str: strs){
            char[] chars =str.toCharArray();
            List<Integer> count= new ArrayList(26);
            for(int i=0;i<26;i++){
                count.add(0);
            }
            
            for(char i:chars){
                int index = i-'a';
                int existingValue =count.get(index);
            count.set(index, existingValue+1);
            }
            List<String> existingList =map.getOrDefault(count, new ArrayList<String>());
            existingList.add(str);
            map.put(count ,existingList );
        }
        return new ArrayList<>(map.values());
    }
}