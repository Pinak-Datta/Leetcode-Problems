class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0,k=0, i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    c+=1;
                }
            }
        }
        return c;
    }
}
