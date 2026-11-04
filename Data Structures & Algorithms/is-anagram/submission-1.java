class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count each character in s
        for (char c : sArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract each character in t
        for (char c : tArr) {
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}