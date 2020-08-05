package Fundamentals.OptionalTask;

import java.util.Scanner;

public class Main {
    static int findArraySize(String string, char space) {
        int count = 1;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == space)
                count++;
        }
        return count;
    }

    static int[] stringToArray(String string, int[] array, char space) {
        int count = 0;
        int beginNumber = 0;
        int endNumber;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == space) {
                endNumber = i;
                array[count] = Integer.parseInt(string.substring(beginNumber, endNumber));
                count++;
                beginNumber = endNumber + 1;
            } else if (i == string.length() - 1) {
                array[count] = Integer.parseInt(string.substring(beginNumber, string.length()));
            }
        }
        return array;
    }

    public static void getTheLongestAndTheShortestWord(String string) {
        String longWord = "", shortWord = string;
        for (String s : string.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }

        System.out.println("The longest number: '" + longWord + "'");
        System.out.println("length: " + longWord.length());
        System.out.println("The shortest number: '" + shortWord + "'");
        System.out.println("length: " + shortWord.length());
    }

    public static double getAverage(String[] arr) {
        double avg = 0;
        for (String s : arr) {
            avg += s.length();
        }
        return avg;
    }

    public static int[] sortInIncreasingOrder(int[] array, int size) {
        int tmp = 0;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input numbers: ");
        String my_string = in.nextLine();
        char space = ' ';
        int sizeOfArray = findArraySize(my_string, space);

        int[] array = new int[sizeOfArray];

        array = stringToArray(my_string, array, space);

        System.out.println("\nTask1");
        array = sortInIncreasingOrder(array, sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++)
            System.out.print(array[i] + " ");

        System.out.println("\n\nTask2");
        getTheLongestAndTheShortestWord(my_string);

        System.out.println("\nTask3");
        String[] string_array = my_string.split(" ");
        double avg = getAverage(string_array);
        if (string_array.length > 0) avg /= string_array.length;
        System.out.printf("The average length of entered numbers: %.2f", avg);
        System.out.println("\nNumbers with a length greater than the average:");
        for (String s : string_array) {
            if (s.length() > avg) System.out.println(s + " length: " + s.length());
        }
        System.out.println("Numbers with a length less than the average:");
        for (String s : string_array) {
            if (s.length() < avg) System.out.println(s + " length: " + s.length());
        }


    }
}
