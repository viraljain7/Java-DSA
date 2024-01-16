package _00_LeetcodeQueSol;

public class Q389 {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        // Summing ASCII values for characters in string s
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        // Subtracting ASCII values for characters in string t
        for (int i = 0; i < t.length(); i++) {
            sum -= t.charAt(i);
        }

        // Returning the difference character
        return (char) Math.abs(sum);
    }
}
