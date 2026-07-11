class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // 65 to 90
            // 97 to 122 ==32
            if(s.charAt(i)<65||(s.charAt(i)>90&&s.charAt(i)<97)||s.charAt(i)>122){
                i++;
            }
            else if(s.charAt(j)<65||(s.charAt(j)>90&&s.charAt(j)<97)||s.charAt(j)>122){
                j--;
            }else if (s.charAt(i)==s.charAt(j)||(s.charAt(i) - s.charAt(j)==32)||(s.charAt(j) - s.charAt(i)==32)){
                i++;
                j--;
            }else{
                return false;
            }


        }
        return true;
    }
}
