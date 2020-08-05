package Fundamentals.MainTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String my_name = in.nextLine();
        System.out.println("Hi, " + my_name + "!");
    }
}
