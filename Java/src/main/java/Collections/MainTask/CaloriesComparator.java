package Collections.MainTask;

import Collections.MainTask.VegetableCrops.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getKcalPer100g() - v2.getKcalPer100g());
    }
}
