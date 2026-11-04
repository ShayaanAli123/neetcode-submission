class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();

        for (int number : nums) {
            if(!freq.add(number)){
                return true;
            }
        }
        return false;
        }
    }