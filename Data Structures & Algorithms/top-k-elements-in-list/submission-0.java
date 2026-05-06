class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //min heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a , b) -> freq.get(a) - freq.get(b)
        );

        // keep only top K eleements
        for(int num : freq.keySet()){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        for(int num : pq ){
            result[i++] = num;
        }
            return result;
    }
}
