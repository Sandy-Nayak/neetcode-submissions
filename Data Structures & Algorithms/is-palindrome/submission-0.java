class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int start = 0, end = cleaned.length() - 1;
        while(start < end){
            if(cleaned.charAt(start++)!=cleaned.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
