/**
 * Class - MyString
 * @Description: A custom string class with various string operations.
 * @Author: Rudraksh Dusad
 */
public class MyString {

    // 1. Reverse String
    public String reverse(String str) {
        char[] arr = str.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];
        }
        return rev;
    }

    // 2. Check Palindrome
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // 3. Count Vowels
    public int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }

    // 4. Remove Spaces
    public String removeSpaces(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                res += str.charAt(i);
        }
        return res;
    }

    // 5. Count Words 
    public int countWords(String str) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                inWord = true;
                count++;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    // 6. Convert to Uppercase
    public String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);
            result += ch;
        }
        return result;
    }

    // 7. Count Character Frequency 
    public int charFrequency(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                count++;
        }
        return count;
    }
}
