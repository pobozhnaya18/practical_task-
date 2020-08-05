package Collections.OptionalTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PoemLinesSorterByLength {
    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        poem.add("Over hill, over dale,");
        poem.add("Thorough bush, thorough brier,");
        poem.add("Over park, over pale,");
        poem.add("Thorough flood, thorough fire!");
        poem.add("I do wander everywhere,");
        poem.add("Swifter than the moon's sphere;");
        poem.add("And I serve the Fairy Queen,");
        poem.add("To dew her orbs upon the green;");
        poem.add("The cowslips tall her pensioners be;");
        poem.add("In their gold coats spots you see;");
        poem.add("Those be rubies, fairy favours;");
        poem.add("In those freckles live their savours;");
        poem.add("I must go seek some dewdrops here,");
        poem.add("And hang a pearl in every cowslip's ear.");

        System.out.println("Initial:\n");
        poem.forEach(System.out::println);
        System.out.println("\nSorted by the line length:\n");
        poem.sort(Comparator.comparingInt(String::length));
        poem.forEach(System.out::println);
        System.out.println();
    }
}
