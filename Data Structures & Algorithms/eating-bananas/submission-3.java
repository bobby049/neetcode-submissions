class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }
        int ans=max;
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                 sum += (piles[i] + mid - 1) / mid;
            }
            if(sum>h){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;           
            }
        }
        return ans;
    }
}