class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char charI = s.charAt(i);
            char charJ = s.charAt(j);
            if (!Character.isLetterOrDigit(charI)) {
                i++;
            } else if (!Character.isLetterOrDigit(charJ)) {
                j--;
            } else if (Character.toLowerCase(charI) == Character.toLowerCase(charJ)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}