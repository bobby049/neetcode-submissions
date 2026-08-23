class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n=s.length();
         int max=0;
        int[] bools=new int[255];
        Arrays.fill(bools,-1);
        int l=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(bools[c]>=l){
                 l=bools[c]+1;
            }
            bools[c]=i;
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
