package Fundamentals.MainTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        StringBuffer string = new StringBuffer(in.nextLine());
        string.reverse();
        System.out.println("Reverse: " + string.toString());
    }
}
