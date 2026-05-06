class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String str : strs){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            result.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            
        }

        return new ArrayList<>(result.values());
    }
}
