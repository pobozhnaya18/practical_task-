package Collections.MainTask;

import Collections.MainTask.Salads.Salad;
import Collections.MainTask.Salads.Vinaigrette;

public class Main {

    public static void main(String[] args) {

        Salad vinaigretteSalad = new Vinaigrette();
        Chef chef1 = new Chef("Rob", vinaigretteSalad);
        chef1.showOptions();
    }
}

