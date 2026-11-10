class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        // need to find exact anagrams  
        for (String word : strs) {
            char characters [] = word.toCharArray();
            Arrays.sort(characters);
            String key = String.valueOf(characters);
            freq.putIfAbsent(key, new ArrayList<>());
            freq.get(key).add(word);
        }
        return new ArrayList<>(freq.values());
    }
}
