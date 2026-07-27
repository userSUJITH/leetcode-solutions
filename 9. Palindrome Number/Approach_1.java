class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }
}