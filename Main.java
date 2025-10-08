/**
 * Class - Main
 * @Description: Main class to test MyString operations
 * @Author: Rudraksh Dusad
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        MyString myStr = new MyString(input);

        while (true) {
            System.out.println("\nChoose operation (0 to Exit):");
            System.out.println(
                "1. Append\n2. CountWords\n3. Replace\n4. IsPalindrome\n5. Splice\n6. Split\n7. MaxRepeatingCharacter\n8. Sort\n9. Shift\n10. Reverse\n11. Concat\n12. Find Length\n13. Check Equal\n14. Count Vowels\n15. Remove Spaces\n0. Exit"
            );

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter string to append:");
                    myStr.append(sc.nextLine());
                    System.out.println("Result: " + myStr);
                    break;

                case 2:
                    System.out.println("Word count: " + myStr.countWords());
                    break;

                case 3:
                    System.out.println("Enter old char:");
                    char oldC = sc.nextLine().charAt(0);
                    System.out.println("Enter new char:");
                    char newC = sc.nextLine().charAt(0);
                    myStr.replaceChar(oldC, newC);
                    System.out.println("Result: " + myStr);
                    break;

                case 4:
                    System.out.println("Palindrome? " + myStr.isPalindrome());
                    break;

                case 5:
                    System.out.println("Enter start index:");
                    int start = sc.nextInt();
                    System.out.println("Enter end index:");
                    int end = sc.nextInt();
                    sc.nextLine();
                    myStr.splice(start, end);
                    System.out.println("Result: " + myStr);
                    break;

                case 6:
                    String[] words = myStr.split();
                    System.out.println("Words:");
                    for (String w : words) System.out.println(w);
                    break;

                case 7:
                    System.out.println("Max repeating: " + myStr.maxRepeatingChar());
                    break;

                case 8:
                    myStr.sortString();
                    System.out.println("Sorted: " + myStr);
                    break;

                case 9:
                    System.out.println("Enter shift amount:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    myStr.shiftString(n);
                    System.out.println("Shifted: " + myStr);
                    break;

                case 10:
                    myStr.reverseString();
                    System.out.println("Reversed: " + myStr);
                    break;

                case 11:
                    System.out.println("Enter string to concat:");
                    myStr.concat(sc.nextLine());
                    System.out.println("Concatenated: " + myStr);
                    break;

                case 12:
                    System.out.println("Length: " + myStr.findLength());
                    break;

                case 13:
                    System.out.println("Enter string to compare:");
                    System.out.println("Equal? " + myStr.isEqual(sc.nextLine()));
                    break;

                case 14:
                    System.out.println("Vowels: " + myStr.countVowels());
                    break;

                case 15:
                    myStr.removeSpaces();
                    System.out.println("Without spaces: " + myStr);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
