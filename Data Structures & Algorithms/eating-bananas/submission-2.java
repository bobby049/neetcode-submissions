class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }

        for(int i =1; i <= max; i++) {

            int sum = 0;

            for(int j = 0; j < piles.length; j++) {

                if (piles[j] < i) {
                    sum++;
                } 
                else {
                    sum += piles[j] / i;

                    if (piles[j] % i != 0) {
                        sum++;
                    }
                }
            }

            if(sum <= h) {
                return i;
            }
        }

        return 0;
    }
}