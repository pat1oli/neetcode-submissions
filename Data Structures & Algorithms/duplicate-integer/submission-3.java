
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> tab = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (tab.contains(nums[i])){
                return true;
            } else {
                tab.add(nums[i]);
            }
        }
        return false;
    }
}