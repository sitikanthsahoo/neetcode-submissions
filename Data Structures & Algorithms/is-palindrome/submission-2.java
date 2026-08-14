class Solution {
    public boolean isPalindrome(String s) {
        // 1. Filter out non-alphanumeric characters and lowercase
        String store = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int length = store.length();
        int start = 0;
        int end = length - 1;

        // 2. A single loop for both even and odd lengths
        for (int i = 0; i < length / 2; i++) {
            if (store.charAt(start) == store.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}