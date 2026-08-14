class Solution {
    public boolean isPalindrome(String s) {
       String store = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = store.length();

        int start = 0;
        int end = store.length()-1;

        if(length%2 == 0){
            for(int i=0;i<(length/2);i++){
                if(store.charAt(start) == store.charAt(end)){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else{
            for(int i=0;i<length/2;i++){
                if(store.charAt(start) == store.charAt(end)){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
           return true;
        }

        
    }
}
