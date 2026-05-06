class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int longestLength = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
        
            if(!set.contains(num - 1)){
                 int currentNumber = num;
                 int currentLength = 1;

                 while(set.contains(currentNumber + 1)){
                    currentLength++;
                    currentNumber++;
                 }
                longestLength = Math.max(currentLength, longestLength);
            }
         
           
        }

            return longestLength;
    }
}
