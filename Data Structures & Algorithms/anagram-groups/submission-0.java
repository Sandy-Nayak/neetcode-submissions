class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        for(String name : strs){
            char[] charArray = name.toCharArray();
            Arrays.sort(charArray);
            String sortedName = new String(charArray);
            map.computeIfAbsent(sortedName, k -> new ArrayList<>()).add(name);
        }

        return new ArrayList<>(map.values());
    }
}
