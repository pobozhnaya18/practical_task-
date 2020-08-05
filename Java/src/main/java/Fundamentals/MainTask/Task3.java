package Fundamentals.MainTask;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input quantity of random numbers: ");
        int quantity = in.nextInt();
        int random_numbers[] = new int[quantity];
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < quantity; i++)
            random_numbers[i] = r.nextInt();

        for (int i = 0; i < quantity; i++)
            System.out.print(random_numbers[i] + " ");

        for (int i = 0; i < quantity; i++)
            System.out.println("\n" + random_numbers[i]);
    }
}
