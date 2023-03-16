package java12.transform;

public class PalindromeChecker {

    boolean isPalindrome(String text) {
        // implement here
        // TIP: you can use StringBuilder.reverse method
        return text
                .transform(s -> new StringBuilder(s))
                .reverse()
                .toString()
                .equals(text);
    }
}
