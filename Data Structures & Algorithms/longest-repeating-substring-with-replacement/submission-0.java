class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
                 freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char maxChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        for(int i=0;i<k;i++){
            if(s.charAt(i)!=maxChar){
                s.replace(s.charAt(i),maxChar);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==maxChar){
                count++;
            }else{
                break;
            }
        }
        return count+k+1;
    }
}
