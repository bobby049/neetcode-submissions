class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n=s.length();
         int max=0;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                boolean[] seen =new boolean[255];
                boolean unique=true;
                for(int k=i;k<=j;k++){
                    char c=s.charAt(k);
                    if(seen[c]){
                        unique=false;
                        break;
                    }
                    seen[c]=true;
                }
                if(unique){
                     max=Math.max(max,j-i+1);
                }
            }
         }
         return max;
    }
}
