package Fundamentals.MainTask;

import java.util.Scanner;

public class Task5 {
    static void setMonth(int month_number) {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String month_entered;
        try {
            month_entered = month[month_number - 1];
            System.out.println("This month is " + month_entered);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such month!");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month_number = in.nextInt();
        setMonth(month_number);
    }
}
