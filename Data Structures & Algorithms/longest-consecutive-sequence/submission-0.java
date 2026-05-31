class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;


        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int prev = num - 1;
            int curr = num;

            int currentLength = 0;
            if(!set.contains(prev)){
                currentLength+=1;
                while(set.contains(curr + 1)){
                    currentLength+=1;
                    curr+=1;
                }

                maxLength = Math.max(maxLength, currentLength );
            }else{
                set.add(num);
            }
        }
        return maxLength;
    }
}
