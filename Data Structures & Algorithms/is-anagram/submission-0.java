class Solution {
    public boolean isAnagram(String s, String t) {

        //Anangram means each character in s should be present exactly same number of times in t
        //Check the length first
        if(s.length() != t.length()) 
            return false;
        
        //For each character from s increment their index,and for t decrement
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length();i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        //If it is anagram, the arr should contain all zero, else it is not anagram
        for(int num : arr) {
            if(num != 0) 
                return false;
        }

        return true;
    }
}
