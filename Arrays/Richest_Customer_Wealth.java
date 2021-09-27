class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j,max=-99999,sum=0;
        for(i=0;i<accounts.length;i++){
            for(j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }   
}
