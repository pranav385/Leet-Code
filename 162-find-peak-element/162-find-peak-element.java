class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        int max=Integer.MIN_VALUE;
        int size= nums.length;
        for(int i=0; i<size ;i++) {
            if(nums[i]>max) {
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}