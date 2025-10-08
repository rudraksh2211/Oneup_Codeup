/**
 * Class - MyString
 * @Description: A custom string class with various string operations.
 * @Author: Rudraksh Dusad
 */
public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    // Getter and Setter
    public String get() {
        return str;
    }

    public void set(String str) {
        this.str = str;
    }

    // Append
    public void append(String s) {
        this.str = this.str + s;
    }

    // Count words
    public int countWords() {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    // Replace character
    public void replaceChar(char oldChar, char newChar) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = (str.charAt(i) == oldChar) ? newChar : str.charAt(i);
        str = new String(arr);
    }

    // Check palindrome
    public boolean isPalindrome() {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Splice
    public void splice(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < start || i >= end)
                sb.append(str.charAt(i));
        }
        str = sb.toString();
    }

    // Split
    public String[] split() {
        return str.trim().split("\\s+");
    }

    // Max repeating character
    public char maxRepeatingChar() {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;
        int max = 0;
        char res = str.charAt(0);
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                res = (char) i;
            }
        }
        return res;
    }

    // Sort string
    public void sortString() {
        char[] arr = str.toCharArray();
        java.util.Arrays.sort(arr);
        str = new String(arr);
    }

    // Shift string
    public void shiftString(int n) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[(i + n) % str.length()] = str.charAt(i);
        str = new String(arr);
    }

    // Reverse string
    public void reverseString() {
        str = new StringBuilder(str).reverse().toString();
    }

    // Concat
    public void concat(String s) {
        str = str + s;
    }

    // Find length
    public int findLength() {
        return str.length();
    }

    // Check equality
    public boolean isEqual(String s) {
        return str.equals(s);
    }

    // Count vowels
    public int countVowels() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }

    // Remove spaces
    public void removeSpaces() {
        str = str.replace(" ", "");
    }

    @Override
    public String toString() {
        return str;
    }
}
