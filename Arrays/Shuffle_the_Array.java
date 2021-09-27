class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, j = n, c = 0; c < res.length; i++, j++) {
            res[c++] = nums[i];
            res[c++] = nums[j];
        } 
        return res;
    }
}
