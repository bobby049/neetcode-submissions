class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        boolean flag = true;

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        if (s.length() != t.length()) {
            return false;
        }

        for (char x : map.keySet()) {
            if (map.get(x) != map1.getOrDefault(x, 0)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}