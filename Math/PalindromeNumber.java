// LeetCode 9: Palindrome Number
// Optimized approach: reverse only half to avoid overflow

class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        // Reverse only half of the number
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        // Even digits: x == rev
        // Odd digits: x == rev / 10 (middle digit ignored)
        return x == rev || x == rev / 10;
    }
}
