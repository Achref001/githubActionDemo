package com.example.demo;

public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        // Incorrect comparison using ==
        if (str1 == str2) {
            System.out.println("str1 and str2 are equal using == (incorrect)");
        } else {
            System.out.println("str1 and str2 are not equal using == (correct)");
        }

        // Correct comparison using .equals()
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal using .equals() (correct)");
        } else {
            System.out.println("str1 and str2 are not equal using .equals() (incorrect)");
        }
    }
}