
/*
Example Walkthrough
s = AABABBA
k = 1

Window grows:

A
len=1
maxFreq=1
1-1=0

Valid.

AA
len=2
maxFreq=2
2-2=0

Valid.

AAB
len=3
maxFreq=2
3-2=1

Valid.

AABA
len=4
maxFreq=3
4-3=1

Valid.

AABAB
len=5
maxFreq=3
5-3=2

Invalid (2 > k)

Shrink from left.


And that quantity is:

window size - count of the most frequent character

Once that exceeds k, the window is no longer feasible and must be shrunk.

*/
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            freq[c - 'A']++;

            maxFreq = Math.max(maxFreq , freq[c - 'A']);

            while((right - left + 1) - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    
    }
}
