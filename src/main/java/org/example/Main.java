package org.example;


import static org.example.ValidParentheses.isValid;

public class Main {

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "()[";

        System.out.println("Input: s = \"" + s1 + "\", Output: " + isValid(s1));
        System.out.println("Input: s = \"" + s2 + "\", Output: " + isValid(s2));
        System.out.println("Input: s = \"" + s3 + "\", Output: " + isValid(s3));
    }
}