class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        int i = m - 1, j = n - 1;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        
        if (carry != 0) {
            result.insert(0, carry);
        }
        
        return result.toString();
    }
}
