package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */

public class YearsToDays {
    public static void main(String[] args) {

        //Declaration and Initialization of variables
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("Please insert your age:");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        //Print results
        System.out.printf("Your age %d in days is %,d", age, days);

    }
}
