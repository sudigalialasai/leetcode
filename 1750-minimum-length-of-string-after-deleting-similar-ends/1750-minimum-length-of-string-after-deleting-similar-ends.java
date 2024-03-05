class Solution {
    public int minimumLength(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = str.length() - 1;

        while (i < j && str.charAt(i) == str.charAt(j)) {
            while (i < j && str.charAt(i) == str.charAt(i + 1)) {
                i++;
            }
            while (i < j && str.charAt(j) == str.charAt(j - 1)) {
                j--;
            }
            i++;
            j--;
        }
        
        // If the string becomes empty or only one character is left
        if (i > j) {
            return 0;
        } else if (i == j) {
            return 1;
        } else {
            return j - i + 1;
        }
    }
}
