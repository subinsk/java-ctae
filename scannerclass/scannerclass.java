package scannerclass;

import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        System.out.println("Enter mobile number:");
        long mobileNo = sc.nextLong();

        System.out.println("Enter mobile CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile No. : " + mobileNo);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}
