/**
 * Class - MyNumber
 * @Description: A custom number class with various operations of numbers.
 * @Author: Rudraksh Dusad
 */
public class MyNumber {

    // 1. Check Prime
    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // 2. Check Armstrong
    public boolean isArmstrong(int num) {
        int original = num;
        int sum = 0, digits = 0;
        int temp = num;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++)
                power *= rem;
            sum += power;
            temp /= 10;
        }

        return sum == original;
    }

    // 3. Reverse Number
    public int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // 4. Check Palindrome
    public boolean isNumberPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // 5. Sum of Digits
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // 6. Factorial (manual)
    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        return fact;
    }

    // 7. Count Digits
    public int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // 8. Fibonacci Series (manual)
    public void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
