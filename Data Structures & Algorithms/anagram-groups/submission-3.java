class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for (String a : strs) {
            char[] chars = a.toCharArray();
            Arrays.sort(chars);
            hash.computeIfAbsent(String.valueOf(chars), k -> new ArrayList<>()).add(a);
        }

        return new ArrayList<>(hash.values());

    }
}
