import java.util.Scanner;

public class ass1 {

    static String append(String str1, String str2) {
        char[] result = new char[str1.length() + str2.length()];
        for (int i = 0; i < str1.length(); i++)
            result[i] = str1.charAt(i);
        for (int i = 0; i < str2.length(); i++)
            result[str1.length() + i] = str2.charAt(i);
        return new String(result);
    }

    static int countWords(String str) {
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

    static String replaceChar(String str, char oldChar, char newChar) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (str.charAt(i) == oldChar) ? newChar : str.charAt(i);
        }
        return new String(arr);
    }

    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static String splice(String str, int start, int end) {
        char[] result = new char[str.length() - (end - start)];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < start || i >= end)
                result[index++] = str.charAt(i);
        }
        return new String(result);
    }

    static String[] split(String str) {
        int wordCount = countWords(str);
        String[] words = new String[wordCount];
        int wIndex = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                temp += str.charAt(i);
            else {
                if (temp.length() > 0) {
                    words[wIndex++] = temp;
                    temp = "";
                }
            }
        }
        if (temp.length() > 0)
            words[wIndex] = temp;
        return words;
    }

    static char maxRepeatingChar(String str) {
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

    static String sortString(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return new String(arr);
    }

    static String shiftString(String str, int n) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[(i + n) % str.length()] = str.charAt(i);
        return new String(arr);
    }

    static String reverseString(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(str.length() - 1 - i);
        return new String(arr);
    }

    static String concat(String a, String b) {
        char[] result = new char[a.length() + b.length()];
        for (int i = 0; i < a.length(); i++)
            result[i] = a.charAt(i);
        for (int j = 0; j < b.length(); j++)
            result[a.length() + j] = b.charAt(j);
        return new String(result);
    }

    static int findLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        return len;
    }

    static boolean isEqual(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;
        }
        return count;
    }

    static String removeSpaces(String str) {
        char[] arr = new char[str.length()];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                arr[idx++] = str.charAt(i);
        }
        return new String(arr, 0, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        while (true) {
            System.out.println(
                "\nChoose operation (0 to Exit):\n" +
                "1. Append\n" +
                "2. CountWords\n" +
                "3. Replace\n" +
                "4. IsPalindrome\n" +
                "5. Splice\n" +
                "6. Split\n" +
                "7. MaxRepeatingCharacter\n" +
                "8. Sort\n" +
                "9. Shift\n" +
                "10. Reverse\n" +
                "11. Concat\n" +
                "12. Find Length\n" +
                "13. Check Equal\n" +
                "14. Count Vowels\n" +
                "15. Remove Spaces\n" +
                "0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter string to append:");
                    String toAppend = sc.nextLine();
                    input = append(input, toAppend);
                    System.out.println("Result: " + input);
                    break;

                case 2:
                    System.out.println("Word count: " + countWords(input));
                    break;

                case 3:
                    System.out.println("Enter old char:");
                    char oldC = sc.nextLine().charAt(0);
                    System.out.println("Enter new char:");
                    char newC = sc.nextLine().charAt(0);
                    input = replaceChar(input, oldC, newC);
                    System.out.println("Result: " + input);
                    break;

                case 4:
                    System.out.println("Palindrome? " + isPalindrome(input));
                    break;

                case 5:
                    System.out.println("Enter start index:");
                    int s = sc.nextInt();
                    System.out.println("Enter end index:");
                    int e = sc.nextInt();
                    sc.nextLine();
                    input = splice(input, s, e);
                    System.out.println("Result: " + input);
                    break;

                case 6:
                    String[] words = split(input);
                    System.out.println("Words:");
                    for (String w : words) System.out.println(w);
                    break;

                case 7:
                    System.out.println("Max repeating: " + maxRepeatingChar(input));
                    break;

                case 8:
                    input = sortString(input);
                    System.out.println("Sorted: " + input);
                    break;

                case 9:
                    System.out.println("Enter shift amount:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    input = shiftString(input, n);
                    System.out.println("Shifted: " + input);
                    break;

                case 10:
                    input = reverseString(input);
                    System.out.println("Reversed: " + input);
                    break;

                case 11:
                    System.out.println("Enter another string to concat:");
                    String s2 = sc.nextLine();
                    input = concat(input, s2);
                    System.out.println("Concatenated: " + input);
                    break;

                case 12:
                    System.out.println("Length: " + findLength(input));
                    break;

                case 13:
                    System.out.println("Enter another string to compare:");
                    String cmp = sc.nextLine();
                    System.out.println("Equal? " + isEqual(input, cmp));
                    break;

                case 14:
                    System.out.println("Vowels: " + countVowels(input));
                    break;

                case 15:
                    input = removeSpaces(input);
                    System.out.println("Without spaces: " + input);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
