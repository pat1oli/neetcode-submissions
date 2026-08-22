class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) {
            return false;
        }

        HashMap<String, Integer> a  = new HashMap<>();
        HashMap<String, Integer> b = new HashMap<>();

        fillHash(a, s);
        fillHash(b, t);

        for (String key : a.keySet()) {
            if(!a.get(key).equals(b.get(key))) {
                return false;
            }
        }

        return true;


    }

    public void fillHash(HashMap<String, Integer> hash, String s){

        for (char ch : s.toCharArray()) {
            if (hash.get(String.valueOf(ch)) == null){
                hash.put(String.valueOf(ch), 1);
            }
            else {
                hash.put(String.valueOf(ch), hash.get(String.valueOf(ch)) + 1);
            }
        }

    }
}
