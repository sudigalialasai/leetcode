class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        String s1=s.toLowerCase();

        while(left<right){
            if(!Character.isLetterOrDigit(s1.charAt(left))) left++;
            else if(!Character.isLetterOrDigit(s1.charAt(right))) right--;
            else{
                if(s1.charAt(left)!=s1.charAt(right)) return false;
                else{
                    left++;
                    right--;
                }
            }
        }
        return true;
        
    }
}