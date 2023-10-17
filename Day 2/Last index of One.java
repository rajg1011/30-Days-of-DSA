// Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.
class Solution {
    public int lastIndex(String s) {
        int k = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                k = i;
                break;
            }
        }
        return k;

    }
}