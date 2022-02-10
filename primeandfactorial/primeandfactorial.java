package primeandfactorial;

import java.util.Scanner;

public class primeandfactorial {
    public static boolean isPrime(int arg) {
        if (arg <= 1) {
            return false;
        }

        for (int i = 2; i < arg; i++) {
            if (arg % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int arg) {
        if (arg == 0) {
            System.out.println("Factorial of " + arg + "is: " + 1);
        }

        int fact = 1;
        while (arg != 0) {
            fact *= arg;
            arg--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("\nEnter elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("\nThe prime numbers of the array are: ");
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i]) == true) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.print("\nThe factorial of the elements of array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(factorial(a[i]) + " ");
        }

        sc.close();
    }
}
