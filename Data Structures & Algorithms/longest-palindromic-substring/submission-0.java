class Solution {
    public String longestPalindrome(String s) {
        String LPS = "";
    
    for(int i = 0; i < s.length();  i++){

    
        String odd = expand(s, i, i);
        if(odd.length() > LPS.length()){
            LPS = odd;
        }
         String even = expand(s, i, i+ 1);
        if(even.length() > LPS.length()){
            LPS = even;
        }

    }
        return LPS;
        
    }

    private static String expand(String s, int left, int right){
        
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
        }
        return s.substring(left + 1, right);
    }
}
