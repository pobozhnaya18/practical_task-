package Collections.MainTask.VegetableCrops;

public class RootVegetable extends Vegetable {

    public RootVegetable(String name, double kcalPer100g) {
        super(name, kcalPer100g);
        setVegetableCrops("Root vegetables");
    }

    public RootVegetable(String name, double kcalPer100g, double weight) {
        super(name, kcalPer100g, weight);
        setVegetableCrops("Root vegetables");
    }
}

