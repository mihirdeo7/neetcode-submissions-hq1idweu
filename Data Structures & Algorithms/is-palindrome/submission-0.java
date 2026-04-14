class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }

            if (i < j) {
                char left = Character.toLowerCase(chars[i]);
                char right = Character.toLowerCase(chars[j]);
                if (left != right) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}
