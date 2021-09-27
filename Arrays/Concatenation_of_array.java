class Solution {
    public int[] getConcatenation(int[] nums) {
        int i;
        int n=nums.length;
        int ans[] = new int[(n)*2];
        for(i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        //for(i=nums.length;i<n*2;i++){
          //  ans[i]==nums[i]
        //
        return ans;
    }
}
