package polymorphism;

import java.util.Arrays;

@FunctionalInterface
interface AnagramChecker {
    boolean check(String s1, String s2);
}

public class Anagram {
    public static void main(String[] args) {
        // Lambda implementation of the functional interface
        AnagramChecker anagram = (s1, s2) -> {
            if (s1 == null || s2 == null || s1.length() != s2.length()) {
                return false;
            }

            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };

        // Test cases
        test(anagram, "silent", "listen");
        test(anagram, "meet", "jeet");
    }

    private static void test(AnagramChecker checker, String a, String b) {
        if (checker.check(a, b)) {
            System.out.println("\"" + a + "\" and \"" + b + "\" are Anagrams");
        } else {
            System.out.println("\"" + a + "\" and \"" + b + "\" are NOT Anagrams");
        }
    }
}