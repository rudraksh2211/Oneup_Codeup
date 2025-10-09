import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString s = new MyString();
        MyNumber n = new MyNumber();

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. String Operations");
            System.out.println("2. Number Operations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n--- STRING OPERATIONS ---");
                        System.out.println("1. Reverse String");
                        System.out.println("2. Check Palindrome");
                        System.out.println("3. Count Vowels");
                        System.out.println("4. Remove Spaces");
                        System.out.println("5. Count Words");
                        System.out.println("6. Convert to Uppercase");
                        System.out.println("7. Character Frequency");
                        System.out.println("8. Go Back");
                        System.out.print("Enter your choice: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input! Enter a number.");
                            sc.nextLine();
                            continue;
                        }

                        int sChoice = sc.nextInt();
                        sc.nextLine();

                        if (sChoice == 8) break;

                        System.out.print("Enter a string: ");
                        String str = sc.nextLine();

                        switch (sChoice) {
                            case 1:
                                System.out.println("Reversed: " + s.reverse(str));
                                break;
                            case 2:
                                System.out.println("Palindrome: " + s.isPalindrome(str));
                                break;
                            case 3:
                                System.out.println("Vowel Count: " + s.countVowels(str));
                                break;
                            case 4:
                                System.out.println("Without Spaces: " + s.removeSpaces(str));
                                break;
                            case 5:
                                System.out.println("Word Count: " + s.countWords(str));
                                break;
                            case 6:
                                System.out.println("Uppercase: " + s.toUpperCase(str));
                                break;
                            case 7:
                                System.out.print("Enter character to count: ");
                                char target = sc.next().charAt(0);
                                sc.nextLine();
                                System.out.println("Frequency: " + s.charFrequency(str, target));
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n--- NUMBER OPERATIONS ---");
                        System.out.println("1. Check Prime");
                        System.out.println("2. Check Armstrong");
                        System.out.println("3. Reverse Number");
                        System.out.println("4. Check Palindrome");
                        System.out.println("5. Sum of Digits");
                        System.out.println("6. Factorial");
                        System.out.println("7. Count Digits");
                        System.out.println("8. Print Fibonacci");
                        System.out.println("9. Go Back");
                        System.out.print("Enter your choice: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input! Enter a number.");
                            sc.nextLine();
                            continue;
                        }

                        int nChoice = sc.nextInt();
                        sc.nextLine();

                        if (nChoice == 9) break;

                        System.out.print("Enter a number: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input! Enter a number.");
                            sc.nextLine();
                            continue;
                        }
                        int num = sc.nextInt();
                        sc.nextLine();

                        switch (nChoice) {
                            case 1:
                                System.out.println("Prime: " + n.isPrime(num));
                                break;
                            case 2:
                                System.out.println("Armstrong: " + n.isArmstrong(num));
                                break;
                            case 3:
                                System.out.println("Reversed: " + n.reverseNumber(num));
                                break;
                            case 4:
                                System.out.println("Palindrome: " + n.isNumberPalindrome(num));
                                break;
                            case 5:
                                System.out.println("Sum of Digits: " + n.sumOfDigits(num));
                                break;
                            case 6:
                                System.out.println("Factorial: " + n.factorial(num));
                                break;
                            case 7:
                                System.out.println("Digit Count: " + n.countDigits(num));
                                break;
                            case 8:
                                n.printFibonacci(num);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
