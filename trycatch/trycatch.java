package trycatch;

import java.util.Scanner;

/**
 * trycatch
 */
public class trycatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number that will be divided by each element of array");
        int number = sc.nextInt();

        int div_arr[] = new int[size];
        int flag = 0;

        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Dividing " + number + " by " + arr[i]);
                div_arr[i] = number / arr[i];
            }
        }

        catch (Exception e) {
            System.out.println("can't divide by 0");
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("New array:- ");
            for (int i = 0; i < size; i++) {
                System.out.print(div_arr[i] + " ");
            }
        }

        System.out.println("Enter the element of new array to be printed");
        number = sc.nextInt();
        int element;

        try {
            element = div_arr[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of size of array");
            element = 0;

        }
        System.out.println(element);
        sc.close();
    }
}