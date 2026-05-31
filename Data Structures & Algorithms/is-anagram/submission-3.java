class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
 
        int[] hashArray = new int[26];

        for(int i = 0; i < s.length(); i++){
            hashArray[s.charAt(i)-'a']++;
            hashArray[t.charAt(i)-'a']--;
        }

        for(int index : hashArray){
            if(index != 0){
                return false;
            }
        }
        return true;
    }
}
