class Solution {
    public int maxArea(int[] heights) {
        //formula: right - left * min(left,right)
        int maxArea = 0;
        int left = 0; int right = heights.length - 1;
        while(left < right){
            int area = (right - left) * Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}
