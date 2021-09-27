class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int runsum[] = new int[n];
        int s=0;
        int i;
        for(i=0;i<n;i++){
            
            s+=nums[i];
            runsum [i] = s;
        }
        return runsum;
    }
}
