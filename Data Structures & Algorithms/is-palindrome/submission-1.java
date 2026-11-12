class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() -1;
        s = s.toLowerCase();
        while(i < j) {
            if(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) &&
                s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
           
        }
        return true;
        
    }
}
