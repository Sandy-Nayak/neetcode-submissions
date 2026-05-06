class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int longestLength = 0;
        for(int num : nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num : nums){
            int currentLength = 1;

            //forward serach
            int nextNum = num + 1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currentLength+=1;

                map.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            //backward search
            int prevNum = num - 1;
            while(map.containsKey(prevNum) && !map.get(prevNum)){
                currentLength+=1;
                map.put(prevNum, Boolean.TRUE);

                prevNum--;
            }

            longestLength = Math.max(currentLength, longestLength);
        }
        return longestLength;
    }
}
