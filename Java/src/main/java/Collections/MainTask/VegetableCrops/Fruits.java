package Collections.MainTask.VegetableCrops;

public class Fruits extends Vegetable {

    public Fruits(String name, double kcalPer100g) {
        super(name, kcalPer100g);
        setVegetableCrops("Fruits");
    }

    public Fruits(String name, double kcalPer100g, double weight) {
        super(name, kcalPer100g, weight);
        setVegetableCrops("Fruits");
    }
}

