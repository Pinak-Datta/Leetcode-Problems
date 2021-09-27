class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int c=0;
        List<Boolean> result = new ArrayList<>(candies.length);
        int max=candies[0],i;
        for(i=0;i<n;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        
        return result;
    }
}
