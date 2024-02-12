package org.example;

public class Palidrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
