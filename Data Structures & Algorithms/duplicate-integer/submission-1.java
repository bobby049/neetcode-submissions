class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : nums) {
             map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(int x : map.values()){
            if(x>1){
                flag=true;
            }
        }
        return flag;
    }
}