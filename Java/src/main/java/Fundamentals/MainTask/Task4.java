package Fundamentals.MainTask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer value: ");
        String my_string = in.nextLine();

        int count = 1;
        char space = ' ';
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == space)
                count++;
        }

        int[] array = new int[count];
        count = 0;
        int beginNumber = 0;
        int endNumber;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == space) {
                endNumber = i;
                array[count] = Integer.parseInt(my_string.substring(beginNumber, endNumber));
                count++;
                beginNumber = endNumber + 1;
            } else if (i == my_string.length() - 1) {
                array[count] = Integer.parseInt(my_string.substring(beginNumber, my_string.length()));
            }
        }

        int sum = 0;
        int mul = 1;
        for (int i = 0; i <= count; i++)
            sum+=array[i];
        for (int i = 0; i <= count; i++)
            mul*=array[i];
        System.out.println("Result of sum: " + sum);
        System.out.println("Result of multiplication: " + mul);
    }
}

