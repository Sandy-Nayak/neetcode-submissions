class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <=0 ) return true;
        StringBuilder sb  = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        return isPalindromeString(sb.toString().toLowerCase()) ;
    }

    private static boolean isPalindromeString(String sb){
        int left = 0; int right = sb.length() -1;

        while(left < right){
         if(sb.charAt(left++) != sb.charAt(right--)){
            return false;
         }
        } 

        return true;
    }
}
