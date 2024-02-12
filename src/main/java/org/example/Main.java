package org.example;

import static org.example.Palidrome.isPalindrome;

public class Main {

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = 10;

        System.out.println("Input: x = " + x1 + ", Output: " + isPalindrome(x1));
        System.out.println("Input: x = " + x2 + ", Output: " + isPalindrome(x2));
    }
}