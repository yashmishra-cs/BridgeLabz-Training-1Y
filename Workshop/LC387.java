class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char H = s.charAt(i);

            if (s.indexOf(H) == s.lastIndexOf(H)){
                return i;
            }
        }
        return -1;
    }
}